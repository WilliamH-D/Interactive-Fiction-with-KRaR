// Generated from D:/Documents/University/Part II Project/Interactive Fiction with KRaR/src/ProcessInput\EditorGrammar.g4 by ANTLR 4.9.2
package ProcessInput.GrammarFiles;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link EditorGrammarVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class EditorGrammarBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements EditorGrammarVisitor<T> {

	@Override public T visitAlpha_numeric(EditorGrammarParser.Alpha_numericContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitNum_int(EditorGrammarParser.Num_intContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitNum_float(EditorGrammarParser.Num_floatContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitNumber(EditorGrammarParser.NumberContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitBool(EditorGrammarParser.BoolContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitVar(EditorGrammarParser.VarContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitAnd(EditorGrammarParser.AndContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitOr(EditorGrammarParser.OrContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitNot(EditorGrammarParser.NotContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitValue(EditorGrammarParser.ValueContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitFlag(EditorGrammarParser.FlagContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitId_entry(EditorGrammarParser.Id_entryContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitLoc_entry(EditorGrammarParser.Loc_entryContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitName_entry(EditorGrammarParser.Name_entryContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitDesc_entry(EditorGrammarParser.Desc_entryContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitFlags_entry(EditorGrammarParser.Flags_entryContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitValues_entry(EditorGrammarParser.Values_entryContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitDir_entry(EditorGrammarParser.Dir_entryContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitAction_entry(EditorGrammarParser.Action_entryContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitObject(EditorGrammarParser.ObjectContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitRoom(EditorGrammarParser.RoomContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitAction(EditorGrammarParser.ActionContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitAction_block(EditorGrammarParser.Action_blockContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitConditional(EditorGrammarParser.ConditionalContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitConditions(EditorGrammarParser.ConditionsContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitEffects(EditorGrammarParser.EffectsContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitEffect_aux(EditorGrammarParser.Effect_auxContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitCondition_aux(EditorGrammarParser.Condition_auxContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitPrsa_cond(EditorGrammarParser.Prsa_condContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitPrso_cond(EditorGrammarParser.Prso_condContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitPrsi_cond(EditorGrammarParser.Prsi_condContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitHere_cond(EditorGrammarParser.Here_condContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitAndflags_cond(EditorGrammarParser.Andflags_condContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitOrflags_cond(EditorGrammarParser.Orflags_condContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitHaveitem_cond(EditorGrammarParser.Haveitem_condContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitHaveitems_cond(EditorGrammarParser.Haveitems_condContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitEquals_cond(EditorGrammarParser.Equals_condContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitGt_cond(EditorGrammarParser.Gt_condContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitLt_cond(EditorGrammarParser.Lt_condContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitCondition(EditorGrammarParser.ConditionContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitTell_eff(EditorGrammarParser.Tell_effContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitGoto_eff(EditorGrammarParser.Goto_effContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitSetflag_eff(EditorGrammarParser.Setflag_effContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitRemflag_eff(EditorGrammarParser.Remflag_effContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitTake_eff(EditorGrammarParser.Take_effContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitPlace_eff(EditorGrammarParser.Place_effContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitSet_eff(EditorGrammarParser.Set_effContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitEffect(EditorGrammarParser.EffectContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitGame_grammar(EditorGrammarParser.Game_grammarContext ctx) { return visitChildren(ctx); }
}