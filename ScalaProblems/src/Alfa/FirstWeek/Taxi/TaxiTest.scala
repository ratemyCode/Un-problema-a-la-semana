package Alfa.FirstWeek.Taxi


import scala.io.StdIn
object TaxiTest {
  def main(args: Array[String]){
    val numberOfGroups = StdIn.readInt()
    val childrens = StdIn.readLine().split(" ").map(_.toInt)

    val taxi = new Taxi()
    val res = taxi.process(childrens)

    println(res)
  }
}
