package CH10Linkedlist;


    import java.util.LinkedList;
import java.util.Queue;

class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int value) {
        this.data = value;
        this.right = null;
        this.left = null;
    }
}

public class ExtremeElements {
    static Node root;

    ExtremeElements() {
        root = null;
    }

    public static void printExtremeElements() {
        if (root != null) {
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            if (root != null) {
                System.out.print(root.data + " "); // Print the extreme left element

                while (!queue.isEmpty()) {
                    Node current = queue.poll();

                    if (current.right != null) {
                        System.out.print(current.right.data + " "); // Print the extreme right element
                        queue.add(current.right);
                    }

                    if (current.left != null) {
                        queue.add(current.left);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ExtremeElements tree = new ExtremeElements();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(8);

        System.out.println("Extreme elements at the first level of binary tree are");
        printExtremeElements();
    }
}

