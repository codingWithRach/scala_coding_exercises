package com.techreturners.exercise003

class Exercise003 {
  // changed from List to Array in order to avoid a type mismatch in test of iceCreamFlavours
  private val _iceCreams = Array("Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet")

  // Function will return -1 if flavour not found
  def getIceCreamCode(iceCreamFlavour: String): Int = _iceCreams.indexOf(iceCreamFlavour)

  def iceCreamFlavours: Array[String] = _iceCreams
}
