package com.techreturners.exercise004

import java.time.{LocalDate, LocalDateTime}

class Exercise004(var dateTime: LocalDateTime) {

  // auxiliary constructor
  def this(dateTime: LocalDate) = this(dateTime.atStartOfDay())

  def getDateTimeWithGigaSecond: LocalDateTime = dateTime.plusSeconds(1000000000)

}
