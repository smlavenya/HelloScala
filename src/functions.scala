object functions {
  def main(args: Array[String]){
  def ncr(n: Int,r: Int)={
    def fact(i: Int): Int= {
      
      var res =1
      for (e<- i to 1 by -1)
        
        res*=e
      return  res
        
    }
    
    fact(n)/(fact(n-r)*fact(n-r))
  }
  var l=ncr(6,3)
  println(l)
  }
}