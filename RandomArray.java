package com.company;

public class RandomArray {

    public static int[] createRandomArray(int count){

        int[] arrRandom = new int[count];
        for (int i = 0; i < arrRandom.length; i++) {
            arrRandom[i] = (int) (Math.random()*count); // storing random integers in an array
        }

        return arrRandom;
    }
    public static int[] createSortedArray(int count){

        ///sorted array for best case
        int[] arrRandomSorted = new int[count];
        for (int i = 0; i < arrRandomSorted.length; i++) {
            arrRandomSorted[i] = i; // storing random integers in an array
        }

        return arrRandomSorted;
    }

    public static int[] createReverseSortedArray(int count){

        ////reverse sorted array for worst case
        int[] arrRandomReverseSorted = new int[1000];
        for (int i = 0; i < arrRandomReverseSorted.length; i++) {
            arrRandomReverseSorted[i] = arrRandomReverseSorted.length-i; // storing random integers in an arrau
        }
        return arrRandomReverseSorted;
    }

}
