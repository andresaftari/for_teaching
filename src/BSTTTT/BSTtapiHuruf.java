package BSTTTT;

//     F
//   E
// D   H

public class BSTtapiHuruf {
    public static void main(String[] args) {
        BSTreeee tree = new BSTreeee();

        tree.insert('f');
        tree.insert('e');
        tree.insert('h');
        tree.insert('d');
        tree.insert('g');
        tree.insert('c');
        tree.insert('b');
        tree.insert('h');
        tree.insert('k');
        tree.insert('i');

        tree.search('z');
    }
}

class BSTreeee {
    private Nodeee root;

    public BSTreeee() {
        this.root = null;
    }

    public void insert(char newChar) {
        if (root == null) root = new Nodeee(newChar);
        else root.insert(newChar);
    }

    public void search(char searchChar) {
        if (searchNode(root, searchChar)) System.out.println("Ketemu ngab");
        else System.out.println("Gak ada");
    }

    private boolean searchNode(Nodeee node, Character key) {
        boolean result = false;

        if (node != null) {
            if (key == node.data) result = true; // apa yg dicari sama, ya itu
            else if (key.compareTo(node.data) < 0) result = searchNode(node.left, key);
            else result = searchNode(node.right, key);
        }

        return result; // T or F
    }
}

// object
class Nodeee {
    char data;
    Nodeee left, right;

    // constructor
    public Nodeee(char data) {
        this.data = data;
        this.left = this.right = null;
    }

    // -1 | 1
    public void insert(Character newValue) {
        // a: 64 b: 65 c: 66
        if (newValue.compareTo(data) < 0) {
            if (left == null) left = new Nodeee(newValue);
            else left.insert(newValue);
        } else if (newValue.compareTo(data) >= 0) {
            if (right == null) right = new Nodeee(newValue);
            else right.insert(newValue);
        }
    }
}
