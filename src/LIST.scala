

object LIST {
  def main(args: Array[String]){
    val list=List(2,4,5,6,7)
   
    var list2:List[Int]=List(45,465,34)
    
    println(list2)
    
  99::list
  println(list)
    var add=1::2::3::List(4,5)
    
    println(add)
    
    var li=1::2::3::Nil
    println(li)
  }
}