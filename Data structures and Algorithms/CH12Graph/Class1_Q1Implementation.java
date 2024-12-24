package CH12Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//import javax.management.Query;
class Graph {
    private Map<Integer, List<Integer>> g;

    Graph() {
        g = new HashMap<>();
    }

    void addNode(int node) {
        if (!g.containsKey(node)) {
            g.put(node, new LinkedList<>());
        } else {
            System.out.println("Node already exists");
        }
    }

    void addEdge(int nodeA, int nodeB) {
        if (g.containsKey(nodeA) && g.containsKey(nodeB)) {
            g.get(nodeA).add(nodeB);
            g.get(nodeB).add(nodeA);
        } else {
            System.out.println("One or both nodes do not exist");
        }
    }

    void print() {
        for (Map.Entry<Integer, List<Integer>> entry : g.entrySet()) {
            System.out.print("Node " + entry.getKey() + ": ");
            for (Integer connector : entry.getValue()) {
                System.out.print(connector + " ");
            }
            System.out.println();
        }
    }

    void updateGraph(int nodeA, int nodeB, boolean flag) {
        if (flag) {
            addEdge(nodeA, nodeB);
        } else {
            removeEdge(nodeA, nodeB);
        }
    }

    void removeEdge(int nodeA, int nodeB) {
        if (g.containsKey(nodeA) && g.containsKey(nodeB)) {
            g.get(nodeA).remove(Integer.valueOf(nodeB));
            g.get(nodeB).remove(Integer.valueOf(nodeA));
        } else {
            System.out.println("One or both nodes do not exist");
        }
    }

    void deleteNode(int node) {
        if (g.containsKey(node)) {
            g.remove(node);
            for (List<Integer> values : g.values()) {
                values.remove(Integer.valueOf(node));
            }
        } else {
            System.out.println("Node does not exist");
        }
    }
}
public class Class1_Q1Implementation {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addNode(1);
        graph.addEdge(1, 3);
        graph.print();
    }
}
