package BSTTTT;

public class BSTree {
    private static Node root = null;

    public static void main(String[] args) {
        insert(23);
        insert(10);
        insert(5);
        insert(8);
        insert(11);
        insert(4);
        insert(7);

//        System.out.println("Post Order: ");
//        postorder(root);
//        System.out.println("\nIn Order: ");
//        inorder(root);
//        System.out.println("\nPre Order: ");
//        preorder(root);

        System.out.println(searchNode(root, 0));
    }

    private static void insert(int data) {
        root = setNode(root, data);
    }

    private static Node setNode(Node roots, int data) {
        // Kondisi saat node cuma ada 1 (root)
        if (roots == null) {
            roots = new Node(data);
            return roots;
        } else {
            if (data > roots.data) roots.right = setNode(roots.right, data);
            else if (data < roots.data) roots.left = setNode(roots.left, data);
        }

        return roots;
    }

    private static String searchNode(Node root, int key) {
        if (root == null) {
            return "Not Found :)";
        } else {
            if (root.data == key) return String.valueOf(root.data);
            else if (key > root.data) return searchNode(root.right, key);
            else return searchNode(root.left, key);
        }
    }

    // Post Order (L -> R -> Root)
    private static void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    // Pre Order (Root -> L -> R)
    private static void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    // Pre Order (L -> Root -> R)
    private static void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
}

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        left = right = null;
        this.data = data;
    }
}


