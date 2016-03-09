package org.vm.fpb.ch2

/**
  * Created by vicmejia on 9/03/16.
  */
object Finonacci {

  def fibonacci(n : Int): Int = {
    def loop(i: Int, fN: Int,fN1: Int): Int = {
      if(i == n) fN + fN1
      else loop(i+1,fN + fN1,fN)
    }

    if (n <= 1) 0
    else if (n == 2) 1
    else loop(3,1,0)
  }

}
