package com.in28minutes.junit.helper;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArraysCompareTest {

    //Arrays.sort
    @Test
    public void testArraySorte_RandomArray(){
        int[] numbers = {12,3,4,1};
        int[] expected = {1,3,4,12};
        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);


    }
}
