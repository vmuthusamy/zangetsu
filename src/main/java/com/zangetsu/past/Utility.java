package com.zangetsu.past;

/**
 * Created by vmuthusamy on 9/15/15.
 */
public class Utility
{

    public static int getNumberOfConnectedComponents (int[][] input, int maxRowSize, int maxColSize)
    {
        boolean[][] lookup = new boolean[maxRowSize][maxColSize];
        int count = 0;

        for (int i = 0; i < maxRowSize; i++)
        {
            for (int j = 0; j < maxColSize; i++)
            {
                if (input[i][j] == 1)
                {
                    count++;
                    traverse(lookup, input, i, j, maxRowSize, maxColSize);
                }
            }
        }

        return count;
    }

    private static void traverse (boolean[][] lookup, int[][] input, int x, int y, int maxRowSize,
            int maxColSize)
    {

        if (checkIndicesAreBound(x, y, maxRowSize, maxColSize))
        {
            if (!lookup[x][y])
            {
                lookup[x][y] = true;
                traverse(lookup, input, x - 1, y, maxRowSize, maxColSize);
                traverse(lookup, input, x + 1, y, maxRowSize, maxColSize);
                traverse(lookup, input, x, y - 1, maxRowSize, maxColSize);
                traverse(lookup, input, x, y + 1, maxRowSize, maxColSize);
            }
        }

    }

    private static boolean checkIndicesAreBound (int x, int y, int maxRowSize, int maxColSize)
    {

        if (x >= 0 && x < maxRowSize)
        {
            if (y >= 0 && y < maxColSize)
            {
                return true;
            }
        }
        return false;
    }

    public static int getIntFromString (String input)
    {

        char[] inputArray = input.toCharArray();
        int scale = 1;
        boolean isNegative = false;
        int output = 0;
        for (int i = inputArray.length - 1; i >= 0; i--)
        {
            if (inputArray[i] == '-')
            {
                isNegative = true;
            } else
            {
                int value = inputArray[i] - '0';
                output += value * scale;
                scale *= 10;
            }
        }

        if (isNegative)
        {
            output *= -1;
        }
        return output;
    }

    public static String multiply (String num1, String num2)
    {
        String n1 = new StringBuilder(num1).reverse().toString();
        String n2 = new StringBuilder(num2).reverse().toString();

        int[] d = new int[num1.length() + num2.length()];

        //multiply each digit and sum at the corresponding positions
        for (int i = 0; i < n1.length(); i++)
        {
            for (int j = 0; j < n2.length(); j++)
            {
                d[i + j] += (n1.charAt(i) - '0') * (n2.charAt(j) - '0');
            }
        }

        StringBuilder sb = new StringBuilder();

        //calculate each digit
        for (int i = 0; i < d.length; i++)
        {
            int mod = d[i] % 10;
            int carry = d[i] / 10;
            if (i + 1 < d.length)
            {
                d[i + 1] += carry;
            }
            sb.insert(0, mod);
        }

        //remove front 0's
        while (sb.charAt(0) == '0' && sb.length() > 1)
        {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}
