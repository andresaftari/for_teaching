package HTree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Heappp {
    private static TreeSort tSort = new TreeSort(3, 0);

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opsi;

        map.put("ISD", 5);
        map.put("UKM", 8);
        map.put("SBD", 3);

        tSort.insert(map.get("ISD"));
        tSort.insert(map.get("UKM"));
        tSort.insert(map.get("SBD"));


        do {
            System.out.println("Original:");
            tSort.displayArray();
            System.out.println("\n1. Min Heap\n2. Max Heap\n3. Exit");
            opsi = sc.nextInt();

            switch (opsi) {
                case 1 -> {
                    System.out.println("\nMin Heap:");
                    tSort.doHeapMin();
                    tSort.displayArrayMin();
                }
                case 2 -> {
                    System.out.println("\nMax Heap:");
                    tSort.doHeapMax();
                    tSort.displayArray();
                }
                case 3 -> {
                    System.out.println("Bye!");
                    System.exit(0);
                }
            }
        } while (true);
    }
}

class TreeSort {
    private final int[] heap;
    private int size;
    private final int minMaxFlag;

    public TreeSort(int size, int minMaxFlag) {
        this.heap = new int[size];
        this.size = 0;
        this.minMaxFlag = minMaxFlag;
    }

    public void insert(int num) {
        if (size == 0) heap[size++] = num;
        else {
            heap[size] = num;
            heapifyUp(size++);
        }
    }

    private void heapifyUp(int index) {
        int temp = heap[index];
        int parent = (index - 1) / 2;

        if (this.minMaxFlag == 0) while (index > 0 && heap[parent] < temp) {
            heap[index] = heap[parent];
            index = parent;
            parent = (index - 1) / 2;
        }

        else while (index > 0 && heap[parent] > temp) {
            heap[index] = heap[parent];
            index = parent;
            parent = (index - 1) / 2;
        }

        heap[index] = temp;
    }

    private void heapifyDown(int index) {
        int largestIndex = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < heap.length && left > heap[largestIndex]) largestIndex = left;
        if (right < heap.length && right > heap[largestIndex]) largestIndex = right;

        if (largestIndex != index) {
            int swaps = heap[index];
            heap[index] = heap[largestIndex];
            heap[largestIndex] = swaps;

            heapifyDown(largestIndex);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void doHeapMin() {
        for (int i = heap.length / 2 - 1; i >= 0; i--) heapifyDown(i);

        for (int i = heap.length - 1; i > 0; i--) {
            int temp = heap[0];
            heap[0] = heap[i];
            heap[i] = temp;

            heapifyDown(i);
        }
    }

    public void doHeapMax() {
        for (int i = 0; i < heap.length; i++) {
            if (heap[i] > heap[(i - 1) / 2]) {
                int j = i;

                while (heap[j] > heap[(j - 1) / 2]) {
                    swap(j, (j - 1) / 2);
                    j = (j - 1) / 2;
                }
            }
        }

        for (int i = heap.length - 1; i > 0; i--) {
            swap(0, i);
            int j = 0, index;

            do {
                index = (2 * j + 1);
                if (index < (i - 1) && heap[index] < heap[index + 1]) index++;

                if (index < i && heap[j] < heap[index]) swap(j, index);
                j = index;
            } while (index < i);
        }
    }

    public void displayArray() {
        System.out.print("[");
        for (int value : heap) System.out.print(value + " ");
        System.out.print("]");
        System.out.println();
    }

    public void displayArrayMin() {
        for (int i = 0; i < heap.length / 2; i++) {
            int container = heap[i];
            heap[i]  = heap[heap.length -i -1];
            heap[heap.length -i -1] = container;
        }
        System.out.println(Arrays.toString(heap));
    }
}
