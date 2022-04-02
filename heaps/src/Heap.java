class Heap {

     public int heapSize;
    // method to float down the values recursively to maintain max heap property
    public void maxHeapify(int array[], int i) {
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
    public void buildMaxHeap(int array[]) {
        heapSize = array.length;
        for (int i=heapSize/2-1; i>=0;i--)
            maxHeapify(array, i);
    }
    // heap sort
    public void heapSort(int array[]) {
        buildMaxHeap(array);
        for (int i=heapSize-1;i>= 1;i--) { // swap values
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapSize = heapSize - 1;
            maxHeapify(array, 0);
        }
    }
    // method to return max element in a heap
    public int heapMax(int[] array) {
        return array[0];
    }
    // method to return max element in a heap
    public int heapExtractMax(int array[]) {
        if(heapSize < 0) System.out.println("Heap Underflow");
        int max;
        max = array[0];
        array[0] = array[heapSize];
        heapSize = heapSize - 1;
        maxHeapify(array, 0);
        return max;
    }
    // method to increase value of index i element to the key value
    public void heapIncreaseKey(int[] array, int i, int key) {
        if(key < array[i])
            return;
        array[i] = key;
        while((i > 0) && (array[(i-1)/2] < array[i])) { // swap when parent less than array[i]
            int temp = array[(i-1)/2];
            array[(i-1)/2] = array[i];
            array[i] = temp;

            i = (i-1) / 2; // upgrade to new parent
        }
    }
    // method to implement priority queue insertion using heap
    public void maxHeapInsert(int[] array, int key) {
        heapSize = heapSize + 1;
        array[heapSize] = (int) Double.NEGATIVE_INFINITY;
        heapIncreaseKey(array, heapSize, key);
    }

}
