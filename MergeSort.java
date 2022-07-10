package com.company;

public class MergeSort {

    private int[] list;

    public MergeSort(int[] listToSort) { //constructor function that takes list to be sorted
        list = listToSort;
    }

    public int[] getList() { // encapsulation (getter) function that returns a list
        return list;
    }

    public void sort() {    // sort function
        list = sort(list);
    }

    private int[] sort(int[] whole) {  //recursive sort function used for each part of array list
        if (whole.length == 1) {
            return whole;
        }
        else {

            // split array and set right/left parts

            int[] left = new int[whole.length/2];
            System.arraycopy(whole, 0, left, 0, left.length);

            int[] right = new int[whole.length-left.length];
            System.arraycopy(whole, left.length, right, 0, right.length);

            // sort both sides separately

            left = sort(left);
            right = sort(right);

            // merge sorted arrays

            merge(left, right, whole);

            return whole;
        }
    }


    private void merge(int[] left, int[] right, int[] result) {   // merge function

        int x = 0;
        int y = 0;
        int k = 0;

        while (x < left.length && y < right.length) { // if both arrays have elements

            if (left[x] < right[y]) {
                result[k] = left[x];
                x++;
            }
            else {
                result[k] = right[y];
                y++;
            }
            k++;

        }

        int[] rest;
        int restIndex;

        if (x >= left.length) {
            rest = right;
            restIndex = y;
        }
        else {
            rest = left;
            restIndex = x;
        }

        for (int i=restIndex; i<rest.length; i++) {
            result[k] = rest[i];
            k++;
        }
    }

    public static int MergeSortEnd(int[] myList,int k) {
        MergeSort sortObj = new MergeSort(myList);
        sortObj.sort();
        int [] sirali = sortObj.getList();
        return sirali[k];

    }
}
