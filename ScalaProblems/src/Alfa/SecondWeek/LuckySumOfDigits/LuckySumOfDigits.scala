package Alfa.SecondWeek.LuckySumOfDigits

class LuckySumOfDigits {
  def process(luckyNumber: Int): String ={
    var y= luckyNumber / 7
    var b= luckyNumber % 7
    var x= b / 4
    var res = ""

    while ( (b % 4)!= 0 &&  y > 0 ){
      b = b + 7
      y = y - 1
      x = b / 4
    }
    if ( ( (x+y) >0) && ( ( (7 * y)  +  (4 * x)) == luckyNumber) ){
      var i=0
      while( i < (x+y) ){
        if( i < x) res = res + "4"
        else res = res + "7"
        i = i + 1
      }
    } else  res = res +  "-1"

    res
  }
}
