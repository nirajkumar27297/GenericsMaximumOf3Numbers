package GenericsProject
import Ordering.Implicits._
class Maximum3Numbers[T:Ordering](args:T*){
  var argument = args

  def maximumInArray(): T = {
    var maxParam = argument(0)
    for(index <- 1.until(argument.length)) {
      maxParam = compare(maxParam,argument(index))
    }
    printMaximumvalue(maxParam)
    maxParam
  }

  def printMaximumvalue(maxValue: T): Unit = {
    println("Maximum Value is "+maxValue)
  }

 def compare[T : Ordering](x: T, y: T) : T = if(x > y) x   else y
}




