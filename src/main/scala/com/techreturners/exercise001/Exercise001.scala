package com.techreturners.exercise001

class Exercise001 {

  // Scala methods defined in various styles
  // Notice how the IDE identifies the return type even if
  // we don't specify it in the code
  // https://docs.scala-lang.org/tour/basics.html

  def capitalizeWord(word: String): String = {
    // separate first character from remainder of string
    val firstCharacter = word.substring(0,1)
    val remainingCharacters = word.substring(1)

    // convert first character to uppercase and reconstruct string
    // return statement is not needed in Scala
    firstCharacter.toUpperCase + remainingCharacters
  }

  def generateInitials(firstName: String, lastName: String) = ""

  def addVat(initialPrice: Double, interestRate: Double) : Double = 0.0

  def reverse(sentence: String) : String = ""

  /**
   * Here we show using a Scala sequence which is a type of collection
   * https://alvinalexander.com/scala/seq-class-methods-examples-syntax/
   *
   * @param users A collection of users
   * @return
   */
  def countLinuxUsers(users: Seq[User]): Int = {
    // Add your code here
    0
  }

}
