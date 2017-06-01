

object anonymous {
  
  def main(args: Array[String]){
    
    def moneytransfer(amt: Double, providerfee :Double=> Double): Double = {
      
     var i= amt+10+providerfee(amt)
      
     return i
      
    }
    
    println(moneytransfer(100, m=>m/10))
  }
}