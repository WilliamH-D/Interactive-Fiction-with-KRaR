// Generated from D:/Documents/University/Part II Project/Interactive Fiction with KRaR/src/ProcessInput\EditorGrammar.g4 by ANTLR 4.9.2
package ProcessInput.GrammarFiles;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EditorGrammarParser}.
 */
public interface EditorGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#alpha_numeric}.
	 * @param ctx the parse tree
	 */
	void enterAlpha_numeric(EditorGrammarParser.Alpha_numericContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#alpha_numeric}.
	 * @param ctx the parse tree
	 */
	void exitAlpha_numeric(EditorGrammarParser.Alpha_numericContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#num_int}.
	 * @param ctx the parse tree
	 */
	void enterNum_int(EditorGrammarParser.Num_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#num_int}.
	 * @param ctx the parse tree
	 */
	void exitNum_int(EditorGrammarParser.Num_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#num_float}.
	 * @param ctx the parse tree
	 */
	void enterNum_float(EditorGrammarParser.Num_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#num_float}.
	 * @param ctx the parse tree
	 */
	void exitNum_float(EditorGrammarParser.Num_floatContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(EditorGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(EditorGrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(EditorGrammarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(EditorGrammarParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(EditorGrammarParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(EditorGrammarParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(EditorGrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(EditorGrammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#flag}.
	 * @param ctx the parse tree
	 */
	void enterFlag(EditorGrammarParser.FlagContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#flag}.
	 * @param ctx the parse tree
	 */
	void exitFlag(EditorGrammarParser.FlagContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#id_entry}.
	 * @param ctx the parse tree
	 */
	void enterId_entry(EditorGrammarParser.Id_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#id_entry}.
	 * @param ctx the parse tree
	 */
	void exitId_entry(EditorGrammarParser.Id_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#loc_entry}.
	 * @param ctx the parse tree
	 */
	void enterLoc_entry(EditorGrammarParser.Loc_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#loc_entry}.
	 * @param ctx the parse tree
	 */
	void exitLoc_entry(EditorGrammarParser.Loc_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#loc_type_entry}.
	 * @param ctx the parse tree
	 */
	void enterLoc_type_entry(EditorGrammarParser.Loc_type_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#loc_type_entry}.
	 * @param ctx the parse tree
	 */
	void exitLoc_type_entry(EditorGrammarParser.Loc_type_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#name_entry}.
	 * @param ctx the parse tree
	 */
	void enterName_entry(EditorGrammarParser.Name_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#name_entry}.
	 * @param ctx the parse tree
	 */
	void exitName_entry(EditorGrammarParser.Name_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#desc_entry}.
	 * @param ctx the parse tree
	 */
	void enterDesc_entry(EditorGrammarParser.Desc_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#desc_entry}.
	 * @param ctx the parse tree
	 */
	void exitDesc_entry(EditorGrammarParser.Desc_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#alt_desc_entry}.
	 * @param ctx the parse tree
	 */
	void enterAlt_desc_entry(EditorGrammarParser.Alt_desc_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#alt_desc_entry}.
	 * @param ctx the parse tree
	 */
	void exitAlt_desc_entry(EditorGrammarParser.Alt_desc_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#flag_conditions}.
	 * @param ctx the parse tree
	 */
	void enterFlag_conditions(EditorGrammarParser.Flag_conditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#flag_conditions}.
	 * @param ctx the parse tree
	 */
	void exitFlag_conditions(EditorGrammarParser.Flag_conditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#synonyms_entry}.
	 * @param ctx the parse tree
	 */
	void enterSynonyms_entry(EditorGrammarParser.Synonyms_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#synonyms_entry}.
	 * @param ctx the parse tree
	 */
	void exitSynonyms_entry(EditorGrammarParser.Synonyms_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#properties_entry}.
	 * @param ctx the parse tree
	 */
	void enterProperties_entry(EditorGrammarParser.Properties_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#properties_entry}.
	 * @param ctx the parse tree
	 */
	void exitProperties_entry(EditorGrammarParser.Properties_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#values_entry}.
	 * @param ctx the parse tree
	 */
	void enterValues_entry(EditorGrammarParser.Values_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#values_entry}.
	 * @param ctx the parse tree
	 */
	void exitValues_entry(EditorGrammarParser.Values_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#north_entry}.
	 * @param ctx the parse tree
	 */
	void enterNorth_entry(EditorGrammarParser.North_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#north_entry}.
	 * @param ctx the parse tree
	 */
	void exitNorth_entry(EditorGrammarParser.North_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#south_entry}.
	 * @param ctx the parse tree
	 */
	void enterSouth_entry(EditorGrammarParser.South_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#south_entry}.
	 * @param ctx the parse tree
	 */
	void exitSouth_entry(EditorGrammarParser.South_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#east_entry}.
	 * @param ctx the parse tree
	 */
	void enterEast_entry(EditorGrammarParser.East_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#east_entry}.
	 * @param ctx the parse tree
	 */
	void exitEast_entry(EditorGrammarParser.East_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#west_entry}.
	 * @param ctx the parse tree
	 */
	void enterWest_entry(EditorGrammarParser.West_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#west_entry}.
	 * @param ctx the parse tree
	 */
	void exitWest_entry(EditorGrammarParser.West_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#up_entry}.
	 * @param ctx the parse tree
	 */
	void enterUp_entry(EditorGrammarParser.Up_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#up_entry}.
	 * @param ctx the parse tree
	 */
	void exitUp_entry(EditorGrammarParser.Up_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#down_entry}.
	 * @param ctx the parse tree
	 */
	void enterDown_entry(EditorGrammarParser.Down_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#down_entry}.
	 * @param ctx the parse tree
	 */
	void exitDown_entry(EditorGrammarParser.Down_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#north_cond}.
	 * @param ctx the parse tree
	 */
	void enterNorth_cond(EditorGrammarParser.North_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#north_cond}.
	 * @param ctx the parse tree
	 */
	void exitNorth_cond(EditorGrammarParser.North_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#south_cond}.
	 * @param ctx the parse tree
	 */
	void enterSouth_cond(EditorGrammarParser.South_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#south_cond}.
	 * @param ctx the parse tree
	 */
	void exitSouth_cond(EditorGrammarParser.South_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#east_cond}.
	 * @param ctx the parse tree
	 */
	void enterEast_cond(EditorGrammarParser.East_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#east_cond}.
	 * @param ctx the parse tree
	 */
	void exitEast_cond(EditorGrammarParser.East_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#west_cond}.
	 * @param ctx the parse tree
	 */
	void enterWest_cond(EditorGrammarParser.West_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#west_cond}.
	 * @param ctx the parse tree
	 */
	void exitWest_cond(EditorGrammarParser.West_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#up_cond}.
	 * @param ctx the parse tree
	 */
	void enterUp_cond(EditorGrammarParser.Up_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#up_cond}.
	 * @param ctx the parse tree
	 */
	void exitUp_cond(EditorGrammarParser.Up_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#down_cond}.
	 * @param ctx the parse tree
	 */
	void enterDown_cond(EditorGrammarParser.Down_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#down_cond}.
	 * @param ctx the parse tree
	 */
	void exitDown_cond(EditorGrammarParser.Down_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#hidden}.
	 * @param ctx the parse tree
	 */
	void enterHidden(EditorGrammarParser.HiddenContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#hidden}.
	 * @param ctx the parse tree
	 */
	void exitHidden(EditorGrammarParser.HiddenContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#north_block_message}.
	 * @param ctx the parse tree
	 */
	void enterNorth_block_message(EditorGrammarParser.North_block_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#north_block_message}.
	 * @param ctx the parse tree
	 */
	void exitNorth_block_message(EditorGrammarParser.North_block_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#south_block_message}.
	 * @param ctx the parse tree
	 */
	void enterSouth_block_message(EditorGrammarParser.South_block_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#south_block_message}.
	 * @param ctx the parse tree
	 */
	void exitSouth_block_message(EditorGrammarParser.South_block_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#east_block_message}.
	 * @param ctx the parse tree
	 */
	void enterEast_block_message(EditorGrammarParser.East_block_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#east_block_message}.
	 * @param ctx the parse tree
	 */
	void exitEast_block_message(EditorGrammarParser.East_block_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#west_block_message}.
	 * @param ctx the parse tree
	 */
	void enterWest_block_message(EditorGrammarParser.West_block_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#west_block_message}.
	 * @param ctx the parse tree
	 */
	void exitWest_block_message(EditorGrammarParser.West_block_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#up_block_message}.
	 * @param ctx the parse tree
	 */
	void enterUp_block_message(EditorGrammarParser.Up_block_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#up_block_message}.
	 * @param ctx the parse tree
	 */
	void exitUp_block_message(EditorGrammarParser.Up_block_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#down_block_message}.
	 * @param ctx the parse tree
	 */
	void enterDown_block_message(EditorGrammarParser.Down_block_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#down_block_message}.
	 * @param ctx the parse tree
	 */
	void exitDown_block_message(EditorGrammarParser.Down_block_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#action_entry}.
	 * @param ctx the parse tree
	 */
	void enterAction_entry(EditorGrammarParser.Action_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#action_entry}.
	 * @param ctx the parse tree
	 */
	void exitAction_entry(EditorGrammarParser.Action_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#global_flag_entry}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_flag_entry(EditorGrammarParser.Global_flag_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#global_flag_entry}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_flag_entry(EditorGrammarParser.Global_flag_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#flag_val_entry}.
	 * @param ctx the parse tree
	 */
	void enterFlag_val_entry(EditorGrammarParser.Flag_val_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#flag_val_entry}.
	 * @param ctx the parse tree
	 */
	void exitFlag_val_entry(EditorGrammarParser.Flag_val_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#det_entry}.
	 * @param ctx the parse tree
	 */
	void enterDet_entry(EditorGrammarParser.Det_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#det_entry}.
	 * @param ctx the parse tree
	 */
	void exitDet_entry(EditorGrammarParser.Det_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(EditorGrammarParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(EditorGrammarParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#room}.
	 * @param ctx the parse tree
	 */
	void enterRoom(EditorGrammarParser.RoomContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#room}.
	 * @param ctx the parse tree
	 */
	void exitRoom(EditorGrammarParser.RoomContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(EditorGrammarParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(EditorGrammarParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#global_flag}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_flag(EditorGrammarParser.Global_flagContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#global_flag}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_flag(EditorGrammarParser.Global_flagContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#action_block}.
	 * @param ctx the parse tree
	 */
	void enterAction_block(EditorGrammarParser.Action_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#action_block}.
	 * @param ctx the parse tree
	 */
	void exitAction_block(EditorGrammarParser.Action_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(EditorGrammarParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(EditorGrammarParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(EditorGrammarParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(EditorGrammarParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#effect_aux}.
	 * @param ctx the parse tree
	 */
	void enterEffect_aux(EditorGrammarParser.Effect_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#effect_aux}.
	 * @param ctx the parse tree
	 */
	void exitEffect_aux(EditorGrammarParser.Effect_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#condition_aux}.
	 * @param ctx the parse tree
	 */
	void enterCondition_aux(EditorGrammarParser.Condition_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#condition_aux}.
	 * @param ctx the parse tree
	 */
	void exitCondition_aux(EditorGrammarParser.Condition_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#prsa_cond}.
	 * @param ctx the parse tree
	 */
	void enterPrsa_cond(EditorGrammarParser.Prsa_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#prsa_cond}.
	 * @param ctx the parse tree
	 */
	void exitPrsa_cond(EditorGrammarParser.Prsa_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#prsa_and_cond}.
	 * @param ctx the parse tree
	 */
	void enterPrsa_and_cond(EditorGrammarParser.Prsa_and_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#prsa_and_cond}.
	 * @param ctx the parse tree
	 */
	void exitPrsa_and_cond(EditorGrammarParser.Prsa_and_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#prso_cond}.
	 * @param ctx the parse tree
	 */
	void enterPrso_cond(EditorGrammarParser.Prso_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#prso_cond}.
	 * @param ctx the parse tree
	 */
	void exitPrso_cond(EditorGrammarParser.Prso_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#prsi_cond}.
	 * @param ctx the parse tree
	 */
	void enterPrsi_cond(EditorGrammarParser.Prsi_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#prsi_cond}.
	 * @param ctx the parse tree
	 */
	void exitPrsi_cond(EditorGrammarParser.Prsi_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#here_cond}.
	 * @param ctx the parse tree
	 */
	void enterHere_cond(EditorGrammarParser.Here_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#here_cond}.
	 * @param ctx the parse tree
	 */
	void exitHere_cond(EditorGrammarParser.Here_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#inscope_cond}.
	 * @param ctx the parse tree
	 */
	void enterInscope_cond(EditorGrammarParser.Inscope_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#inscope_cond}.
	 * @param ctx the parse tree
	 */
	void exitInscope_cond(EditorGrammarParser.Inscope_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#andflags_cond}.
	 * @param ctx the parse tree
	 */
	void enterAndflags_cond(EditorGrammarParser.Andflags_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#andflags_cond}.
	 * @param ctx the parse tree
	 */
	void exitAndflags_cond(EditorGrammarParser.Andflags_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#orflags_cond}.
	 * @param ctx the parse tree
	 */
	void enterOrflags_cond(EditorGrammarParser.Orflags_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#orflags_cond}.
	 * @param ctx the parse tree
	 */
	void exitOrflags_cond(EditorGrammarParser.Orflags_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#andproperties_cond}.
	 * @param ctx the parse tree
	 */
	void enterAndproperties_cond(EditorGrammarParser.Andproperties_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#andproperties_cond}.
	 * @param ctx the parse tree
	 */
	void exitAndproperties_cond(EditorGrammarParser.Andproperties_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#orproperties_cond}.
	 * @param ctx the parse tree
	 */
	void enterOrproperties_cond(EditorGrammarParser.Orproperties_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#orproperties_cond}.
	 * @param ctx the parse tree
	 */
	void exitOrproperties_cond(EditorGrammarParser.Orproperties_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#flagvalue_cond}.
	 * @param ctx the parse tree
	 */
	void enterFlagvalue_cond(EditorGrammarParser.Flagvalue_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#flagvalue_cond}.
	 * @param ctx the parse tree
	 */
	void exitFlagvalue_cond(EditorGrammarParser.Flagvalue_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#haveitem_cond}.
	 * @param ctx the parse tree
	 */
	void enterHaveitem_cond(EditorGrammarParser.Haveitem_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#haveitem_cond}.
	 * @param ctx the parse tree
	 */
	void exitHaveitem_cond(EditorGrammarParser.Haveitem_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#haveitems_cond}.
	 * @param ctx the parse tree
	 */
	void enterHaveitems_cond(EditorGrammarParser.Haveitems_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#haveitems_cond}.
	 * @param ctx the parse tree
	 */
	void exitHaveitems_cond(EditorGrammarParser.Haveitems_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#equals_cond}.
	 * @param ctx the parse tree
	 */
	void enterEquals_cond(EditorGrammarParser.Equals_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#equals_cond}.
	 * @param ctx the parse tree
	 */
	void exitEquals_cond(EditorGrammarParser.Equals_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#gt_cond}.
	 * @param ctx the parse tree
	 */
	void enterGt_cond(EditorGrammarParser.Gt_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#gt_cond}.
	 * @param ctx the parse tree
	 */
	void exitGt_cond(EditorGrammarParser.Gt_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#lt_cond}.
	 * @param ctx the parse tree
	 */
	void enterLt_cond(EditorGrammarParser.Lt_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#lt_cond}.
	 * @param ctx the parse tree
	 */
	void exitLt_cond(EditorGrammarParser.Lt_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(EditorGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(EditorGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#tell_eff}.
	 * @param ctx the parse tree
	 */
	void enterTell_eff(EditorGrammarParser.Tell_effContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#tell_eff}.
	 * @param ctx the parse tree
	 */
	void exitTell_eff(EditorGrammarParser.Tell_effContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#goto_eff}.
	 * @param ctx the parse tree
	 */
	void enterGoto_eff(EditorGrammarParser.Goto_effContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#goto_eff}.
	 * @param ctx the parse tree
	 */
	void exitGoto_eff(EditorGrammarParser.Goto_effContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#setflag_eff}.
	 * @param ctx the parse tree
	 */
	void enterSetflag_eff(EditorGrammarParser.Setflag_effContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#setflag_eff}.
	 * @param ctx the parse tree
	 */
	void exitSetflag_eff(EditorGrammarParser.Setflag_effContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#remflag_eff}.
	 * @param ctx the parse tree
	 */
	void enterRemflag_eff(EditorGrammarParser.Remflag_effContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#remflag_eff}.
	 * @param ctx the parse tree
	 */
	void exitRemflag_eff(EditorGrammarParser.Remflag_effContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#take_eff}.
	 * @param ctx the parse tree
	 */
	void enterTake_eff(EditorGrammarParser.Take_effContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#take_eff}.
	 * @param ctx the parse tree
	 */
	void exitTake_eff(EditorGrammarParser.Take_effContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#place_eff}.
	 * @param ctx the parse tree
	 */
	void enterPlace_eff(EditorGrammarParser.Place_effContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#place_eff}.
	 * @param ctx the parse tree
	 */
	void exitPlace_eff(EditorGrammarParser.Place_effContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#set_var_eff}.
	 * @param ctx the parse tree
	 */
	void enterSet_var_eff(EditorGrammarParser.Set_var_effContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#set_var_eff}.
	 * @param ctx the parse tree
	 */
	void exitSet_var_eff(EditorGrammarParser.Set_var_effContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#inc_var_eff}.
	 * @param ctx the parse tree
	 */
	void enterInc_var_eff(EditorGrammarParser.Inc_var_effContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#inc_var_eff}.
	 * @param ctx the parse tree
	 */
	void exitInc_var_eff(EditorGrammarParser.Inc_var_effContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#dec_var_eff}.
	 * @param ctx the parse tree
	 */
	void enterDec_var_eff(EditorGrammarParser.Dec_var_effContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#dec_var_eff}.
	 * @param ctx the parse tree
	 */
	void exitDec_var_eff(EditorGrammarParser.Dec_var_effContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#effect}.
	 * @param ctx the parse tree
	 */
	void enterEffect(EditorGrammarParser.EffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#effect}.
	 * @param ctx the parse tree
	 */
	void exitEffect(EditorGrammarParser.EffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link EditorGrammarParser#game_grammar}.
	 * @param ctx the parse tree
	 */
	void enterGame_grammar(EditorGrammarParser.Game_grammarContext ctx);
	/**
	 * Exit a parse tree produced by {@link EditorGrammarParser#game_grammar}.
	 * @param ctx the parse tree
	 */
	void exitGame_grammar(EditorGrammarParser.Game_grammarContext ctx);
}