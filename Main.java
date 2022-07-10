//Muhammed Murat Dilmaç - 150116017
//Elif Gülay - 150119732
//Beyzanur Çabuk - 150119632

package com.company;

import java.util.Arrays;
import java.util.Random;

import static com.company.InsertionSort.insertionSort;
import static com.company.MergeSort.MergeSortEnd;
import static com.company.QuickSelect.kthSmallest;
import static com.company.QuickSort.printArray;

import static com.company.QuickSort.quickSort;
import static com.company.RandomArray.*;
import static com.company.SelectionSort.sel_sort;
import static com.company.DeletionHeap.times;
import static java.util.Arrays.sort;

public class Main {

    // Driver program
    public static void main(String args[]) {
        ///Parameters of the arrays
        int k = 25; //k's smallest
        int arraySize = 10000; // array size


        ////Insertion Sort
        int[] arrRandomForInsertion = createRandomArray(arraySize);
        int[] arrRandomForInsertionBestCase = createSortedArray(arraySize);
        int[] arrRandomForInsertionWorst = createReverseSortedArray(arraySize);


        System.out.print("Insertion sort array random before sort: ");printArray(arrRandomForInsertion);
        System.out.print("Insertion sort array sorted before sort: ");printArray(arrRandomForInsertionBestCase);
        System.out.print("Insertion sort array d_sorted before sort: ");printArray(arrRandomForInsertionWorst);




        long nano_startTime = System.nanoTime(); //measuring time - start point
        System.out.println("Insertion sort K-th smallest element in array random: " + insertionSort(arrRandomForInsertion,k));
        long nano_endTime = System.nanoTime(); System.out.println("ArraySize= " +arraySize+ " Insertion sort,Time taken in nano seconds: " + (nano_endTime - nano_startTime));      //finding the time difference

        long nano_startTime1 = System.nanoTime(); //measuring time - start point
        System.out.println("Insertion sort K-th smallest element in array sorted: " + insertionSort(arrRandomForInsertionBestCase,k));
        long nano_endTime1 = System.nanoTime(); System.out.println("ArraySize= " +arraySize+ " Insertion sort,Time taken in nano seconds: " + (nano_endTime1 - nano_startTime1));      //finding the time difference

        long nano_startTime2 = System.nanoTime(); //measuring time - start point
        System.out.println("Insertion sort K-th smallest element in array d_sorted: " + insertionSort(arrRandomForInsertionWorst,k));
        long nano_endTime2 = System.nanoTime(); System.out.println("ArraySize= " +arraySize+ " Insertion sort,Time taken in nano seconds: " + (nano_endTime2 - nano_startTime2));      //finding the time difference


        System.out.print("Insertion sort array random after sorted: ");printArray(arrRandomForInsertion);
        System.out.print("Insertion sort array sorted after sorted: ");printArray(arrRandomForInsertionBestCase);
        System.out.print("Insertion sort array d_sorted after sorted: ");printArray(arrRandomForInsertionWorst);


        System.out.println();


        ////Mergesort
        int[] arrRandomForMerge = createRandomArray(arraySize);
        int[] arrRandomForMergeBestCase = createSortedArray(arraySize);
        int[] arrRandomForMergeWorst = createReverseSortedArray(arraySize);


        System.out.print("Merge sort array random before sort: ");printArray(arrRandomForMerge);
        System.out.print("Merge sort array sorted before sort: ");printArray(arrRandomForMergeBestCase);
        System.out.print("Merge sort array d_sorted before sort: ");printArray(arrRandomForMergeWorst);


        long nano_startTime3 = System.nanoTime(); //measuring time - start point
        System.out.println("ArraySize= " +arraySize+ " Merge sort K-th smallest element in array random: " + MergeSortEnd(arrRandomForMerge, k));
        long nano_endTime3 = System.nanoTime(); System.out.println("Merge sort,Time taken in nano seconds: " + (nano_endTime3 - nano_startTime3));      //finding the time difference

        long nano_startTime4 = System.nanoTime(); //measuring time - start point
        System.out.println("ArraySize= " +arraySize+ " Merge sort K-th smallest element in array sorted: " + MergeSortEnd(arrRandomForMergeBestCase, k));
        long nano_endTime4 = System.nanoTime(); System.out.println("Merge sort,Time taken in nano seconds: " + (nano_endTime4 - nano_startTime4));      //finding the time difference

        long nano_startTime5 = System.nanoTime(); //measuring time - start point
        System.out.println("ArraySize= " +arraySize+ " Merge sort K-th smallest element in array d_sorted: " + MergeSortEnd(arrRandomForMergeWorst, k));
        long nano_endTime5 = System.nanoTime(); System.out.println("Merge sort,Time taken in nano seconds: " + (nano_endTime5 - nano_startTime5));      //finding the time difference


        System.out.print("Merge sort array random after sorted: ");printArray(arrRandomForMerge);
        System.out.print("Merge sort array sorted after sorted: ");printArray(arrRandomForMergeBestCase);
        System.out.print("Merge sort array worst after sorted: ");printArray(arrRandomForMergeWorst);


        System.out.println();


        ////Quicksort
        int[] arrRandomForQuicksort = createRandomArray(arraySize);
        int[] arrRandomForQuicksortSorted = createSortedArray(arraySize);
        int[] arrRandomForQuicksortWorst = createReverseSortedArray(arraySize);



        System.out.print("Quick Sort, random array: ");printArray(arrRandomForQuicksort);
        System.out.print("Quick Sort, sorted array: ");printArray(arrRandomForQuicksortSorted);
        System.out.print("Quick Sort, d_sorted array: ");printArray(arrRandomForQuicksortWorst);


        long nano_startTime6 = System.nanoTime(); //measuring time - start point
        System.out.println("ArraySize= " +arraySize+ " Quick sort K-th smallest element in array random: " + quickSort(arrRandomForQuicksort, 0, arrRandomForQuicksort.length - 1,k));
        long nano_endTime6 = System.nanoTime(); System.out.println("Quick sort, Time taken in nano seconds: " + (nano_endTime6 - nano_startTime6));      //finding the time difference

        long nano_startTime7 = System.nanoTime(); //measuring time - start point
        System.out.println("ArraySize= " +arraySize+ " Quick sort K-th smallest element in array sorted: " + quickSort(arrRandomForQuicksortSorted, 0, arrRandomForQuicksortSorted.length - 1,k));
        long nano_endTime7 = System.nanoTime(); System.out.println("Quick sort, Time taken in nano seconds: " + (nano_endTime7 - nano_startTime7));      //finding the time difference

        long nano_startTime8 = System.nanoTime(); //measuring time - start point
        System.out.println("ArraySize= " +arraySize+ " Quick sort K-th smallest element in array decrease_sorted: " + quickSort(arrRandomForQuicksortWorst, 0, arrRandomForQuicksortWorst.length - 1,k));
        long nano_endTime8 = System.nanoTime(); System.out.println("Quick sort, Time taken in nano seconds: " + (nano_endTime8 - nano_startTime8));      //finding the time difference


        System.out.print("Quick Sort, random array: ");printArray(arrRandomForQuicksort);
        System.out.print("Quick Sort, sorted array: ");printArray(arrRandomForQuicksortSorted);
        System.out.print("Quick Sort, d_sorted array: ");printArray(arrRandomForQuicksortWorst);


        System.out.println();


        ///Partial selection sort
        int[] arrRandomForPartialSelection = createRandomArray(arraySize);
        int[] arrRandomForPartialSelectionBest = createSortedArray(arraySize);
        int[] arrRandomForPartialSelectionWorst = createReverseSortedArray(arraySize);


        System.out.print("Partial Selection Before Sorted random: ");printArray(arrRandomForPartialSelection);
        System.out.print("Partial Selection Before Sorted sorted: ");printArray(arrRandomForPartialSelectionBest);
        System.out.print("Partial Selection Before Sorted d_sorted: ");printArray(arrRandomForPartialSelectionWorst);


        long nano_startTime9 = System.nanoTime(); //measuring time - start point
        System.out.print("ArraySize= " +arraySize+ " Partial Selection K-th smallest element in array random: " + sel_sort(arrRandomForPartialSelection, k));
        long nano_endTime9 = System.nanoTime(); System.out.println("Partial Selection, Time taken in nano seconds: " + (nano_endTime9 - nano_startTime9));      //finding the time difference

        long nano_startTime10 = System.nanoTime(); //measuring time - start point
        System.out.print("ArraySize= " +arraySize+ " Partial Selection K-th smallest element in array best: " + sel_sort(arrRandomForPartialSelectionBest, k));
        long nano_endTime10 = System.nanoTime(); System.out.println("Partial Selection, Time taken in nano seconds: " + (nano_endTime10 - nano_startTime10));      //finding the time difference

        long nano_startTime11 = System.nanoTime(); //measuring time - start point
        System.out.println("ArraySize= " +arraySize+ " Partial Selection K-th smallest element in array d_sorted: " + sel_sort(arrRandomForPartialSelectionWorst, k));
        long nano_endTime11 = System.nanoTime(); System.out.println("Partial Selection, Time taken in nano seconds: " + (nano_endTime11 - nano_startTime11));      //finding the time difference


        System.out.print("Partial Selection Sorted random: ");printArray(arrRandomForPartialSelection);
        System.out.print("Partial Selection Sorted sorted: ");printArray(arrRandomForPartialSelectionBest);
        System.out.print("Partial Selection Sorted d_sorted: ");printArray(arrRandomForPartialSelectionWorst);


        System.out.println();


        ////deletionHeap

        int[] arrRandomForDeletionHeap = createRandomArray(arraySize);
        int[] arrRandomForDeletionHeapBestCase = createSortedArray(arraySize);
        int[] arrRandomForDeletionHeapWorst = createReverseSortedArray(arraySize);

        //System.out.print("Deletion Heap Before Sorted random: ");printArray(arrRandomForDeletionHeap);
        long nano_startTime12 = System.nanoTime(); //measuring time - start point
        System.out.println("ArraySize= " +arraySize+ " Deletion Heap K-th smallest element in array random: " + times(arrRandomForDeletionHeap, arrRandomForDeletionHeap.length, arraySize-1));
        long nano_endTime12 = System.nanoTime(); System.out.println("Deletion Heap, Time taken in nano seconds: " + (nano_endTime12 - nano_startTime12));      //finding the time difference
        //System.out.print("Deletion Heap Sorted random: ");printArray(arrRandomForDeletionHeap);


        //System.out.print("Deletion Heap Before Sorted Best: ");printArray(arrRandomForDeletionHeapBestCase);
        long nano_startTime13 = System.nanoTime(); //measuring time - start point
        System.out.println("ArraySize= " +arraySize+ " Deletion Heap K-th smallest element in array sorted: " + times(arrRandomForDeletionHeapBestCase, arrRandomForDeletionHeapBestCase.length, arraySize-1));
        long nano_endTime13 = System.nanoTime(); System.out.println("Deletion Heap, Time taken in nano seconds: " + (nano_endTime13 - nano_startTime13));      //finding the time difference
        //System.out.print("Deletion Heap Sorted sorted: ");printArray(arrRandomForDeletionHeapBestCase);


        //System.out.print("Deletion Heap Before Sorted Worst: ");printArray(arrRandomForDeletionHeapWorst);
        long nano_startTime14 = System.nanoTime(); //measuring time - start point
        System.out.println("ArraySize= " +arraySize+ " Deletion Heap K-th smallest element in array decrease sorted: " + times(arrRandomForDeletionHeapWorst, arrRandomForDeletionHeapWorst.length, arraySize-1));
        long nano_endTime14 = System.nanoTime(); System.out.println("Deletion Heap, Time taken in nano seconds: " + (nano_endTime14 - nano_startTime14));      //finding the time difference
        //System.out.print("Deletion Heap Sorted d_sorted: ");printArray(arrRandomForDeletionHeapWorst);
        System.out.println();



        /////QuickSelect algoritm
        int[] arrRandomForQuickSelect = createRandomArray(arraySize);
        int[] arrRandomForQuickSelectBestCase = createSortedArray(arraySize);
        int[] arrRandomForQuickSelectWorst = createReverseSortedArray(arraySize);

        int[] arrRandomForQuickSelectCopy = arrRandomForQuickSelect;
        int[] arrRandomForQuickSelectBestCaseCopy = arrRandomForQuickSelectBestCase;
        int[] arrRandomForQuickSelectWorstCopy = arrRandomForQuickSelectWorst;


        System.out.print("Quick Select Before Sorted random: ");printArray(arrRandomForQuickSelect);
        System.out.print("Quick Select Before Sorted sorted: ");printArray(arrRandomForQuickSelectBestCase);
        System.out.print("Quick Select Before Sorted d_sorted: ");printArray(arrRandomForQuickSelectWorst);


        long nano_startTime15 = System.nanoTime(); //measuring time - start point
        System.out.println("ArraySize= " +arraySize+ " Quick Select K-th smallest element in array random : " + kthSmallest(arrRandomForQuickSelectCopy, 0, arrRandomForQuickSelect.length - 1, k));
        long nano_endTime15 = System.nanoTime(); System.out.println("Quick Select, Time taken in nano seconds: " + (nano_endTime15 - nano_startTime15));      //finding the time difference

        long nano_startTime16 = System.nanoTime(); //measuring time - start point
        System.out.println("ArraySize= " +arraySize+ " Quick Select K-th smallest element in array sorted : " + kthSmallest(arrRandomForQuickSelectBestCaseCopy, 0, arrRandomForQuickSelectBestCase.length - 1, k));
        long nano_endTime16 = System.nanoTime(); System.out.println("Quick Select, Time taken in nano seconds: " + (nano_endTime16 - nano_startTime16));      //finding the time difference

        long nano_startTime17 = System.nanoTime(); //measuring time - start point
        System.out.println("ArraySize= " +arraySize+ " Quick Select K-th smallest element in array d_sorted : " + kthSmallest(arrRandomForQuickSelectWorstCopy, 0, arrRandomForQuickSelectWorst.length - 1, k));
        long nano_endTime17 = System.nanoTime(); System.out.println("Quick Select, Time taken in nano seconds: " + (nano_endTime17 - nano_startTime17));      //finding the time difference


        System.out.print("Quick Select Sorted random: ");printArray(arrRandomForQuickSelect);
        System.out.print("Quick Select Sorted sorted: ");printArray(arrRandomForQuickSelectBestCase);
        System.out.print("Quick Select Sorted d_sorted: ");printArray(arrRandomForQuickSelectWorst);
        System.out.println();


    }


}
