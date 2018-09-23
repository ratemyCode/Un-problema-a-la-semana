package Alfa.Semana1

object WaterMelon {
  def main(args: Array[String]): Unit ={
    val s = readLine().split(" ").map(_.toInt)
    val fn = (x: Int) => if(x % 2 == 0 && x > 2  ) "YES" else "NO"
    val n = fn(s(0))
    println(n)
  }

}