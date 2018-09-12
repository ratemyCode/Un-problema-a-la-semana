package Alfa.ThirdWeek.SoldierAndBananas

import scala.io.StdIn

object SoldierAndBananasMain {
  def main(args: Array[String]): Unit = {
    val knw = StdIn.readLine().split(" ").map(_.toInt)
    val k = knw(0)
    val n = knw(1)
    val w = knw(2)

    val saB = new SoldierAndBananas
    val res = saB.process(k, n, w)
    print(res)

  }
}
