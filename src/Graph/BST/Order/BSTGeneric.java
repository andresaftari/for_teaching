package Graph.BST.Order;

import java.io.*;
import java.util.*;

/*
 * Contoh program Binary Search Tree dengan menerapkan ordering tanpa meng-handle duplikasi.
 * Ini adalah materi Binary Search Tree part 1, untuk part 2 tentang Binary Search Tree Insert dan Search, bisa kunjungi
 * https://github.com/andresaftari/Java-Implementation/blob/master/BST/BSTSearchInsert.java
 *
 * Untuk part 3 tentang Binary Search Tree complete implementation, bisa kunjungi
 * https://github.com/andresaftari/Java-Implementation/blob/master/BST/BSTCompleteImplementation.java
 */

public class BSTGeneric {
    private Nodes rootNode;

    private void binaryTree() {
        addNode(rootNode, 51);
        addNode(rootNode, 21);
        addNode(rootNode, 78);
        addNode(rootNode, 7);
        addNode(rootNode, 23);
        addNode(rootNode, 22);
        addNode(rootNode, 78);
        addNode(rootNode, 91);
        addNode(rootNode, 83);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BSTGeneric operator = new BSTGeneric();
        operator.binaryTree();

        do {
            System.out.println("Choose a solution :\n1. Use Preorder Traversal\n2. Use Inorder Traversal\n3. Use Postorder Traversal\n4. Use Level Order Traversal\n5. Exit");
            int option = Integer.parseInt(br.readLine());

            switch (option) {
                case 1:
                    System.out.println("Pre order ");
                    operator.printPreOrder(operator.rootNode);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("In order ");
                    operator.printInOrder(operator.rootNode);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Post order ");
                    operator.printPostOrder(operator.rootNode);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Level order ");
                    operator.printLevelOrder(operator.rootNode);
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Good bye and stay safe!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Sorry, option " + option + " is invalid");
            }
        }
        while (true);
    }

    static class Nodes {
        Nodes left, right;
        Integer data;

        Nodes(Integer data) {
            this.data = data;
        }

        void setLeft(Nodes left) {
            this.left = left;
        }

        void setRight(Nodes right) {
            this.right = right;
        }
    }

    // Adding Vertex
    private void addNode(Nodes rootNode, int data) {
        if (rootNode == null) this.rootNode = new Nodes(data);
        else addNodeForProperPlace(rootNode, data);
    }

    // Adding proper placed Vertex for InOrder
    private void addNodeForProperPlace(Nodes rootNode, int data) {
        if (data > rootNode.data) if (rootNode.right != null) addNode(rootNode.right, data);
        else {
            Nodes temporary = new Nodes(data);
            rootNode.setRight(temporary);
        }
        else if (data < rootNode.data)
            if (rootNode.left != null) addNode(rootNode.left, data);
            else {
                Nodes temporary = new Nodes(data);
                rootNode.setLeft(temporary);
            }
    }

    private void printLevelOrder(Nodes rootNode) {
        if (rootNode == null) return;
        Queue<Nodes> nodeQueue = new LinkedList<>();
        nodeQueue.add(rootNode);

        while (!nodeQueue.isEmpty()) {
            Nodes obj = nodeQueue.poll();
            System.out.print(obj.data + " ");
            if (obj.left != null) nodeQueue.add(obj.left);
            if (obj.right != null) nodeQueue.add(obj.right);
        }
    }

    // Pre Order solution
    private void printPreOrder(Nodes node) {
        if (node != null) {
            System.out.print(node.data + " ");
            printPreOrder(node.left);
            printPreOrder(node.right);
        }
    }

    // In Order solution
    private void printInOrder(Nodes node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.data + " ");
            printInOrder(node.right);
        }
    }

    // Post Order solution
    private void printPostOrder(Nodes node) {
        if (node != null) {
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }
}