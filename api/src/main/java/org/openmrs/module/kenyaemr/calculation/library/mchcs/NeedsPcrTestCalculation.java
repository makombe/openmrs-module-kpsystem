/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.kenyaemr.calculation.library.mchcs;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.DateTime;
import org.joda.time.Months;
import org.joda.time.Weeks;
import org.openmrs.Concept;
import org.openmrs.Obs;
import org.openmrs.Person;
import org.openmrs.Program;
import org.openmrs.api.context.Context;
import org.openmrs.calculation.patient.PatientCalculationContext;
import org.openmrs.calculation.result.CalculationResultMap;
import org.openmrs.module.kenyacore.calculation.AbstractPatientCalculation;
import org.openmrs.module.kenyacore.calculation.BooleanResult;
import org.openmrs.module.kenyacore.calculation.Calculations;
import org.openmrs.module.kenyacore.calculation.Filters;
import org.openmrs.module.kenyacore.calculation.PatientFlagCalculation;
import org.openmrs.module.kenyaemr.Dictionary;
import org.openmrs.module.kenyaemr.calculation.EmrCalculationUtils;
import org.openmrs.module.kenyaemr.metadata.MchMetadata;
import org.openmrs.module.metadatadeploy.MetadataUtils;

import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/**
 * Determines whether a child at 6 week and above has had PCR test
 */
public class NeedsPcrTestCalculation extends AbstractPatientCalculation implements PatientFlagCalculation {
	protected static final Log log = LogFactory.getLog(NeedsPcrTestCalculation.class);
	/**
	 * @see org.openmrs.module.kenyacore.calculation.PatientFlagCalculation#getFlagMessage()
	 */
	@Override
	public String getFlagMessage() {
		return "Due For PCR Test";
	}

	/**
	 * @see org.openmrs.calculation.patient.PatientCalculation#evaluate(java.util.Collection, java.util.Map, org.openmrs.calculation.patient.PatientCalculationContext)
	 */
	@Override
	public CalculationResultMap evaluate(Collection<Integer> cohort, Map<String, Object> parameterValues, PatientCalculationContext context) {

		Program mchcsProgram = MetadataUtils.existing(Program.class, MchMetadata._Program.MCHCS);

		// Get all patients who are alive and in MCH-CS program
		Set<Integer> alive = Filters.alive(cohort, context);
		Set<Integer> inMchcsProgram = Filters.inProgram(mchcsProgram, alive, context);

		// Get whether the child is HIV Exposed
		CalculationResultMap lastChildHivStatus = Calculations.lastObs(Dictionary.getConcept(Dictionary.CHILDS_CURRENT_HIV_STATUS), cohort, context);
		CalculationResultMap lastPcrTestReaction = Calculations.lastObs(Dictionary.getConcept(Dictionary.HIV_DNA_POLYMERASE_CHAIN_REACTION), cohort, context);
		CalculationResultMap lastPcrTestQualitative = Calculations.lastObs(Dictionary.getConcept(Dictionary.HIV_DNA_POLYMERASE_CHAIN_REACTION_QUALITATIVE), cohort, context);

		Concept hivExposed = Dictionary.getConcept(Dictionary.EXPOSURE_TO_HIV);

		CalculationResultMap ret = new CalculationResultMap();

		for (Integer ptId : cohort) {

			boolean needsPcr = false;

			// Check if a patient is alive and is in MCHCS program
			if (inMchcsProgram.contains(ptId)) {

				Obs hivStatusObs = EmrCalculationUtils.obsResultForPatient(lastChildHivStatus, ptId);
				Obs pcrTestObs =  EmrCalculationUtils.obsResultForPatient(lastPcrTestReaction, ptId);
				Obs pcrTestObsQual =  EmrCalculationUtils.obsResultForPatient(lastPcrTestQualitative, ptId);

				//get birth date of this patient
				Person person = Context.getPersonService().getPerson(ptId);

				if (hivStatusObs != null && pcrTestObs == null &&  pcrTestObsQual == null && (hivStatusObs.getValueCoded().equals(hivExposed)) && getAgeInWeeks(person.getBirthdate(), context.getNow()) >= 6 && getAgeInMonths(person.getBirthdate(), context.getNow()) <= 12) {
					needsPcr = true;

				}

			}

			ret.put(ptId, new BooleanResult(needsPcr, this, context));
		}
		return ret;
	}

	Integer getAgeInWeeks(Date birtDate, Date context) {
		DateTime d1 = new DateTime(birtDate.getTime());
		DateTime d2 = new DateTime(context.getTime());
		return Weeks.weeksBetween(d1, d2).getWeeks();
	}

	Integer getAgeInMonths(Date birtDate, Date context) {
		DateTime d1 = new DateTime(birtDate.getTime());
		DateTime d2 = new DateTime(context.getTime());
		return Months.monthsBetween(d1, d2).getMonths();
	}
}