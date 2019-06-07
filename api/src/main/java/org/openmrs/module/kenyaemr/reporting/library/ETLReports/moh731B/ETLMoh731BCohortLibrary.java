/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.kenyaemr.reporting.library.ETLReports.moh731B;

import org.openmrs.module.reporting.cohort.definition.CohortDefinition;
import org.openmrs.module.reporting.cohort.definition.SqlCohortDefinition;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by dev on 1/14/17.
 */

/**
 * Library of cohort definitions used specifically in the MOH731 report based on ETL tables. It has incorporated green card components
 */
@Component


public class ETLMoh731BCohortLibrary {

    public CohortDefinition activeFsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("activeFsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("activeFsw");

        return cd;
    }

    public CohortDefinition activeMsm(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("activeMsm");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("activeMsm");

        return cd;
    }

    public CohortDefinition activeMsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("activeMsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("activeMsw");

        return cd;
    }

    public CohortDefinition activePwid(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("activePwid");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("activePwid");

        return cd;
    }

    public CohortDefinition activePwud(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("activePwud");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("activePwud");

        return cd;
    }

    public CohortDefinition activeTransgender(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("activeTransgender");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("activeTransgender");

        return cd;
    }

    public CohortDefinition hivTestedFsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("hivTestedFsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("hivTestedFsw");

        return cd;
    }

    public CohortDefinition hivTestedMsm(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("hivTestedMsm");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("hivTestedMsm");

        return cd;
    }

    public CohortDefinition hivTestedMsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("hivTestedMsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("hivTestedMsw");

        return cd;
    }

    public CohortDefinition hivTestedPwid(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("hivTestedPwid");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("hivTestedPwid");

        return cd;
    }

    public CohortDefinition hivTestedPwud(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("hivTestedPwud");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("hivTestedPwud");

        return cd;
    }

    public CohortDefinition hivTestedTransgender(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("hivTestedTransgender");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("hivTestedTransgender");

        return cd;
    }

    public CohortDefinition testedAtFacilityFsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("testedAtFacilityFsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("testedAtFacilityFsw");

        return cd;
    }

    public CohortDefinition testedAtFacilityMsm(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("testedAtFacilityMsm");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("testedAtFacilityMsm");

        return cd;
    }

    public CohortDefinition testedAtFacilityMsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("testedAtFacilityMsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("testedAtFacilityMsw");

        return cd;
    }

    public CohortDefinition testedAtFacilityPwid(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("testedAtFacilityPwid");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("testedAtFacilityPwid");

        return cd;
    }    public CohortDefinition testedAtFacilityPwud(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("diagnosedSTI");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("Diagnosed for STI");

        return cd;
    }

    public CohortDefinition testedAtFacilityTransgender(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("testedAtFacilityTransgender");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("testedAtFacilityTransgender");

        return cd;
    }

    public CohortDefinition testedAtCommunityFsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("testedAtCommunityFsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("testedAtCommunityFsw");

        return cd;
    }

    public CohortDefinition testedAtCommunityMsm(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("testedAtCommunityMsm");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("testedAtCommunityMsm");

        return cd;
    }

    public CohortDefinition testedAtCommunityMsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("testedAtCommunityMsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("testedAtCommunityMsw");

        return cd;
    }

    public CohortDefinition testedAtCommunityPwid(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery = "";
                cd.setName("testedAtCommunityPwid");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("testedAtCommunityPwid");

        return cd;
    }

    public CohortDefinition testedAtCommunityPwud(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("testedAtCommunityPwud");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("testedAtCommunityPwud");

        return cd;
    }

    public CohortDefinition testedAtCommunityTransgender(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("testedAtCommunityTransgender");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("testedAtCommunityTransgender");

        return cd;
    }

    public CohortDefinition testedNewFsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("testedNewFsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("testedNewFsw");

        return cd;
    }

    public CohortDefinition testedNewMsm(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("testedNewMsm");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("testedNewMsm");

        return cd;
    }

    public CohortDefinition testedNewMsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("testedNewMsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("testedNewMsw");

        return cd;
    }

    public CohortDefinition testedNewPwid(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("testedNewPwid");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("testedNewPwid");

        return cd;
    }

    public CohortDefinition testedNewPwud(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("testedNewPwud");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("testedNewPwud");

        return cd;
    }

    public CohortDefinition testedAtNewTransgender(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("testedAtNewTransgender");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("testedAtNewTransgender");

        return cd;
    }

    public CohortDefinition testedRepeatFsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("testedRepeatFsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("testedRepeatFsw");

        return cd;
    }

    public CohortDefinition testedRepeatMsm(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("testedRepeatMsm");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("testedRepeatMsm");

        return cd;
    }

    public CohortDefinition testedRepeatMsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("testedRepeatMsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("testedRepeatMsw");

        return cd;
    }

    public CohortDefinition testedRepeatPwid(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("testedRepeatPwid");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("testedRepeatPwid");

        return cd;
    }

    public CohortDefinition testedRepeatPwud(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("testedRepeatPwud");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("testedRepeatPwud");

        return cd;
    }

    public CohortDefinition testedRepeatTransgender(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("testedRepeatTransgender");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("testedRepeatTransgender");

        return cd;
    }


    public CohortDefinition knownPositiveFsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("knownPositiveFsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("knownPositiveFsw");

        return cd;
    }

    public CohortDefinition knownPositiveMsm(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("knownPositiveMsm");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("knownPositiveMsm");

        return cd;
    }



        public CohortDefinition knownPositiveMsw(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("knownPositiveMsw");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("knownPositiveMsw");

            return cd;
        }

        public CohortDefinition knownPositivePwid(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("knownPositivePwid");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("knownPositivePwid ");

            return cd;
        }

        public CohortDefinition knownPositivePwud(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("knownPositivePwud");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("knownPositivePwud");

            return cd;
        }

        public CohortDefinition knownPositiveTransgender(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("knownPositiveTransgender");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("knownPositiveTransgender");

            return cd;
        }

        public CohortDefinition receivedPositiveResultsFsw(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivedPositiveResultsFsw");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivedPositiveResultsFsw");

            return cd;
        }

        public CohortDefinition receivedPositiveResultsMsm(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivedPositiveResultsMsm");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivedPositiveResultsMsm");

            return cd;
        }

        public CohortDefinition receivedPositiveResultsMsw(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivedPositiveResultsMsw");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivedPositiveResultsMsw");

            return cd;
        }

        public CohortDefinition receivedPositiveResultsPwid(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivedPositiveResultsPwid");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivedPositiveResultsPwid");

            return cd;
        }

        public CohortDefinition receivedPositiveResultsPwud(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivedPositiveResultsPwud");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivedPositiveResultsPwud");

            return cd;
        }

    public CohortDefinition receivedPositiveResultsTransgender(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("receivedPositiveResultsTransgender");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("receivedPositiveResultsTransgender");

        return cd;
    }

        public CohortDefinition linkedFsw(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("linkedFsw");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("linkedFsw");

            return cd;
        }



    public CohortDefinition linkedMsm(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("linkedMsm");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("linkedMsm");

        return cd;
    }

    public CohortDefinition linkedMsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("linkedMsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("linkedMsw");

        return cd;
    }

        public CohortDefinition linkedPwid(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("linkedPwid");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("linkedPwid");

            return cd;
        }

        public CohortDefinition linkedPwud(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("linkedPwud");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("linkedPwud");

            return cd;
        }

        public CohortDefinition linkedTransgender(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("linkedTransgender");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("linkedTransgender");

            return cd;
        }

        public CohortDefinition receivingCondomsFsw(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingCondomsFsw");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingCondomsFsw");

            return cd;
        }

        public CohortDefinition receivingCondomsMsm(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingCondomsMsm");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingCondomsMsm ");

            return cd;
        }

        public CohortDefinition receivingCondomsMsw(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingCondomsMsw");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingCondomsMsw");

            return cd;
        }


    public CohortDefinition receivingCondomsPwid(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("receivingCondomsPwid");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("receivingCondomsPwid");

        return cd;
    }

    public CohortDefinition receivingCondomsPwud(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingCondomsPwud");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingCondomsPwud");

            return cd;
        }

        public CohortDefinition receivingCondomsTransgender(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingCondomsTransgender");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingCondomsTransgender");

            return cd;
        }

        public CohortDefinition receivingCondomsPerNeedPerNeedFsw(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingCondomsPerNeedPerNeedFsw");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingCondomsPerNeedPerNeedFsw");

            return cd;
        }

        public CohortDefinition receivingCondomsPerNeedMsm(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingCondomsPerNeedMsm");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingCondomsPerNeedMsm");

            return cd;
        }


    public CohortDefinition receivingCondomsPerNeedMsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("receivingCondomsPerNeedMsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("receivingCondomsPerNeedMsw");

        return cd;
    }

    public CohortDefinition receivingCondomsPerNeedPwid(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("receivingCondomsPerNeedPwid");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("receivingCondomsPerNeedPwid");

        return cd;
    }



        public CohortDefinition receivingCondomsPerNeedPwud(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingCondomsPerNeedPwud");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingCondomsPerNeedPwud");

            return cd;
        }

        public CohortDefinition receivingCondomsPerNeedTransgender(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingCondomsPerNeedTransgender");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingCondomsPerNeedTransgender");

            return cd;
        }

        public CohortDefinition receivingNeedlesAndSyringesFsw(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingNeedlesAndSyringesPerNeedFsw");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingNeedlesAndSyringesPerNeedFsw");

            return cd;
        }

        public CohortDefinition receivingNeedlesAndSyringesMsm(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingNeedlesAndSyringesMsm");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingNeedlesAndSyringesMsm");

            return cd;
        }

        public CohortDefinition receivingNeedlesAndSyringesMsw(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingNeedlesAndSyringesMsw");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingNeedlesAndSyringesMsw");

            return cd;
        }

        public CohortDefinition receivingNeedlesAndSyringesPwid(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingNeedlesAndSyringesPwid");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingNeedlesAndSyringesPwid");

            return cd;
        }


    public CohortDefinition receivingNeedlesAndSyringesPwud(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("receivingNeedlesAndSyringesPwud");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("receivingNeedlesAndSyringesPwud");

        return cd;
    }


    public CohortDefinition receivingNeedlesAndSyringesTransgender(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("receivingNeedlesAndSyringesTransgender");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("receivingNeedlesAndSyringesTransgender");

        return cd;
    }


    public CohortDefinition receivingNeedlesAndSyringesPerNeedFsw(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingNeedlesAndSyringesPerNeedFsw");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingNeedlesAndSyringesPerNeedFsw");

            return cd;
        }

    public CohortDefinition receivingNeedlesAndSyringesPerNeedMsm(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("receivingNeedlesAndSyringesPerNeedPerNeedMsm");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("receivingNeedlesAndSyringesPerNeedPerNeedMsm ");

        return cd;
    }
        public CohortDefinition receivingNeedlesAndSyringesPerNeedMsw(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingNeedlesAndSyringesPerNeedPerNeedMsw");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingNeedlesAndSyringesPerNeedPerNeedMsw ");

            return cd;
        }

        public CohortDefinition receivingNeedlesAndSyringesPerNeedPwid(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingNeedlesAndSyringesPerNeedPwid");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingNeedlesAndSyringesPerNeedPerNeedPwid");

            return cd;
        }

        public CohortDefinition receivingNeedlesAndSyringesPerNeedPwud(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingNeedlesAndSyringesPerNeedPwud");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingNeedlesAndSyringesPerNeedPwud");

            return cd;
        }

        public CohortDefinition receivingNeedlesAndSyringesPerNeedTransgender(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingNeedlesAndSyringesPerNeedTransgender");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingNeedlesAndSyringesPerNeedTransgender");

            return cd;
        }


    public CohortDefinition receivingLubricantsFsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("receivingLubricantsFsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("receivingLubricantsFsw");

        return cd;
    }

    public CohortDefinition receivingLubricantsMsm(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("receivingLubricantsMsm");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("receivingLubricantsMsm");

        return cd;
    }

        public CohortDefinition receivingLubricantsMsw(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingLubricantsMsw");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingLubricantsMsw");

            return cd;
        }

        public CohortDefinition receivingLubricantsPwid(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingLubricantsPwid");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingLubricantsPwid");

            return cd;
        }

        public CohortDefinition receivingLubricantsPwud(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingLubricantsPwud");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingLubricantsPwud");

            return cd;
        }

        public CohortDefinition receivingLubricantsTransgender(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingLubricantsTransgender");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingLubricantsTransgender");

            return cd;
        }

        public CohortDefinition receivingLubricantsPerNeedFsw(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingLubricantsPerNeedFsw");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingLubricantsPerNeedFsw");

            return cd;
        }

        public CohortDefinition receivingLubricantsPerNeedMsm(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingLubricantsPerNeedMsm");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingLubricantsPerNeedMsm");

            return cd;
        }

        public CohortDefinition receivingLubricantsPerNeedMsw(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingLubricantsPerNeedMsw");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingLubricantsPerNeedMsw");

            return cd;
        }

        public CohortDefinition receivingLubricantsPerNeedPwid(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingLubricantsPerNeedPwid");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingLubricantsPerNeedPwid");

            return cd;
        }

        public CohortDefinition receivingLubricantsPerNeedPwud(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingLubricantsPerNeedPwud");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingLubricantsPerNeedPwud");

            return cd;
        }

        public CohortDefinition receivingLubricantsPerNeedTransgender(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("receivingLubricantsPerNeedTransgender");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("receivingLubricantsPerNeedTransgender");

            return cd;
        }

        public CohortDefinition screenedForSTIFsw(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("screenedForSTIFsw");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("screenedForSTIFsw");

            return cd;
        }


    public CohortDefinition screenedForSTIMsm(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("screenedForSTIMsm");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("screenedForSTIMsm");

        return cd;
    }

    public CohortDefinition screenedForSTIMsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("screenedForSTIMsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("screenedForSTIMsw");

        return cd;
    }

        public CohortDefinition screenedForSTIPwid(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("screenedForSTIPwid");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("screenedForSTIPwid");

            return cd;
        }

        public CohortDefinition screenedForSTIPwud(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("screenedForSTIPwud");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("screenedForSTIPwud");

            return cd;
        }

        public CohortDefinition screenedForSTITransgender(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("screenedForSTITransgender");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("screenedForSTITransgender");

            return cd;
        }

        public CohortDefinition screenedForHCVFsw(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("screenedForHCVFsw");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("screenedForHCVFsw");

            return cd;
        }


    public CohortDefinition screenedForHCVMsm(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("screenedForHCVMsm");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("screenedForHCVMsm");

        return cd;
    }

        public CohortDefinition screenedForHCVMsw(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("screenedForHCVMsw");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("screenedForHCVMsw");

            return cd;
        }

        public CohortDefinition screenedForHCVPwid(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("screenedForHCVPwid");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("screenedForHCVPwid");

            return cd;
        }

    public CohortDefinition screenedForHCVPwud(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("screenedForHCVPwud");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("screenedForHCVPwud ");

        return cd;
    }


    public CohortDefinition screenedForHCVTransgender(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("screenedForHCVTransgender");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("screenedForHCVTransgender");

            return cd;
        }


        public CohortDefinition screenedForHBVFsw(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("screenedForHBVFsw");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("screenedForHBVFsw");

            return cd;
        }

        public CohortDefinition screenedForHBVMsm(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("screenedForHBVMsm");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("screenedForHBVMsm");

            return cd;
        }


    public CohortDefinition screenedForHBVMsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
                cd.setName("screenedForHBVMsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("screenedForHBVMsw");

        return cd;
    }

    public CohortDefinition screenedForHBVPwid(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("screenedForHBVPwid");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("screenedForHBVPwid");

        return cd;
    }


        public CohortDefinition screenedForHBVPwud(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("screenedForHBVPwud");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("screenedForHBVPwud ");

            return cd;
        }

        public CohortDefinition screenedForHBVTransgender(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("screenedForHBVTransgender");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("screenedForHBVTransgender");

            return cd;
        }

        public CohortDefinition positiveHBVFsw(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("positiveHBVFsw");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("positiveHBVFsw");

            return cd;
        }

        public CohortDefinition positiveHBVMsm(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("positiveHBVMsm");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("positiveHBVMsm");

            return cd;
        }

        public CohortDefinition positiveHBVMsw(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("positiveHBVMsw");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("positiveHBVMsw");

            return cd;
        }

        public CohortDefinition positiveHBVPwid(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("completedPEPWithin28Days");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("positiveHBVPwid");

            return cd;
        }

        public CohortDefinition positiveHBVPwud(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("positiveHBVPwud");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("positiveHBVPwud ");

            return cd;
        }

        public CohortDefinition positiveHBVTransgender(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("completedPEPWithin28Days");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("Completed PEP within ");

            return cd;
        }

        public CohortDefinition treatedHBVFsw(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("treatedHBVFsw");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("treatedHBVFsw");

            return cd;
        }

        public CohortDefinition treatedHBVMsm(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("treatedHBVMsm");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("treatedHBVMsm");

            return cd;
        }

    public CohortDefinition treatedHBVMsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("treatedHBVMsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("treatedHBVMsw ");

        return cd;
    }

        public CohortDefinition treatedHBVPwud(){
            SqlCohortDefinition cd = new SqlCohortDefinition();
            String sqlQuery ="";
            cd.setName("treatedHBVPwud");
            cd.setQuery(sqlQuery);
            cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
            cd.addParameter(new Parameter("endDate", "End Date", Date.class));
            cd.setDescription("treatedHBVPwud");

            return cd;
        }
    public CohortDefinition treatedHBVPwid(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("treatedHBVPwid");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("treatedHBVPwid");

        return cd;
    }



    public CohortDefinition treatedHBVTransgender(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("treatedHBVTransgender");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("treatedHBVTransgender");

        return cd;
    }

    public CohortDefinition negativeHBVVaccinatedFsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("negativeHBVVaccinatedFsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("negativeHBVVaccinatedFsw");

        return cd;
    }

    public CohortDefinition negativeHBVVaccinatedMsm(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("negativeHBVVaccinatedMsm");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("negativeHBVVaccinatedMsm");

        return cd;
    }

    public CohortDefinition negativeHBVVaccinatedMsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("negativeHBVVaccinatedMsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("negativeHBVVaccinatedMsw ");

        return cd;
    }

    public CohortDefinition negativeHBVVaccinatedPwid(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("negativeHBVVaccinatedPwid");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("negativeHBVVaccinatedPwid ");

        return cd;
    }

    public CohortDefinition negativeHBVVaccinatedPwud(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("negativeHBVVaccinatedPwud");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("negativeHBVVaccinatedPwud");

        return cd;
    }

    public CohortDefinition negativeHBVVaccinatedTransgender(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("negativeHBVVaccinatedTransgender");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("negativeHBVVaccinatedTransgender");

        return cd;
    }

    public CohortDefinition screenedTBFsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("screenedTBFsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("screenedTBFsw ");

        return cd;
    }

    public CohortDefinition screenedTBMsm(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("screenedTBMsm");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("screenedTBMsm");

        return cd;
    }

    public CohortDefinition screenedTBMsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("screenedTBMsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("screenedTBMsw");

        return cd;
    }

    public CohortDefinition screenedTBPwid(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("screenedTBPwid");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("screenedTBPwid ");

        return cd;
    }

    public CohortDefinition screenedTBPwud(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("completedPEPWithin28Days");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("screenedTBPwud ");

        return cd;
    }

    public CohortDefinition screenedTBTransgender(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("screenedTBTransgender");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("screenedTBTransgender");

        return cd;
    }

    public CohortDefinition diagnosedTBFsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("diagnosedTBFsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("diagnosedTBFsw");

        return cd;
    }


    public CohortDefinition diagnosedTBMsm(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("diagnosedTBMsm");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("diagnosedTBMsm ");

        return cd;
    }

    public CohortDefinition diagnosedTBMsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("diagnosedTBMsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("diagnosedTBMsw");

        return cd;
    }

    public CohortDefinition diagnosedTBPwid(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("diagnosedTBPwid");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("diagnosedTBPwid");

        return cd;
    }

    public CohortDefinition diagnosedTBPwud(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("diagnosedTBPwud");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("diagnosedTBPwud");

        return cd;
    }

    public CohortDefinition diagnosedTBTransgender(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("diagnosedTBTransgender");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("diagnosedTBTransgender ");

        return cd;
    }

    public CohortDefinition startedOnTBTxFsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("startedOnTBTxFsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("startedOnTBTxFsw");

        return cd;
    }

    public CohortDefinition startedOnTBTxMsm(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("startedOnTBTxMsm");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("startedOnTBTxMsm");

        return cd;
    }

    public CohortDefinition startedOnTBTxMsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("startedOnTBTxMsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("startedOnTBTxMsw ");

        return cd;
    }
    public CohortDefinition startedOnTBTxPwid(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("startedOnTBTxPwid");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("startedOnTBTxPwid");

        return cd;
    }


    public CohortDefinition startedOnTBTxPwud(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("startedOnTBTxPwud");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("startedOnTBTxPwud");

        return cd;
    }

    public CohortDefinition startedOnTBTxTransgender(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("startedOnTBTxTransgender");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("startedOnTBTxTransgender ");

        return cd;
    }
    public CohortDefinition tbClientsOnHAARTFsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("tbClientsOnHAARTFsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("tbClientsOnHAARTFsw ");

        return cd;
    }


    public CohortDefinition tbClientsOnHAARTMsm(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("tbClientsOnHAARTMsm");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("tbClientsOnHAARTMsm ");

        return cd;
    }

    public CohortDefinition tbClientsOnHAARTMsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("tbClientsOnHAARTMsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("tbClientsOnHAARTMsw ");

        return cd;
    }
    public CohortDefinition tbClientsOnHAARTPwid(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("tbClientsOnHAARTPwid");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("tbClientsOnHAARTPwid");

        return cd;
    }


    public CohortDefinition tbClientsOnHAARTPwud(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("tbClientsOnHAARTPwud");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("tbClientsOnHAARTPwud ");

        return cd;
    }

    public CohortDefinition tbClientsOnHAARTTransgender(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("tbClientsOnHAARTTransgender");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("tbClientsOnHAARTTransgender ");

        return cd;
    }
    public CohortDefinition initiatedPrEPFsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("initiatedPrEPFsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("initiatedPrEPFsw");
        return cd;
    }


    public CohortDefinition initiatedPrEPMsm(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("initiatedPrEPMsm");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("initiatedPrEPMsm ");

        return cd;
    }

    public CohortDefinition initiatedPrEPMsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("initiatedPrEPMsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("initiatedPrEPMsw");

        return cd;
    }
    public CohortDefinition initiatedPrEPPwid(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("initiatedPrEPPwid");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("initiatedPrEPPwid ");

        return cd;
    }


    public CohortDefinition initiatedPrEPPwud(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("initiatedPrEPPwud");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("initiatedPrEPPwud ");

        return cd;
    }

    public CohortDefinition initiatedPrEPTransgender(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("initiatedPrEPTransgender");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("initiatedPrEPTransgender");

        return cd;
    }
    public CohortDefinition currentOnPrEPFsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("currentOnPrEPFsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("currentOnPrEPFsw");

        return cd;
    }

    public CohortDefinition currentOnPrEPMsm(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("currentOnPrEPMsm");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("currentOnPrEPMsm");

        return cd;
    }

    public CohortDefinition currentOnPrEPMsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("currentOnPrEPMsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("currentOnPrEPMsw");

        return cd;
    }

    public CohortDefinition currentOnPrEPPwid(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("currentOnPrEPPwid");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("currentOnPrEPPwid");

        return cd;
    }

    public CohortDefinition currentOnPrEPPwud(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("currentOnPrEPPwud");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("currentOnPrEPPwud");

        return cd;
    }

    public CohortDefinition currentOnPrEPTransgender(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("currentOnPrEPTransgender");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("currentOnPrEPTransgender ");

        return cd;
    }

    public CohortDefinition turningPositiveWhileOnPrEPFsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("turningPositiveWhileOnPrEPFsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("turningPositiveWhileOnPrEPFsw");

        return cd;
    }

    public CohortDefinition turningPositiveWhileOnPrEPMsm(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("turningPositiveWhileOnPrEPMsm");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("turningPositiveWhileOnPrEPMsm ");

        return cd;
    }

    public CohortDefinition turningPositiveWhileOnPrEPMsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("turningPositiveWhileOnPrEPMsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("turningPositiveWhileOnPrEPMsw");

        return cd;
    }

    public CohortDefinition turningPositiveWhileOnPrEPPwid(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("turningPositiveWhileOnPrEPPwid");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("turningPositiveWhileOnPrEPPwid");

        return cd;
    }

    public CohortDefinition turningPositiveWhileOnPrEPPwud(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("turningPositiveWhileOnPrEPPwud");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("turningPositiveWhileOnPrEPPwud");

        return cd;
    }

    public CohortDefinition turningPositiveWhileOnPrEPTransgender(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("turningPositiveWhileOnPrEPTransgender");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("turningPositiveWhileOnPrEPTransgender");

        return cd;
    }

    public CohortDefinition experiencingViolenceFsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("experiencingViolenceFsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("experiencingViolenceFsw");

        return cd;
    }

    public CohortDefinition experiencingViolenceMsm(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("experiencingViolenceMsm");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("experiencingViolenceMsm");

        return cd;
    }

    public CohortDefinition experiencingViolenceMsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("experiencingViolenceMsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("experiencingViolenceMsw");

        return cd;
    }

    public CohortDefinition experiencingViolencePwid(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("experiencingViolencePwid");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("experiencingViolencePwid");

        return cd;
    }

    public CohortDefinition experiencingViolencePwud(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("experiencingViolencePwud");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("experiencingViolencePwud");

        return cd;
    }

    public CohortDefinition experiencingViolenceTransgender(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("experiencingViolenceTransgender");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("experiencingViolenceTransgender");

        return cd;
    }

    public CohortDefinition receivingViolenceSupportFsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("receivingViolenceSupportFsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("receivingViolenceSupportFsw");

        return cd;
    }

    public CohortDefinition receivingViolenceSupportMsm(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("receivingViolenceSupportMsm");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("receivingViolenceSupportMsm");

        return cd;
    }


    public CohortDefinition receivingViolenceSupportMsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("receivingViolenceSupportMsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("receivingViolenceSupportMsw");

        return cd;
    }

    public CohortDefinition receivingViolenceSupportPwid(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("receivingViolenceSupportPwid");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("receivingViolenceSupportPwid");

        return cd;
    }

    public CohortDefinition receivingViolenceSupportPwud(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("receivingViolenceSupportPwud");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("receivingViolenceSupportPwud");

        return cd;
    }

    public CohortDefinition receivingViolenceSupportTransgender(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("receivingViolenceSupportTransgender");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("receivingViolenceSupportTransgender");

        return cd;
    }

    public CohortDefinition numberExposedFsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("numberExposedFsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("numberExposedFsw");

        return cd;
    }

    public CohortDefinition numberExposedMsm(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("numberExposedMsm");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("numberExposedMsm");

        return cd;
    }

    public CohortDefinition numberExposedMsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("numberExposedMsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("numberExposedMsw");

        return cd;
    }

    public CohortDefinition numberExposedPwid(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("numberExposedPwid");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("numberExposedPwid");

        return cd;
    }

    public CohortDefinition numberExposedPwud(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("numberExposedPwud");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("numberExposedPwud");

        return cd;
    }

    public CohortDefinition numberExposedTransgender(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("numberExposedTransgender");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("numberExposedTransgender");

        return cd;
    }

    public CohortDefinition receivingPEPWithin72HrsFsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("receivingPEPWithin72HrsFsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("receivingPEPWithin72HrsFsw");

        return cd;
    }

    public CohortDefinition receivingPEPWithin72HrsMsm(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("receivingPEPWithin72HrsMsm");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("receivingPEPWithin72HrsMsm");

        return cd;
    }

    public CohortDefinition receivingPEPWithin72HrsMsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("receivingPEPWithin72HrsMsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("receivingPEPWithin72HrsMsw");

        return cd;
    }

    public CohortDefinition receivingPEPWithin72HrsPwid(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("receivingPEPWithin72HrsPwid");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("receivingPEPWithin72HrsPwid");

        return cd;
    }

    public CohortDefinition  receivingPEPWithin72HrsPwud(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("receivingPEPWithin72HrsPwud");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("receivingPEPWithin72HrsPwud");

        return cd;
    }

    public CohortDefinition receivingPEPWithin72HrsTransgender(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("receivingPEPWithin72HrsTransgender");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("receivingPEPWithin72HrsTransgender");

        return cd;
    }

    public CohortDefinition completedPEPWith28DaysFsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("completedPEPWith28DaysFsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("completedPEPWith28DaysFsw");

        return cd;
    }
    public CohortDefinition completedPEPWith28DaysMsm(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("completedPEPWith28DaysMsm");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("completedPEPWith28DaysMsm");

        return cd;
    }

    public CohortDefinition completedPEPWith28DaysMsw(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("completedPEPWith28DaysMsw");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("completedPEPWith28DaysMsw");

        return cd;
    }

    public CohortDefinition completedPEPWith28DaysPwid(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("completedPEPWith28DaysPwid");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("completedPEPWith28DaysPwid");

        return cd;
    }

    public CohortDefinition completedPEPWith28DaysPwud(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("completedPEPWith28DaysPwud");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("completedPEPWith28DaysPwud");

        return cd;
    }

    public CohortDefinition completedPEPWith28DaysTransgender(){
        SqlCohortDefinition cd = new SqlCohortDefinition();
        String sqlQuery ="";
        cd.setName("completedPEPWith28DaysTransgender");
        cd.setQuery(sqlQuery);
        cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
        cd.addParameter(new Parameter("endDate", "End Date", Date.class));
        cd.setDescription("completedPEPWith28DaysTransgender");

        return cd;
    }


}
