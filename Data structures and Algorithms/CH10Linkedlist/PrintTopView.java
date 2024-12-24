package CH10Linkedlist;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

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

public class PrintTopView {
    static Node root;

    PrintTopView() {
        root = null;
    }

    public static void printTop() {
        Map<Integer, Integer> result = new TreeMap<>();
        printTopView(root, result);

        for (Integer element : result.values()) {
            System.out.print(element + " ");
        }
    }

    public static void printTopView(Node root, Map<Integer, Integer> map) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        Queue<Integer> distanceQueue = new LinkedList<>();

        queue.add(root);
        distanceQueue.add(0);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            int distance = distanceQueue.poll();

            if (!map.containsKey(distance)) {
                map.put(distance, current.data);
            }

            if (current.left != null) {
                queue.add(current.left);
                distanceQueue.add(distance - 1);
            }

            if (current.right != null) {
                queue.add(current.right);
                distanceQueue.add(distance + 1);
            }
        }
    }

    public static void main(String[] args) {
        PrintTopView tree = new PrintTopView();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Top view of binary tree is");
        printTop();
    }
}
