import org.scalatest.funsuite.AnyFunSuite

class RevertListSpec extends AnyFunSuite {

  val input = List(1, 2, 3, 4, 5)
  val expected = List(5, 4, 3, 2, 1)

  test("DKP01_Impl") {
    assert(DKP01_Impl.revert(input) == expected)
  }

  test("DKP02_Impl") {
    assert(DKP02_Impl.revert(input) == expected)
  }

  test("DKP03_Impl") {
    assert(DKP03_Impl.revert(input) == expected)
  }

  test("DKP04_Impl") {
    assert(DKP04_Impl.revert(input) == expected)
  }

  test("DKP05_Impl") {
    assert(DKP05_Impl.revert(input) == expected)
  }

  test("DKP06_Impl") {
    assert(DKP06_Impl.revert(input) == expected)
  }

  test("DKP07_Impl") {
    assert(DKP07_Impl.revert(input) == expected)
  }

  test("DKP08_Impl") {
    assert(DKP08_Impl.revert(input) == expected)
  }

  test("DKP09_Impl") {
    assert(DKP09_Impl.revert(input) == expected)
  }

  test("DKP10_Impl") {
    assert(DKP10_Impl.revert(input) == expected)
  }

}