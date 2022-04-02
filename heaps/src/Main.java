import java.util.Random;

public class Main {

    public static int[] generateRandomArrays(int numberOfElements) {
        Random rd = new Random(); // creating Random object
        int[] arr = new int[numberOfElements];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(1000); // storing random integers in an array
        }
        return arr;
    }

    public static void main(String[] args) {

        /** heap test
         Heap heap = new Heap();
         int[] array = generateRandomArrays(10);
         System.out.println("Array before: ");
         for(int i=0; i< array.length; i++) {
         System.out.print(array[i] + " ");
         }
         heap.maxHeapify(array);
         System.out.println();
         System.out.println("Max Heap: ");
         for(int i=0; i< heap.heapSize; i++) {
         System.out.print(array[i] + " ");
         }
         **/

        /** heapsort
         Heap heap = new Heap();
         int[] array = generateRandomArrays(10);
         System.out.println("Array before: ");
         for(int i=0; i< array.length; i++) {
         System.out.print(array[i] + " ");
         }
         heap.heapSort(array);
         System.out.println();
         System.out.println("Max Heap: ");
         for(int i=0; i< array.length; i++) {
         System.out.print(array[i] + " ");
         }
         **/

        /** priority queue test

         Heap heap = new Heap();
         int[] array = generateRandomArrays(10);
         int[] priorityArray = new int[array.length];
         System.out.println("Array before: ");
         heap.heapSize = -1;
         for(int i=0; i< array.length; i++) {
         heap.maxHeapInsert(priorityArray, array[i]);
         System.out.print(array[i] + " ");
         }
         System.out.println();
         System.out.println("Priority Queue: ");
         for(int i=0; i< heap.heapSize; i++) {
         System.out.print(priorityArray[i] + " ");
         }
         while(heap.heapSize != 0) {
         System.out.println();
         System.out.println("Max is " + heap.heapExtractMax(priorityArray));
         for(int i=0; i< heap.heapSize; i++) {
         System.out.print(priorityArray[i] + " ");
         }
         }
         **/


        /** comparison analysis
         Heap heap = new Heap();
         int numberofElements = 1;
         int count = 0;
         while (count != 2) {
         count++;
         numberofElements = numberofElements * 2;
         int[] array1 = generateRandomArrays(numberofElements);
         int[] heapArray = new int[array1.length], mergeArray = new int[array1.length],
         quickArray = new int[array1.length], bubbleArray = new int[array1.length],
         selectionArray = new int[array1.length], insertionArray = new int[array1.length];

         int[][] arrays = {heapArray, mergeArray, quickArray, bubbleArray, selectionArray, insertionArray};
         for (int i = 0; i < arrays.length; i++) {
         for (int j = 0; j < array1.length; j++) {
         arrays[i][j] = array1[j];
         }
         }
         for (int i = 0; i < arrays.length; i++) {
         for (int j = 0; j < array1.length; j++) {
         System.out.print(arrays[i][j]);
         }
         System.out.println();
         }
         long[] timer = new long[6];
         long startTime = System.nanoTime();
         heap.heapSort(heapArray);

         timer[0] = (System.nanoTime() - startTime);
         startTime = System.nanoTime();
         Sort.mergeSort(mergeArray);
         timer[1] = (System.nanoTime() - startTime);
         startTime = System.nanoTime();
         Sort.quickSort(quickArray);
         timer[2] = (System.nanoTime() - startTime);
         startTime = System.nanoTime();
         Sort.bubbleSort(bubbleArray);
         timer[3] = (System.nanoTime() - startTime);
         startTime = System.nanoTime();
         Sort.selectionSort(selectionArray);
         timer[4] = (System.nanoTime() - startTime);
         startTime = System.nanoTime();
         Sort.insertionSort(insertionArray);
         timer[5] = (System.nanoTime() - startTime);

         System.out.println("Number of elements: " + numberofElements);
         for (int i = 0; i < 6; i++) {
            System.out.println(timer[i]);
         }
         }
        **/

    }


}
