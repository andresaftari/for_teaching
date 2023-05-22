package HeapTree;

import java.io.*;
import java.util.Arrays;

public class HeapTree {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Choose solution :\n1. Max-Heap\n2. Min-Heap\n3. Heapsort (asc)\n4. Heapsort (desc)\n5. Exit");

            int option = Integer.parseInt(br.readLine());

            switch (option) {
                case 1 -> {
//                    System.out.println("\nOriginal Tree : 5, 8, 3");
                    System.out.print("\nMax Heap : ");
                    HeapTreeOps max = new HeapTreeOps(256, 0);
                    max.insert(5);
                    max.insert(8);
                    max.insert(3);
                    max.insert(9);
                    max.insert(10);
                    max.displayHeap();
                }

                case 2 -> {
//                    System.out.println("\nOriginal Tree : 5, 8, 3");
                    System.out.print("\nMin Heap : ");
                    HeapTreeOps min = new HeapTreeOps(256, 1);
                    min.insert(5);
                    min.insert(8);
                    min.insert(3);
                    min.insert(9);
                    min.insert(10);
                    min.displayHeap();
                }

                case 3 -> {
                    HeapSort sortMax = new HeapSort();
                    System.out.println("\nHeapsort from Max-Heap: ");
                    int[] insert = {5, 8, 3, 9, 10};
                    int len = insert.length;
                    System.out.print("Original Array : ");
                    sortMax.displayArray(insert);
                    System.out.println("Sorted with Acsending order : ");
                    sortMax.heapSortMax(insert, len);
                    sortMax.displayArray(insert);
                    System.out.println();
                }

                case 4 -> {
                    HeapSort sortMin = new HeapSort();
                    System.out.println("\nnHeapsort from Min-Heap: ");
                    int[] inserts = {5, 8, 3, 9, 10};
                    System.out.print("Original Array : ");
                    sortMin.displayArray(inserts);
                    System.out.println("Sorted with Descending order : ");
                    sortMin.heapSortMin(inserts);
                    sortMin.displayArrayMin(inserts);
                    System.out.println();
                }

                case 5 -> {
                    System.out.println("Goodbye and stay safe!");
                    System.exit(0);
                }

                default -> System.out.println("There is no option " + option);
            }
        }
        while (true);
    }
}

class HeapTreeOps {
    private final int[] heap;
    private int size;
    private final int minMaxFlag;

    HeapTreeOps(int max, int minMaxFlag) {
        heap = new int[max];
        size = 0;
        this.minMaxFlag = minMaxFlag;
    }

    private int parentIndex(int index) {
        return (index - 1) / 2;
    }

    void insert(int element) {
        if (size == 0) {
            heap[size++] = element;
        } else {
            heap[size] = element;
            heapifyUp(size++);
        }
    }

    // max/min heap based on flag
    private void heapifyUp(int index) {
        int temp = heap[index];
        int parent = parentIndex(index);
        if (this.minMaxFlag == 0) {
            while (index > 0 && heap[parent] < temp) {
                heap[index] = heap[parent];
                index = parent;
                parent = parentIndex(index);

            }
        } else {
            while (index > 0 && heap[parent] > temp) {
                heap[index] = heap[parent];
                index = parent;
                parent = parentIndex(index);

            }
        }
        heap[index] = temp;
    }

    void displayHeap() {
        for (int i = 0; i < size; i++) {
            if (heap[i] != Integer.MAX_VALUE) System.out.print(heap[i] + " ");
            else System.out.print("-- ");
        }
        System.out.println();

        int blanks = 32;
        int itemsEachRow = 1;
        int column = 0;
        int current = 0;

        String delimeter = "-----------------------------------------------------------------";
        System.out.println(delimeter);

        while (size > 0) {
            if (column == 0) for (int k = 0; k < blanks; k++) System.out.print(' ');

            System.out.print(heap[current]);

            if (++current == size) break;
            if (++column == itemsEachRow) {
                blanks /= 2;
                itemsEachRow *= 2;
                column = 0;
                System.out.println();
            } else for (int k = 0; k < blanks * 2 - 2; k++) System.out.print(' ');
        }
        System.out.println("\n" + delimeter);
    }
}

class HeapSort {
    private void maxHeap(int[] arr, int len) {
        for (int i = 1; i < len; i++) {

            if (arr[i] > arr[(i - 1) / 2]) {
                int j = i;

                while (arr[j] > arr[(j - 1) / 2]) {
                    swap(arr, j, (j - 1) / 2);
                    j = (j - 1) / 2;
                }
            }
        }
    }

    void heapSortMax(int[] arr, int n) {
        maxHeap(arr, n);

        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            int j = 0, index;

            do {
                index = (2 * j + 1);
                if (index < (i - 1) && arr[index] < arr[index + 1]) index++;

                if (index < i && arr[j] < arr[index]) swap(arr, j, index);
                j = index;
            } while (index < i);
        }
    }

    void heapSortMin(int[] arr) {
        int len = arr.length;

        for (int i = len / 2 - 1; i >= 0; i--) heapifyMinSort(arr, len, i);

        for (int i = len - 1; i > 0; i--) {
            int container = arr[0];
            arr[0] = arr[i];
            arr[i] = container;

            heapifyMinSort(arr, i, 0);
        }
    }

    private void heapifyMinSort(int[] arr, int len, int index) {
        int largest = index;
        int onLeft = 2 * index + 1;
        int onRight = 2 * index + 2;

        if (onLeft < len && arr[onLeft] > arr[largest]) largest = onLeft;
        if (onRight < len && arr[onRight] > arr[largest]) largest = onRight;
        if (largest != index) {
            int swapper = arr[index];
            arr[index] = arr[largest];
            arr[largest] = swapper;

            heapifyMinSort(arr, len, largest);
        }
    }

    private void swap(int[] heapArray, int index1, int index2) {
        int temp = heapArray[index1];
        heapArray[index1] = heapArray[index2];
        heapArray[index2] = temp;
    }

    void displayArray(int[] arr) {
        System.out.print("[");
        for (int value : arr) System.out.print(value + " ");
        System.out.print("]");
        System.out.println();
    }

    void displayArrayMin(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int container = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = container;
        }
        System.out.println(Arrays.toString(arr));
    }
}