package com.company;

public class SelectionSort {

    static int sel_sort(int numArray[],int k)
    {
        int n = numArray.length;

        // traverse unsorted array
        for (int i = 0; i < k; i++)
        {


            // Find the minimum element in unsorted array
            int min_idx = i;
            int minValue = numArray[i];
            for (int j = i+1; j < n; j++) {
                if (numArray[j] < minValue) {
                    min_idx = j;
                    minValue = numArray[j];
                    int temp = numArray[min_idx];
                    numArray[min_idx] = numArray[i];
                    numArray[i] = temp;
                }

                //swap(numArray,numArray[i], numArray[min_idx]);
            }

            /* swap minimum element with compared element
            */
        }
        return numArray[k-1];
    }
    /*
    static int partialSelectionSort(int numArray[],int k) {
        int n = numArray.length;

        for (int i = 0; i < n-1; i++){
            int minIndex = i;
            int minValue = numArray[i];
            for (int j = i+1; j < n; j++){
                if (numArray[j] < minValue) {
                    minIndex = j;
                }
                minValue = numArray[j];
                swap(numArray,numArray[i], numArray[minIndex]);
            }
        }
        return numArray[k];
    }
*/
    public static void swap(int[] arr,int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
