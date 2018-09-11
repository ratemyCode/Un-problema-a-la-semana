package Alfa.FirstWeek.Taxi

object TaxiTest {
  def main(args: Array[String]){
    val s = readLine().split(" ").map(_.toInt)

    val fn = (x: Int) => if(x % 2 == 0 && x > 2  ) "YES" else "NO"
    val n = fn(s(0))
    println(n)
  }
}
