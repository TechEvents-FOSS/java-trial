package org.osidays.cidemo;

import static org.osidays.cidemo.CalendarUtils.isLeapYear;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;


public class LeapTest
{
   @Test
   public void normalLeapYears() {
        assertTrue(CalendarUtils.isLeapYear(1996));
        assertTrue(CalendarUtils.isLeapYear(2012));
   }
   @Test
   public void normalNonLeapYears() {
        assertFalse(CalendarUtils.isLeapYear(1995));
        assertTrue(CalendarUtils.isLeapYear(2011));
   }
   @Test
   public void centuryLeapYears() {
        assertTrue(CalendarUtils.isLeapYear(2400));
        assertTrue(CalendarUtils.isLeapYear(1600));
   }
   /*
   @Test
   public void centuryNonLeapYears() {
        assertFalse(CalendarUtils.isLeapYear(1700));
        assertTrue(CalendarUtils.isLeapYear(2100));
   }*/
}
