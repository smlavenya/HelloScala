

object singledimesionalarray {
  def main(args: Array[String]){
    
    var numbers:Array[Int]=new Array(5)
    
    numbers(0)=5;numbers(1)=10;numbers(2)=15;numbers(3)=20;numbers(4)=25;
    
    var total=0.0
    
    for( a <-0 to (numbers.length-1))
    {
      total+= numbers(a)
      
    }
    println("totals" + total)
    
    var average =0.0
    average=total/numbers.length
    println("average"+average)
    
    
  }
}