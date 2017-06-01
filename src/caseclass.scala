
class ingete()
case class caseclass (name: String,id: Int ) extends ingete()

case class immutables(var name: String)

case object main{
      
  def main(args: Array[String]){
    
   val im=immutables("testing")
   im.name="hello"
   
  lazy val i=10
   
   println(i)
   println(im)
    val a=caseclass("lavenya",1000)
    val b=caseclass("rammi",3000)
    println(a.copy("rammi", 2000))
    println(a.copy(name="test",id=43))
    println(a.==(b))
    println(a.id);
    val aa=a.toString()
    val bb=a.hashCode()
    println(bb)
    
    
  }
  
  
}