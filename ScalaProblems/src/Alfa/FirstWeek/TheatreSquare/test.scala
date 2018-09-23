package Alfa.FirstWeek.TheatreSquare

object test {
  def main(args: Array[String]){
    val s = readLine().split(" ").map(_.toInt)

    val theatre = new TheatreSquare()
    val res = theatre.process(s(0), s(1), s(2))

    println(res)
  }
}
