package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Homework {

    public static void sortArray(Integer[] arr) {
        Arrays.sort(arr, Comparator.reverseOrder());
    }

    public static int sumPositiveNumbers(Integer[] arr) {
        int sum = 0;
        for (Integer i : arr)
            if (i > 0) {
                sum += i;
            }
        return sum;
    }

    public static int averageOfArray(Integer[] arr) {
        int average = 0;
        for (Integer i : arr) {
            average += i;
        }
        return average / arr.length;
    }

    public static void replaceAllDuplicateToZero(Integer[] array) {
        System.out.println("Array: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = 0;
                }
            }
        }
    }
}
