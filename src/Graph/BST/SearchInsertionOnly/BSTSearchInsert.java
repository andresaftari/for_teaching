package Graph.BST.SearchInsertionOnly;

import java.io.*;
import java.util.*;

/*
 * Contoh program Binary Search Tree dengan menerapkan sistem Insert Node, Search Node tanpa meng-handle duplikasi.
 * Ini adalah materi Binary Search Tree part 2, untuk part 1 tentang Binary Search Tree ordering, bisa kunjungi
 * https://github.com/andresaftari/Java-Implementation/blob/master/BST/BSTGeneric.java
 * atau
 * https://github.com/andresaftari/Java-Implementation/blob/master/BST/BSTrecursive.java
 *
 * Untuk part 3 tentang Binary Search Tree complete implementation, bisa kunjungi
 * https://github.com/andresaftari/Java-Implementation/blob/master/BST/BSTCompleteImplementation.java
 */

public class BSTSearchInsert {
    private static Nodes root;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("1. Insert nodes\n2. Search nodes\n" +
                    "3. Print level order\n4. Print in-order\n" +
                    "5. Print pre-order\n6. Print post-order\n7. Exit");
            int option = Integer.parseInt(br.readLine());
            switch (option) {
                case 1:
                    elementToAdd();
                    System.out.println("All nodes inserted");
                    break;

                case 2:
                    System.out.print("Node you want to search : ");
                    String nodeToFind = br.readLine();

                    System.out.println(search(root, nodeToFind));
                    break;

                case 3:
                    System.out.println("Level order");
                    printLevelOrder(root);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("In order");
                    printInOrder(root);
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Pre order");
                    printPreOrder(root);
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Post order");
                    printPostOrder(root);
                    System.out.println();
                    break;

                case 7:
                    System.out.println("Goodbye and stay safe!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("No option " + option + " in the menu");
            }
        }
        while (true);
    }

    private static void elementToAdd() {
        String[] nodes = {"F", "E", "H", "D", "G", "C", "B", "H", "K", "J"};

        for (String node : nodes) insert(node);
    }

    static class Nodes {
        String data;
        Nodes left, right;

        Nodes(String element) {
            data = element;
            left = right = null;
        }
    }

    private static Boolean search(Nodes rootNode, String targetNode) {
        if (rootNode == null) return false;
        else if (rootNode.data.equalsIgnoreCase(targetNode)) return true;

        boolean result1 = search(rootNode.left, targetNode);
        if (result1) return true;

        return search(rootNode.right, targetNode);
    }

    private static void insert(String nodes) {
        if (root == null) root = new Nodes(nodes);
        Nodes rootNode = root;

        while (true) {
            if (nodes.compareTo(rootNode.data) < 0) {
                if (rootNode.left != null) rootNode = rootNode.left;
                else {
                    rootNode.left = new Nodes(nodes);
                    break;
                }
            } else if (nodes.compareTo(rootNode.data) > 0) {
                if (rootNode.right != null) rootNode = rootNode.right;
                else {
                    rootNode.right = new Nodes(nodes);
                    break;
                }
            } else break;
        }
    }

    // Level Order solution
    private static void printLevelOrder(Nodes rootNode) {
        if (rootNode == null) return;
        Queue<Nodes> nodeQueue = new LinkedList<>();
        nodeQueue.add(rootNode);

        while (!nodeQueue.isEmpty()) {
            Nodes child = nodeQueue.poll();
            System.out.print(child.data + " ");
            if (child.left != null) nodeQueue.add(child.left);
            if (child.right != null) nodeQueue.add(child.right);
        }
    }

    // Pre Order solution
    private static void printPreOrder(Nodes rootNode) {
        if (rootNode != null) {
            System.out.print(rootNode.data + " ");
            printPreOrder(rootNode.left);
            printPreOrder(rootNode.right);
        }
    }

    // In Order solution
    private static void printInOrder(Nodes rootNode) {
        if (rootNode != null) {
            printInOrder(rootNode.left);
            System.out.print(rootNode.data + " ");
            printInOrder(rootNode.right);
        }
    }

    // Post Order solution
    private static void printPostOrder(Nodes rootNode) {
        if (rootNode != null) {
            printPostOrder(rootNode.left);
            printPostOrder(rootNode.right);
            System.out.print(rootNode.data + " ");
        }
    }
}