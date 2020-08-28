package Maximum3GenericsTest
import GenericsProject.Maximum3Numbers
import org.scalatest.FunSuite

class MaximumOf3Test extends FunSuite {

  test("test_MaximumIntegerInputNumberatFirstFollowedBySecondAndThirdInput_ReturnFirstInputAsMaximum"){
    val obj = new  Maximum3Numbers(6,4,3)
    assert(obj.maximumOf3Numbers[java.lang.Integer]() == 6)
  }

  test("test_MaximumIntegerInputNumberatSecondFollowedByFirstAndThirdInput_ReturnSecondInputAsMaximum") {
    val obj = new  Maximum3Numbers(6,7,4)
    assert(obj.maximumOf3Numbers[java.lang.Integer]() == 7)
  }

  test("test_MaximumIntegerInputNumberatThirdFollowedByFirstAndSecondInput_ReturnThirdInputAsMaximum") {
    val obj = new  Maximum3Numbers(6,7,8)
    assert(obj.maximumOf3Numbers[java.lang.Integer]() == 8)
  }
  test("test_MaximumFloatInputNumberatFirstFollowedBySecondAndThirdInput_ReturnFirstInputAsMaximum"){
    val obj = new  Maximum3Numbers(6.1f,4.2f,3.2f)
    assert(obj.maximumOf3Numbers[java.lang.Float]() == 6.1f)
  }

  test("test_MaximumFloatInputNumberatSecondFollowedByFirstAndThirdInput_ReturnSecondInputAsMaximum") {
    val obj = new  Maximum3Numbers(6.1f,8.2f,3.2f)
    assert(obj.maximumOf3Numbers[java.lang.Float]() == 8.2f)
  }

  test("test_MaximumFloatInputNumberatThirdFollowedByFirstAndSecondInput_ReturnThirdInputAsMaximum") {
    val obj = new  Maximum3Numbers(6.1f,8.2f,9.2f)
    assert(obj.maximumOf3Numbers[java.lang.Float]() == 9.2f)
  }
  test("test_MaximumStringInputStringatFirstFollowedBySecondAndThirdInput_ReturnFirstInputAsMaximum") {
    val obj = new Maximum3Numbers("Peach", "Banana", "Apple")
    assert(obj.maximumOf3Numbers[java.lang.String]() == "Peach")
  }

  test("test_MaximumStringInputStringatSecondFollowedByFirstAndThirdInput_ReturnSecondInputAsMaximum") {
    val obj = new  Maximum3Numbers("Orange","Van","Red")
    assert(obj.maximumOf3Numbers[java.lang.String] == "Van")
  }

  test("test_MaximumStringInputNumberatThirdFollowedByFirstAndSecondInput_ReturnThirdInputAsMaximum") {
    val obj = new  Maximum3Numbers("Keyboard","Chair","Mouse")
    assert(obj.maximumOf3Numbers[java.lang.String]() == "Mouse")
  }

}



