package com.company;

public class DeletionHeap {

    static void heapify(int arr[], int n, int i)
    {
        int largest = i; // in max-heap, largest is root.
        int l = 2 * i + 1; // left
        int r = 2 * i + 2; // right


        if (l < n && arr[l] > arr[largest])  // when left child is larger than root
            largest = l;

        if (r < n && arr[r] > arr[largest])  // when right child is larger than largest so far
            largest = r;

        if (largest != i) {   				// when largest is not root
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    static int deleteRoot(int arr[], int n)  // to delete the root from Heap

    {
        int lastElement = arr[n - 1];		// last element
        arr[0] = lastElement;				// replace root with first element
        n = n - 1;							// decreasing size of heap by 1
        heapify(arr, n, 0);					// heapify the root node
        return n;							// return new size of Heap

    }

    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    static int times(int arr[],int n, int h) {
        for (int i=1;i<=h;i++) {
            deleteRoot(arr,n);
        }
        return arr[0];
    }

}