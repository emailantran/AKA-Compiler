// Generated from AKA.g4 by ANTLR 4.7.2

    package antlr4;
    import java.util.HashMap;
    import java.util.Map;
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AKAParser}.
 */
public interface AKAListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AKAParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AKAParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AKAParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#programIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterProgramIdentifier(AKAParser.ProgramIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#programIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitProgramIdentifier(AKAParser.ProgramIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#defList}.
	 * @param ctx the parse tree
	 */
	void enterDefList(AKAParser.DefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#defList}.
	 * @param ctx the parse tree
	 */
	void exitDefList(AKAParser.DefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#funcblock}.
	 * @param ctx the parse tree
	 */
	void enterFuncblock(AKAParser.FuncblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#funcblock}.
	 * @param ctx the parse tree
	 */
	void exitFuncblock(AKAParser.FuncblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#mainblock}.
	 * @param ctx the parse tree
	 */
	void enterMainblock(AKAParser.MainblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#mainblock}.
	 * @param ctx the parse tree
	 */
	void exitMainblock(AKAParser.MainblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AKAParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AKAParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(AKAParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(AKAParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhs(AKAParser.LhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhs(AKAParser.LhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#rhs}.
	 * @param ctx the parse tree
	 */
	void enterRhs(AKAParser.RhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#rhs}.
	 * @param ctx the parse tree
	 */
	void exitRhs(AKAParser.RhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(AKAParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(AKAParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(AKAParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(AKAParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AKAParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AKAParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(AKAParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(AKAParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#elseifBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseifBlock(AKAParser.ElseifBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#elseifBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseifBlock(AKAParser.ElseifBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(AKAParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(AKAParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(AKAParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(AKAParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(AKAParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(AKAParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#display}.
	 * @param ctx the parse tree
	 */
	void enterDisplay(AKAParser.DisplayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#display}.
	 * @param ctx the parse tree
	 */
	void exitDisplay(AKAParser.DisplayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#guard}.
	 * @param ctx the parse tree
	 */
	void enterGuard(AKAParser.GuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#guard}.
	 * @param ctx the parse tree
	 */
	void exitGuard(AKAParser.GuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(AKAParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(AKAParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#defCall}.
	 * @param ctx the parse tree
	 */
	void enterDefCall(AKAParser.DefCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#defCall}.
	 * @param ctx the parse tree
	 */
	void exitDefCall(AKAParser.DefCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(AKAParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(AKAParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(AKAParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(AKAParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#defName}.
	 * @param ctx the parse tree
	 */
	void enterDefName(AKAParser.DefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#defName}.
	 * @param ctx the parse tree
	 */
	void exitDefName(AKAParser.DefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#varList}.
	 * @param ctx the parse tree
	 */
	void enterVarList(AKAParser.VarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#varList}.
	 * @param ctx the parse tree
	 */
	void exitVarList(AKAParser.VarListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(AKAParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(AKAParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#definitionnoreturn}.
	 * @param ctx the parse tree
	 */
	void enterDefinitionnoreturn(AKAParser.DefinitionnoreturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#definitionnoreturn}.
	 * @param ctx the parse tree
	 */
	void exitDefinitionnoreturn(AKAParser.DefinitionnoreturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(AKAParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(AKAParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AKAParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AKAParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(AKAParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(AKAParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(AKAParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(AKAParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableFactor}
	 * labeled alternative in {@link AKAParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterVariableFactor(AKAParser.VariableFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableFactor}
	 * labeled alternative in {@link AKAParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitVariableFactor(AKAParser.VariableFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link AKAParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumberFactor(AKAParser.NumberFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link AKAParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumberFactor(AKAParser.NumberFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link AKAParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterStringFactor(AKAParser.StringFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link AKAParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitStringFactor(AKAParser.StringFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanFactor}
	 * labeled alternative in {@link AKAParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFactor(AKAParser.BooleanFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanFactor}
	 * labeled alternative in {@link AKAParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFactor(AKAParser.BooleanFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defCallFactor}
	 * labeled alternative in {@link AKAParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterDefCallFactor(AKAParser.DefCallFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defCallFactor}
	 * labeled alternative in {@link AKAParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitDefCallFactor(AKAParser.DefCallFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notFactor}
	 * labeled alternative in {@link AKAParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNotFactor(AKAParser.NotFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notFactor}
	 * labeled alternative in {@link AKAParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNotFactor(AKAParser.NotFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedFactor}
	 * labeled alternative in {@link AKAParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedFactor(AKAParser.ParenthesizedFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedFactor}
	 * labeled alternative in {@link AKAParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedFactor(AKAParser.ParenthesizedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#variableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableIdentifier(AKAParser.VariableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#variableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableIdentifier(AKAParser.VariableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(AKAParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(AKAParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#relOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelOperator(AKAParser.RelOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#relOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelOperator(AKAParser.RelOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#addOperator}.
	 * @param ctx the parse tree
	 */
	void enterAddOperator(AKAParser.AddOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#addOperator}.
	 * @param ctx the parse tree
	 */
	void exitAddOperator(AKAParser.AddOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#mulOperator}.
	 * @param ctx the parse tree
	 */
	void enterMulOperator(AKAParser.MulOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#mulOperator}.
	 * @param ctx the parse tree
	 */
	void exitMulOperator(AKAParser.MulOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(AKAParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(AKAParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#numberConstant}.
	 * @param ctx the parse tree
	 */
	void enterNumberConstant(AKAParser.NumberConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#numberConstant}.
	 * @param ctx the parse tree
	 */
	void exitNumberConstant(AKAParser.NumberConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(AKAParser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(AKAParser.StringConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link AKAParser#booleanConstant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanConstant(AKAParser.BooleanConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link AKAParser#booleanConstant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanConstant(AKAParser.BooleanConstantContext ctx);
}