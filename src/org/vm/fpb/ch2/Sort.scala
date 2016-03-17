
/**
  * Created by vicmejia on 17/03/16.
  */
object Sort {

  def isSorted[A](as : Array[A], ordered : (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(i : Int): Boolean = {
      if(i >= as.length || as.length <= 1) true
      else if (ordered(as(i-1),as(i))) loop(i+1)
      else false
    }
    loop(1)
  }
}
