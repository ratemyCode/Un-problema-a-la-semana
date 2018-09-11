package Alfa.SecondWeek.LuckySumOfDigits

import scala.io.StdIn

object  LuckySumOfDigitsTest{

  def main(args: Array[String]):Unit ={
    val luckyNumber = StdIn.readInt()
    val isLucky = new LuckySumOfDigits
    val res = isLucky.process(luckyNumber )
    print(res)

  }
}