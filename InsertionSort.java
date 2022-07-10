package com.company;

class InsertionSort {
    static int insertionSort(int arr[],int k)  {

        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            //Compare the key with each element in the array and move the greater elements to the right.
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key; //Place the key to the right of the element that is smaller.
        }

        return arr[k];
    }
}
