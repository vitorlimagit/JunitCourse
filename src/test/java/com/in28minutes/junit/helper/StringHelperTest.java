package com.in28minutes.junit.helper;



import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StringHelperTest {

    @Test
    public void test() {

        StringHelper helper = new StringHelper();


        // AACD => CC  ACD => CD CDEF => CDEF CDAA => CDAA
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
        // expected, actual
    }


}
