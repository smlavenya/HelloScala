

object fibnoci {
  
  def main(args: Array[String]){
    var i=0
    var j=1
    println(i)
    println(j)
    for (e <- j to 5 by 1){
  
   
      val result=i+j
      i=j;
      j=result;
     
      println(result)
      
    }
      
    
  }
}