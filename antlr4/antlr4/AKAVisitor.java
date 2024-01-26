// Generated from AKA.g4 by ANTLR 4.4

    package antlr4;
    import java.util.HashMap;
    import java.util.Map;
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AKAParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AKAVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AKAParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(@NotNull AKAParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#variableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableIdentifier(@NotNull AKAParser.VariableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#mainblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainblock(@NotNull AKAParser.MainblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#programIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramIdentifier(@NotNull AKAParser.ProgramIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#defCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefCall(@NotNull AKAParser.DefCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#guard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard(@NotNull AKAParser.GuardContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(@NotNull AKAParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#defList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefList(@NotNull AKAParser.DefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull AKAParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#elseifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifBlock(@NotNull AKAParser.ElseifBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(@NotNull AKAParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#booleanConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanConstant(@NotNull AKAParser.BooleanConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(@NotNull AKAParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link AKAParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberFactor(@NotNull AKAParser.NumberFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link AKAParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFactor(@NotNull AKAParser.StringFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defCallFactor}
	 * labeled alternative in {@link AKAParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefCallFactor(@NotNull AKAParser.DefCallFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(@NotNull AKAParser.VarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#definitionnoreturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitionnoreturn(@NotNull AKAParser.DefinitionnoreturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#stringConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConstant(@NotNull AKAParser.StringConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(@NotNull AKAParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notFactor}
	 * labeled alternative in {@link AKAParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotFactor(@NotNull AKAParser.NotFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull AKAParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(@NotNull AKAParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull AKAParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanFactor}
	 * labeled alternative in {@link AKAParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFactor(@NotNull AKAParser.BooleanFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#mulOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOperator(@NotNull AKAParser.MulOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#numberConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberConstant(@NotNull AKAParser.NumberConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(@NotNull AKAParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull AKAParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull AKAParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#display}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplay(@NotNull AKAParser.DisplayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#relOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOperator(@NotNull AKAParser.RelOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(@NotNull AKAParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#funcblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncblock(@NotNull AKAParser.FuncblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull AKAParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull AKAParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull AKAParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(@NotNull AKAParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#addOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOperator(@NotNull AKAParser.AddOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#varList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarList(@NotNull AKAParser.VarListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs(@NotNull AKAParser.LhsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableFactor}
	 * labeled alternative in {@link AKAParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableFactor(@NotNull AKAParser.VariableFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(@NotNull AKAParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull AKAParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedFactor}
	 * labeled alternative in {@link AKAParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedFactor(@NotNull AKAParser.ParenthesizedFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#defName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefName(@NotNull AKAParser.DefNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AKAParser#rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRhs(@NotNull AKAParser.RhsContext ctx);
}