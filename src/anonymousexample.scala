

object anonymousexample {
  
  def main(args: Array[String]){
    
    var resul =(a: Int, b:Int) => a+b
    var res =(_:Int)+(_:Int)
    
    println(resul(10,5))
    println(res(3,4))
  }
  


  
}