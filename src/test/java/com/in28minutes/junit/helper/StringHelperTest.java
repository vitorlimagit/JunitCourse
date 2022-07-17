package com.in28minutes.junit.helper;



import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StringHelperTest {

    StringHelper helper = new StringHelper();

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
        assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEFJ"));
    }

    @Test
    public void testTruncateAInFirst2Positions2_AinFirst2Positions4() {
        // AACD => CC  ACD => CD CDEF => CDEF CDAA => CDAA
        assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
    }

}
