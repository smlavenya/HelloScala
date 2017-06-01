

class companionclass {
  def add{
    var i=10; var j=20
    println(i+j)
  }
}

object companionclass{
  def main(args:Array[String]){
    new companionclass().add
    
  }
}