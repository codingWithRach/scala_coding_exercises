package com.techreturners.exercise003

import org.scalatest.flatspec.AnyFlatSpec

class Exercise003Test extends AnyFlatSpec {

  val exercise003 = new Exercise003

  "A mint ice cream" should "be correctly identified and the code returned" in {
    assert(exercise003.getIceCreamCode("Mint Chocolate Chip") == 3)
  }

  "A Mango Sorbet ice cream" should "be correctly identified and the code returned" in {
    assert(exercise003.getIceCreamCode("Mango Sorbet") == 5)
  }

  "A Salted Caramel ice cream" should "not be identified and -1 returned" in {
    assert(exercise003.getIceCreamCode("Salted Caramel") == -1)
  }

  "All available flavours" should "be correctly returned" ignore {

    val flavours = Array("Pistachio",
      "Raspberry Ripple",
      "Vanilla",
      "Mint Chocolate Chip",
      "Chocolate",
      "Mango Sorbet"
    )

    assert(exercise003.iceCreamFlavours sameElements flavours)
  }
}
