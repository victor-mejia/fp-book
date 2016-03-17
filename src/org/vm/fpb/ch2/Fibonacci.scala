

/**
  * Created by vicmejia on 9/03/16.
  */
object Fibonacci {

  def fibonacci(n : Int): Int = {
    @annotation.tailrec
    def loop(i: Int, fN: Int,fN1: Int): Int = {
      if(i == n) fN + fN1
      else loop(i+1,fN + fN1,fN)
    }

    if (n <= 1) 0
    else if (n == 2) 1
    else loop(3,1,0)
  }

  def main(ars : Array[String]): Unit = {
    println("Fibonacci of "+ars(0)+": "+Fibonacci.fibonacci(ars(0).toInt))
  }


}
