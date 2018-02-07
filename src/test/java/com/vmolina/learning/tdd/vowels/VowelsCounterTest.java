package com.vmolina.learning.tdd.vowels;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Stopwatch;
import org.junit.runner.Description;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class VowelsCounterTest {

    private static final Logger LOGGER = Logger.getLogger(VowelsCounterTest.class.getName());

    @Rule
    public Stopwatch stopwatch = new Stopwatch() {
        @Override
        protected void succeeded(long nanos, Description description) {
            LOGGER.info(String.format("Test " + description.getMethodName() + " " + nanos + "ns"));
        }
    };

    @Test
    public void testAllConsonants() {
        assertTrue(0 == VowelsCounter.execute("bcdfghjklmnpqrstvwxyz"));
    }

    @Test
    public void testOneVowel() {
        assertTrue(1 == VowelsCounter.execute("abcdfghjklmnpqrstvwxyz"));
    }

    @Test
    public void testTwoVowels() {
        assertTrue(2 == VowelsCounter.execute("abcdefghjklmnpqrstvwxyz"));
    }

    @Test
    public void testThreeVowels() {
        assertTrue(3 == VowelsCounter.execute("abcdefghijklmnpqrstvwxyz"));
    }

    @Test
    public void testFourVowels() {
        assertTrue(4 == VowelsCounter.execute("abcdefghijklmnopqrstvwxyz"));
    }

    @Test
    public void testFiveVowels() {
        assertTrue(5 == VowelsCounter.execute("abcdefghijklmnopqrstuvwxyz"));
    }

}