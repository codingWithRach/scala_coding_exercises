package com.techreturners.exercise004

import java.time.{DateTimeException, LocalDate, LocalDateTime}

class Exercise004(var dateTime: LocalDateTime) {

  // auxiliary constructor
  def this(dateTime: LocalDate) = this(dateTime.atStartOfDay())

  def getDateTimeWithGigaSecond: Option[LocalDateTime] = {
    try {
      Some(dateTime.plusSeconds(1000000000))
    } catch {
      case e: Exception => None
    }
  }
}
