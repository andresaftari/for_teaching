import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HeapRecursive {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final MinHeap minOperator = new MinHeap(12);
    private static final MaxHeap maxOperator = new MaxHeap(12);

    private static void maxInsertion() {
        maxOperator.insertMax(25);
        maxOperator.insertMax(23);
        maxOperator.insertMax(30);
        maxOperator.insertMax(15);
        maxOperator.insertMax(6);
        maxOperator.insertMax(45);
        maxOperator.insertMax(27);
        maxOperator.insertMax(10);
        maxOperator.insertMax(33);
        maxOperator.insertMax(7);
    }

    private static void minInsertion() {
        minOperator.insertMin(25);
        minOperator.insertMin(23);
        minOperator.insertMin(30);
        minOperator.insertMin(15);
        minOperator.insertMin(6);
        minOperator.insertMin(45);
        minOperator.insertMin(27);
        minOperator.insertMin(10);
        minOperator.insertMin(33);
        minOperator.insertMin(7);
    }

    public static void main(String[] args) throws IOException {
        do {
            System.out.println("1. Execute Max-Heap operation\n2. Execute Min-Heap operation\n" +
                    "3. Heapsort(from max heap)\n4. Heapsort(from min heap)\n5. Exit");
            int option = Integer.parseInt(br.readLine());
            System.out.println("\n");


            switch (option) {
                case 1:
                    System.out.println("Max Heap : ");
                    maxInsertion();
                    maxOperator.maxHeap();

                    maxOperator.display();
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Min Heap : ");
                    minInsertion();
                    minOperator.minHeap();

                    minOperator.display();
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Heapsort (from Max-Heap) : ");

                    System.out.println("\n");
                    break;

                case 4:
                    System.out.println("Heapsort (from Min-Heap) : ");

                    System.out.println("\n");
                    break;

                case 5:
                    System.out.println("Good bye and stay safe!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("There is no option " + option);
            }
        } while (true);
    }
}

class MaxHeap {
    private final int[] Heap;
    private int size;

    private static final int nodeFront = 1;

    MaxHeap(int maxsize) {
        this.size = 0;
        Heap = new int[maxsize + 1];
        Heap[0] = Integer.MAX_VALUE;
    }

    private int parent(int position) {
        return position / 2;
    }

    private int leftChild(int position) {
        return (2 * position);
    }

    private int rightChild(int position) {
        return (2 * position) + 1;
    }

    private boolean isLeaf(int position) {
        return position >= (size / 2) && position <= size;
    }

    private void swap(int nodeA, int nodeB) {
        int tmp;
        tmp = Heap[nodeA];
        Heap[nodeA] = Heap[nodeB];
        Heap[nodeB] = tmp;
    }

    private void maxHeapify(int position) {
        if (!isLeaf(position)) {
            if (Heap[position] < Heap[leftChild(position)] || Heap[position] < Heap[rightChild(position)]) {
                if (Heap[leftChild(position)] > Heap[rightChild(position)]) {
                    swap(position, leftChild(position));
                    maxHeapify(leftChild(position));
                } else {
                    swap(position, rightChild(position));
                    maxHeapify(rightChild(position));
                }
            }
        }
    }

    void insertMax(int element) {
        Heap[++size] = element;
        int current = size;

        while (Heap[current] > Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    void display() {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(Heap[2 * i + 1] + " ");
        }
    }

    void maxHeap() {
        for (int pos = (size / 2); pos >= 1; pos--) maxHeapify(pos);
    }

    public int remove() {
        int popped = Heap[nodeFront];
        Heap[nodeFront] = Heap[size--];
        maxHeapify(nodeFront);
        return popped;
    }
}

class MinHeap {
    private final int[] Heap;
    private int size;

    private static final int nodeFront = 1;

    MinHeap(int maxsize) {
        this.size = 0;
        Heap = new int[maxsize + 1];
        Heap[0] = Integer.MIN_VALUE;
    }

    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return (2 * pos);
    }

    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }

    private boolean isLeaf(int pos) {
        return pos >= (size / 2) && pos <= size;
    }

    private void swap(int fpos, int spos) {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }

    private void minHeapify(int pos) {
        if (!isLeaf(pos)) {
            if (Heap[pos] > Heap[leftChild(pos)] || Heap[pos] > Heap[rightChild(pos)]) {
                if (Heap[leftChild(pos)] < Heap[rightChild(pos)]) {
                    swap(pos, leftChild(pos));
                    minHeapify(leftChild(pos));
                } else {
                    swap(pos, rightChild(pos));
                    minHeapify(rightChild(pos));
                }
            }
        }
    }

    public void insertMin(int element) {
        Heap[++size] = element;
        int current = size;

        while (Heap[current] < Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public void display() {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2 * i]
                    + " RIGHT CHILD :" + Heap[2 * i + 1]);
            System.out.println();
        }
    }

    public void minHeap() {
        for (int pos = (size / 2); pos >= 1; pos--) {
            minHeapify(pos);
        }
    }

    public int remove() {
        int popped = Heap[nodeFront];
        Heap[nodeFront] = Heap[size--];
        minHeapify(nodeFront);
        return popped;
    }
}
