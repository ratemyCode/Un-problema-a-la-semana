package Beta.Week_1.CoverPoints

import scala.io.StdIn

object CoverPoints {
  def main(args: Array[String]): Unit ={
    val n = StdIn.readInt()
    var ans = 0
    for( i <- 1 to n){
      val xy = StdIn.readLine().split(" ").map(_.toInt)
      val x = xy(0)
      val y = xy(1)
      ans  = math.max(ans,x + y)
    }
    print(ans)
  }

}
