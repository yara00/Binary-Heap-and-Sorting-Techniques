class Heap {

    // private static int[] array = {3,20,1,5,6,4};
    // private static int heapSize = array.length;
    private static int heapSize = 0;
    public static void main(String[] args) {
        int[] array = new int[20];
        maxHeapInsert(array, 11);
        maxHeapInsert(array, 15);
        maxHeapInsert(array, 8);
        maxHeapInsert(array, 10);
        maxHeapInsert(array, 5);
        maxHeapInsert(array, 7);
        maxHeapInsert(array, 6);
        maxHeapInsert(array, 2);
        maxHeapInsert(array, 9);
        maxHeapInsert(array, 1);

        //heapSort(array);
        //buildMaxHeap(nums, n);
        //heapIncreaseKey(array, 3, 21);
        //heapExtractMax(array);

        for(int marioma=0; marioma< heapSize; marioma++) {
            System.out.println(array[marioma]);
        }
        System.out.println("helloooooooooooooooooo");
        System.out.println(heapExtractMax(array));

        System.out.println("helloooooooooooooooooo");
        System.out.println(heapExtractMax(array));
        System.out.println("helloooooooooooooooooo");
        System.out.println(heapExtractMax(array));
        System.out.println("helloooooooooooooooooo");
        System.out.println(heapExtractMax(array));
        System.out.println("helloooooooooooooooooo");
        System.out.println(heapExtractMax(array));
        System.out.println("helloooooooooooooooooo");
        System.out.println(heapExtractMax(array));
        System.out.println("helloooooooooooooooooo");
        System.out.println(heapExtractMax(array));
     /*   for(int marioma=0; marioma< array.length; marioma++) {
            System.out.println(array[marioma]);
        }*/
    }
    // method to float down the values recursively to maintain max heap property
    public static void maxHeapify(int array[], int i)
    {
        int root = i; // parent
        int leftChild = i*2 + 1;
        int rightChild = i*2 + 2;
        if (rightChild < heapSize && array[rightChild] > array[root]) // right child greater
            root = rightChild;
        if (leftChild < heapSize && array[leftChild] > array[root]) // left child greater
            root = leftChild;
        // swap if parent is not greatest
        if (root != i) {
            int temp = array[i];
            array[i] = array[root];
            array[root] = temp;
            maxHeapify(array, root);
        }
    }
    // method to convert array to max heap
    public static void buildMaxHeap(int array[]) {
        for (int i=heapSize/2-1; i>=0;i--)
            maxHeapify(array, i);
    }
    // heap sort
    public static void heapSort(int array[]) {
        buildMaxHeap(array);
        for (int i=heapSize-1;i>= 0;i--) { // swap values
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            maxHeapify(array, 0);
        }
    }
    // method to return max element in a heap
    public static int heapMax(int[] array) {
        return array[0];
    }
    // method to return max element in a heap
    public static int heapExtractMax(int array[]) {
        if(heapSize < 1) System.out.println("Heap Underflow");
        int max;
        max = array[0];
        array[0] = array[heapSize];
        heapSize = heapSize - 1;
        maxHeapify(array, 0);
        return max;
    }
    // method to increase value of index i element to the key value
    public static void heapIncreaseKey(int[] array, int i, int key) {
        if(key < array[i])
            return;
        array[i] = key;
        while((i > 1) && (array[(i/2)-1] < array[i])) { // swap when parent less than array[i]
            int temp = array[(i/2)-1];
            array[(i/2)-1] = array[i];
            array[i] = temp;

            i = (i / 2) - 1; // upgrade to parent
        }
    }
    // method to implement priority queue insertion using heap
    public static void maxHeapInsert(int[] array, int key) {
        heapSize = heapSize + 1;
        array[heapSize] = (int) Double.NEGATIVE_INFINITY;
        heapIncreaseKey(array, heapSize, key);
    }

}
