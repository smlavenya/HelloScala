

class classprimary(id: Int,name: String) {
  def show(){
    println(id+name)
  }
}

object pri{
  def main(args:Array[String]){
    
    var const = new classprimary(111,"laven")
    var const1=new classprimary(222,"rammi")
    const.show()
    const1.show()
  }
}