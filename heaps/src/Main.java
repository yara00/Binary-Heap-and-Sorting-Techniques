import java.util.Random;

public class Main {
    public static int[] generateRandomArrays(int numberOfElements) {
        Random rd = new Random(); // creating Random object
        int[] arr = new int[numberOfElements];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(); // storing random integers in an array
        }
        return arr;
    }

    public static void main(String[] args) {
        Heap heap = new Heap();
        int numberofElements = 1;
        int count = 0;
        while (count != 20) {
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
            heap.heapSize = array1.length;
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
    }

}
