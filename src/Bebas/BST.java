package Bebas;

import java.util.*;

class BST {
    private static Node root;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option1, option2;
        do {
            System.out.println("Option : \n1. Insert Node\n2. Search node K and A\n3. Delete node\n4. Ordering option\n5. Exit");
            option1 = scanner.nextInt();

            switch (option1) {
                case 1:
                    System.out.println("Option : \n1. Duplicated insertion (sebelum ralat)\n" +
                            "2. Single insertion (setelah ralat)");
                    option2 = scanner.nextInt();

                    switch (option2) {
                        case 1:
                            System.out.println();
                            char[] list1 = {'F', 'E', 'H', 'D', 'G', 'C', 'B', 'H', 'K', 'J'};
                            for (char node : list1) insert(root, node);

                            System.out.println("All nodes inserted successfully");
                            break;

                        case 2:
                            System.out.println();
                            char[] list2 = {'F', 'D', 'H', 'E', 'C', 'G', 'B', 'J', 'I', 'K'};
                            for (char node : list2) insert(root, node);

                            System.out.println("All nodes inserted successfully");
                            break;
                    }
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Level order");
                    printLevelOrder(root);
                    System.out.println();

                    System.out.println("Pre order");
                    printPreOrder(root);
                    System.out.println();

                    System.out.println("In order");
                    printInOrder(root);
                    System.out.println();

                    System.out.println("Post order");
                    printPostOrder(root);
                    System.out.println();
                    System.out.println();

                    System.out.print("Is node K found? ");
                    System.out.println(search(root, 'K'));
                    System.out.print("Is node A found? ");
                    System.out.println(search(root, 'A'));
                    break;

                case 3:
                    System.out.print("Deletion option:\n1. Delete node C and K\n2. Delete node C, K, and H\n");
                    option2 = scanner.nextInt();

                    switch (option2) {
                        case 1:
                            System.out.println();
                            System.out.println("Tree before deletion : ");
                            printInOrder(root);
                            System.out.println();

                            System.out.println("Tree after C and K deletion : ");
                            root = delete(root, 'C');
                            root = delete(root, 'K');
                            printInOrder(root);

                            System.out.println();
                            break;

                        case 2:
                            System.out.println();
                            System.out.println("Tree before deletion : ");
                            printInOrder(root);
                            System.out.println();

                            System.out.println("Tree after C, K, and H deletion : ");
                            root = delete(root, 'C');
                            root = delete(root, 'K');
                            root = delete(root, 'H');
                            printInOrder(root);

                            System.out.println();
                            break;

                        default:
                            System.out.println("Option " + option2 + " is invalid");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Ordering option:\n1. Level Order traversal\n2. Pre Order traversal\n" +
                            "3. In Order traversal\n4. Post Order traversal");
                    option2 = scanner.nextInt();

                    switch (option2) {
                        case 1:
                            System.out.println();
                            System.out.println("Level order");
                            printLevelOrder(root);
                            System.out.println();
                            break;

                        case 2:
                            System.out.println();
                            System.out.println("Pre order");
                            printPreOrder(root);
                            System.out.println();
                            break;

                        case 3:
                            System.out.println();
                            System.out.println("In order");
                            printInOrder(root);
                            System.out.println();
                            break;

                        case 4:
                            System.out.println();
                            System.out.println("Post order");
                            printPostOrder(root);
                            System.out.println();
                            break;

                        default:
                            System.out.println("Option " + option2 + " is invalid");
                    }
                    break;

                case 5:
                    System.out.println();
                    System.out.println("Goodbye and stay safe!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Option " + option1 + " is invalid");
            }
        }
        while (true);
    }

    // Minimum value finder (Persiapan bonus 2)
    private static Node minValue(Node minNode) {
        Node current = minNode;
        // Digunakan untuk mencari nilai terkecil dari tree, untuk mencari langkah terbaik dalam menghapus node,
        // dan meng-handle node duplication
        while (current.left != null) current = current.left;
        return current;
    }

    // Search method
    private static Boolean search(Node root, char keyNode) {
        // Apabila root == null, tidak ada nilai yang dikembalikan
        if (root == null) return false;

            // Apabila root == keyNode, itulah yang dicari
        else if (root.root == keyNode) return true;

        // Apabila ditemukan di cabang kiri, dan ada keyNode nya, return true
        boolean isLeft = search(root.left, keyNode);
        if (isLeft) return true;

        // Apabila ditemukan di cabang kanan, dan ada keyNode nya, return true
        return search(root.right, keyNode);
    }

    // Insertion method
    private static void insert(Node root, char node) {
        // Base case (Kasus 0), apabila root kosong insert new Node
        if (root == null) BST.root = new Node(node);

            // Kasus 1: Apabila terdapat duplication terhadap suatu node, node counter menjadi +1
        else if (node == root.root) root.setCount(1);

            // Kasus 2: Apabila hanya terdapat satu child, di subtree kiri ataupun kanan
        else if (node < root.root) {
            if (root.left == null) root.setLeft(new Node(node));
            else insert(root.left, node);
        } else {
            if (root.right == null) root.setRight(new Node(node));
            else insert(root.right, node);
        }
    }

    // Bonus 20% nilai tambahan
    private static Node delete(Node root, char keyNode) {
        // Base case menjadi kasus 0
        if (root == null) return null;

        // Kasus 1:
        // Apabila key lebih kecil daripada root key, maka cari di cabang kiri.
        // Apabila key lebih besar daripada root key, berarti ada di cabang kanan.
        if (keyNode < root.root) root.left = delete(root.left, keyNode);
        else if (keyNode > root.root) root.right = delete(root.right, keyNode);

        else {
            // Kasus 2:
            // Kalau key lebih dari satu, decrement dan return
            if (root.count > 1) {
                root.setCount(-1);
                return root;
            }

            // Kasus 3:
            // Hanya ada 1 child ataupun tidak ada child sama sekali
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            Node temporaryNode = minValue(root.right);
            root.root = temporaryNode.root;
            root.right = delete(root.right, temporaryNode.root);
        }
        return root;
    }

    // Level Order
    private static void printLevelOrder(Node root) {
        if (root == null) return;
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()) {
            Node child = nodeQueue.poll();
            if (root.count > 1) System.out.print(child.root + "(" + root.count + ")" + " ");
            else System.out.print(root.root + " ");

            if (child.left != null) nodeQueue.add(child.left);
            if (child.right != null) nodeQueue.add(child.right);
        }
    }

    // Pre Order
    private static void printPreOrder(Node rootNode) {
        if (rootNode != null) {
            if (rootNode.count > 1) System.out.print(rootNode.root + "(" + rootNode.count + ")" + " ");
            else System.out.print(rootNode.root + " ");
            printPreOrder(rootNode.left);
            printPreOrder(rootNode.right);
        }
    }

    // In Order
    private static void printInOrder(Node rootNode) {
        if (rootNode != null) {
            printInOrder(rootNode.left);
            if (rootNode.count > 1) System.out.print(rootNode.root + "(" + rootNode.count + ")" + " ");
            else System.out.print(rootNode.root + " ");
            printInOrder(rootNode.right);
        }
    }

    // Post Order solution
    private static void printPostOrder(Node rootNode) {
        if (rootNode != null) {
            printPostOrder(rootNode.left);
            printPostOrder(rootNode.right);
            if (rootNode.count > 1) System.out.print(rootNode.root + "(" + rootNode.count + ")" + " ");
            else System.out.print(rootNode.root + " ");
        }
    }
}

class Node {
    char root;
    Node left, right;
    int count = 1;

    Node(char root) {
        this.root = root;
    }

    void setLeft(Node left) {
        this.left = left;
    }

    void setRight(Node right) {
        this.right = right;
    }

    void setCount(int count) {
        this.count += count;
    }
}