// $ANTLR 3.5.1 D:\\Antlr\\V3\\MathLexer.g 2019-04-17 03:20:23
 package com.ltchen.antlr.antlr3.math; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MathLexer extends Lexer {
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

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public MathLexer() {} 
	public MathLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public MathLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\Antlr\\V3\\MathLexer.g"; }

	// $ANTLR start "APOSTROPHE"
	public final void mAPOSTROPHE() throws RecognitionException {
		try {
			int _type = APOSTROPHE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Antlr\\V3\\MathLexer.g:6:11: ( '\\'' )
			// D:\\Antlr\\V3\\MathLexer.g:6:13: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "APOSTROPHE"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Antlr\\V3\\MathLexer.g:7:7: ( '=' )
			// D:\\Antlr\\V3\\MathLexer.g:7:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "CARET"
	public final void mCARET() throws RecognitionException {
		try {
			int _type = CARET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Antlr\\V3\\MathLexer.g:8:6: ( '^' )
			// D:\\Antlr\\V3\\MathLexer.g:8:8: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CARET"

	// $ANTLR start "FUNCTIONS"
	public final void mFUNCTIONS() throws RecognitionException {
		try {
			int _type = FUNCTIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Antlr\\V3\\MathLexer.g:9:10: ( 'functions' )
			// D:\\Antlr\\V3\\MathLexer.g:9:12: 'functions'
			{
			match("functions"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCTIONS"

	// $ANTLR start "HELP"
	public final void mHELP() throws RecognitionException {
		try {
			int _type = HELP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Antlr\\V3\\MathLexer.g:10:5: ( '?' | 'help' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='?') ) {
				alt1=1;
			}
			else if ( (LA1_0=='h') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// D:\\Antlr\\V3\\MathLexer.g:10:7: '?'
					{
					match('?'); 
					}
					break;
				case 2 :
					// D:\\Antlr\\V3\\MathLexer.g:10:13: 'help'
					{
					match("help"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HELP"

	// $ANTLR start "LEFT_PAREN"
	public final void mLEFT_PAREN() throws RecognitionException {
		try {
			int _type = LEFT_PAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Antlr\\V3\\MathLexer.g:11:11: ( '(' )
			// D:\\Antlr\\V3\\MathLexer.g:11:13: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT_PAREN"

	// $ANTLR start "LIST"
	public final void mLIST() throws RecognitionException {
		try {
			int _type = LIST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Antlr\\V3\\MathLexer.g:12:5: ( 'list' )
			// D:\\Antlr\\V3\\MathLexer.g:12:7: 'list'
			{
			match("list"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LIST"

	// $ANTLR start "PRINT"
	public final void mPRINT() throws RecognitionException {
		try {
			int _type = PRINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Antlr\\V3\\MathLexer.g:13:6: ( 'print' )
			// D:\\Antlr\\V3\\MathLexer.g:13:8: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINT"

	// $ANTLR start "RIGHT_PAREN"
	public final void mRIGHT_PAREN() throws RecognitionException {
		try {
			int _type = RIGHT_PAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Antlr\\V3\\MathLexer.g:14:12: ( ')' )
			// D:\\Antlr\\V3\\MathLexer.g:14:14: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT_PAREN"

	// $ANTLR start "SIGN"
	public final void mSIGN() throws RecognitionException {
		try {
			int _type = SIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Antlr\\V3\\MathLexer.g:15:5: ( '+' | '-' )
			// D:\\Antlr\\V3\\MathLexer.g:
			{
			if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIGN"

	// $ANTLR start "VARIABLES"
	public final void mVARIABLES() throws RecognitionException {
		try {
			int _type = VARIABLES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Antlr\\V3\\MathLexer.g:16:10: ( 'variables' )
			// D:\\Antlr\\V3\\MathLexer.g:16:12: 'variables'
			{
			match("variables"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARIABLES"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Antlr\\V3\\MathLexer.g:18:7: ( INTEGER | FLOAT )
			int alt2=2;
			alt2 = dfa2.predict(input);
			switch (alt2) {
				case 1 :
					// D:\\Antlr\\V3\\MathLexer.g:18:9: INTEGER
					{
					mINTEGER(); 

					}
					break;
				case 2 :
					// D:\\Antlr\\V3\\MathLexer.g:18:19: FLOAT
					{
					mFLOAT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			// D:\\Antlr\\V3\\MathLexer.g:19:15: ( INTEGER '.' ( '0' .. '9' )+ )
			// D:\\Antlr\\V3\\MathLexer.g:19:17: INTEGER '.' ( '0' .. '9' )+
			{
			mINTEGER(); 

			match('.'); 
			// D:\\Antlr\\V3\\MathLexer.g:19:29: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// D:\\Antlr\\V3\\MathLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			// D:\\Antlr\\V3\\MathLexer.g:20:17: ( '0' | ( SIGN )? '1' .. '9' ( '0' .. '9' )* )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='0') ) {
				alt6=1;
			}
			else if ( (LA6_0=='+'||LA6_0=='-'||(LA6_0 >= '1' && LA6_0 <= '9')) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// D:\\Antlr\\V3\\MathLexer.g:20:19: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// D:\\Antlr\\V3\\MathLexer.g:20:25: ( SIGN )? '1' .. '9' ( '0' .. '9' )*
					{
					// D:\\Antlr\\V3\\MathLexer.g:20:25: ( SIGN )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0=='+'||LA4_0=='-') ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// D:\\Antlr\\V3\\MathLexer.g:
							{
							if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					matchRange('1','9'); 
					// D:\\Antlr\\V3\\MathLexer.g:20:40: ( '0' .. '9' )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// D:\\Antlr\\V3\\MathLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop5;
						}
					}

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "NAME"
	public final void mNAME() throws RecognitionException {
		try {
			int _type = NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Antlr\\V3\\MathLexer.g:21:5: ( LETTER ( LETTER | DIGIT | '_' )* )
			// D:\\Antlr\\V3\\MathLexer.g:21:7: LETTER ( LETTER | DIGIT | '_' )*
			{
			mLETTER(); 

			// D:\\Antlr\\V3\\MathLexer.g:21:14: ( LETTER | DIGIT | '_' )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\Antlr\\V3\\MathLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop7;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NAME"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Antlr\\V3\\MathLexer.g:22:15: ( '\"' ( NONCONTROL_CHAR )* '\"' )
			// D:\\Antlr\\V3\\MathLexer.g:22:17: '\"' ( NONCONTROL_CHAR )* '\"'
			{
			match('\"'); 
			// D:\\Antlr\\V3\\MathLexer.g:22:21: ( NONCONTROL_CHAR )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='\t'||(LA8_0 >= ' ' && LA8_0 <= '!')||(LA8_0 >= '#' && LA8_0 <= '~')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// D:\\Antlr\\V3\\MathLexer.g:
					{
					if ( input.LA(1)=='\t'||(input.LA(1) >= ' ' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '~') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop8;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "NONCONTROL_CHAR"
	public final void mNONCONTROL_CHAR() throws RecognitionException {
		try {
			// D:\\Antlr\\V3\\MathLexer.g:24:25: ( LETTER | DIGIT | SYMBOL | SPACE )
			// D:\\Antlr\\V3\\MathLexer.g:
			{
			if ( input.LA(1)=='\t'||(input.LA(1) >= ' ' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '~') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NONCONTROL_CHAR"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// D:\\Antlr\\V3\\MathLexer.g:25:16: ( LOWER | UPPER )
			// D:\\Antlr\\V3\\MathLexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "LOWER"
	public final void mLOWER() throws RecognitionException {
		try {
			// D:\\Antlr\\V3\\MathLexer.g:26:15: ( 'a' .. 'z' )
			// D:\\Antlr\\V3\\MathLexer.g:
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOWER"

	// $ANTLR start "UPPER"
	public final void mUPPER() throws RecognitionException {
		try {
			// D:\\Antlr\\V3\\MathLexer.g:27:15: ( 'A' .. 'Z' )
			// D:\\Antlr\\V3\\MathLexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UPPER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// D:\\Antlr\\V3\\MathLexer.g:28:15: ( '0' .. '9' )
			// D:\\Antlr\\V3\\MathLexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "SPACE"
	public final void mSPACE() throws RecognitionException {
		try {
			// D:\\Antlr\\V3\\MathLexer.g:29:15: ( ' ' | '\\t' )
			// D:\\Antlr\\V3\\MathLexer.g:
			{
			if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SPACE"

	// $ANTLR start "SYMBOL"
	public final void mSYMBOL() throws RecognitionException {
		try {
			// D:\\Antlr\\V3\\MathLexer.g:32:16: ( '!' | '#' .. '/' | ':' .. '@' | '[' .. '`' | '{' .. '~' )
			// D:\\Antlr\\V3\\MathLexer.g:
			{
			if ( input.LA(1)=='!'||(input.LA(1) >= '#' && input.LA(1) <= '/')||(input.LA(1) >= ':' && input.LA(1) <= '@')||(input.LA(1) >= '[' && input.LA(1) <= '`')||(input.LA(1) >= '{' && input.LA(1) <= '~') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYMBOL"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Antlr\\V3\\MathLexer.g:37:8: ( ( ( '\\r' )? '\\n' )+ )
			// D:\\Antlr\\V3\\MathLexer.g:37:10: ( ( '\\r' )? '\\n' )+
			{
			// D:\\Antlr\\V3\\MathLexer.g:37:10: ( ( '\\r' )? '\\n' )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0=='\n'||LA10_0=='\r') ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// D:\\Antlr\\V3\\MathLexer.g:37:11: ( '\\r' )? '\\n'
					{
					// D:\\Antlr\\V3\\MathLexer.g:37:11: ( '\\r' )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='\r') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// D:\\Antlr\\V3\\MathLexer.g:37:11: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "WHITESPACE"
	public final void mWHITESPACE() throws RecognitionException {
		try {
			int _type = WHITESPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Antlr\\V3\\MathLexer.g:38:11: ( ( SPACE )+ )
			// D:\\Antlr\\V3\\MathLexer.g:38:13: ( SPACE )+
			{
			// D:\\Antlr\\V3\\MathLexer.g:38:13: ( SPACE )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0=='\t'||LA11_0==' ') ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// D:\\Antlr\\V3\\MathLexer.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHITESPACE"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\Antlr\\V3\\MathLexer.g:1:8: ( APOSTROPHE | ASSIGN | CARET | FUNCTIONS | HELP | LEFT_PAREN | LIST | PRINT | RIGHT_PAREN | SIGN | VARIABLES | NUMBER | NAME | STRING_LITERAL | NEWLINE | WHITESPACE )
		int alt12=16;
		switch ( input.LA(1) ) {
		case '\'':
			{
			alt12=1;
			}
			break;
		case '=':
			{
			alt12=2;
			}
			break;
		case '^':
			{
			alt12=3;
			}
			break;
		case 'f':
			{
			int LA12_4 = input.LA(2);
			if ( (LA12_4=='u') ) {
				int LA12_18 = input.LA(3);
				if ( (LA12_18=='n') ) {
					int LA12_24 = input.LA(4);
					if ( (LA12_24=='c') ) {
						int LA12_29 = input.LA(5);
						if ( (LA12_29=='t') ) {
							int LA12_34 = input.LA(6);
							if ( (LA12_34=='i') ) {
								int LA12_38 = input.LA(7);
								if ( (LA12_38=='o') ) {
									int LA12_41 = input.LA(8);
									if ( (LA12_41=='n') ) {
										int LA12_43 = input.LA(9);
										if ( (LA12_43=='s') ) {
											int LA12_45 = input.LA(10);
											if ( ((LA12_45 >= '0' && LA12_45 <= '9')||(LA12_45 >= 'A' && LA12_45 <= 'Z')||LA12_45=='_'||(LA12_45 >= 'a' && LA12_45 <= 'z')) ) {
												alt12=13;
											}

											else {
												alt12=4;
											}

										}

										else {
											alt12=13;
										}

									}

									else {
										alt12=13;
									}

								}

								else {
									alt12=13;
								}

							}

							else {
								alt12=13;
							}

						}

						else {
							alt12=13;
						}

					}

					else {
						alt12=13;
					}

				}

				else {
					alt12=13;
				}

			}

			else {
				alt12=13;
			}

			}
			break;
		case '?':
			{
			alt12=5;
			}
			break;
		case 'h':
			{
			int LA12_6 = input.LA(2);
			if ( (LA12_6=='e') ) {
				int LA12_19 = input.LA(3);
				if ( (LA12_19=='l') ) {
					int LA12_25 = input.LA(4);
					if ( (LA12_25=='p') ) {
						int LA12_30 = input.LA(5);
						if ( ((LA12_30 >= '0' && LA12_30 <= '9')||(LA12_30 >= 'A' && LA12_30 <= 'Z')||LA12_30=='_'||(LA12_30 >= 'a' && LA12_30 <= 'z')) ) {
							alt12=13;
						}

						else {
							alt12=5;
						}

					}

					else {
						alt12=13;
					}

				}

				else {
					alt12=13;
				}

			}

			else {
				alt12=13;
			}

			}
			break;
		case '(':
			{
			alt12=6;
			}
			break;
		case 'l':
			{
			int LA12_8 = input.LA(2);
			if ( (LA12_8=='i') ) {
				int LA12_20 = input.LA(3);
				if ( (LA12_20=='s') ) {
					int LA12_26 = input.LA(4);
					if ( (LA12_26=='t') ) {
						int LA12_31 = input.LA(5);
						if ( ((LA12_31 >= '0' && LA12_31 <= '9')||(LA12_31 >= 'A' && LA12_31 <= 'Z')||LA12_31=='_'||(LA12_31 >= 'a' && LA12_31 <= 'z')) ) {
							alt12=13;
						}

						else {
							alt12=7;
						}

					}

					else {
						alt12=13;
					}

				}

				else {
					alt12=13;
				}

			}

			else {
				alt12=13;
			}

			}
			break;
		case 'p':
			{
			int LA12_9 = input.LA(2);
			if ( (LA12_9=='r') ) {
				int LA12_21 = input.LA(3);
				if ( (LA12_21=='i') ) {
					int LA12_27 = input.LA(4);
					if ( (LA12_27=='n') ) {
						int LA12_32 = input.LA(5);
						if ( (LA12_32=='t') ) {
							int LA12_36 = input.LA(6);
							if ( ((LA12_36 >= '0' && LA12_36 <= '9')||(LA12_36 >= 'A' && LA12_36 <= 'Z')||LA12_36=='_'||(LA12_36 >= 'a' && LA12_36 <= 'z')) ) {
								alt12=13;
							}

							else {
								alt12=8;
							}

						}

						else {
							alt12=13;
						}

					}

					else {
						alt12=13;
					}

				}

				else {
					alt12=13;
				}

			}

			else {
				alt12=13;
			}

			}
			break;
		case ')':
			{
			alt12=9;
			}
			break;
		case '+':
		case '-':
			{
			int LA12_11 = input.LA(2);
			if ( ((LA12_11 >= '1' && LA12_11 <= '9')) ) {
				alt12=12;
			}

			else {
				alt12=10;
			}

			}
			break;
		case 'v':
			{
			int LA12_12 = input.LA(2);
			if ( (LA12_12=='a') ) {
				int LA12_23 = input.LA(3);
				if ( (LA12_23=='r') ) {
					int LA12_28 = input.LA(4);
					if ( (LA12_28=='i') ) {
						int LA12_33 = input.LA(5);
						if ( (LA12_33=='a') ) {
							int LA12_37 = input.LA(6);
							if ( (LA12_37=='b') ) {
								int LA12_40 = input.LA(7);
								if ( (LA12_40=='l') ) {
									int LA12_42 = input.LA(8);
									if ( (LA12_42=='e') ) {
										int LA12_44 = input.LA(9);
										if ( (LA12_44=='s') ) {
											int LA12_46 = input.LA(10);
											if ( ((LA12_46 >= '0' && LA12_46 <= '9')||(LA12_46 >= 'A' && LA12_46 <= 'Z')||LA12_46=='_'||(LA12_46 >= 'a' && LA12_46 <= 'z')) ) {
												alt12=13;
											}

											else {
												alt12=11;
											}

										}

										else {
											alt12=13;
										}

									}

									else {
										alt12=13;
									}

								}

								else {
									alt12=13;
								}

							}

							else {
								alt12=13;
							}

						}

						else {
							alt12=13;
						}

					}

					else {
						alt12=13;
					}

				}

				else {
					alt12=13;
				}

			}

			else {
				alt12=13;
			}

			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt12=12;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'g':
		case 'i':
		case 'j':
		case 'k':
		case 'm':
		case 'n':
		case 'o':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt12=13;
			}
			break;
		case '\"':
			{
			alt12=14;
			}
			break;
		case '\n':
		case '\r':
			{
			alt12=15;
			}
			break;
		case '\t':
		case ' ':
			{
			alt12=16;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 12, 0, input);
			throw nvae;
		}
		switch (alt12) {
			case 1 :
				// D:\\Antlr\\V3\\MathLexer.g:1:10: APOSTROPHE
				{
				mAPOSTROPHE(); 

				}
				break;
			case 2 :
				// D:\\Antlr\\V3\\MathLexer.g:1:21: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 3 :
				// D:\\Antlr\\V3\\MathLexer.g:1:28: CARET
				{
				mCARET(); 

				}
				break;
			case 4 :
				// D:\\Antlr\\V3\\MathLexer.g:1:34: FUNCTIONS
				{
				mFUNCTIONS(); 

				}
				break;
			case 5 :
				// D:\\Antlr\\V3\\MathLexer.g:1:44: HELP
				{
				mHELP(); 

				}
				break;
			case 6 :
				// D:\\Antlr\\V3\\MathLexer.g:1:49: LEFT_PAREN
				{
				mLEFT_PAREN(); 

				}
				break;
			case 7 :
				// D:\\Antlr\\V3\\MathLexer.g:1:60: LIST
				{
				mLIST(); 

				}
				break;
			case 8 :
				// D:\\Antlr\\V3\\MathLexer.g:1:65: PRINT
				{
				mPRINT(); 

				}
				break;
			case 9 :
				// D:\\Antlr\\V3\\MathLexer.g:1:71: RIGHT_PAREN
				{
				mRIGHT_PAREN(); 

				}
				break;
			case 10 :
				// D:\\Antlr\\V3\\MathLexer.g:1:83: SIGN
				{
				mSIGN(); 

				}
				break;
			case 11 :
				// D:\\Antlr\\V3\\MathLexer.g:1:88: VARIABLES
				{
				mVARIABLES(); 

				}
				break;
			case 12 :
				// D:\\Antlr\\V3\\MathLexer.g:1:98: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 13 :
				// D:\\Antlr\\V3\\MathLexer.g:1:105: NAME
				{
				mNAME(); 

				}
				break;
			case 14 :
				// D:\\Antlr\\V3\\MathLexer.g:1:110: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 15 :
				// D:\\Antlr\\V3\\MathLexer.g:1:125: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 16 :
				// D:\\Antlr\\V3\\MathLexer.g:1:133: WHITESPACE
				{
				mWHITESPACE(); 

				}
				break;

		}
	}


	protected DFA2 dfa2 = new DFA2(this);
	static final String DFA2_eotS =
		"\1\uffff\1\4\1\uffff\1\4\2\uffff\1\4";
	static final String DFA2_eofS =
		"\7\uffff";
	static final String DFA2_minS =
		"\1\53\1\56\1\61\1\56\2\uffff\1\56";
	static final String DFA2_maxS =
		"\1\71\1\56\2\71\2\uffff\1\71";
	static final String DFA2_acceptS =
		"\4\uffff\1\1\1\2\1\uffff";
	static final String DFA2_specialS =
		"\7\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\2\1\uffff\1\2\2\uffff\1\1\11\3",
			"\1\5",
			"\11\3",
			"\1\5\1\uffff\12\6",
			"",
			"",
			"\1\5\1\uffff\12\6"
	};

	static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
	static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
	static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
	static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
	static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
	static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
	static final short[][] DFA2_transition;

	static {
		int numStates = DFA2_transitionS.length;
		DFA2_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
		}
	}

	protected class DFA2 extends DFA {

		public DFA2(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 2;
			this.eot = DFA2_eot;
			this.eof = DFA2_eof;
			this.min = DFA2_min;
			this.max = DFA2_max;
			this.accept = DFA2_accept;
			this.special = DFA2_special;
			this.transition = DFA2_transition;
		}
		@Override
		public String getDescription() {
			return "18:1: NUMBER : ( INTEGER | FLOAT );";
		}
	}

}
