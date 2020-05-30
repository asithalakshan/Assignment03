

object fibonacci {
  def main(args: Array[String]){
    
    var n:Int = 8
    var i:Int = 1
    
    println("First " +n+ " Fibonacci Numbers are \n")
    
    for(i<-1 to n){
      
      println("* " + fibonacci(i))
     
      
    }
      
    
  }
  
  def fibonacci(no:Int):Int = 
    
    if (no==0) 0
    
    else if (no==1) 1
    
    else 
      
      fibonacci(no-1) + fibonacci(no-2)
    
    
}