parser grammar MathParser;
 
options {
  // We're going to output an AST.
  output = AST;
 
  // We're going to use the tokens defined in our MathLexer grammar.
  tokenVocab = MathLexer;
}
 
// These are imaginary tokens that will serve as parent nodes
// for grouping other tokens in our AST.
tokens {
  COMBINE;
  DEFINE;
  DERIVATIVE;
  FUNCTION;
  POLYNOMIAL;
  TERM;
}
 
// We want the generated parser class to be in this package.
@header { package com.ltchen.antlr.antlr3.math; }
 
// This is the "start rule".
// EOF is a predefined token that represents the end of input.
// The "start rule" should end with this.
// Note the use of the ! AST operator
// to avoid adding the EOF token to the AST.
script: statement* EOF!;
 
statement: assign | define | interactiveStatement | combine | print;
 
// These kinds of statements only need to be supported
// when reading input from the keyboard.
interactiveStatement: help | list;
 
// Examples of input that match this rule include
// "a = 19", "a = b", "a = f(2)" and "a = f(b)".
assign: NAME ASSIGN value terminator -> ^(ASSIGN NAME value);
 
value: NUMBER | NAME | functionEval;
 
// A parenthesized group in a rule alternative is called a "subrule".
// Examples of input that match this rule include "f(2)" and "f(b)".
functionEval
  : fn=NAME LEFT_PAREN (v=NUMBER | v=NAME) RIGHT_PAREN -> ^(FUNCTION $fn $v);
 
// EOF cannot be used in lexer rules, so we made this a parser rule.
// EOF is needed here for interactive mode where each line entered ends in EOF
// and for file mode where the last line ends in EOF.
terminator: NEWLINE | EOF;
 
// Examples of input that match this rule include
// "f(x) = 3x^2 - 4" and "g(x) = y^2 - 2y + 1".
// Note that two parameters are passed to the polynomial rule.
define
  : fn=NAME LEFT_PAREN fv=NAME RIGHT_PAREN ASSIGN
    polynomial[$fn.text, $fv.text] terminator
    -> ^(DEFINE $fn $fv polynomial);
 
// Examples of input that match this rule include
// "3x2 - 4" and "y^2 - 2y + 1".
// fnt = function name text; fvt = function variable text
// Note that two parameters are passed in each invocation of the term rule.
polynomial[String fnt, String fvt]
  : term[$fnt, $fvt] (SIGN term[$fnt, $fvt])*
    -> ^(POLYNOMIAL term (SIGN term)*);
 
// Examples of input that match this rule include
// "4", "4x", "x^2" and "4x^2".
// fnt = function name text; fvt = function variable text
term[String fnt, String fvt]
  // tv = term variable
  : c=coefficient? (tv=NAME e=exponent?)?
    // What follows is a validating semantic predicate.
    // If it evaluates to false, a FailedPredicateException will be thrown.
    // It is testing whether the term variable matches the function variable.
    { tv == null ? true : ($tv.text).equals($fvt) }?
    -> ^(TERM $c? $tv? $e?)
  ;
  // This catches bad function definitions such as
  // f(x) = 2y
  catch [FailedPredicateException fpe] {
    String tvt = $tv.text;
    String msg = "In function \"" + fnt +
      "\" the term variable \"" + tvt +
      "\" doesn't match function variable \"" + fvt + "\".";
    throw new RuntimeException(msg);
  } 
 
coefficient: NUMBER;
 
// An example of input that matches this rule is "^2".
exponent: CARET NUMBER -> NUMBER;
 
// Inputs that match this rule are "?" and "help".
help: HELP terminator -> HELP;
 
// Inputs that match this rule include
// "list functions" and "list variables".
list
  : LIST listOption terminator -> ^(LIST listOption);
 
// Inputs that match this rule are "functions" and "variables".
listOption: FUNCTIONS | VARIABLES;
 
// Examples of input that match this rule include
// "h = f + g" and "h = f - g".
combine
  : fn1=NAME ASSIGN fn2=NAME op=SIGN fn3=NAME terminator
    -> ^(COMBINE $fn1 $op $fn2 $fn3);
 
// An example of input that matches this rule is
// print "f(" a ") = " f(a)
print
  : PRINT printTarget* terminator -> ^(PRINT printTarget*); 
 
// Examples of input that match this rule include
// 19, 3.14, "my text", a, f(), f(2), f(a) and f'().
printTarget
  : NUMBER -> NUMBER
  | sl=STRING_LITERAL -> $sl
  | NAME -> NAME
  // This is a function reference to print a string representation.
  | NAME LEFT_PAREN RIGHT_PAREN -> ^(FUNCTION NAME)
  | functionEval
  | derivative
  ;
 
// An example of input that matches this rule is "f'()".
derivative
  : NAME APOSTROPHE LEFT_PAREN RIGHT_PAREN -> ^(DERIVATIVE NAME);