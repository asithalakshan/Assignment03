object primen{
   def main(args: Array[String]) {
     
    println(prime(4))
   }
   
   def gcd(a:Int, b:Int):Int = b match{
       
       case 0 => a
       case x if x>a => gcd(x, a)
       case _ => gcd(b, a%b)
   }
   
   def prime(a:Int, b:Int = 2):Boolean = b match{
       
       case x if(x==a) => true
       case x if gcd(a, x) > 1 => false
       case x => prime(a, x+1)
   }
}
