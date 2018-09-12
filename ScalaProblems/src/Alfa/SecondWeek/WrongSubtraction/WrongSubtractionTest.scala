package Alfa.SecondWeek.WrongSubtraction

import scala.io.StdIn

object WrongSubtractionTest {

  def main(args:Array[String]): Unit={
    val nk = StdIn.readLine().split(" ").map(_.toInt)
    val n = nk(0)
    val k = nk(1)
    val wrongSubtraction = new WrongSubtraction
    val res = wrongSubtraction.process(n,k)

    print(res)
  }
}
