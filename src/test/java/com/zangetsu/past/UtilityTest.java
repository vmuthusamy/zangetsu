package com.zangetsu.past;

import org.junit.Test;

/**
 * Created by vm023561 on 9/15/15.
 */
public class UtilityTest
{
    @Test
    public void testMultiply ()
    {
        System.out.println(Utility.multiply("10", "20"));
    }

    @Test
    public void testIntToString ()
    {
        System.out.println(Utility.getIntFromString("-123456"));
    }
}
