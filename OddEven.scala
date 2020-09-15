object OddEven{
   def main(args: Array[String]) {
     
    println(isEven(5))
    println(isOdd(5))
   }
   
  def isEven(a:Int):Boolean = a match{
      
      case 0 => true
      case _ => isOdd(a-1)
  }
  
  def isOdd(a:Int):Boolean = !(isEven(a))
}
