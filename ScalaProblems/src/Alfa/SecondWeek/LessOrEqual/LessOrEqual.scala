package Alfa.SecondWeek.LessOrEqual

class LessOrEqual {
  def process(k: Int, tam: Int, elements:Array[Int]): String ={
    if( k > tam ) return "-1"
    if (k == tam) return elements(k-1)+" "
    if(k < tam){

      if (k == 0 ){
        if (elements(0) > 1){
          return elements( 0 ) - 1+""
        }
        else return "-1"
      }

      if ( elements( k - 1 ) < elements( k ))
      {return elements(k - 1)+ ""}
    }
    return "-1"
  }

}
