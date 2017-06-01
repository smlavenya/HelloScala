

object singletonobj {
  def add={
    var i=10
    var j=20
    var sum =0
    for(e<-i to j by 2)
    {
      sum+=e
      println(sum)
    }
  }
}

object mainn{
  def main(args:Array[String]){
    singletonobj.add
  }
}