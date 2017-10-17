package com.github.patwakeem.asm.enumeration;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AsmCheckIntervalTest {

    @Test
    public void testFiveMin() {
        assertEquals(AsmCheckInterval.FIVE_MIN.toString(), "300");
    }

    @Test
    public void testTenMin() {
        assertEquals(AsmCheckInterval.TEN_MIN.toString(), "600");
    }

    @Test
    public void testFifteenMin() {
        assertEquals(AsmCheckInterval.FIFTEEN_MIN.toString(), "900");
    }

    @Test
    public void testTwentyMin() {
        assertEquals(AsmCheckInterval.TWENTY_MIN.toString(), "1200");
    }

    @Test
    public void testThirtyMin() {
        assertEquals(AsmCheckInterval.THIRTY_MIN.toString(), "1800");
    }

    @Test
    public void testOneHour() {
        assertEquals(AsmCheckInterval.ONE_HOUR.toString(), "3600");
    }

    @Test
    public void testTwoHours() {
        assertEquals(AsmCheckInterval.TWO_HOURS.toString(), "7200");
    }

    @Test
    public void testFourHours() {
        assertEquals(AsmCheckInterval.FOUR_HOURS.toString(), "14400");
    }

    @Test
    public void testSixHours() {
        assertEquals(AsmCheckInterval.SIX_HOURS.toString(), "21600");
    }

    @Test
    public void testTwelveHours() {
        assertEquals(AsmCheckInterval.TWELVE_HOURS.toString(), "43200");
    }

    @Test
    public void testOneDay() {
        assertEquals(AsmCheckInterval.ONE_DAY.toString(), "86400");
    }
}