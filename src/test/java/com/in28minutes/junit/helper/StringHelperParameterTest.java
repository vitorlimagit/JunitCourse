package com.in28minutes.junit.helper;



import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class StringHelperParameterTest {
    StringHelper helper = new StringHelper();

    String input;
    String expectedOutput;

    public StringHelperParameterTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testeConditions(){
        String expectedOutputs[][] = { {"AACD", "CD"},
                { "ACD", "CD"}
        };

        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testTruncateAInFirst2Positions_AinFirst2Positions() {

        // AACD => CC  ACD => CD CDEF => CDEF CDAA => CDAA
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
        // expected, actual
    }

   @Test
    public void testTruncatedAInFirst2Positions(){
        assertEquals(expectedOutput,helper.truncateAInFirst2Positions(input));
   }






}
