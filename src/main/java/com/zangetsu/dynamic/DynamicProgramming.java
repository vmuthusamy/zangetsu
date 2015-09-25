package com.zangetsu.dynamic;

/**
 * Created by vm023561 on 9/25/15.
 */
public class DynamicProgramming
{
    public static int getLMS (int[] input)
    {

        int size = input.length;
        int[] output = new int[size];

        initialize(output);

        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (input[i] > input[j] && output[i] < output[j] + 1)
                {
                    output[i] = output[j] + 1;
                }
            }
        }

        return getMaxFromArray(output);
    }

    private static int getMaxFromArray (int[] array)
    {

        int max = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
        }
        return max;

    }

    private static void initialize (int[] array)
    {

        for (int i = 0; i < array.length; i++)
        {
            array[i] = 1;
        }

    }
}
