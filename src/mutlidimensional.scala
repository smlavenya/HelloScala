

object mutlidimensional {
  
  def main(args:Array[String]){
    
    val rows =2
    val columns=3
    val multidim = Array.ofDim[String](rows,columns)
    multidim(0)(0)="rammi"
    multidim(0)(1)="lavi"
    multidim(0)(2)="ammulu"
    multidim(1)(0)="sub"
    multidim(1)(1)="keer"
    multidim(1)(2)="brem"
    
    
    for{
      i <- 0 until rows
      j <- 0 until columns
    }
    
    println(s"($i)($j)=${multidim(i)(j)}")
    

    
  }
}