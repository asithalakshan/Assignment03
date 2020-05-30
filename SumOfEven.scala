

object SumOfEven {
  def main(args: Array[String]){
    
    var n:Int = 5
    println("Addition of all even numbers less than " +n+ " is : " + addEven(n))
  }
  
  def addEven(no:Int):Int = 
    
    if (no==0) 0
    
    else if (no%2==1) addEven(no-1)
    
    else
     addEven(no) + addEven(no-2)
}