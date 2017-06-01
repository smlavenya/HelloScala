

object factorial {
  
 /* def main(args: Array[String]){
    val i =4
    var result=1
    
    for( e <- i to 1 by -1){
      result =result*e
      
      
    }
    println(result)
  }*/
  
  def fact(i:Int):Int={
    
    var res: Int=1
    for(e <- i to 1 by -1)
    
      res *=e
    return res 
    
  }
    
    def main(args: Array[String]){
   var l=   factorial.fact(5):Int
      println(l)    }
  
}