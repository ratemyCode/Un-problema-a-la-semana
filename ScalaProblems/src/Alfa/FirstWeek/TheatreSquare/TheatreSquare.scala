package Alfa.FirstWeek.TheatreSquare

class TheatreSquare {
  def process(first: Long, second: Long, third: Long):Long = {
    val fn = (a: Long, b: Long) => (a + b - 1)/b
    val n = fn(first, third)
    val m = fn(second, third)
    n*m
  }
}