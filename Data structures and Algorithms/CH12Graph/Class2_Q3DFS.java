package CH12Graph;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

class Graph {
    private static Map<Integer, List<Integer>> g;

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

    static void dfs(int start_node) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();
        stack.push(start_node);
        visited.add(start_node);

        while (!stack.isEmpty()) {
            int currentNode = stack.pop();
            System.out.print(currentNode + " ");

            for (int relative : g.get(currentNode)) {
                if (!visited.contains(relative)) {
                    visited.add(relative);
                    stack.push(relative);
                }
            }
        }
    }
}

public class Class2_Q3DFS {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addNode(1);
        graph.addEdge(1, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);

        System.out.println("DFS using Stack:");
        Graph.dfs(1);
    }
}
