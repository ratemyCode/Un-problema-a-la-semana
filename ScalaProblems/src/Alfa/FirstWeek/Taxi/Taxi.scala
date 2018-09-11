package Alfa.FirstWeek.Taxi

class Taxi {
  def process(childrens: Array[Int]): Int ={
    var count1 = childrens.count(_ == 1)
    var count2 = childrens.count(_ == 2)
    var count3 = childrens.count(_ == 3)
    var count4 = childrens.count(_ == 4)

    var res = count4
    while (count1 > 0 && count3 >0 ){
      res = res + 1
      count1  = count1 - 1
      count3 = count3  - 1
    }
    if(count2 > 0){
      res = res + count2/2
      count2 = count2 % 2
    }

    if(count1 > 0 ){
      if(count2 > 0){
        count1  = count1 + 2
      }
      res = res + count1/4
      if( count1 % 4 != 0 ) res = res + 1;
    }
    else if(count3 > 0){
      res = res +  count3
      if( count2 > 0){
        res = res + 1

      }
    }
    else if(count2 > 0){
      res = res +1
    }

    res
  }
}
