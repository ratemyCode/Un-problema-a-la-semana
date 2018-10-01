package Beta.Week_1.LittleCLoves3_I

import scala.io.StdIn

object LittleCLoves3Main {
  def main(args: Array[String]){
    val n = StdIn.readInt()
    val p = n/3
    val tt = p%3
    val resFaltante = n%3
    print("residuo de tt:" + tt)


    print(matches(resFaltante, p,tt))
  }

  def matches(x:Int, p: Int, tt: Int): String = {
    if(x == 1) {
      if(tt == 0){
        return ""+(p -1) + " " + (p + 1) + " " + (p + 1)
      }

      if( (p + 1) % 3 != 0  )
        return p + " " + p  + " " + (p + 1)
      else return p + " " + (p + 2) + " " + (p - 1)
    }
    if(x == 2) {
      if(tt == 0){
        return (p -1) + " " + (p + 2) + " " + (p + 1)
      }
      if((p + 2) % 3 != 0)
        return p + " " + p  + " " + (p + 2)
      else return p + " " + (p + 1)  + " " + (p + 1)
    }
    if(x == 0 && tt == 0){
      return (p+1) + " " + (p-2) + " " + (p+1)
    }
    return p + " " + p  + " " + p

  }
}
