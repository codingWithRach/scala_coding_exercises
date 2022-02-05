package com.techreturners.exercise003

class Exercise003 {

  private val _iceCreams = List("Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet")

  // Function will return -1 if flavour not found
  def getIceCreamCode(iceCreamFlavour: String): Int = _iceCreams.indexOf(iceCreamFlavour)

  def iceCreamFlavours: Array[String] = {
    throw new UnsupportedOperationException("You can delete this line and add your code here.")
  }

}
