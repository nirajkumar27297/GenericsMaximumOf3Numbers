package GenericsProject

class Maximum3Numbers() {

  def maximumOf3NumbersInt(firstNumber:Int,secondNumber:Int,thirdNumber:Int): Int ={
    var maxNumber = firstNumber
    if(secondNumber.compareTo(firstNumber) == 1 && secondNumber.compareTo(thirdNumber)== 1) {
      maxNumber = secondNumber
    }
    if(thirdNumber.compareTo(firstNumber) == 1 && thirdNumber.compareTo(secondNumber)== 1) {
      maxNumber = thirdNumber
    }
    maxNumber
  }

}


