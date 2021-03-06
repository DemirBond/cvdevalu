package com.szg_tech.cvdevaluator.entities.evaluation_items;

import android.content.Context;

import com.szg_tech.cvdevaluator.R;
import com.szg_tech.cvdevaluator.core.ConfigurationParams;
import com.szg_tech.cvdevaluator.entities.EvaluationItem;
import com.szg_tech.cvdevaluator.entities.evaluation_item_elements.BoldEvaluationItem;
import com.szg_tech.cvdevaluator.entities.evaluation_item_elements.BooleanEvaluationItem;
import com.szg_tech.cvdevaluator.entities.evaluation_item_elements.NumericalDependantEvaluationItem;
import com.szg_tech.cvdevaluator.entities.evaluation_item_elements.NumericalEvaluationItem;
import com.szg_tech.cvdevaluator.entities.evaluation_item_elements.SectionCheckboxEvaluationItem;
import com.szg_tech.cvdevaluator.entities.evaluation_item_elements.SectionEvaluationItem;

import java.util.ArrayList;

class Laboratories extends SectionEvaluationItem {
    Laboratories(Context context) {
        super(context, ConfigurationParams.LABORATORIES, null, false);
        name = context.getString(R.string.laboratories);
        this.evaluationItemList = createEvaluationItemElementsList();
        sectionElementState = SectionEvaluationItem.SectionElementState.LOCKED;
    }

    private ArrayList<EvaluationItem> createEvaluationItemElementsList() {
        return new ArrayList<EvaluationItem>() {
            {
                add(new BoldEvaluationItem(context, ConfigurationParams.CHEM_BASIC, context.getString(R.string.chem_basic), false));
                add(new NumericalEvaluationItem(context, ConfigurationParams.NA_MEQ_L, context.getString(R.string.na_meq_l), context.getString(R.string.value), 99, 170, false, true));
                add(new NumericalDependantEvaluationItem(context, ConfigurationParams.URINE_NA_MEQ_L, context.getString(R.string.urine_na_meq_l), context.getString(R.string.value), 1, 200, false, true,
                        ConfigurationParams.NA_MEQ_L, 99, 130));
                add(new NumericalDependantEvaluationItem(context, ConfigurationParams.SERUM_OSMOLALITY, context.getString(R.string.serum_osmolality), context.getString(R.string.value), 200, 400, false, true,
                        ConfigurationParams.NA_MEQ_L, 99, 130));
                add(new NumericalDependantEvaluationItem(context, ConfigurationParams.URINE_OSMOLALITY, context.getString(R.string.urine_osmolality), context.getString(R.string.value), 200, 1000, false, true,
                        ConfigurationParams.NA_MEQ_L, 99, 130));
                add(new NumericalEvaluationItem(context, ConfigurationParams.K_MEQ_L, context.getString(R.string.k_meq_l), context.getString(R.string.value), 2, 9, false));
                add(new NumericalEvaluationItem(context, ConfigurationParams.CREATININE_MG_DL, "Creatinine", context.getString(R.string.value), 0.4, 20, false));
                add(new NumericalEvaluationItem(context, ConfigurationParams.BUN_MG_DL, context.getString(R.string.bun_mg_dl), context.getString(R.string.value), 6, 200, false, true));
                add(new NumericalEvaluationItem(context, ConfigurationParams.FASTING_PLASMA_GLUCOSE, "Glucose mg/dl", context.getString(R.string.value), 35, 1000, false, true));
                add(new NumericalEvaluationItem(context, ConfigurationParams.GFR_ML_MIN, "GFR", context.getString(R.string.value), 5, 120, false, true) {

                });
                add(new BooleanEvaluationItem(context, ConfigurationParams.WORSENING_RENAL_FX, context.getString(R.string.worsening_renal_fx), false));
                add(new BoldEvaluationItem(context, ConfigurationParams.LIPID_PROFILE, context.getString(R.string.lipid_profile), false));
                add(new BooleanEvaluationItem(context, ConfigurationParams.ALREADY_ON_STATIN, context.getString(R.string.already_on_statin), false));
                add(new BooleanEvaluationItem(context, ConfigurationParams.STATIN_INTOLERANCE, context.getString(R.string.statin_intolerance), false));

                add(new NumericalEvaluationItem(context, ConfigurationParams.CHOLESTEROL, context.getString(R.string.cholesterol), context.getString(R.string.value), 40, 500, false, true));
                add(new NumericalEvaluationItem(context, ConfigurationParams.TRG, context.getString(R.string.trg), context.getString(R.string.value), 25, 25000, false, true));
                add(new NumericalEvaluationItem(context, ConfigurationParams.LDL_C, context.getString(R.string.ldl_c), context.getString(R.string.value), 0, 500, false, true));
                add(new NumericalEvaluationItem(context, ConfigurationParams.HDL_C, context.getString(R.string.hdl_c), context.getString(R.string.value), 1, 200, false, true));
                add(new NumericalEvaluationItem(context, ConfigurationParams.APO_B, context.getString(R.string.apo_b), context.getString(R.string.value), 0, 400, false, true));
                add(new NumericalEvaluationItem(context, ConfigurationParams.LDL_P, context.getString(R.string.ldl_p), context.getString(R.string.value), 100, 5000, false, true));
                add(new NumericalEvaluationItem(context, ConfigurationParams.LPA_MG_DL, context.getString(R.string.lpa_mg_dl), context.getString(R.string.value), 1, 500, false, true));
                add(new NumericalEvaluationItem(context, ConfigurationParams.ASCVD_RISK, context.getString(R.string.ascvd_risk), context.getString(R.string.value), 0.1, 30, false));

                add(new BoldEvaluationItem(context, ConfigurationParams.OTHERS, context.getString(R.string.others), false));
                add(new NumericalEvaluationItem(context, ConfigurationParams.HBA1C, context.getString(R.string.hba1c), context.getString(R.string.value), 4.9, 19.99, false));
                add(new NumericalEvaluationItem(context, ConfigurationParams.CRP_MG_L, context.getString(R.string.crp_mg_l), context.getString(R.string.value), 0.1, 30, false));
                add(new NumericalEvaluationItem(context, ConfigurationParams.NT_PROBNP_PG_ML, context.getString(R.string.nt_probnp_pg_ml), context.getString(R.string.value), 50, 100000, false, true));
                add(new NumericalEvaluationItem(context, ConfigurationParams.BNP_PG_ML, context.getString(R.string.bnp_pg_ml), context.getString(R.string.value), 10, 100000, false, true));
                add(new NumericalEvaluationItem(context, ConfigurationParams.ALBUMINURIA_MG_GM_OR_MG_24HR, context.getString(R.string.albuminuria_mg_gm_or_mg_24hr), context.getString(R.string.value), 1, 10000, false, true));
                add(new SectionCheckboxEvaluationItem(context, ConfigurationParams.URINE, "Abnormal urine sediment", false, new ArrayList<EvaluationItem>() {
                    {
                        add(new BooleanEvaluationItem(context, ConfigurationParams.RBC, "Isolated RBC", false));
                        add(new BooleanEvaluationItem(context, ConfigurationParams.RBCCAST, "RBC cast", false));
                        add(new BooleanEvaluationItem(context, ConfigurationParams.WBCCAST, "WBC cast", false));
                        add(new BooleanEvaluationItem(context, ConfigurationParams.GRANULAR, "Granular cast", false));
                        add(new BooleanEvaluationItem(context, ConfigurationParams.OVAL, "Oval cell bodies", false));

                    }
                }));
            }
        };
    }
}
