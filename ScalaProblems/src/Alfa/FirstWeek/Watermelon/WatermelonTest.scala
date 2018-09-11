package Alfa.FirstWeek.Watermelon

import scala.io.StdIn

object WatermelonTest {
  def main(args: Array[String]): Unit ={
//    val s = readLine().split(" ").map(_.toInt)
    val s = StdIn.readInt()
    val waterMelon = new Watermelon
    val res  = waterMelon.process(s)

    print(res)
  }
}
