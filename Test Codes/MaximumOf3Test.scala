package Maximum3GenericsTest
import GenericsProject.Maximum3Numbers
import org.scalatest.FunSuite

class MaximumOf3Test extends FunSuite {

  test("test_MaximumInputNumberatFirstFollowedBySecondAndThirdInput_ReturnFirstInputAsMaximum"){
    val obj = new  Maximum3Numbers()
    assert(obj.maximumOf3NumbersInt(6,4,3) == 6)
  }

  test("test_MaximumInputNumberatSecondFollowedByFirstAndThirdInput_ReturnSecondInputAsMaximum") {
    val obj = new  Maximum3Numbers()
    assert(obj.maximumOf3NumbersInt(6,7,3) == 7)
  }

  test("test_MaximumInputNumberatThirdFollowedByFirstAndSecondInput_ReturnThirdInputAsMaximum") {
    val obj = new  Maximum3Numbers()
    assert(obj.maximumOf3NumbersInt(7,6,8) == 8)
  }
}



