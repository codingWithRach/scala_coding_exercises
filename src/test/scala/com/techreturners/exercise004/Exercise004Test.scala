package com.techreturners.exercise004

import org.scalatest.flatspec.AnyFlatSpec

import java.time.{LocalDate, LocalDateTime, Month}

class Exercise004Test extends AnyFlatSpec{

  "A correct date time" should "be returned when constructed with a date" in {
    val exercise004 = new Exercise004(LocalDate.of(2021, Month.JULY, 19))
    assert(exercise004.getDateTimeWithGigaSecond == LocalDateTime.of(2053, Month.MARCH, 27, 1, 46, 40))
  }

  it should "be returned when constructed with a date and time" in {
    val exercise004 = new Exercise004(LocalDateTime.of(2021, Month.MARCH, 4, 23, 22, 0, 0))
    assert(exercise004.getDateTimeWithGigaSecond == LocalDateTime.of(2052, Month.NOVEMBER, 11, 1, 8, 40))
  }

  it should "be returned when constructed with a date and time with day roll over" in {
    val exercise004 = new Exercise004(LocalDateTime.of(2021, Month.JANUARY, 24, 23, 59, 59, 0))
    assert(exercise004.getDateTimeWithGigaSecond == LocalDateTime.of(2052, Month.OCTOBER, 3, 1, 46, 39))
  }

  it should "be returned when the resulting date is a leap day" in {
    val exercise004 = new Exercise004(LocalDateTime.of(1988, Month.JUNE, 22, 12, 0, 0, 0))
    assert(exercise004.getDateTimeWithGigaSecond == LocalDateTime.of(2020, Month.FEBRUARY, 29, 13, 46, 40))
  }

  it should "be returned when both original and resulting date are BC" in {
    val exercise004 = new Exercise004(LocalDateTime.of(-2000, Month.JANUARY, 1, 12, 0, 0, 0))
    assert(exercise004.getDateTimeWithGigaSecond == LocalDateTime.of(-1969, Month.SEPTEMBER, 9, 13, 46, 40))
  }

  it should "be returned when original date is BC and resulting date is AC" in {
    val exercise004 = new Exercise004(LocalDateTime.of(-15, Month.JANUARY, 1, 12, 0, 0, 0))
    assert(exercise004.getDateTimeWithGigaSecond == LocalDateTime.of(16, Month.SEPTEMBER, 9, 13, 46, 40))
  }

  it should "be handled correctly when resulting date greater than maximum allowed" in {
    val exercise004 = new Exercise004(LocalDateTime.of(999999999, Month.DECEMBER, 31, 12, 0, 0, 0))
    assert(exercise004.getDateTimeWithGigaSecond == LocalDateTime.of(0, Month.JANUARY, 1, 0, 0, 0))
  }
}
