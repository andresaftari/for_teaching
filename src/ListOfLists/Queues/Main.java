package ListOfLists.Queues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    private static final Queue<String> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int option;

        do {
            System.out.println("1. Add Task\n2. Close Task\n3. Show Tasks\n4. Exit");
            option = Integer.parseInt(br.readLine());

            switch (option) {
                case 1:
                    System.out.print("Task name: ");
                    addTask(br.readLine());
//                    addTask(sc.nextLine());
                    break;

                case 2:
                    System.out.println("Task name to be closed:");
                    removeTask(br.readLine());
//                    removeTask(sc.nextLine());
                    break;

                case 3:
                    System.out.println("---All Tasks---");
                    displayTask();
                    break;

                case 4:
                    System.out.println("Bye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opsi " + option + " tidak ada");
            }
        } while (true);
    }

    private static void addTask(String task) {
        queue.add(task);
    }

    private static void removeTask(String doneTask) {
        if (queue.isEmpty()) {
            System.out.println("Task list kosong");
            return;
        }

        if (!queue.peek().equals(doneTask)) {
            System.out.println("Task " + queue.peek() + " harus dikerjakan dahulu!");
        } else {
            System.out.println("Task " + queue.poll() + " sudah ditutup");
        }
    }

    private static void displayTask() {
        int counter = 1;
        Iterator<String> iterator = queue.iterator();

        if (queue.isEmpty()) {
            System.out.println("Task list kosong");
        }

        while (iterator.hasNext()) {
            System.out.println("Task " + counter + " - " + iterator.next());
            counter++;
        }
    }
}
