package com.techreturners.exercise002

case class Person(firstName: String, lastName: String, city: String, age: Int)

class Exercise002 {

  def isFromManchester(person: Person): Boolean = person.city == "Manchester"

  def canWatchFilm(/*person: Person, ageLimit: Int */): Boolean = {
    false
  }

}
