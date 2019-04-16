// $ANTLR 3.5.1 D:\\Antlr\\V3\\MathParser.g 2019-04-17 03:20:28
 package com.ltchen.antlr.antlr3.math; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class MathParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "APOSTROPHE", "ASSIGN", "CARET", 
		"DIGIT", "FLOAT", "FUNCTIONS", "HELP", "INTEGER", "LEFT_PAREN", "LETTER", 
		"LIST", "LOWER", "NAME", "NEWLINE", "NONCONTROL_CHAR", "NUMBER", "PRINT", 
		"RIGHT_PAREN", "SIGN", "SPACE", "STRING_LITERAL", "SYMBOL", "UPPER", "VARIABLES", 
		"WHITESPACE", "COMBINE", "DEFINE", "DERIVATIVE", "FUNCTION", "POLYNOMIAL", 
		"TERM"
	};
	public static final int EOF=-1;
	public static final int APOSTROPHE=4;
	public static final int ASSIGN=5;
	public static final int CARET=6;
	public static final int DIGIT=7;
	public static final int FLOAT=8;
	public static final int FUNCTIONS=9;
	public static final int HELP=10;
	public static final int INTEGER=11;
	public static final int LEFT_PAREN=12;
	public static final int LETTER=13;
	public static final int LIST=14;
	public static final int LOWER=15;
	public static final int NAME=16;
	public static final int NEWLINE=17;
	public static final int NONCONTROL_CHAR=18;
	public static final int NUMBER=19;
	public static final int PRINT=20;
	public static final int RIGHT_PAREN=21;
	public static final int SIGN=22;
	public static final int SPACE=23;
	public static final int STRING_LITERAL=24;
	public static final int SYMBOL=25;
	public static final int UPPER=26;
	public static final int VARIABLES=27;
	public static final int WHITESPACE=28;
	public static final int COMBINE=29;
	public static final int DEFINE=30;
	public static final int DERIVATIVE=31;
	public static final int FUNCTION=32;
	public static final int POLYNOMIAL=33;
	public static final int TERM=34;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "script", "exponent", "derivative", "listOption", "coefficient", 
		"assign", "printTarget", "print", "define", "interactiveStatement", "term", 
		"list", "combine", "terminator", "value", "help", "functionEval", "statement", 
		"polynomial"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public MathParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public MathParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this,port,adaptor);
		setDebugListener(proxy);
		setTokenStream(new DebugTokenStream(input,proxy));
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);
		proxy.setTreeAdaptor(adap);
	}

	public MathParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg);
		 
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
		}
		public TreeAdaptor getTreeAdaptor() {
			return adaptor;
		}
	@Override public String[] getTokenNames() { return MathParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\Antlr\\V3\\MathParser.g"; }


	public static class script_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "script"
	// D:\\Antlr\\V3\\MathParser.g:30:1: script : ( statement )* EOF !;
	public final script_return script() throws RecognitionException {
		script_return retval = new script_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope statement1 =null;

		Object EOF2_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "script");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(30, 0);

		try {
			// D:\\Antlr\\V3\\MathParser.g:30:7: ( ( statement )* EOF !)
			dbg.enterAlt(1);

			// D:\\Antlr\\V3\\MathParser.g:30:9: ( statement )* EOF !
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(30,9);
			// D:\\Antlr\\V3\\MathParser.g:30:9: ( statement )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==HELP||LA1_0==LIST||LA1_0==NAME||LA1_0==PRINT) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Antlr\\V3\\MathParser.g:30:9: statement
					{
					dbg.location(30,9);
					pushFollow(FOLLOW_statement_in_script95);
					statement1=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement1.getTree());

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(30,23);
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_script98); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(30, 23);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "script");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "script"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// D:\\Antlr\\V3\\MathParser.g:32:1: statement : ( assign | define | interactiveStatement | combine | print );
	public final statement_return statement() throws RecognitionException {
		statement_return retval = new statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assign3 =null;
		ParserRuleReturnScope define4 =null;
		ParserRuleReturnScope interactiveStatement5 =null;
		ParserRuleReturnScope combine6 =null;
		ParserRuleReturnScope print7 =null;


		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(32, 0);

		try {
			// D:\\Antlr\\V3\\MathParser.g:32:10: ( assign | define | interactiveStatement | combine | print )
			int alt2=5;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			switch ( input.LA(1) ) {
			case NAME:
				{
				int LA2_1 = input.LA(2);
				if ( (LA2_1==ASSIGN) ) {
					int LA2_4 = input.LA(3);
					if ( (LA2_4==NAME) ) {
						int LA2_6 = input.LA(4);
						if ( (LA2_6==SIGN) ) {
							alt2=4;
						}
						else if ( (LA2_6==EOF||LA2_6==LEFT_PAREN||LA2_6==NEWLINE) ) {
							alt2=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 2, 6, input);
								dbg.recognitionException(nvae);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA2_4==NUMBER) ) {
						alt2=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 4, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA2_1==LEFT_PAREN) ) {
					alt2=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case HELP:
			case LIST:
				{
				alt2=3;
				}
				break;
			case PRINT:
				{
				alt2=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Antlr\\V3\\MathParser.g:32:12: assign
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(32,12);
					pushFollow(FOLLOW_assign_in_statement107);
					assign3=assign();
					state._fsp--;

					adaptor.addChild(root_0, assign3.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\Antlr\\V3\\MathParser.g:32:21: define
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(32,21);
					pushFollow(FOLLOW_define_in_statement111);
					define4=define();
					state._fsp--;

					adaptor.addChild(root_0, define4.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// D:\\Antlr\\V3\\MathParser.g:32:30: interactiveStatement
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(32,30);
					pushFollow(FOLLOW_interactiveStatement_in_statement115);
					interactiveStatement5=interactiveStatement();
					state._fsp--;

					adaptor.addChild(root_0, interactiveStatement5.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// D:\\Antlr\\V3\\MathParser.g:32:53: combine
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(32,53);
					pushFollow(FOLLOW_combine_in_statement119);
					combine6=combine();
					state._fsp--;

					adaptor.addChild(root_0, combine6.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// D:\\Antlr\\V3\\MathParser.g:32:63: print
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(32,63);
					pushFollow(FOLLOW_print_in_statement123);
					print7=print();
					state._fsp--;

					adaptor.addChild(root_0, print7.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(32, 67);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "statement"


	public static class interactiveStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interactiveStatement"
	// D:\\Antlr\\V3\\MathParser.g:36:1: interactiveStatement : ( help | list );
	public final interactiveStatement_return interactiveStatement() throws RecognitionException {
		interactiveStatement_return retval = new interactiveStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope help8 =null;
		ParserRuleReturnScope list9 =null;


		try { dbg.enterRule(getGrammarFileName(), "interactiveStatement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(36, 0);

		try {
			// D:\\Antlr\\V3\\MathParser.g:36:21: ( help | list )
			int alt3=2;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==HELP) ) {
				alt3=1;
			}
			else if ( (LA3_0==LIST) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Antlr\\V3\\MathParser.g:36:23: help
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(36,23);
					pushFollow(FOLLOW_help_in_interactiveStatement133);
					help8=help();
					state._fsp--;

					adaptor.addChild(root_0, help8.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\Antlr\\V3\\MathParser.g:36:30: list
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(36,30);
					pushFollow(FOLLOW_list_in_interactiveStatement137);
					list9=list();
					state._fsp--;

					adaptor.addChild(root_0, list9.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(36, 33);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "interactiveStatement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "interactiveStatement"


	public static class assign_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assign"
	// D:\\Antlr\\V3\\MathParser.g:40:1: assign : NAME ASSIGN value terminator -> ^( ASSIGN NAME value ) ;
	public final assign_return assign() throws RecognitionException {
		assign_return retval = new assign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NAME10=null;
		Token ASSIGN11=null;
		ParserRuleReturnScope value12 =null;
		ParserRuleReturnScope terminator13 =null;

		Object NAME10_tree=null;
		Object ASSIGN11_tree=null;
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleSubtreeStream stream_terminator=new RewriteRuleSubtreeStream(adaptor,"rule terminator");
		RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");

		try { dbg.enterRule(getGrammarFileName(), "assign");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(40, 0);

		try {
			// D:\\Antlr\\V3\\MathParser.g:40:7: ( NAME ASSIGN value terminator -> ^( ASSIGN NAME value ) )
			dbg.enterAlt(1);

			// D:\\Antlr\\V3\\MathParser.g:40:9: NAME ASSIGN value terminator
			{
			dbg.location(40,9);
			NAME10=(Token)match(input,NAME,FOLLOW_NAME_in_assign147);  
			stream_NAME.add(NAME10);
			dbg.location(40,14);
			ASSIGN11=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign149);  
			stream_ASSIGN.add(ASSIGN11);
			dbg.location(40,21);
			pushFollow(FOLLOW_value_in_assign151);
			value12=value();
			state._fsp--;

			stream_value.add(value12.getTree());dbg.location(40,27);
			pushFollow(FOLLOW_terminator_in_assign153);
			terminator13=terminator();
			state._fsp--;

			stream_terminator.add(terminator13.getTree());
			// AST REWRITE
			// elements: NAME, ASSIGN, value
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 40:38: -> ^( ASSIGN NAME value )
			{
				dbg.location(40,41);
				// D:\\Antlr\\V3\\MathParser.g:40:41: ^( ASSIGN NAME value )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(40,43);
				root_1 = (Object)adaptor.becomeRoot(stream_ASSIGN.nextNode(), root_1);
				dbg.location(40,50);
				adaptor.addChild(root_1, stream_NAME.nextNode());dbg.location(40,55);
				adaptor.addChild(root_1, stream_value.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(40, 60);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assign");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "assign"


	public static class value_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "value"
	// D:\\Antlr\\V3\\MathParser.g:42:1: value : ( NUMBER | NAME | functionEval );
	public final value_return value() throws RecognitionException {
		value_return retval = new value_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER14=null;
		Token NAME15=null;
		ParserRuleReturnScope functionEval16 =null;

		Object NUMBER14_tree=null;
		Object NAME15_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "value");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(42, 0);

		try {
			// D:\\Antlr\\V3\\MathParser.g:42:6: ( NUMBER | NAME | functionEval )
			int alt4=3;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==NUMBER) ) {
				alt4=1;
			}
			else if ( (LA4_0==NAME) ) {
				int LA4_2 = input.LA(2);
				if ( (LA4_2==LEFT_PAREN) ) {
					alt4=3;
				}
				else if ( (LA4_2==EOF||LA4_2==NEWLINE) ) {
					alt4=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Antlr\\V3\\MathParser.g:42:8: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(42,8);
					NUMBER14=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_value171); 
					NUMBER14_tree = (Object)adaptor.create(NUMBER14);
					adaptor.addChild(root_0, NUMBER14_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\Antlr\\V3\\MathParser.g:42:17: NAME
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(42,17);
					NAME15=(Token)match(input,NAME,FOLLOW_NAME_in_value175); 
					NAME15_tree = (Object)adaptor.create(NAME15);
					adaptor.addChild(root_0, NAME15_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// D:\\Antlr\\V3\\MathParser.g:42:24: functionEval
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(42,24);
					pushFollow(FOLLOW_functionEval_in_value179);
					functionEval16=functionEval();
					state._fsp--;

					adaptor.addChild(root_0, functionEval16.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(42, 35);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "value");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "value"


	public static class functionEval_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionEval"
	// D:\\Antlr\\V3\\MathParser.g:46:1: functionEval : fn= NAME LEFT_PAREN (v= NUMBER |v= NAME ) RIGHT_PAREN -> ^( FUNCTION $fn $v) ;
	public final functionEval_return functionEval() throws RecognitionException {
		functionEval_return retval = new functionEval_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token fn=null;
		Token v=null;
		Token LEFT_PAREN17=null;
		Token RIGHT_PAREN18=null;

		Object fn_tree=null;
		Object v_tree=null;
		Object LEFT_PAREN17_tree=null;
		Object RIGHT_PAREN18_tree=null;
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");

		try { dbg.enterRule(getGrammarFileName(), "functionEval");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(46, 0);

		try {
			// D:\\Antlr\\V3\\MathParser.g:47:3: (fn= NAME LEFT_PAREN (v= NUMBER |v= NAME ) RIGHT_PAREN -> ^( FUNCTION $fn $v) )
			dbg.enterAlt(1);

			// D:\\Antlr\\V3\\MathParser.g:47:5: fn= NAME LEFT_PAREN (v= NUMBER |v= NAME ) RIGHT_PAREN
			{
			dbg.location(47,7);
			fn=(Token)match(input,NAME,FOLLOW_NAME_in_functionEval194);  
			stream_NAME.add(fn);
			dbg.location(47,13);
			LEFT_PAREN17=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_functionEval196);  
			stream_LEFT_PAREN.add(LEFT_PAREN17);
			dbg.location(47,24);
			// D:\\Antlr\\V3\\MathParser.g:47:24: (v= NUMBER |v= NAME )
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==NUMBER) ) {
				alt5=1;
			}
			else if ( (LA5_0==NAME) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Antlr\\V3\\MathParser.g:47:25: v= NUMBER
					{
					dbg.location(47,26);
					v=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_functionEval201);  
					stream_NUMBER.add(v);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\Antlr\\V3\\MathParser.g:47:36: v= NAME
					{
					dbg.location(47,37);
					v=(Token)match(input,NAME,FOLLOW_NAME_in_functionEval207);  
					stream_NAME.add(v);

					}
					break;

			}
			} finally {dbg.exitSubRule(5);}
			dbg.location(47,44);
			RIGHT_PAREN18=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_functionEval210);  
			stream_RIGHT_PAREN.add(RIGHT_PAREN18);

			// AST REWRITE
			// elements: fn, v
			// token labels: v, fn
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleTokenStream stream_fn=new RewriteRuleTokenStream(adaptor,"token fn",fn);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 47:56: -> ^( FUNCTION $fn $v)
			{
				dbg.location(47,59);
				// D:\\Antlr\\V3\\MathParser.g:47:59: ^( FUNCTION $fn $v)
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(47,61);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
				dbg.location(47,71);
				adaptor.addChild(root_1, stream_fn.nextNode());dbg.location(47,75);
				adaptor.addChild(root_1, stream_v.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(47, 76);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "functionEval");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "functionEval"


	public static class terminator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "terminator"
	// D:\\Antlr\\V3\\MathParser.g:52:1: terminator : ( NEWLINE | EOF );
	public final terminator_return terminator() throws RecognitionException {
		terminator_return retval = new terminator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set19=null;

		Object set19_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "terminator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(52, 0);

		try {
			// D:\\Antlr\\V3\\MathParser.g:52:11: ( NEWLINE | EOF )
			dbg.enterAlt(1);

			// D:\\Antlr\\V3\\MathParser.g:
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(52,11);
			set19=input.LT(1);
			if ( input.LA(1)==EOF||input.LA(1)==NEWLINE ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set19));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(52, 25);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "terminator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "terminator"


	public static class define_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "define"
	// D:\\Antlr\\V3\\MathParser.g:57:1: define : fn= NAME LEFT_PAREN fv= NAME RIGHT_PAREN ASSIGN polynomial[$fn.text, $fv.text] terminator -> ^( DEFINE $fn $fv polynomial ) ;
	public final define_return define() throws RecognitionException {
		define_return retval = new define_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token fn=null;
		Token fv=null;
		Token LEFT_PAREN20=null;
		Token RIGHT_PAREN21=null;
		Token ASSIGN22=null;
		ParserRuleReturnScope polynomial23 =null;
		ParserRuleReturnScope terminator24 =null;

		Object fn_tree=null;
		Object fv_tree=null;
		Object LEFT_PAREN20_tree=null;
		Object RIGHT_PAREN21_tree=null;
		Object ASSIGN22_tree=null;
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleSubtreeStream stream_polynomial=new RewriteRuleSubtreeStream(adaptor,"rule polynomial");
		RewriteRuleSubtreeStream stream_terminator=new RewriteRuleSubtreeStream(adaptor,"rule terminator");

		try { dbg.enterRule(getGrammarFileName(), "define");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(57, 0);

		try {
			// D:\\Antlr\\V3\\MathParser.g:58:3: (fn= NAME LEFT_PAREN fv= NAME RIGHT_PAREN ASSIGN polynomial[$fn.text, $fv.text] terminator -> ^( DEFINE $fn $fv polynomial ) )
			dbg.enterAlt(1);

			// D:\\Antlr\\V3\\MathParser.g:58:5: fn= NAME LEFT_PAREN fv= NAME RIGHT_PAREN ASSIGN polynomial[$fn.text, $fv.text] terminator
			{
			dbg.location(58,7);
			fn=(Token)match(input,NAME,FOLLOW_NAME_in_define253);  
			stream_NAME.add(fn);
			dbg.location(58,13);
			LEFT_PAREN20=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_define255);  
			stream_LEFT_PAREN.add(LEFT_PAREN20);
			dbg.location(58,26);
			fv=(Token)match(input,NAME,FOLLOW_NAME_in_define259);  
			stream_NAME.add(fv);
			dbg.location(58,32);
			RIGHT_PAREN21=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_define261);  
			stream_RIGHT_PAREN.add(RIGHT_PAREN21);
			dbg.location(58,44);
			ASSIGN22=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_define263);  
			stream_ASSIGN.add(ASSIGN22);
			dbg.location(59,5);
			pushFollow(FOLLOW_polynomial_in_define269);
			polynomial23=polynomial((fn!=null?fn.getText():null), (fv!=null?fv.getText():null));
			state._fsp--;

			stream_polynomial.add(polynomial23.getTree());dbg.location(59,36);
			pushFollow(FOLLOW_terminator_in_define272);
			terminator24=terminator();
			state._fsp--;

			stream_terminator.add(terminator24.getTree());
			// AST REWRITE
			// elements: fn, polynomial, fv
			// token labels: fv, fn
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_fv=new RewriteRuleTokenStream(adaptor,"token fv",fv);
			RewriteRuleTokenStream stream_fn=new RewriteRuleTokenStream(adaptor,"token fn",fn);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 60:5: -> ^( DEFINE $fn $fv polynomial )
			{
				dbg.location(60,8);
				// D:\\Antlr\\V3\\MathParser.g:60:8: ^( DEFINE $fn $fv polynomial )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(60,10);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFINE, "DEFINE"), root_1);
				dbg.location(60,18);
				adaptor.addChild(root_1, stream_fn.nextNode());dbg.location(60,22);
				adaptor.addChild(root_1, stream_fv.nextNode());dbg.location(60,25);
				adaptor.addChild(root_1, stream_polynomial.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(60, 35);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "define");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "define"


	public static class polynomial_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "polynomial"
	// D:\\Antlr\\V3\\MathParser.g:66:1: polynomial[String fnt, String fvt] : term[$fnt, $fvt] ( SIGN term[$fnt, $fvt] )* -> ^( POLYNOMIAL term ( SIGN term )* ) ;
	public final polynomial_return polynomial(String fnt, String fvt) throws RecognitionException {
		polynomial_return retval = new polynomial_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SIGN26=null;
		ParserRuleReturnScope term25 =null;
		ParserRuleReturnScope term27 =null;

		Object SIGN26_tree=null;
		RewriteRuleTokenStream stream_SIGN=new RewriteRuleTokenStream(adaptor,"token SIGN");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try { dbg.enterRule(getGrammarFileName(), "polynomial");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(66, 0);

		try {
			// D:\\Antlr\\V3\\MathParser.g:67:3: ( term[$fnt, $fvt] ( SIGN term[$fnt, $fvt] )* -> ^( POLYNOMIAL term ( SIGN term )* ) )
			dbg.enterAlt(1);

			// D:\\Antlr\\V3\\MathParser.g:67:5: term[$fnt, $fvt] ( SIGN term[$fnt, $fvt] )*
			{
			dbg.location(67,5);
			pushFollow(FOLLOW_term_in_polynomial306);
			term25=term(fnt, fvt);
			state._fsp--;

			stream_term.add(term25.getTree());dbg.location(67,22);
			// D:\\Antlr\\V3\\MathParser.g:67:22: ( SIGN term[$fnt, $fvt] )*
			try { dbg.enterSubRule(6);

			loop6:
			while (true) {
				int alt6=2;
				try { dbg.enterDecision(6, decisionCanBacktrack[6]);

				int LA6_0 = input.LA(1);
				if ( (LA6_0==SIGN) ) {
					alt6=1;
				}

				} finally {dbg.exitDecision(6);}

				switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Antlr\\V3\\MathParser.g:67:23: SIGN term[$fnt, $fvt]
					{
					dbg.location(67,23);
					SIGN26=(Token)match(input,SIGN,FOLLOW_SIGN_in_polynomial310);  
					stream_SIGN.add(SIGN26);
					dbg.location(67,28);
					pushFollow(FOLLOW_term_in_polynomial312);
					term27=term(fnt, fvt);
					state._fsp--;

					stream_term.add(term27.getTree());
					}
					break;

				default :
					break loop6;
				}
			}
			} finally {dbg.exitSubRule(6);}

			// AST REWRITE
			// elements: SIGN, term, term
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 68:5: -> ^( POLYNOMIAL term ( SIGN term )* )
			{
				dbg.location(68,8);
				// D:\\Antlr\\V3\\MathParser.g:68:8: ^( POLYNOMIAL term ( SIGN term )* )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(68,10);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(POLYNOMIAL, "POLYNOMIAL"), root_1);
				dbg.location(68,21);
				adaptor.addChild(root_1, stream_term.nextTree());dbg.location(68,26);
				// D:\\Antlr\\V3\\MathParser.g:68:26: ( SIGN term )*
				while ( stream_SIGN.hasNext()||stream_term.hasNext() ) {
					dbg.location(68,27);
					adaptor.addChild(root_1, stream_SIGN.nextNode());dbg.location(68,32);
					adaptor.addChild(root_1, stream_term.nextTree());
				}
				stream_SIGN.reset();
				stream_term.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(68, 38);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "polynomial");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "polynomial"


	public static class term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "term"
	// D:\\Antlr\\V3\\MathParser.g:73:1: term[String fnt, String fvt] : (c= coefficient )? (tv= NAME (e= exponent )? )? {...}? -> ^( TERM ( $c)? ( $tv)? ( $e)? ) ;
	public final term_return term(String fnt, String fvt) throws RecognitionException {
		term_return retval = new term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token tv=null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope e =null;

		Object tv_tree=null;
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleSubtreeStream stream_coefficient=new RewriteRuleSubtreeStream(adaptor,"rule coefficient");
		RewriteRuleSubtreeStream stream_exponent=new RewriteRuleSubtreeStream(adaptor,"rule exponent");

		try { dbg.enterRule(getGrammarFileName(), "term");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(73, 0);

		try {
			// D:\\Antlr\\V3\\MathParser.g:75:3: ( (c= coefficient )? (tv= NAME (e= exponent )? )? {...}? -> ^( TERM ( $c)? ( $tv)? ( $e)? ) )
			dbg.enterAlt(1);

			// D:\\Antlr\\V3\\MathParser.g:75:5: (c= coefficient )? (tv= NAME (e= exponent )? )? {...}?
			{
			dbg.location(75,6);
			// D:\\Antlr\\V3\\MathParser.g:75:6: (c= coefficient )?
			int alt7=2;
			try { dbg.enterSubRule(7);
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==NUMBER) ) {
				alt7=1;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Antlr\\V3\\MathParser.g:75:6: c= coefficient
					{
					dbg.location(75,6);
					pushFollow(FOLLOW_coefficient_in_term354);
					c=coefficient();
					state._fsp--;

					stream_coefficient.add(c.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(7);}
			dbg.location(75,20);
			// D:\\Antlr\\V3\\MathParser.g:75:20: (tv= NAME (e= exponent )? )?
			int alt9=2;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==NAME) ) {
				alt9=1;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Antlr\\V3\\MathParser.g:75:21: tv= NAME (e= exponent )?
					{
					dbg.location(75,23);
					tv=(Token)match(input,NAME,FOLLOW_NAME_in_term360);  
					stream_NAME.add(tv);
					dbg.location(75,30);
					// D:\\Antlr\\V3\\MathParser.g:75:30: (e= exponent )?
					int alt8=2;
					try { dbg.enterSubRule(8);
					try { dbg.enterDecision(8, decisionCanBacktrack[8]);

					int LA8_0 = input.LA(1);
					if ( (LA8_0==CARET) ) {
						alt8=1;
					}
					} finally {dbg.exitDecision(8);}

					switch (alt8) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\Antlr\\V3\\MathParser.g:75:30: e= exponent
							{
							dbg.location(75,30);
							pushFollow(FOLLOW_exponent_in_term364);
							e=exponent();
							state._fsp--;

							stream_exponent.add(e.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(8);}

					}
					break;

			}
			} finally {dbg.exitSubRule(9);}
			dbg.location(79,5);
			if ( !(evalPredicate( tv == null ? true : ((tv!=null?tv.getText():null)).equals(fvt) ," tv == null ? true : ($tv.text).equals($fvt) ")) ) {
				throw new FailedPredicateException(input, "term", " tv == null ? true : ($tv.text).equals($fvt) ");
			}
			// AST REWRITE
			// elements: c, tv, e
			// token labels: tv
			// rule labels: c, e, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_tv=new RewriteRuleTokenStream(adaptor,"token tv",tv);
			RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);
			RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 80:5: -> ^( TERM ( $c)? ( $tv)? ( $e)? )
			{
				dbg.location(80,8);
				// D:\\Antlr\\V3\\MathParser.g:80:8: ^( TERM ( $c)? ( $tv)? ( $e)? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(80,10);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERM, "TERM"), root_1);
				dbg.location(80,16);
				// D:\\Antlr\\V3\\MathParser.g:80:16: ( $c)?
				if ( stream_c.hasNext() ) {
					dbg.location(80,16);
					adaptor.addChild(root_1, stream_c.nextTree());
				}
				stream_c.reset();
				dbg.location(80,20);
				// D:\\Antlr\\V3\\MathParser.g:80:20: ( $tv)?
				if ( stream_tv.hasNext() ) {
					dbg.location(80,20);
					adaptor.addChild(root_1, stream_tv.nextNode());
				}
				stream_tv.reset();
				dbg.location(80,25);
				// D:\\Antlr\\V3\\MathParser.g:80:25: ( $e)?
				if ( stream_e.hasNext() ) {
					dbg.location(80,25);
					adaptor.addChild(root_1, stream_e.nextTree());
				}
				stream_e.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (FailedPredicateException fpe) {

			    String tvt = (tv!=null?tv.getText():null);
			    String msg = "In function \"" + fnt +
			      "\" the term variable \"" + tvt +
			      "\" doesn't match function variable \"" + fvt + "\".";
			    throw new RuntimeException(msg);
			  
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(81, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "term");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "term"


	public static class coefficient_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "coefficient"
	// D:\\Antlr\\V3\\MathParser.g:92:1: coefficient : NUMBER ;
	public final coefficient_return coefficient() throws RecognitionException {
		coefficient_return retval = new coefficient_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER28=null;

		Object NUMBER28_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "coefficient");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(92, 0);

		try {
			// D:\\Antlr\\V3\\MathParser.g:92:12: ( NUMBER )
			dbg.enterAlt(1);

			// D:\\Antlr\\V3\\MathParser.g:92:14: NUMBER
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(92,14);
			NUMBER28=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_coefficient436); 
			NUMBER28_tree = (Object)adaptor.create(NUMBER28);
			adaptor.addChild(root_0, NUMBER28_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(92, 19);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "coefficient");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "coefficient"


	public static class exponent_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exponent"
	// D:\\Antlr\\V3\\MathParser.g:95:1: exponent : CARET NUMBER -> NUMBER ;
	public final exponent_return exponent() throws RecognitionException {
		exponent_return retval = new exponent_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CARET29=null;
		Token NUMBER30=null;

		Object CARET29_tree=null;
		Object NUMBER30_tree=null;
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
		RewriteRuleTokenStream stream_CARET=new RewriteRuleTokenStream(adaptor,"token CARET");

		try { dbg.enterRule(getGrammarFileName(), "exponent");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(95, 0);

		try {
			// D:\\Antlr\\V3\\MathParser.g:95:9: ( CARET NUMBER -> NUMBER )
			dbg.enterAlt(1);

			// D:\\Antlr\\V3\\MathParser.g:95:11: CARET NUMBER
			{
			dbg.location(95,11);
			CARET29=(Token)match(input,CARET,FOLLOW_CARET_in_exponent445);  
			stream_CARET.add(CARET29);
			dbg.location(95,17);
			NUMBER30=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_exponent447);  
			stream_NUMBER.add(NUMBER30);

			// AST REWRITE
			// elements: NUMBER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 95:24: -> NUMBER
			{
				dbg.location(95,27);
				adaptor.addChild(root_0, stream_NUMBER.nextNode());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(95, 32);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exponent");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exponent"


	public static class help_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "help"
	// D:\\Antlr\\V3\\MathParser.g:98:1: help : HELP terminator -> HELP ;
	public final help_return help() throws RecognitionException {
		help_return retval = new help_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token HELP31=null;
		ParserRuleReturnScope terminator32 =null;

		Object HELP31_tree=null;
		RewriteRuleTokenStream stream_HELP=new RewriteRuleTokenStream(adaptor,"token HELP");
		RewriteRuleSubtreeStream stream_terminator=new RewriteRuleSubtreeStream(adaptor,"rule terminator");

		try { dbg.enterRule(getGrammarFileName(), "help");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(98, 0);

		try {
			// D:\\Antlr\\V3\\MathParser.g:98:5: ( HELP terminator -> HELP )
			dbg.enterAlt(1);

			// D:\\Antlr\\V3\\MathParser.g:98:7: HELP terminator
			{
			dbg.location(98,7);
			HELP31=(Token)match(input,HELP,FOLLOW_HELP_in_help460);  
			stream_HELP.add(HELP31);
			dbg.location(98,12);
			pushFollow(FOLLOW_terminator_in_help462);
			terminator32=terminator();
			state._fsp--;

			stream_terminator.add(terminator32.getTree());
			// AST REWRITE
			// elements: HELP
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 98:23: -> HELP
			{
				dbg.location(98,26);
				adaptor.addChild(root_0, stream_HELP.nextNode());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(98, 29);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "help");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "help"


	public static class list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "list"
	// D:\\Antlr\\V3\\MathParser.g:102:1: list : LIST listOption terminator -> ^( LIST listOption ) ;
	public final list_return list() throws RecognitionException {
		list_return retval = new list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LIST33=null;
		ParserRuleReturnScope listOption34 =null;
		ParserRuleReturnScope terminator35 =null;

		Object LIST33_tree=null;
		RewriteRuleTokenStream stream_LIST=new RewriteRuleTokenStream(adaptor,"token LIST");
		RewriteRuleSubtreeStream stream_listOption=new RewriteRuleSubtreeStream(adaptor,"rule listOption");
		RewriteRuleSubtreeStream stream_terminator=new RewriteRuleSubtreeStream(adaptor,"rule terminator");

		try { dbg.enterRule(getGrammarFileName(), "list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(102, 0);

		try {
			// D:\\Antlr\\V3\\MathParser.g:103:3: ( LIST listOption terminator -> ^( LIST listOption ) )
			dbg.enterAlt(1);

			// D:\\Antlr\\V3\\MathParser.g:103:5: LIST listOption terminator
			{
			dbg.location(103,5);
			LIST33=(Token)match(input,LIST,FOLLOW_LIST_in_list479);  
			stream_LIST.add(LIST33);
			dbg.location(103,10);
			pushFollow(FOLLOW_listOption_in_list481);
			listOption34=listOption();
			state._fsp--;

			stream_listOption.add(listOption34.getTree());dbg.location(103,21);
			pushFollow(FOLLOW_terminator_in_list483);
			terminator35=terminator();
			state._fsp--;

			stream_terminator.add(terminator35.getTree());
			// AST REWRITE
			// elements: listOption, LIST
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 103:32: -> ^( LIST listOption )
			{
				dbg.location(103,35);
				// D:\\Antlr\\V3\\MathParser.g:103:35: ^( LIST listOption )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(103,37);
				root_1 = (Object)adaptor.becomeRoot(stream_LIST.nextNode(), root_1);
				dbg.location(103,42);
				adaptor.addChild(root_1, stream_listOption.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(103, 52);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "list"


	public static class listOption_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "listOption"
	// D:\\Antlr\\V3\\MathParser.g:106:1: listOption : ( FUNCTIONS | VARIABLES );
	public final listOption_return listOption() throws RecognitionException {
		listOption_return retval = new listOption_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set36=null;

		Object set36_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "listOption");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(106, 0);

		try {
			// D:\\Antlr\\V3\\MathParser.g:106:11: ( FUNCTIONS | VARIABLES )
			dbg.enterAlt(1);

			// D:\\Antlr\\V3\\MathParser.g:
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(106,11);
			set36=input.LT(1);
			if ( input.LA(1)==FUNCTIONS||input.LA(1)==VARIABLES ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set36));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(106, 33);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "listOption");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "listOption"


	public static class combine_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "combine"
	// D:\\Antlr\\V3\\MathParser.g:110:1: combine : fn1= NAME ASSIGN fn2= NAME op= SIGN fn3= NAME terminator -> ^( COMBINE $fn1 $op $fn2 $fn3) ;
	public final combine_return combine() throws RecognitionException {
		combine_return retval = new combine_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token fn1=null;
		Token fn2=null;
		Token op=null;
		Token fn3=null;
		Token ASSIGN37=null;
		ParserRuleReturnScope terminator38 =null;

		Object fn1_tree=null;
		Object fn2_tree=null;
		Object op_tree=null;
		Object fn3_tree=null;
		Object ASSIGN37_tree=null;
		RewriteRuleTokenStream stream_SIGN=new RewriteRuleTokenStream(adaptor,"token SIGN");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleSubtreeStream stream_terminator=new RewriteRuleSubtreeStream(adaptor,"rule terminator");

		try { dbg.enterRule(getGrammarFileName(), "combine");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(110, 0);

		try {
			// D:\\Antlr\\V3\\MathParser.g:111:3: (fn1= NAME ASSIGN fn2= NAME op= SIGN fn3= NAME terminator -> ^( COMBINE $fn1 $op $fn2 $fn3) )
			dbg.enterAlt(1);

			// D:\\Antlr\\V3\\MathParser.g:111:5: fn1= NAME ASSIGN fn2= NAME op= SIGN fn3= NAME terminator
			{
			dbg.location(111,8);
			fn1=(Token)match(input,NAME,FOLLOW_NAME_in_combine519);  
			stream_NAME.add(fn1);
			dbg.location(111,14);
			ASSIGN37=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_combine521);  
			stream_ASSIGN.add(ASSIGN37);
			dbg.location(111,24);
			fn2=(Token)match(input,NAME,FOLLOW_NAME_in_combine525);  
			stream_NAME.add(fn2);
			dbg.location(111,32);
			op=(Token)match(input,SIGN,FOLLOW_SIGN_in_combine529);  
			stream_SIGN.add(op);
			dbg.location(111,41);
			fn3=(Token)match(input,NAME,FOLLOW_NAME_in_combine533);  
			stream_NAME.add(fn3);
			dbg.location(111,47);
			pushFollow(FOLLOW_terminator_in_combine535);
			terminator38=terminator();
			state._fsp--;

			stream_terminator.add(terminator38.getTree());
			// AST REWRITE
			// elements: fn2, op, fn1, fn3
			// token labels: op, fn1, fn3, fn2
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
			RewriteRuleTokenStream stream_fn1=new RewriteRuleTokenStream(adaptor,"token fn1",fn1);
			RewriteRuleTokenStream stream_fn3=new RewriteRuleTokenStream(adaptor,"token fn3",fn3);
			RewriteRuleTokenStream stream_fn2=new RewriteRuleTokenStream(adaptor,"token fn2",fn2);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 112:5: -> ^( COMBINE $fn1 $op $fn2 $fn3)
			{
				dbg.location(112,8);
				// D:\\Antlr\\V3\\MathParser.g:112:8: ^( COMBINE $fn1 $op $fn2 $fn3)
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(112,10);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMBINE, "COMBINE"), root_1);
				dbg.location(112,19);
				adaptor.addChild(root_1, stream_fn1.nextNode());dbg.location(112,24);
				adaptor.addChild(root_1, stream_op.nextNode());dbg.location(112,28);
				adaptor.addChild(root_1, stream_fn2.nextNode());dbg.location(112,33);
				adaptor.addChild(root_1, stream_fn3.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(112, 36);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "combine");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "combine"


	public static class print_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "print"
	// D:\\Antlr\\V3\\MathParser.g:116:1: print : PRINT ( printTarget )* terminator -> ^( PRINT ( printTarget )* ) ;
	public final print_return print() throws RecognitionException {
		print_return retval = new print_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT39=null;
		ParserRuleReturnScope printTarget40 =null;
		ParserRuleReturnScope terminator41 =null;

		Object PRINT39_tree=null;
		RewriteRuleTokenStream stream_PRINT=new RewriteRuleTokenStream(adaptor,"token PRINT");
		RewriteRuleSubtreeStream stream_printTarget=new RewriteRuleSubtreeStream(adaptor,"rule printTarget");
		RewriteRuleSubtreeStream stream_terminator=new RewriteRuleSubtreeStream(adaptor,"rule terminator");

		try { dbg.enterRule(getGrammarFileName(), "print");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(116, 0);

		try {
			// D:\\Antlr\\V3\\MathParser.g:117:3: ( PRINT ( printTarget )* terminator -> ^( PRINT ( printTarget )* ) )
			dbg.enterAlt(1);

			// D:\\Antlr\\V3\\MathParser.g:117:5: PRINT ( printTarget )* terminator
			{
			dbg.location(117,5);
			PRINT39=(Token)match(input,PRINT,FOLLOW_PRINT_in_print570);  
			stream_PRINT.add(PRINT39);
			dbg.location(117,11);
			// D:\\Antlr\\V3\\MathParser.g:117:11: ( printTarget )*
			try { dbg.enterSubRule(10);

			loop10:
			while (true) {
				int alt10=2;
				try { dbg.enterDecision(10, decisionCanBacktrack[10]);

				int LA10_0 = input.LA(1);
				if ( (LA10_0==NAME||LA10_0==NUMBER||LA10_0==STRING_LITERAL) ) {
					alt10=1;
				}

				} finally {dbg.exitDecision(10);}

				switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Antlr\\V3\\MathParser.g:117:11: printTarget
					{
					dbg.location(117,11);
					pushFollow(FOLLOW_printTarget_in_print572);
					printTarget40=printTarget();
					state._fsp--;

					stream_printTarget.add(printTarget40.getTree());
					}
					break;

				default :
					break loop10;
				}
			}
			} finally {dbg.exitSubRule(10);}
			dbg.location(117,24);
			pushFollow(FOLLOW_terminator_in_print575);
			terminator41=terminator();
			state._fsp--;

			stream_terminator.add(terminator41.getTree());
			// AST REWRITE
			// elements: printTarget, PRINT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 117:35: -> ^( PRINT ( printTarget )* )
			{
				dbg.location(117,38);
				// D:\\Antlr\\V3\\MathParser.g:117:38: ^( PRINT ( printTarget )* )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(117,40);
				root_1 = (Object)adaptor.becomeRoot(stream_PRINT.nextNode(), root_1);
				dbg.location(117,46);
				// D:\\Antlr\\V3\\MathParser.g:117:46: ( printTarget )*
				while ( stream_printTarget.hasNext() ) {
					dbg.location(117,46);
					adaptor.addChild(root_1, stream_printTarget.nextTree());
				}
				stream_printTarget.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(117, 58);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "print");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "print"


	public static class printTarget_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "printTarget"
	// D:\\Antlr\\V3\\MathParser.g:121:1: printTarget : ( NUMBER -> NUMBER |sl= STRING_LITERAL -> $sl| NAME -> NAME | NAME LEFT_PAREN RIGHT_PAREN -> ^( FUNCTION NAME ) | functionEval | derivative );
	public final printTarget_return printTarget() throws RecognitionException {
		printTarget_return retval = new printTarget_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token sl=null;
		Token NUMBER42=null;
		Token NAME43=null;
		Token NAME44=null;
		Token LEFT_PAREN45=null;
		Token RIGHT_PAREN46=null;
		ParserRuleReturnScope functionEval47 =null;
		ParserRuleReturnScope derivative48 =null;

		Object sl_tree=null;
		Object NUMBER42_tree=null;
		Object NAME43_tree=null;
		Object NAME44_tree=null;
		Object LEFT_PAREN45_tree=null;
		Object RIGHT_PAREN46_tree=null;
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");

		try { dbg.enterRule(getGrammarFileName(), "printTarget");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(121, 0);

		try {
			// D:\\Antlr\\V3\\MathParser.g:122:3: ( NUMBER -> NUMBER |sl= STRING_LITERAL -> $sl| NAME -> NAME | NAME LEFT_PAREN RIGHT_PAREN -> ^( FUNCTION NAME ) | functionEval | derivative )
			int alt11=6;
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			switch ( input.LA(1) ) {
			case NUMBER:
				{
				alt11=1;
				}
				break;
			case STRING_LITERAL:
				{
				alt11=2;
				}
				break;
			case NAME:
				{
				switch ( input.LA(2) ) {
				case LEFT_PAREN:
					{
					int LA11_4 = input.LA(3);
					if ( (LA11_4==RIGHT_PAREN) ) {
						alt11=4;
					}
					else if ( (LA11_4==NAME||LA11_4==NUMBER) ) {
						alt11=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 4, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case APOSTROPHE:
					{
					alt11=6;
					}
					break;
				case EOF:
				case NAME:
				case NEWLINE:
				case NUMBER:
				case STRING_LITERAL:
					{
					alt11=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 3, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Antlr\\V3\\MathParser.g:122:5: NUMBER
					{
					dbg.location(122,5);
					NUMBER42=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_printTarget598);  
					stream_NUMBER.add(NUMBER42);

					// AST REWRITE
					// elements: NUMBER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 122:12: -> NUMBER
					{
						dbg.location(122,15);
						adaptor.addChild(root_0, stream_NUMBER.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\Antlr\\V3\\MathParser.g:123:5: sl= STRING_LITERAL
					{
					dbg.location(123,7);
					sl=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_printTarget610);  
					stream_STRING_LITERAL.add(sl);

					// AST REWRITE
					// elements: sl
					// token labels: sl
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_sl=new RewriteRuleTokenStream(adaptor,"token sl",sl);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 123:23: -> $sl
					{
						dbg.location(123,27);
						adaptor.addChild(root_0, stream_sl.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// D:\\Antlr\\V3\\MathParser.g:124:5: NAME
					{
					dbg.location(124,5);
					NAME43=(Token)match(input,NAME,FOLLOW_NAME_in_printTarget621);  
					stream_NAME.add(NAME43);

					// AST REWRITE
					// elements: NAME
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 124:10: -> NAME
					{
						dbg.location(124,13);
						adaptor.addChild(root_0, stream_NAME.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// D:\\Antlr\\V3\\MathParser.g:126:5: NAME LEFT_PAREN RIGHT_PAREN
					{
					dbg.location(126,5);
					NAME44=(Token)match(input,NAME,FOLLOW_NAME_in_printTarget634);  
					stream_NAME.add(NAME44);
					dbg.location(126,10);
					LEFT_PAREN45=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_printTarget636);  
					stream_LEFT_PAREN.add(LEFT_PAREN45);
					dbg.location(126,21);
					RIGHT_PAREN46=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_printTarget638);  
					stream_RIGHT_PAREN.add(RIGHT_PAREN46);

					// AST REWRITE
					// elements: NAME
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 126:33: -> ^( FUNCTION NAME )
					{
						dbg.location(126,36);
						// D:\\Antlr\\V3\\MathParser.g:126:36: ^( FUNCTION NAME )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(126,38);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
						dbg.location(126,47);
						adaptor.addChild(root_1, stream_NAME.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// D:\\Antlr\\V3\\MathParser.g:127:5: functionEval
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(127,5);
					pushFollow(FOLLOW_functionEval_in_printTarget652);
					functionEval47=functionEval();
					state._fsp--;

					adaptor.addChild(root_0, functionEval47.getTree());

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// D:\\Antlr\\V3\\MathParser.g:128:5: derivative
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(128,5);
					pushFollow(FOLLOW_derivative_in_printTarget658);
					derivative48=derivative();
					state._fsp--;

					adaptor.addChild(root_0, derivative48.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(129, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "printTarget");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "printTarget"


	public static class derivative_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "derivative"
	// D:\\Antlr\\V3\\MathParser.g:132:1: derivative : NAME APOSTROPHE LEFT_PAREN RIGHT_PAREN -> ^( DERIVATIVE NAME ) ;
	public final derivative_return derivative() throws RecognitionException {
		derivative_return retval = new derivative_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NAME49=null;
		Token APOSTROPHE50=null;
		Token LEFT_PAREN51=null;
		Token RIGHT_PAREN52=null;

		Object NAME49_tree=null;
		Object APOSTROPHE50_tree=null;
		Object LEFT_PAREN51_tree=null;
		Object RIGHT_PAREN52_tree=null;
		RewriteRuleTokenStream stream_APOSTROPHE=new RewriteRuleTokenStream(adaptor,"token APOSTROPHE");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");

		try { dbg.enterRule(getGrammarFileName(), "derivative");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(132, 0);

		try {
			// D:\\Antlr\\V3\\MathParser.g:133:3: ( NAME APOSTROPHE LEFT_PAREN RIGHT_PAREN -> ^( DERIVATIVE NAME ) )
			dbg.enterAlt(1);

			// D:\\Antlr\\V3\\MathParser.g:133:5: NAME APOSTROPHE LEFT_PAREN RIGHT_PAREN
			{
			dbg.location(133,5);
			NAME49=(Token)match(input,NAME,FOLLOW_NAME_in_derivative673);  
			stream_NAME.add(NAME49);
			dbg.location(133,10);
			APOSTROPHE50=(Token)match(input,APOSTROPHE,FOLLOW_APOSTROPHE_in_derivative675);  
			stream_APOSTROPHE.add(APOSTROPHE50);
			dbg.location(133,21);
			LEFT_PAREN51=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_derivative677);  
			stream_LEFT_PAREN.add(LEFT_PAREN51);
			dbg.location(133,32);
			RIGHT_PAREN52=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_derivative679);  
			stream_RIGHT_PAREN.add(RIGHT_PAREN52);

			// AST REWRITE
			// elements: NAME
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 133:44: -> ^( DERIVATIVE NAME )
			{
				dbg.location(133,47);
				// D:\\Antlr\\V3\\MathParser.g:133:47: ^( DERIVATIVE NAME )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(133,49);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DERIVATIVE, "DERIVATIVE"), root_1);
				dbg.location(133,60);
				adaptor.addChild(root_1, stream_NAME.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(133, 64);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "derivative");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "derivative"

	// Delegated rules



	public static final BitSet FOLLOW_statement_in_script95 = new BitSet(new long[]{0x0000000000114400L});
	public static final BitSet FOLLOW_EOF_in_script98 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_in_statement107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_define_in_statement111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interactiveStatement_in_statement115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_combine_in_statement119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_statement123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_help_in_interactiveStatement133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_interactiveStatement137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_assign147 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_assign149 = new BitSet(new long[]{0x0000000000090000L});
	public static final BitSet FOLLOW_value_in_assign151 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_terminator_in_assign153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_value171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_value175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionEval_in_value179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_functionEval194 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_functionEval196 = new BitSet(new long[]{0x0000000000090000L});
	public static final BitSet FOLLOW_NUMBER_in_functionEval201 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NAME_in_functionEval207 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_functionEval210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_define253 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_define255 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_NAME_in_define259 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_define261 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_define263 = new BitSet(new long[]{0x0000000000490000L});
	public static final BitSet FOLLOW_polynomial_in_define269 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_terminator_in_define272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_polynomial306 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_SIGN_in_polynomial310 = new BitSet(new long[]{0x0000000000490000L});
	public static final BitSet FOLLOW_term_in_polynomial312 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_coefficient_in_term354 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_NAME_in_term360 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_exponent_in_term364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_coefficient436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CARET_in_exponent445 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NUMBER_in_exponent447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HELP_in_help460 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_terminator_in_help462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_list479 = new BitSet(new long[]{0x0000000008000200L});
	public static final BitSet FOLLOW_listOption_in_list481 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_terminator_in_list483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_combine519 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_combine521 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_NAME_in_combine525 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_SIGN_in_combine529 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_NAME_in_combine533 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_terminator_in_combine535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print570 = new BitSet(new long[]{0x00000000010B0000L});
	public static final BitSet FOLLOW_printTarget_in_print572 = new BitSet(new long[]{0x00000000010B0000L});
	public static final BitSet FOLLOW_terminator_in_print575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_printTarget598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_printTarget610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_printTarget621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_printTarget634 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_printTarget636 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_printTarget638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionEval_in_printTarget652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_derivative_in_printTarget658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_derivative673 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_APOSTROPHE_in_derivative675 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_derivative677 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_derivative679 = new BitSet(new long[]{0x0000000000000002L});
}
