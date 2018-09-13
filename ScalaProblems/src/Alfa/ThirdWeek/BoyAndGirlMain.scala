package Alfa.ThirdWeek

import scala.io.StdIn

object BoyAndGirlMain {
  def main(args: Array[String]): Unit = {
    val userName = StdIn.readLine().toArray
    val lol = userName.groupBy(_.charValue())

    if (lol.size % 2 == 0 )
      print ("CHAT WITH HER!")
    else print("IGNORE HIM!")
  }

}
