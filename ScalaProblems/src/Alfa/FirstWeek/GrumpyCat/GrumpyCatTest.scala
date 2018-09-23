package Alfa.FirstWeek.GrumpyCat

import scala.io.StdIn

object GrumpyCat {
  def main(args:Array[String]): Unit={
    var res = "normal"
    print("9")
    val sequen = List("go die in a hole","are you serious?","terrible","worse","no way","don't even")
    val nk = StdIn.readLine()
    if (sequen.contains(nk)){
      res = "grumpy"
    }

    print(res)

  }
}
