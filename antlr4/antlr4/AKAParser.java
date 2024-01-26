// Generated from AKA.g4 by ANTLR 4.4

    package antlr4;
    import java.util.HashMap;
    import java.util.Map;
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AKAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, NUMBER=20, BOOL=21, STRING=22, MAIN=23, DISPLAY=24, 
		IF=25, WHILE=26, ELSE=27, ELSEIF=28, GUARD=29, DEF=30, NOT=31, TRUE=32, 
		FALSE=33, AND=34, OR=35, NEWLINE=36, WS=37, DOUBLEQUOTE=38, STRINGWORD=39, 
		COMMENT=40, IDENTIFIER=41, INTEGER=42;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "':'", "'>='", "';'", "'{'", "'<'", "'=='", "'='", 
		"'}'", "'>'", "'~'", "'<='", "'('", "')'", "'*'", "'+'", "','", "'-'", 
		"'.'", "NUMBER", "BOOL", "STRING", "MAIN", "DISPLAY", "IF", "WHILE", "ELSE", 
		"ELSEIF", "GUARD", "DEF", "NOT", "TRUE", "FALSE", "AND", "OR", "NEWLINE", 
		"WS", "DOUBLEQUOTE", "STRINGWORD", "COMMENT", "IDENTIFIER", "INTEGER"
	};
	public static final int
		RULE_program = 0, RULE_programIdentifier = 1, RULE_funcblock = 2, RULE_defList = 3, 
		RULE_mainblock = 4, RULE_statement = 5, RULE_assignment = 6, RULE_lhs = 7, 
		RULE_rhs = 8, RULE_varType = 9, RULE_declaration = 10, RULE_ifStatement = 11, 
		RULE_ifBlock = 12, RULE_elseifBlock = 13, RULE_elseBlock = 14, RULE_condition = 15, 
		RULE_whileStatement = 16, RULE_display = 17, RULE_guard = 18, RULE_paramList = 19, 
		RULE_defCall = 20, RULE_argumentList = 21, RULE_argument = 22, RULE_defName = 23, 
		RULE_varList = 24, RULE_definition = 25, RULE_definitionnoreturn = 26, 
		RULE_statementList = 27, RULE_expression = 28, RULE_simpleExpression = 29, 
		RULE_term = 30, RULE_factor = 31, RULE_variableIdentifier = 32, RULE_variable = 33, 
		RULE_relOperator = 34, RULE_addOperator = 35, RULE_mulOperator = 36, RULE_sign = 37, 
		RULE_numberConstant = 38, RULE_stringConstant = 39, RULE_booleanConstant = 40;
	public static final String[] ruleNames = {
		"program", "programIdentifier", "funcblock", "defList", "mainblock", "statement", 
		"assignment", "lhs", "rhs", "varType", "declaration", "ifStatement", "ifBlock", 
		"elseifBlock", "elseBlock", "condition", "whileStatement", "display", 
		"guard", "paramList", "defCall", "argumentList", "argument", "defName", 
		"varList", "definition", "definitionnoreturn", "statementList", "expression", 
		"simpleExpression", "term", "factor", "variableIdentifier", "variable", 
		"relOperator", "addOperator", "mulOperator", "sign", "numberConstant", 
		"stringConstant", "booleanConstant"
	};

	@Override
	public String getGrammarFileName() { return "AKA.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AKAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public FuncblockContext funcblock() {
			return getRuleContext(FuncblockContext.class,0);
		}
		public ProgramIdentifierContext programIdentifier() {
			return getRuleContext(ProgramIdentifierContext.class,0);
		}
		public MainblockContext mainblock() {
			return getRuleContext(MainblockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); programIdentifier();
			setState(83); match(T__14);
			setState(85);
			_la = _input.LA(1);
			if (_la==DEF) {
				{
				setState(84); funcblock();
				}
			}

			setState(87); mainblock();
			setState(88); match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramIdentifierContext extends ParserRuleContext {
		public SymtabEntry entry;
		public TerminalNode IDENTIFIER() { return getToken(AKAParser.IDENTIFIER, 0); }
		public ProgramIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitProgramIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramIdentifierContext programIdentifier() throws RecognitionException {
		ProgramIdentifierContext _localctx = new ProgramIdentifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncblockContext extends ParserRuleContext {
		public DefListContext defList() {
			return getRuleContext(DefListContext.class,0);
		}
		public FuncblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcblock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitFuncblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncblockContext funcblock() throws RecognitionException {
		FuncblockContext _localctx = new FuncblockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); defList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefListContext extends ParserRuleContext {
		public DefinitionnoreturnContext definitionnoreturn(int i) {
			return getRuleContext(DefinitionnoreturnContext.class,i);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public List<DefinitionnoreturnContext> definitionnoreturn() {
			return getRuleContexts(DefinitionnoreturnContext.class);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitDefList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefListContext defList() throws RecognitionException {
		DefListContext _localctx = new DefListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_defList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(94); definition();
				}
				break;
			case 2:
				{
				setState(95); definitionnoreturn();
				}
				break;
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				setState(100);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(98); definition();
					}
					break;
				case 2:
					{
					setState(99); definitionnoreturn();
					}
					break;
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainblockContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode MAIN() { return getToken(AKAParser.MAIN, 0); }
		public MainblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainblock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitMainblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainblockContext mainblock() throws RecognitionException {
		MainblockContext _localctx = new MainblockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mainblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(MAIN);
			setState(106); match(T__14);
			setState(108);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << DISPLAY) | (1L << IF) | (1L << WHILE) | (1L << GUARD) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(107); statementList();
				}
			}

			setState(110); match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public DefCallContext defCall() {
			return getRuleContext(DefCallContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DisplayContext display() {
			return getRuleContext(DisplayContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(124);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112); assignment();
				setState(113); match(T__15);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115); ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116); whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(117); guard();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(118); display();
				setState(119); match(T__15);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(121); defCall();
				setState(122); match(T__15);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public RhsContext rhs() {
			return getRuleContext(RhsContext.class,0);
		}
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << STRING))) != 0)) {
				{
				setState(126); varType();
				}
			}

			setState(129); lhs();
			setState(130); match(T__11);
			setState(131); rhs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LhsContext extends ParserRuleContext {
		public Typespec type;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitLhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		LhsContext _localctx = new LhsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lhs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RhsContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public RhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rhs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitRhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RhsContext rhs() throws RecognitionException {
		RhsContext _localctx = new RhsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rhs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarTypeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(AKAParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(AKAParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(AKAParser.NUMBER, 0); }
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitVarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Typespec type;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public ElseifBlockContext elseifBlock(int i) {
			return getRuleContext(ElseifBlockContext.class,i);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public List<ElseifBlockContext> elseifBlock() {
			return getRuleContexts(ElseifBlockContext.class);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); ifBlock();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(142); elseifBlock();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(148); elseBlock();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AKAParser.IF, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(IF);
			setState(152); match(T__6);
			setState(153); condition();
			setState(154); match(T__5);
			setState(155); match(T__14);
			setState(157);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << DISPLAY) | (1L << IF) | (1L << WHILE) | (1L << GUARD) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(156); statementList();
				}
			}

			setState(159); match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseifBlockContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(AKAParser.ELSEIF, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ElseifBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitElseifBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifBlockContext elseifBlock() throws RecognitionException {
		ElseifBlockContext _localctx = new ElseifBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elseifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); match(ELSEIF);
			setState(162); match(T__6);
			setState(163); condition();
			setState(164); match(T__5);
			setState(165); match(T__14);
			setState(167);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << DISPLAY) | (1L << IF) | (1L << WHILE) | (1L << GUARD) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(166); statementList();
				}
			}

			setState(169); match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(AKAParser.ELSE, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); match(ELSE);
			setState(172); match(T__14);
			setState(174);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << DISPLAY) | (1L << IF) | (1L << WHILE) | (1L << GUARD) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(173); statementList();
				}
			}

			setState(176); match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(AKAParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); match(WHILE);
			setState(181); match(T__6);
			setState(182); condition();
			setState(183); match(T__5);
			setState(184); match(T__14);
			setState(186);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << DISPLAY) | (1L << IF) | (1L << WHILE) | (1L << GUARD) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(185); statementList();
				}
			}

			setState(188); match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisplayContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(AKAParser.DISPLAY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DisplayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitDisplay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayContext display() throws RecognitionException {
		DisplayContext _localctx = new DisplayContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_display);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(190); match(DISPLAY);
			}
			setState(191); match(T__6);
			setState(193);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__3) | (1L << T__1) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << STRINGWORD) | (1L << IDENTIFIER) | (1L << INTEGER))) != 0)) {
				{
				setState(192); expression();
				}
			}

			setState(195); match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GuardContext extends ParserRuleContext {
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode GUARD() { return getToken(AKAParser.GUARD, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public GuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardContext guard() throws RecognitionException {
		GuardContext _localctx = new GuardContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(GUARD);
			setState(198); match(T__6);
			setState(199); paramList();
			setState(200); match(T__5);
			setState(201); match(T__14);
			setState(202); statementList();
			setState(203); match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamListContext extends ParserRuleContext {
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); condition();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(206); match(T__2);
				setState(207); condition();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefCallContext extends ParserRuleContext {
		public DefNameContext defName() {
			return getRuleContext(DefNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public DefCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitDefCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefCallContext defCall() throws RecognitionException {
		DefCallContext _localctx = new DefCallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_defCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); defName();
			setState(214); match(T__6);
			setState(216);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__3) | (1L << T__1) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << STRINGWORD) | (1L << IDENTIFIER) | (1L << INTEGER))) != 0)) {
				{
				setState(215); argumentList();
				}
			}

			setState(218); match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); argument();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(221); match(T__2);
				setState(222); argument();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefNameContext extends ParserRuleContext {
		public Typespec type;
		public SymtabEntry entry;
		public TerminalNode IDENTIFIER() { return getToken(AKAParser.IDENTIFIER, 0); }
		public DefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitDefName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefNameContext defName() throws RecognitionException {
		DefNameContext _localctx = new DefNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_defName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarListContext extends ParserRuleContext {
		public VarTypeContext varType(int i) {
			return getRuleContext(VarTypeContext.class,i);
		}
		public List<VarTypeContext> varType() {
			return getRuleContexts(VarTypeContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitVarList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarListContext varList() throws RecognitionException {
		VarListContext _localctx = new VarListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_varList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(232); varType();
			setState(233); variable();
			}
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(235); match(T__2);
				{
				setState(236); varType();
				setState(237); variable();
				}
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionContext extends ParserRuleContext {
		public DefNameContext defName() {
			return getRuleContext(DefNameContext.class,0);
		}
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode DEF() { return getToken(AKAParser.DEF, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); match(DEF);
			setState(245); defName();
			setState(246); match(T__6);
			setState(248);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << STRING))) != 0)) {
				{
				setState(247); varList();
				}
			}

			setState(250); match(T__17);
			{
			setState(251); varType();
			setState(252); variable();
			}
			setState(254); match(T__5);
			setState(255); match(T__14);
			setState(257);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << DISPLAY) | (1L << IF) | (1L << WHILE) | (1L << GUARD) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(256); statementList();
				}
			}

			setState(259); match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionnoreturnContext extends ParserRuleContext {
		public DefNameContext defName() {
			return getRuleContext(DefNameContext.class,0);
		}
		public TerminalNode DEF() { return getToken(AKAParser.DEF, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public DefinitionnoreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionnoreturn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitDefinitionnoreturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionnoreturnContext definitionnoreturn() throws RecognitionException {
		DefinitionnoreturnContext _localctx = new DefinitionnoreturnContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_definitionnoreturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261); match(DEF);
			setState(262); defName();
			setState(263); match(T__6);
			setState(265);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << STRING))) != 0)) {
				{
				setState(264); varList();
				}
			}

			setState(267); match(T__5);
			setState(268); match(T__14);
			setState(270);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << DISPLAY) | (1L << IF) | (1L << WHILE) | (1L << GUARD) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(269); statementList();
				}
			}

			setState(272); match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); statement();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << DISPLAY) | (1L << IF) | (1L << WHILE) | (1L << GUARD) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(275); statement();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Typespec type;
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public RelOperatorContext relOperator() {
			return getRuleContext(RelOperatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); simpleExpression();
			setState(285);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__13) | (1L << T__12) | (1L << T__9) | (1L << T__8) | (1L << T__7))) != 0)) {
				{
				setState(282); relOperator();
				setState(283); simpleExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpressionContext extends ParserRuleContext {
		public Typespec type;
		public AddOperatorContext addOperator(int i) {
			return getRuleContext(AddOperatorContext.class,i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public List<AddOperatorContext> addOperator() {
			return getRuleContexts(AddOperatorContext.class);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(287); sign();
				}
				break;
			}
			setState(290); term();
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__1) | (1L << OR))) != 0)) {
				{
				{
				setState(291); addOperator();
				setState(292); term();
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public Typespec type;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public MulOperatorContext mulOperator(int i) {
			return getRuleContext(MulOperatorContext.class,i);
		}
		public List<MulOperatorContext> mulOperator() {
			return getRuleContexts(MulOperatorContext.class);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299); factor();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__4) | (1L << AND))) != 0)) {
				{
				{
				setState(300); mulOperator();
				setState(301); factor();
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public Typespec type;
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class NumberFactorContext extends FactorContext {
		public NumberConstantContext numberConstant() {
			return getRuleContext(NumberConstantContext.class,0);
		}
		public NumberFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitNumberFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringFactorContext extends FactorContext {
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public StringFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitStringFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefCallFactorContext extends FactorContext {
		public DefCallContext defCall() {
			return getRuleContext(DefCallContext.class,0);
		}
		public DefCallFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitDefCallFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableFactorContext extends FactorContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitVariableFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotFactorContext extends FactorContext {
		public TerminalNode NOT() { return getToken(AKAParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public NotFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitNotFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedFactorContext extends FactorContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitParenthesizedFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanFactorContext extends FactorContext {
		public BooleanConstantContext booleanConstant() {
			return getRuleContext(BooleanConstantContext.class,0);
		}
		public BooleanFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitBooleanFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_factor);
		try {
			setState(319);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new VariableFactorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(308); variable();
				}
				break;
			case 2:
				_localctx = new NumberFactorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(309); numberConstant();
				}
				break;
			case 3:
				_localctx = new StringFactorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(310); stringConstant();
				}
				break;
			case 4:
				_localctx = new BooleanFactorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(311); booleanConstant();
				}
				break;
			case 5:
				_localctx = new DefCallFactorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(312); defCall();
				}
				break;
			case 6:
				_localctx = new NotFactorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(313); match(NOT);
				setState(314); factor();
				}
				break;
			case 7:
				_localctx = new ParenthesizedFactorContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(315); match(T__6);
				setState(316); expression();
				setState(317); match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableIdentifierContext extends ParserRuleContext {
		public Typespec type;
		public SymtabEntry entry;
		public TerminalNode IDENTIFIER() { return getToken(AKAParser.IDENTIFIER, 0); }
		public VariableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitVariableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableIdentifierContext variableIdentifier() throws RecognitionException {
		VariableIdentifierContext _localctx = new VariableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public Typespec type;
		public SymtabEntry entry;
		public VariableIdentifierContext variableIdentifier() {
			return getRuleContext(VariableIdentifierContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323); variableIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelOperatorContext extends ParserRuleContext {
		public RelOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitRelOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOperatorContext relOperator() throws RecognitionException {
		RelOperatorContext _localctx = new RelOperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_relOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__13) | (1L << T__12) | (1L << T__9) | (1L << T__8) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(AKAParser.OR, 0); }
		public AddOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitAddOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOperatorContext addOperator() throws RecognitionException {
		AddOperatorContext _localctx = new AddOperatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_addOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__1) | (1L << OR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(AKAParser.AND, 0); }
		public MulOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitMulOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulOperatorContext mulOperator() throws RecognitionException {
		MulOperatorContext _localctx = new MulOperatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_mulOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__4) | (1L << AND))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberConstantContext extends ParserRuleContext {
		public Typespec type;
		public Object value;
		public List<TerminalNode> INTEGER() { return getTokens(AKAParser.INTEGER); }
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public TerminalNode INTEGER(int i) {
			return getToken(AKAParser.INTEGER, i);
		}
		public NumberConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitNumberConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberConstantContext numberConstant() throws RecognitionException {
		NumberConstantContext _localctx = new NumberConstantContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_numberConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__1) {
				{
				setState(333); sign();
				}
			}

			setState(336); match(INTEGER);
			setState(339);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(337); match(T__0);
				setState(338); match(INTEGER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringConstantContext extends ParserRuleContext {
		public Typespec type;
		public Object value;
		public TerminalNode STRINGWORD() { return getToken(AKAParser.STRINGWORD, 0); }
		public StringConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitStringConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConstantContext stringConstant() throws RecognitionException {
		StringConstantContext _localctx = new StringConstantContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341); match(STRINGWORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanConstantContext extends ParserRuleContext {
		public Typespec type;
		public Object value;
		public TerminalNode FALSE() { return getToken(AKAParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(AKAParser.TRUE, 0); }
		public BooleanConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AKAVisitor ) return ((AKAVisitor<? extends T>)visitor).visitBooleanConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanConstantContext booleanConstant() throws RecognitionException {
		BooleanConstantContext _localctx = new BooleanConstantContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_booleanConstant);
		try {
			setState(345);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(343); match(TRUE);
				}
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(344); match(FALSE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u015e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\5\2X\n\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\5\5c\n\5\3\5\3\5\7\5"+
		"g\n\5\f\5\16\5j\13\5\3\6\3\6\3\6\5\6o\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\177\n\7\3\b\5\b\u0082\n\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\7\r\u0092\n\r\f\r\16\r"+
		"\u0095\13\r\3\r\5\r\u0098\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a0"+
		"\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00aa\n\17\3\17\3\17"+
		"\3\20\3\20\3\20\5\20\u00b1\n\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u00bd\n\22\3\22\3\22\3\23\3\23\3\23\5\23\u00c4\n\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u00d3"+
		"\n\25\f\25\16\25\u00d6\13\25\3\26\3\26\3\26\5\26\u00db\n\26\3\26\3\26"+
		"\3\27\3\27\3\27\7\27\u00e2\n\27\f\27\16\27\u00e5\13\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u00f2\n\32\f\32\16\32\u00f5"+
		"\13\32\3\33\3\33\3\33\3\33\5\33\u00fb\n\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\5\33\u0104\n\33\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u010c\n\34"+
		"\3\34\3\34\3\34\5\34\u0111\n\34\3\34\3\34\3\35\3\35\7\35\u0117\n\35\f"+
		"\35\16\35\u011a\13\35\3\36\3\36\3\36\3\36\5\36\u0120\n\36\3\37\5\37\u0123"+
		"\n\37\3\37\3\37\3\37\3\37\7\37\u0129\n\37\f\37\16\37\u012c\13\37\3 \3"+
		" \3 \3 \7 \u0132\n \f \16 \u0135\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\5!\u0142\n!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\5(\u0151\n(\3"+
		"(\3(\3(\5(\u0156\n(\3)\3)\3*\3*\5*\u015c\n*\3*\2\2+\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\7\3\2\26\30"+
		"\5\2\5\5\b\t\f\16\5\2\22\22\24\24%%\5\2\3\3\21\21$$\4\2\22\22\24\24\u015c"+
		"\2T\3\2\2\2\4\\\3\2\2\2\6^\3\2\2\2\bb\3\2\2\2\nk\3\2\2\2\f~\3\2\2\2\16"+
		"\u0081\3\2\2\2\20\u0087\3\2\2\2\22\u0089\3\2\2\2\24\u008b\3\2\2\2\26\u008d"+
		"\3\2\2\2\30\u008f\3\2\2\2\32\u0099\3\2\2\2\34\u00a3\3\2\2\2\36\u00ad\3"+
		"\2\2\2 \u00b4\3\2\2\2\"\u00b6\3\2\2\2$\u00c0\3\2\2\2&\u00c7\3\2\2\2(\u00cf"+
		"\3\2\2\2*\u00d7\3\2\2\2,\u00de\3\2\2\2.\u00e6\3\2\2\2\60\u00e8\3\2\2\2"+
		"\62\u00ea\3\2\2\2\64\u00f6\3\2\2\2\66\u0107\3\2\2\28\u0114\3\2\2\2:\u011b"+
		"\3\2\2\2<\u0122\3\2\2\2>\u012d\3\2\2\2@\u0141\3\2\2\2B\u0143\3\2\2\2D"+
		"\u0145\3\2\2\2F\u0147\3\2\2\2H\u0149\3\2\2\2J\u014b\3\2\2\2L\u014d\3\2"+
		"\2\2N\u0150\3\2\2\2P\u0157\3\2\2\2R\u015b\3\2\2\2TU\5\4\3\2UW\7\7\2\2"+
		"VX\5\6\4\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\5\n\6\2Z[\7\13\2\2[\3\3\2\2"+
		"\2\\]\7+\2\2]\5\3\2\2\2^_\5\b\5\2_\7\3\2\2\2`c\5\64\33\2ac\5\66\34\2b"+
		"`\3\2\2\2ba\3\2\2\2ch\3\2\2\2dg\5\64\33\2eg\5\66\34\2fd\3\2\2\2fe\3\2"+
		"\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\t\3\2\2\2jh\3\2\2\2kl\7\31\2\2ln\7"+
		"\7\2\2mo\58\35\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\13\2\2q\13\3\2\2\2"+
		"rs\5\16\b\2st\7\6\2\2t\177\3\2\2\2u\177\5\30\r\2v\177\5\"\22\2w\177\5"+
		"&\24\2xy\5$\23\2yz\7\6\2\2z\177\3\2\2\2{|\5*\26\2|}\7\6\2\2}\177\3\2\2"+
		"\2~r\3\2\2\2~u\3\2\2\2~v\3\2\2\2~w\3\2\2\2~x\3\2\2\2~{\3\2\2\2\177\r\3"+
		"\2\2\2\u0080\u0082\5\24\13\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0084\5\20\t\2\u0084\u0085\7\n\2\2\u0085\u0086\5"+
		"\22\n\2\u0086\17\3\2\2\2\u0087\u0088\5D#\2\u0088\21\3\2\2\2\u0089\u008a"+
		"\5\26\f\2\u008a\23\3\2\2\2\u008b\u008c\t\2\2\2\u008c\25\3\2\2\2\u008d"+
		"\u008e\5:\36\2\u008e\27\3\2\2\2\u008f\u0093\5\32\16\2\u0090\u0092\5\34"+
		"\17\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\5\36"+
		"\20\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\31\3\2\2\2\u0099\u009a"+
		"\7\33\2\2\u009a\u009b\7\17\2\2\u009b\u009c\5 \21\2\u009c\u009d\7\20\2"+
		"\2\u009d\u009f\7\7\2\2\u009e\u00a0\58\35\2\u009f\u009e\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\13\2\2\u00a2\33\3\2\2\2\u00a3"+
		"\u00a4\7\36\2\2\u00a4\u00a5\7\17\2\2\u00a5\u00a6\5 \21\2\u00a6\u00a7\7"+
		"\20\2\2\u00a7\u00a9\7\7\2\2\u00a8\u00aa\58\35\2\u00a9\u00a8\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7\13\2\2\u00ac\35\3\2\2"+
		"\2\u00ad\u00ae\7\35\2\2\u00ae\u00b0\7\7\2\2\u00af\u00b1\58\35\2\u00b0"+
		"\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7\13"+
		"\2\2\u00b3\37\3\2\2\2\u00b4\u00b5\5:\36\2\u00b5!\3\2\2\2\u00b6\u00b7\7"+
		"\34\2\2\u00b7\u00b8\7\17\2\2\u00b8\u00b9\5 \21\2\u00b9\u00ba\7\20\2\2"+
		"\u00ba\u00bc\7\7\2\2\u00bb\u00bd\58\35\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7\13\2\2\u00bf#\3\2\2\2\u00c0"+
		"\u00c1\7\32\2\2\u00c1\u00c3\7\17\2\2\u00c2\u00c4\5:\36\2\u00c3\u00c2\3"+
		"\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\7\20\2\2\u00c6"+
		"%\3\2\2\2\u00c7\u00c8\7\37\2\2\u00c8\u00c9\7\17\2\2\u00c9\u00ca\5(\25"+
		"\2\u00ca\u00cb\7\20\2\2\u00cb\u00cc\7\7\2\2\u00cc\u00cd\58\35\2\u00cd"+
		"\u00ce\7\13\2\2\u00ce\'\3\2\2\2\u00cf\u00d4\5 \21\2\u00d0\u00d1\7\23\2"+
		"\2\u00d1\u00d3\5 \21\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5)\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00d8\5\60\31\2\u00d8\u00da\7\17\2\2\u00d9\u00db\5,\27\2\u00da\u00d9"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\7\20\2\2"+
		"\u00dd+\3\2\2\2\u00de\u00e3\5.\30\2\u00df\u00e0\7\23\2\2\u00e0\u00e2\5"+
		".\30\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4-\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\5:\36\2"+
		"\u00e7/\3\2\2\2\u00e8\u00e9\7+\2\2\u00e9\61\3\2\2\2\u00ea\u00eb\5\24\13"+
		"\2\u00eb\u00ec\5D#\2\u00ec\u00f3\3\2\2\2\u00ed\u00ee\7\23\2\2\u00ee\u00ef"+
		"\5\24\13\2\u00ef\u00f0\5D#\2\u00f0\u00f2\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\63\3\2\2"+
		"\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7 \2\2\u00f7\u00f8\5\60\31\2\u00f8"+
		"\u00fa\7\17\2\2\u00f9\u00fb\5\62\32\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\7\4\2\2\u00fd\u00fe\5\24\13\2"+
		"\u00fe\u00ff\5D#\2\u00ff\u0100\3\2\2\2\u0100\u0101\7\20\2\2\u0101\u0103"+
		"\7\7\2\2\u0102\u0104\58\35\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0106\7\13\2\2\u0106\65\3\2\2\2\u0107\u0108\7 \2"+
		"\2\u0108\u0109\5\60\31\2\u0109\u010b\7\17\2\2\u010a\u010c\5\62\32\2\u010b"+
		"\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\7\20"+
		"\2\2\u010e\u0110\7\7\2\2\u010f\u0111\58\35\2\u0110\u010f\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7\13\2\2\u0113\67\3\2\2"+
		"\2\u0114\u0118\5\f\7\2\u0115\u0117\5\f\7\2\u0116\u0115\3\2\2\2\u0117\u011a"+
		"\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u01199\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011b\u011f\5<\37\2\u011c\u011d\5F$\2\u011d\u011e\5<\37"+
		"\2\u011e\u0120\3\2\2\2\u011f\u011c\3\2\2\2\u011f\u0120\3\2\2\2\u0120;"+
		"\3\2\2\2\u0121\u0123\5L\'\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u012a\5> \2\u0125\u0126\5H%\2\u0126\u0127\5> \2\u0127"+
		"\u0129\3\2\2\2\u0128\u0125\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b=\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u0133"+
		"\5@!\2\u012e\u012f\5J&\2\u012f\u0130\5@!\2\u0130\u0132\3\2\2\2\u0131\u012e"+
		"\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"?\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0142\5D#\2\u0137\u0142\5N(\2\u0138"+
		"\u0142\5P)\2\u0139\u0142\5R*\2\u013a\u0142\5*\26\2\u013b\u013c\7!\2\2"+
		"\u013c\u0142\5@!\2\u013d\u013e\7\17\2\2\u013e\u013f\5:\36\2\u013f\u0140"+
		"\7\20\2\2\u0140\u0142\3\2\2\2\u0141\u0136\3\2\2\2\u0141\u0137\3\2\2\2"+
		"\u0141\u0138\3\2\2\2\u0141\u0139\3\2\2\2\u0141\u013a\3\2\2\2\u0141\u013b"+
		"\3\2\2\2\u0141\u013d\3\2\2\2\u0142A\3\2\2\2\u0143\u0144\7+\2\2\u0144C"+
		"\3\2\2\2\u0145\u0146\5B\"\2\u0146E\3\2\2\2\u0147\u0148\t\3\2\2\u0148G"+
		"\3\2\2\2\u0149\u014a\t\4\2\2\u014aI\3\2\2\2\u014b\u014c\t\5\2\2\u014c"+
		"K\3\2\2\2\u014d\u014e\t\6\2\2\u014eM\3\2\2\2\u014f\u0151\5L\'\2\u0150"+
		"\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0155\7,"+
		"\2\2\u0153\u0154\7\25\2\2\u0154\u0156\7,\2\2\u0155\u0153\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156O\3\2\2\2\u0157\u0158\7)\2\2\u0158Q\3\2\2\2\u0159"+
		"\u015c\7\"\2\2\u015a\u015c\7#\2\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2"+
		"\2\2\u015cS\3\2\2\2!Wbfhn~\u0081\u0093\u0097\u009f\u00a9\u00b0\u00bc\u00c3"+
		"\u00d4\u00da\u00e3\u00f3\u00fa\u0103\u010b\u0110\u0118\u011f\u0122\u012a"+
		"\u0133\u0141\u0150\u0155\u015b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}