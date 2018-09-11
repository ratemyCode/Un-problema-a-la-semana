package Alfa.FirstWeek.Watermelon

class Watermelon {
  def process(weightWaterMelon: Int): String ={
    val fn = (x: Int) => if(x % 2 == 0 && x > 2  ) "YES" else "NO"
    val n = fn(weightWaterMelon)
    n
  }
}
