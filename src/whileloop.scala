

object whileloop {
  
  def main(args: Array[String]){
  val j=76
  
  var ctr =86
  
  
  for ( e <- ctr to j by -2){
    println(e)
  }
  
  while(ctr >=j){
    println(ctr)
    ctr -= 1
  }
  }
}