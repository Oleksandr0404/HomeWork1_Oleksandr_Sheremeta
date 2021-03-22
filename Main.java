package com.company;

import java.util.Arrays;

public class Main {
    // Sort them by DESC(reverseOrder).
    public static void main(String[] args) {
        //sort
        Integer[] arrayOfInteger = {2, 3, 1, 7, 11};
        Homework.sortArray(arrayOfInteger);
        System.out.println("Sorted by" + Arrays.toString(arrayOfInteger));
        //return the sum of all the positive ones
        arrayOfInteger = new Integer[]{5, 2, -3, 8, -2};
        int sum = Homework.sumPositiveNumbers(arrayOfInteger);
        System.out.println("sum of all the positive " + sum);
        //You get an array of numbers, return the average of a list of numbers in this array.
        arrayOfInteger = new Integer[]{2, 5, 10, 3, 7};
        int average = Homework.averageOfArray(arrayOfInteger);
        System.out.println("Average :" + average);
        //Replace all duplicated values by 0
        arrayOfInteger = new Integer[]{3, 2, 3, 1, 4, 2, 8, 3};
        Homework.replaceAllDuplicateToZero(arrayOfInteger);
        System.out.println("Duplicates replaced with 0: " + Arrays.toString(arrayOfInteger));
    }
}

