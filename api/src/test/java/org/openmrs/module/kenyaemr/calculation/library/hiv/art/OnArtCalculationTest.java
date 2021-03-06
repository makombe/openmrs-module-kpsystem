/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.kenyaemr.calculation.library.hiv.art;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openmrs.Concept;
import org.openmrs.Encounter;
import org.openmrs.api.context.Context;
import org.openmrs.calculation.patient.PatientCalculationService;
import org.openmrs.calculation.result.CalculationResultMap;
import org.openmrs.module.kenyacore.test.TestUtils;
import org.openmrs.module.kenyaemr.Dictionary;
import org.openmrs.test.BaseModuleContextSensitiveTest;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;

/**
 * Tests for {@link OnArtCalculation}
 */

public class OnArtCalculationTest extends BaseModuleContextSensitiveTest {

	/**
	 * Setup each test
	 */
	@Before
	public void setup() throws Exception {
		executeDataSet("dataset/test-concepts.xml");
	}

	/**
	 * @see OnArtCalculation#evaluate(java.util.Collection, java.util.Map, org.openmrs.calculation.patient.PatientCalculationContext)
	 */
	@Test
	public void evaluate_shouldCalculateCurrentArtRegimen() throws Exception {
		/**
		 * encounter#3,4,5 for patient 7
		 * encounter#6 for patient 2
		 *
		 */
		// Put patient #7 on Dapsone
		Concept dapsone = Dictionary.getConcept(Dictionary.DAPSONE);
		Encounter enc1 = Context.getEncounterService().getEncounter(3);
		TestUtils.saveDrugOrder(TestUtils.getPatient(7), dapsone, TestUtils.date(2011, 1, 1), null, enc1);

		// Put patient #8 on Stavudine
		Concept stavudine = Dictionary.getConcept(Dictionary.STAVUDINE);
		Encounter enc2 = Context.getEncounterService().getEncounter(6);
		TestUtils.saveDrugOrder(TestUtils.getPatient(2), stavudine, TestUtils.date(2011, 1, 1), null, enc2);

		List<Integer> cohort = Arrays.asList(2, 7, 8);

		CalculationResultMap resultMap = new OnArtCalculation().evaluate(cohort, null, Context.getService(PatientCalculationService.class).createCalculationContext());
		Assert.assertThat((Boolean) resultMap.get(8).getValue(), is(false)); // isn't on any drugs
		Assert.assertThat((Boolean) resultMap.get(7).getValue(), is(false)); // isn't on any ARTs
		Assert.assertThat((Boolean) resultMap.get(2).getValue(), is(true)); // is taking D4T
	}
}