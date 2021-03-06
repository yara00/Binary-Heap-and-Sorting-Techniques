public class Sort {
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j > -1 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void selectionSort(int arr[]) {
        int indx = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndx = i;
         //   int flag = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                   // flag = 1;
                    min = arr[j];
                    minIndx = j;
                }
            }
          //  if (flag == 0) return;
            int temp = arr[indx];
            arr[indx] = min;
            arr[minIndx] = temp;
            indx++;
        }

    }

    public static void mergeSort(int arr[]) {
        int len = arr.length;
        if (len < 2)
            return;
        int mid = len / 2;
        int left[] = new int[mid];
        int right[] = new int[len - mid];
        for (int i = 0; i < mid; i++)
            left[i] = arr[i];
        for (int i = mid; i < len; i++)
            right[i - mid] = arr[i];
        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);

    }

    private static void merge(int left[], int right[], int arr[]) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < right.length && j < left.length) {
            if (right[i] < left[j]) {
                arr[k] = right[i];
                i++;
            } else {
                arr[k] = left[j];
                j++;
            }
            k++;
        }
        if (i < right.length) {
            while (i != right.length) {
                arr[k] = right[i];
                i++;
                k++;
            }
        }
        if (j < left.length) {
            while (j != left.length) {
                arr[k] = left[j];
                k++;
                j++;
            }
        }

    }

    public static void quickSort(int arr[]){
        quickSort(arr, 0, arr.length-1);
    }

    private static void quickSort(int arr[], int start, int end){
        if(start > end) return;
        int pivotIndex = partition(arr, start, end);
        quickSort(arr, start, pivotIndex-1);
        quickSort(arr, pivotIndex+1, end);

    }

    private static int partition(int arr[], int start, int end){
        int pivot = arr[end];
        int pivotIndex = start;
        for (int i = start; i < end; i++){
            if(arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[pivotIndex];
                arr[pivotIndex] = temp;
                pivotIndex++;
            }
        }
        int temp = arr[end];
        arr[end] = arr[pivotIndex];
        arr[pivotIndex] = temp;
        return pivotIndex;
    }
}
