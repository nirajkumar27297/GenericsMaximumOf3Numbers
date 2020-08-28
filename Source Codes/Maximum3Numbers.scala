package GenericsProject
import Ordering.Implicits._
class Maximum3Numbers[T:Ordering](var x:T,var y:T,var z:T){
  val firstParam = x
  val secondParam = y
  val thirdParam = z

  def this() {
    this(0.asInstanceOf[T],1.asInstanceOf[T],2.asInstanceOf[T])
  }

  def maximumOf3Numbers[T](): T = {
    var maxParam = firstParam
    maxParam = compare(maxParam,secondParam)
    maxParam = compare(maxParam,thirdParam)
    return maxParam.asInstanceOf[T]
  }

  def compare[T : Ordering](x: T, y: T) : T = if(x > y) x   else y
}




