package com.zangetsu.dynamic;

import java.util.LinkedHashSet;

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

    public static int getMonotonicAlternatingSequence (int[] input)
    {

        int size = input.length;
        int[] output = new int[size];

        initialize(output);
        LinkedHashSet<Integer> outputSequence = new LinkedHashSet<Integer>();

        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (input[i] > input[j] && output[i] < output[j] + 1)
                {
                    if((input[i]%2==0 && input[j]%2!=0)||(input[i]%2!=0 && input[j]%2==0)){
                        outputSequence.add(input[j]);
                        outputSequence.add(input[i]);
                        output[i] = output[j] + 1;
                    }

                }
            }
        }
        System.err.println(outputSequence);
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
