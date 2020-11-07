package com.particeep.test

/**
  * This is basic language questions so don't use external library or build in function
  */
object BasicScala {


  /**
    * Encode parameter in url format
    *
    * Example:
    *
    * input  : Map("sort_by" -> "name", "order_by" -> "asc", "user_id" -> "12")
    * output : "?sort_by=name&order_by=asc&user_id=12"
    *
    * input  : Map()
    * output : ""
    */
  def encodeParamsInUrl(params: Map[String, String]): String = {
    if (params.size == 0){
      ""
    }else{
      "?"+params.map( value => value._1+"="+value._2 ).reduce(_+"&"+_)
    }
  }


  /**
    * Test if a String is an email
    */
  def isEmail(maybeEmail: String): Boolean = """(\w+)@([\w\.]+)""".r.unapplySeq(maybeEmail).isDefined


  /**
    * Compute i ^ n
    *
    * Example:
    *
    * input : (i = 2, n = 3) we compute 2^3 = 2x2x2
    * output : 8
    *
    * input : (i = 99, n = 38997)
    * output : 1723793299
    */
  def power(i:Int, n:Int):Int = {
    /* Negative power not handled*/
    if( n <= 0)
      1
    else{
      var res = 1
      var temp = n
      while(temp>0){
        res *= i
        temp = temp - 1
      }
      res
    }
  }


}
