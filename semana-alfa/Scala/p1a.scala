import scala.io.Source

object test{
  def main(args: Array[String]){
    val s = readLine().split(" ").map(_.toInt)
    val fn = (x: Long, y: Long) => (x + y - 1)/y
    val n = fn(s(0), s(2))
    val m = fn(s(1), s(2))
    println(n*m)
  }
}
