package Maximum3GenericsTest
import GenericsProject.Maximum3Numbers
import org.scalatest.FunSuite

class MaximumOf3Test extends FunSuite {

  test("test_MaximumIntegerInputNumberatFirstFollowedBySecondAndThirdInput_ReturnFirstInputAsMaximum"){
    val obj = new  Maximum3Numbers()
    assert(obj.maximumOf3NumbersInt(6,4,3) == 6)
  }

  test("test_MaximumIntegerInputNumberatSecondFollowedByFirstAndThirdInput_ReturnSecondInputAsMaximum") {
    val obj = new  Maximum3Numbers()
    assert(obj.maximumOf3NumbersInt(6,7,3) == 7)
  }

  test("test_MaximumIntegerInputNumberatThirdFollowedByFirstAndSecondInput_ReturnThirdInputAsMaximum") {
    val obj = new  Maximum3Numbers()
    assert(obj.maximumOf3NumbersInt(7,6,8) == 8)
  }
  test("test_MaximumFloatInputNumberatFirstFollowedBySecondAndThirdInput_ReturnFirstInputAsMaximum"){
    val obj = new  Maximum3Numbers()
    assert(obj.maximumOf3NumbersFloat(6.1f,4.2f,3.2f) == 6.1f)
  }

  test("test_MaximumFloatInputNumberatSecondFollowedByFirstAndThirdInput_ReturnSecondInputAsMaximum") {
    val obj = new  Maximum3Numbers()
    assert(obj.maximumOf3NumbersFloat(6.2f,7.2f,3.2f) == 7.2f)
  }

  test("test_MaximumFloatInputNumberatThirdFollowedByFirstAndSecondInput_ReturnThirdInputAsMaximum") {
    val obj = new  Maximum3Numbers()
    assert(obj.maximumOf3NumbersFloat(7.2f,6.2f,8.2f) == 8.2f)
  }
  test("test_MaximumStringInputStringatFirstFollowedBySecondAndThirdInput_ReturnFirstInputAsMaximum"){
    val obj = new  Maximum3Numbers()
    assert(obj.maximumOf3NumbersString("Peach","Banana","Apple") == "Peach")
  }

  test("test_MaximumStringInputStringatSecondFollowedByFirstAndThirdInput_ReturnSecondInputAsMaximum") {
    val obj = new  Maximum3Numbers()
    assert(obj.maximumOf3NumbersString("Orange","Van","Red") == "Van")
  }

  test("test_MaximumStringInputNumberatThirdFollowedByFirstAndSecondInput_ReturnThirdInputAsMaximum") {
    val obj = new  Maximum3Numbers()
    assert(obj.maximumOf3NumbersString("Keyboard","Chair","Mouse") == "Mouse")
  }
}



