// Generated from D:/Documents/University/Part II Project/Interactive Fiction with KRaR/src/ProcessInput\editorGrammar.g4 by ANTLR 4.9.2
package ProcessInput;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link editorGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface editorGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#id_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_entry(editorGrammarParser.Id_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#loc_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoc_entry(editorGrammarParser.Loc_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#name_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_entry(editorGrammarParser.Name_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#desc_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesc_entry(editorGrammarParser.Desc_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#flags_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlags_entry(editorGrammarParser.Flags_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#values_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_entry(editorGrammarParser.Values_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#dir_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDir_entry(editorGrammarParser.Dir_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#action_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction_entry(editorGrammarParser.Action_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(editorGrammarParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(editorGrammarParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#room}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoom(editorGrammarParser.RoomContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(editorGrammarParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#action_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction_block(editorGrammarParser.Action_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(editorGrammarParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(editorGrammarParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#effects}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEffects(editorGrammarParser.EffectsContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#effect_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEffect_aux(editorGrammarParser.Effect_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#condition_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_aux(editorGrammarParser.Condition_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#prsa_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrsa_cond(editorGrammarParser.Prsa_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#prso_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrso_cond(editorGrammarParser.Prso_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#prsi_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrsi_cond(editorGrammarParser.Prsi_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#here_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHere_cond(editorGrammarParser.Here_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#andflags_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndflags_cond(editorGrammarParser.Andflags_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#orflags_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrflags_cond(editorGrammarParser.Orflags_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#haveitem_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaveitem_cond(editorGrammarParser.Haveitem_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#haveitems_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaveitems_cond(editorGrammarParser.Haveitems_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#equals_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals_cond(editorGrammarParser.Equals_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#gt_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGt_cond(editorGrammarParser.Gt_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#lt_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt_cond(editorGrammarParser.Lt_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(editorGrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#tell_eff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTell_eff(editorGrammarParser.Tell_effContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#goto_eff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_eff(editorGrammarParser.Goto_effContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#setflag_eff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetflag_eff(editorGrammarParser.Setflag_effContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#remflag_eff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemflag_eff(editorGrammarParser.Remflag_effContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#take_eff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTake_eff(editorGrammarParser.Take_effContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#place_eff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlace_eff(editorGrammarParser.Place_effContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#set_eff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_eff(editorGrammarParser.Set_effContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#effect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEffect(editorGrammarParser.EffectContext ctx);
	/**
	 * Visit a parse tree produced by {@link editorGrammarParser#game_grammar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGame_grammar(editorGrammarParser.Game_grammarContext ctx);
}