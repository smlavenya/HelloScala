

object func_currying {
  
  def add (a:Int)(b:Int)={
    a+b
  }
  
  def main(arge: Array[String]){
    var result =add(10)(10)
    println(result)
    var result1=add(10)_
    var result2=result1(3)
    println(result2)
  }
}