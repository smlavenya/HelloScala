

object ifblock {
  
  def main(args: Array[String]){
  
  val i=(math.random*100).toInt
  
  val j=(math.random*100).toInt
  
  if(i>j){
    println("i"+i)
  }  else{ if(i==j){
    println("equal")
    println(i);
    println(j)
  }else {
    println("j"+j)
  }
      
  }
  }
}