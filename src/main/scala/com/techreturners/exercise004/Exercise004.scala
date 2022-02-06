package com.techreturners.exercise004

import java.time.{DateTimeException, LocalDate, LocalDateTime}

class Exercise004(var dateTime: LocalDateTime) {

  // auxiliary constructor
  def this(dateTime: LocalDate) = this(dateTime.atStartOfDay())

  def getDateTimeWithGigaSecond: LocalDateTime = {
    try {
      dateTime.plusSeconds(1000000000)
    } catch {
      // there must be something more appropriate to return for an invalid date/time!
      case err: DateTimeException =>
        println("Exception: invalid date/time")
        LocalDateTime.of(0, 1, 1, 0, 0, 0)
    }
  }
}
