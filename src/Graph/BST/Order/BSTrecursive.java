package Graph.BST.Order;

import java.io.*;
import java.util.*;

public class BSTrecursive {
    private Node rootNode;
    private Integer pilihan;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BSTrecursive operator = new BSTrecursive();

        operator.addNode(operator.rootNode, 23);
        operator.addNode(operator.rootNode, 53);
        operator.addNode(operator.rootNode, 85);
        operator.addNode(operator.rootNode, 40);
        operator.addNode(operator.rootNode, 35);
        operator.addNode(operator.rootNode, 11);
        operator.addNode(operator.rootNode, 39);
        operator.addNode(operator.rootNode, 72);
        operator.addNode(operator.rootNode, 63);
        operator.addNode(operator.rootNode, 69);
        operator.addNode(operator.rootNode, 96);

        do {
            System.out.println("1. Use Level Order Traversal\n2. Use Preorder Traversal\n3. Use Inorder Traversal\n4. Use Postorder Traversal\n5. Exit");
            operator.pilihan = Integer.parseInt(br.readLine());

            switch (operator.pilihan) {
                case 1:
                    operator.printLevelOrder(operator.rootNode);
                    break;

                case 2:
                    operator.printPreOrder(operator.rootNode);
                    break;

                case 3:
                    operator.printInOrder(operator.rootNode);
                    break;

                case 4:
                    operator.printPostOrder(operator.rootNode);
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Input");
            }
        }
        while (true);
    }

    // Levelorder
    private void printLevelOrder(Node rootNode) {
        if (rootNode == null) return;
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(rootNode);

        while (!nodeQueue.isEmpty()) {
            Node obj = nodeQueue.poll();
            System.out.print(obj.getData() + " ");

            if (obj.getLeft() != null) nodeQueue.add(obj.getLeft());
            if (obj.getRight() != null) nodeQueue.add(obj.getRight());
        }
    }

    // Print with Inorder version
    private void printInOrder(Node rootNode) {
        if (rootNode == null) return;

        printInOrder(rootNode.getLeft());
        System.out.print(rootNode.getData() + " ");
        printInOrder(rootNode.getRight());
    }

    // Print with Preorder version
    private void printPreOrder(Node rootNode) {
        if (rootNode == null) return;

        System.out.print(rootNode.getData() + " ");
        printPreOrder(rootNode.getLeft());
        printPreOrder(rootNode.getRight());
    }

    // Print with PostOrder version
    private void printPostOrder(Node rootNode) {
        if (rootNode == null) return;

        printPostOrder(rootNode.getLeft());
        printPostOrder(rootNode.getRight());
        System.out.print(rootNode.getData() + " ");
    }

    // Adding Vertex
    private void addNode(Node rootNode, int data) {
        if (rootNode == null) this.rootNode = new Node(data);
        else addNodeForProperPlace(rootNode, data);
    }

    // Adding proper placed Vertex for InOrder
    private void addNodeForProperPlace(Node rootNode, int data) {
        if (data > rootNode.getData())
            if (rootNode.getRight() != null) addNode(rootNode.getRight(), data);
            else {
                Node temporary = new Node(data);
                rootNode.setRight(temporary);
            }
        else if (data < rootNode.getData())
            if (rootNode.getLeft() != null) addNode(rootNode.getLeft(), data);
            else {
                Node temporary = new Node(data);
                rootNode.setLeft(temporary);
            }
    }
}

class Node {
    private final Integer data;
    private Node left, right;

    Node(Integer data) {
        this.data = data;
    }

    Integer getData() {
        return data;
    }

    Node getLeft() {
        return left;
    }

    void setLeft(Node left) {
        this.left = left;
    }

    Node getRight() {
        return right;
    }

    void setRight(Node right) {
        this.right = right;
    }
}