package edu.macalester.comp124.hello;

import acm.program.ConsoleProgram;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Reena on 9/14/14.
 */
public class RecursionArray extends ConsoleProgram {

    public void run() {

        int count[] = {0, 0, 1, 0, 3};
        int count1[] = {0, 0, 0, 0, 0, 4, 0, 0, 8, 0, 10};
        int count2[] = {0, 9, 8, 0, 90, 0, 10};
        System.out.println(countZeroes(count));
        System.out.println(countZeroes(count1));
        System.out.println(countZeroes(count2));
    }
    //* This method counts the number of zeroes in an array


    public int countZeroes(int zero[]) {

        if (zero.length > 1) {
            int halfOne = 0;
            int halfTwo = 0;

            if (zero.length % 2 == 0) {
                halfOne = zero.length / 2;
                halfTwo = zero.length / 2;
            } else {
                halfOne = zero.length / 2;
                halfTwo = zero.length / 2 + 1;
            }

            int[] half1 = new int[halfOne];
            int[] half2 = new int[halfTwo];
            for (int i = 0; i < zero.length; i++) {
                if (i < halfOne) {
                    half1[i] = zero[i];
                } else {
                    half2[i - halfOne] = zero[i];
                }
            }

            return countZeroes(half1) + countZeroes(half2);

        } else if (zero[0] == 0) {
            return 1;
        } else {
            return 0;
        }

    }

}