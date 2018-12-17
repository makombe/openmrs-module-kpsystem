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

import org.openmrs.calculation.patient.PatientCalculationContext;
import org.openmrs.calculation.result.CalculationResultMap;
import org.openmrs.calculation.result.SimpleResult;
import org.openmrs.module.kenyacore.calculation.AbstractPatientCalculation;
import org.openmrs.module.kenyacore.calculation.BooleanResult;
import org.openmrs.module.kenyacore.calculation.CalculationUtils;
import org.openmrs.module.kenyaemr.calculation.EmrCalculationUtils;
import org.openmrs.module.kenyaemr.calculation.library.hiv.LostToFollowUpCalculation;
import org.openmrs.module.kenyaemr.regimen.RegimenOrder;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Calculates whether patients are on second-line ART regimens
 */
public class OnSecondLineArtCalculation extends AbstractPatientCalculation {

	/**
	 * @see org.openmrs.calculation.patient.PatientCalculation#evaluate(java.util.Collection, java.util.Map, org.openmrs.calculation.patient.PatientCalculationContext)
	 * @should return null for patients who have never started ARVs
	 * @should return whether patients are currently taking a second-line regimen
	 */
	@Override
    public CalculationResultMap evaluate(Collection<Integer> cohort, Map<String, Object> arg1, PatientCalculationContext context) {

		// Get active ART regimen of each patient
		CalculationResultMap currentArvs = calculate(new CurrentArtRegimenCalculation(), cohort, context);
		Set<Integer> ltfu = CalculationUtils.patientsThatPass(calculate(new LostToFollowUpCalculation(), cohort, context));

		CalculationResultMap ret = new CalculationResultMap();
		for (Integer ptId : cohort) {
			boolean onSecondLine = false;
			SimpleResult currentArvResult = (SimpleResult) currentArvs.get(ptId);

			if (currentArvResult != null) {
				RegimenOrder currentRegimen = (RegimenOrder) currentArvResult.getValue();

				onSecondLine = EmrCalculationUtils.regimenInGroup(currentRegimen, "ARV", "adult-second");
			}
			if (ltfu.contains(ptId)) {
				onSecondLine = false;
			}

			ret.put(ptId, new BooleanResult(onSecondLine, this, context));
		}
		return ret;
    }
}