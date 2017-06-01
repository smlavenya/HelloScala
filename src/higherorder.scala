

object higherorder {
  
  def marker(mark:Int) : Double =mark.toDouble/2
  
  def addfive(value:Int): Int=value*5
  
  def processrange(start: Int,Finsih: Int,processor:Int => AnyVal): Unit ={
    
    for(i<-start to Finsih)
      println(processor(i))
  }
  
  def main(args: Array[String]){
    
    processrange(1,3,marker)
    processrange(1,2,addfive)
  }
}