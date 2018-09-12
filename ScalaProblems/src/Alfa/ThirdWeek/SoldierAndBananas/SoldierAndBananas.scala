package Alfa.ThirdWeek.SoldierAndBananas

class SoldierAndBananas {
  def process(k: Int, n: Int, w: Int): Int ={
    var sum = 0

    for( i <- 1 to w){
      sum = sum + i * k
    }
    if ( n - sum   >= 0 ) return 0

    sum - n
  }
}