// Generated from D:/Documents/University/Part II Project/Interactive Fiction with KRaR/src/ProcessInput\EditorGrammar.g4 by ANTLR 4.9.2
package ProcessInput.GrammarFiles;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EditorGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EditorGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#alpha_numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlpha_numeric(EditorGrammarParser.Alpha_numericContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#num_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_int(EditorGrammarParser.Num_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#num_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_float(EditorGrammarParser.Num_floatContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(EditorGrammarParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(EditorGrammarParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(EditorGrammarParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(EditorGrammarParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#flag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlag(EditorGrammarParser.FlagContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#id_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_entry(EditorGrammarParser.Id_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#loc_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoc_entry(EditorGrammarParser.Loc_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#name_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_entry(EditorGrammarParser.Name_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#desc_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesc_entry(EditorGrammarParser.Desc_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#flags_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlags_entry(EditorGrammarParser.Flags_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#values_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_entry(EditorGrammarParser.Values_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#dir_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDir_entry(EditorGrammarParser.Dir_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#action_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction_entry(EditorGrammarParser.Action_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#global_flag_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_flag_entry(EditorGrammarParser.Global_flag_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#flag_val_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlag_val_entry(EditorGrammarParser.Flag_val_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(EditorGrammarParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#room}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoom(EditorGrammarParser.RoomContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(EditorGrammarParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#global_flag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_flag(EditorGrammarParser.Global_flagContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#action_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction_block(EditorGrammarParser.Action_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(EditorGrammarParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(EditorGrammarParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#effects}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEffects(EditorGrammarParser.EffectsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#effect_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEffect_aux(EditorGrammarParser.Effect_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#condition_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_aux(EditorGrammarParser.Condition_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#prsa_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrsa_cond(EditorGrammarParser.Prsa_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#prso_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrso_cond(EditorGrammarParser.Prso_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#prsi_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrsi_cond(EditorGrammarParser.Prsi_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#here_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHere_cond(EditorGrammarParser.Here_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#andflags_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndflags_cond(EditorGrammarParser.Andflags_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#orflags_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrflags_cond(EditorGrammarParser.Orflags_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#haveitem_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaveitem_cond(EditorGrammarParser.Haveitem_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#haveitems_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaveitems_cond(EditorGrammarParser.Haveitems_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#equals_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals_cond(EditorGrammarParser.Equals_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#gt_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGt_cond(EditorGrammarParser.Gt_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#lt_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt_cond(EditorGrammarParser.Lt_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(EditorGrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#tell_eff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTell_eff(EditorGrammarParser.Tell_effContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#goto_eff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_eff(EditorGrammarParser.Goto_effContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#setflag_eff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetflag_eff(EditorGrammarParser.Setflag_effContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#remflag_eff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemflag_eff(EditorGrammarParser.Remflag_effContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#take_eff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTake_eff(EditorGrammarParser.Take_effContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#place_eff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlace_eff(EditorGrammarParser.Place_effContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#set_eff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_eff(EditorGrammarParser.Set_effContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#effect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEffect(EditorGrammarParser.EffectContext ctx);
	/**
	 * Visit a parse tree produced by {@link EditorGrammarParser#game_grammar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGame_grammar(EditorGrammarParser.Game_grammarContext ctx);
}