package com.in28minutes.junit.helper;



import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class StringHelperTest {
    StringHelper helper;
    @Before
    public void before(){
        helper = new StringHelper();
    }

    @Test
    public void testTruncateAInFirst2Positions_AinFirst2Positions() {

        StringHelper helper = new StringHelper();

        // AACD => CC  ACD => CD CDEF => CDEF CDAA => CDAA
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
        // expected, actual
    }

    @Test
    public void testTruncateAInFirst2Positions_AinFirst2Positions2(){
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions2_AinFirst2Positions3(){
        // AACD => CC  ACD => CD CDEF => CDEF CDAA => CDAA
        assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
    }

    @Test
    public void testTruncateAInFirst2Positions2_AinFirst2Positions4() {
        // AACD => CC  ACD => CD CDEF => CDEF CDAA => CDAA
        assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
    }

    // ABCD => flase, ABAB => true, AB => true, A => false,//

   @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario(){
       assertFalse(
               helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
   }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario(){
        // ABCD => flase, ABAB => true, AB => true, A => false,//
        assertTrue(
                helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_AdvancedPositiveScenario(){
        // ABCD => flase, ABAB => true, AB => true, A => false,//
        assertTrue(
                helper.areFirstAndLastTwoCharactersTheSame("AB"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_AdvancedNegativeScenario(){
        // ABCD => flase, ABAB => true, AB => true, A => false,//
        assertFalse(
                helper.areFirstAndLastTwoCharactersTheSame("A"));
    }

}
