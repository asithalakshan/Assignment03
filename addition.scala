

object addition {
  def main(args: Array[String]){
    
    println(add(5))
  }
  
  def add(no:Int):Int =    
    if (no==1) 1
    
    else no + add(no-1)
  
}