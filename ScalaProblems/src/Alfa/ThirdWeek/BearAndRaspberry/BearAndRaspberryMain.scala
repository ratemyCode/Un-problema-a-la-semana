package Alfa.ThirdWeek.BearAndRaspberry

import scala.io.StdIn

object BearAndRaspberryMain {
  def main(args: Array[String]): Unit ={
    val nc = StdIn.readLine().split(" ").map(_.toInt)
    val n = nc(0)
    val c = nc(1)
    val elements = StdIn.readLine().split(" ").map(_.toInt)
    val bar = new BearAndRaspberry
    val res = bar.process(n, c, elements)

    print(res)
  }
}