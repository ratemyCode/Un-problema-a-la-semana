package Alfa.ThirdWeek.BearAndRaspberry

class BearAndRaspberry {

  def process(n: Int, c: Int, elements:Array[Int]): Int ={
    var LOL = 0

    for(i <- 0 to n-2){
      val d  =  elements(i) - c - elements(i+1)
      if( LOL < d)
        LOL = d
    }

    LOL
  }

}
