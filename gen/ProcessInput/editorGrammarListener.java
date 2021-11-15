// Generated from D:/Documents/University/Part II Project/Interactive Fiction with KRaR/src/ProcessInput\editorGrammar.g4 by ANTLR 4.9.2
package ProcessInput;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link editorGrammarParser}.
 */
public interface editorGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#id_entry}.
	 * @param ctx the parse tree
	 */
	void enterId_entry(editorGrammarParser.Id_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#id_entry}.
	 * @param ctx the parse tree
	 */
	void exitId_entry(editorGrammarParser.Id_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#loc_entry}.
	 * @param ctx the parse tree
	 */
	void enterLoc_entry(editorGrammarParser.Loc_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#loc_entry}.
	 * @param ctx the parse tree
	 */
	void exitLoc_entry(editorGrammarParser.Loc_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#name_entry}.
	 * @param ctx the parse tree
	 */
	void enterName_entry(editorGrammarParser.Name_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#name_entry}.
	 * @param ctx the parse tree
	 */
	void exitName_entry(editorGrammarParser.Name_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#desc_entry}.
	 * @param ctx the parse tree
	 */
	void enterDesc_entry(editorGrammarParser.Desc_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#desc_entry}.
	 * @param ctx the parse tree
	 */
	void exitDesc_entry(editorGrammarParser.Desc_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#flags_entry}.
	 * @param ctx the parse tree
	 */
	void enterFlags_entry(editorGrammarParser.Flags_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#flags_entry}.
	 * @param ctx the parse tree
	 */
	void exitFlags_entry(editorGrammarParser.Flags_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#values_entry}.
	 * @param ctx the parse tree
	 */
	void enterValues_entry(editorGrammarParser.Values_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#values_entry}.
	 * @param ctx the parse tree
	 */
	void exitValues_entry(editorGrammarParser.Values_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#dir_entry}.
	 * @param ctx the parse tree
	 */
	void enterDir_entry(editorGrammarParser.Dir_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#dir_entry}.
	 * @param ctx the parse tree
	 */
	void exitDir_entry(editorGrammarParser.Dir_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#action_entry}.
	 * @param ctx the parse tree
	 */
	void enterAction_entry(editorGrammarParser.Action_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#action_entry}.
	 * @param ctx the parse tree
	 */
	void exitAction_entry(editorGrammarParser.Action_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(editorGrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(editorGrammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(editorGrammarParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(editorGrammarParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#room}.
	 * @param ctx the parse tree
	 */
	void enterRoom(editorGrammarParser.RoomContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#room}.
	 * @param ctx the parse tree
	 */
	void exitRoom(editorGrammarParser.RoomContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(editorGrammarParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(editorGrammarParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#action_block}.
	 * @param ctx the parse tree
	 */
	void enterAction_block(editorGrammarParser.Action_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#action_block}.
	 * @param ctx the parse tree
	 */
	void exitAction_block(editorGrammarParser.Action_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(editorGrammarParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(editorGrammarParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(editorGrammarParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(editorGrammarParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#effects}.
	 * @param ctx the parse tree
	 */
	void enterEffects(editorGrammarParser.EffectsContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#effects}.
	 * @param ctx the parse tree
	 */
	void exitEffects(editorGrammarParser.EffectsContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#effect_aux}.
	 * @param ctx the parse tree
	 */
	void enterEffect_aux(editorGrammarParser.Effect_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#effect_aux}.
	 * @param ctx the parse tree
	 */
	void exitEffect_aux(editorGrammarParser.Effect_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#condition_aux}.
	 * @param ctx the parse tree
	 */
	void enterCondition_aux(editorGrammarParser.Condition_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#condition_aux}.
	 * @param ctx the parse tree
	 */
	void exitCondition_aux(editorGrammarParser.Condition_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#prsa_cond}.
	 * @param ctx the parse tree
	 */
	void enterPrsa_cond(editorGrammarParser.Prsa_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#prsa_cond}.
	 * @param ctx the parse tree
	 */
	void exitPrsa_cond(editorGrammarParser.Prsa_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#prso_cond}.
	 * @param ctx the parse tree
	 */
	void enterPrso_cond(editorGrammarParser.Prso_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#prso_cond}.
	 * @param ctx the parse tree
	 */
	void exitPrso_cond(editorGrammarParser.Prso_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#prsi_cond}.
	 * @param ctx the parse tree
	 */
	void enterPrsi_cond(editorGrammarParser.Prsi_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#prsi_cond}.
	 * @param ctx the parse tree
	 */
	void exitPrsi_cond(editorGrammarParser.Prsi_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#here_cond}.
	 * @param ctx the parse tree
	 */
	void enterHere_cond(editorGrammarParser.Here_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#here_cond}.
	 * @param ctx the parse tree
	 */
	void exitHere_cond(editorGrammarParser.Here_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#andflags_cond}.
	 * @param ctx the parse tree
	 */
	void enterAndflags_cond(editorGrammarParser.Andflags_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#andflags_cond}.
	 * @param ctx the parse tree
	 */
	void exitAndflags_cond(editorGrammarParser.Andflags_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#orflags_cond}.
	 * @param ctx the parse tree
	 */
	void enterOrflags_cond(editorGrammarParser.Orflags_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#orflags_cond}.
	 * @param ctx the parse tree
	 */
	void exitOrflags_cond(editorGrammarParser.Orflags_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#haveitem_cond}.
	 * @param ctx the parse tree
	 */
	void enterHaveitem_cond(editorGrammarParser.Haveitem_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#haveitem_cond}.
	 * @param ctx the parse tree
	 */
	void exitHaveitem_cond(editorGrammarParser.Haveitem_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#haveitems_cond}.
	 * @param ctx the parse tree
	 */
	void enterHaveitems_cond(editorGrammarParser.Haveitems_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#haveitems_cond}.
	 * @param ctx the parse tree
	 */
	void exitHaveitems_cond(editorGrammarParser.Haveitems_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#equals_cond}.
	 * @param ctx the parse tree
	 */
	void enterEquals_cond(editorGrammarParser.Equals_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#equals_cond}.
	 * @param ctx the parse tree
	 */
	void exitEquals_cond(editorGrammarParser.Equals_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#gt_cond}.
	 * @param ctx the parse tree
	 */
	void enterGt_cond(editorGrammarParser.Gt_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#gt_cond}.
	 * @param ctx the parse tree
	 */
	void exitGt_cond(editorGrammarParser.Gt_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#lt_cond}.
	 * @param ctx the parse tree
	 */
	void enterLt_cond(editorGrammarParser.Lt_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#lt_cond}.
	 * @param ctx the parse tree
	 */
	void exitLt_cond(editorGrammarParser.Lt_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(editorGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(editorGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#tell_eff}.
	 * @param ctx the parse tree
	 */
	void enterTell_eff(editorGrammarParser.Tell_effContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#tell_eff}.
	 * @param ctx the parse tree
	 */
	void exitTell_eff(editorGrammarParser.Tell_effContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#goto_eff}.
	 * @param ctx the parse tree
	 */
	void enterGoto_eff(editorGrammarParser.Goto_effContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#goto_eff}.
	 * @param ctx the parse tree
	 */
	void exitGoto_eff(editorGrammarParser.Goto_effContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#setflag_eff}.
	 * @param ctx the parse tree
	 */
	void enterSetflag_eff(editorGrammarParser.Setflag_effContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#setflag_eff}.
	 * @param ctx the parse tree
	 */
	void exitSetflag_eff(editorGrammarParser.Setflag_effContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#remflag_eff}.
	 * @param ctx the parse tree
	 */
	void enterRemflag_eff(editorGrammarParser.Remflag_effContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#remflag_eff}.
	 * @param ctx the parse tree
	 */
	void exitRemflag_eff(editorGrammarParser.Remflag_effContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#take_eff}.
	 * @param ctx the parse tree
	 */
	void enterTake_eff(editorGrammarParser.Take_effContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#take_eff}.
	 * @param ctx the parse tree
	 */
	void exitTake_eff(editorGrammarParser.Take_effContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#place_eff}.
	 * @param ctx the parse tree
	 */
	void enterPlace_eff(editorGrammarParser.Place_effContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#place_eff}.
	 * @param ctx the parse tree
	 */
	void exitPlace_eff(editorGrammarParser.Place_effContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#set_eff}.
	 * @param ctx the parse tree
	 */
	void enterSet_eff(editorGrammarParser.Set_effContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#set_eff}.
	 * @param ctx the parse tree
	 */
	void exitSet_eff(editorGrammarParser.Set_effContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#effect}.
	 * @param ctx the parse tree
	 */
	void enterEffect(editorGrammarParser.EffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#effect}.
	 * @param ctx the parse tree
	 */
	void exitEffect(editorGrammarParser.EffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link editorGrammarParser#game_grammar}.
	 * @param ctx the parse tree
	 */
	void enterGame_grammar(editorGrammarParser.Game_grammarContext ctx);
	/**
	 * Exit a parse tree produced by {@link editorGrammarParser#game_grammar}.
	 * @param ctx the parse tree
	 */
	void exitGame_grammar(editorGrammarParser.Game_grammarContext ctx);
}