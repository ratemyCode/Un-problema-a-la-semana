package Alfa.SecondWeek.LessOrEqual

import scala.io.StdIn

object LessOrEqualTest {
  def main(args: Array[String]):Unit ={
    val nk = StdIn.readLine().split(" ").map(_.toInt)
    val elements = StdIn.readLine().split(" ").map(_.toInt)
    val elementsSorted = elements.sortWith(_ < _)
    val k = nk(1)
    val n = nk(0)

    val lessOrEqual = new LessOrEqual
    val isLessOrEqual = lessOrEqual.process(k,n,elementsSorted)
    print(isLessOrEqual)
  }
}
