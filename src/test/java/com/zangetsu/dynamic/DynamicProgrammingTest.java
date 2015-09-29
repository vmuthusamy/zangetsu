package com.zangetsu.dynamic;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by vm023561 on 9/25/15.
 */
public class DynamicProgrammingTest
{
    @Test
    public void testGetLMS ()
    {
        int[] example = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
        // expected output:
        //0, 2, 6, 9, 11, 15.

        int expectedSize = 6;

        assertEquals(expectedSize, DynamicProgramming.getLMS(example));
    }

    @Test
    public void testGetAlternatingLMS(){

        int[] example = {7,12,13,22};
        int[] linearExample ={1,2,3,4,5,6,7,8,9,10};

        int expectedSize = 4;
        int expectedLinearSize = 10;

        assertEquals(expectedSize,DynamicProgramming.getMonotonicAlternatingSequence(example));
        assertEquals(expectedLinearSize,DynamicProgramming.getMonotonicAlternatingSequence(linearExample));
    }
}
