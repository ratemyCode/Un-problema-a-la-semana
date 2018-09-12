package Alfa.SecondWeek.WrongSubtraction

class WrongSubtraction {


  def process (n: Int, k: Int): Int ={
    if( k == 0) return n
    if(n % 10 == 0)  return process(n/10, k -1)
    else return process(n -1, k -1)
  }

}
