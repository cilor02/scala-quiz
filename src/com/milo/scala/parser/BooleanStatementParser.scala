package com.milo.scala.parser

class BooleanStatementParser (tokens:List[String])
{
  val ops = List("and","or")
  def parse(opsList:List[String], statement:List[String])
  {
   val i = statement.indexWhere(_ == opsList.head)
   
   if(i < 0)
   {
     parse(opsList.tail,statement)
   }
   
   val preOp = statement(i-1)
   val op = statement(i)
   val postOp = statement(i+1)
   statement.take(i-2)
   statement.drop(i-2)
   statement.drop(3)
   

  }
  
}