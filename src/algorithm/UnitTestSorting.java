package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        //Now implement Unit test for rest of the soring algorithm...................below
        // apply unsorted array to insertionSort.
        sort.insertionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try{
            Assert.assertEquals(sortedArray, unSortedArray, "Insertion Sort is not sorting properly");
        }catch(Exception e){
            e.getMessage();
        }

        // apply unsorted array to QuickSort.
        sort.quickSort(unSortedArray,0,6);
        //verify if the unsorted array is sorted by the quick sort algorithm.
        try{
            Assert.assertEquals(sortedArray, unSortedArray, "Quick Sort is not sorting properly");
        }catch(Exception e){
            e.getMessage();
        }

        // apply unsorted array to BubbleSort.
        sort.bubbleSort(unSortedArray);
        //verify if the unsorted array is sorted by the bubble sort algorithm.
        try{
            Assert.assertEquals(sortedArray, unSortedArray, "bucket Sort is not sorting properly");
        }catch(Exception e){
            e.getMessage();
        }

        // apply unsorted array to mergeSort.
        sort.merge(unSortedArray, 0, 6);
        //verify if the unsorted array is sorted by the merge sort algorithm.
        try{
            Assert.assertEquals(sortedArray, unSortedArray, "Merge Sort is not sorting properly");
        }catch(Exception e){
            e.getMessage();
        }

        // apply unsorted array to heapSort.
        sort.heapSort(unSortedArray);
        //verify if the unsorted array is sorted by the heap sort algorithm.
        try{
            Assert.assertEquals(sortedArray, unSortedArray, "Heap Sort is not sorting properly");
        }catch(Exception e){
            e.getMessage();
        }

        // apply unsorted array to bucketSort.
        sort.bucketSort(unSortedArray);
        //verify if the unsorted array is sorted by the backet sort algorithm.
        try{
            Assert.assertEquals(sortedArray, unSortedArray, "Backet Sort is not sorting properly");
        }catch(Exception e){
            e.getMessage();
        }













    }
}
