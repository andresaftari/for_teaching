public class QueueChallenge {
    private static final int[] arrQueue = new int[3];
    private static int front, rear;

    public static void main(String[] args) {
        front = rear = -1;

        enqueue(1);
        enqueue(3);
        enqueue(6);

        dequeue();
        enqueue(4);

        showQueue();
    }

    private static boolean isFull() {
        if (front == 0 && rear == arrQueue.length - 1) return true;
        return front == rear + 1;
    }

    private static boolean isEmpty() {
        return front == -1;
    }

    private static void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue penuh");
        } else {
            if (front == -1) front = 0;

            rear = (rear + 1) % arrQueue.length;
            arrQueue[rear] = data;
        }
    }

    private static void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
        } else {
            if (front == rear) front = rear = -1;
            else front = (front + 1) % arrQueue.length;
        }
    }

    private static void showQueue() {
        System.out.println("Rear: Index " + rear);
        System.out.println("Front: Index " + front);

        for (int data : arrQueue) System.out.println(data);
    }
}