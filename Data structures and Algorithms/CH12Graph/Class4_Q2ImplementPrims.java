package CH12Graph;

import java.util.*;

public class Class4_Q2ImplementPrims {
    static class Graph {
        private int V;
        private LinkedList<Edge>[] adj;

        Graph(int v) {
            V = v;
            adj = new LinkedList[V];
            for (int i = 0; i < V; ++i)
                adj[i] = new LinkedList<>();
        }

        static class Edge {
            int dest, weight;

            Edge(int dest, int weight) {
                this.dest = dest;
                this.weight = weight;
            }
        }

        void addEdge(int src, int dest, int weight) {
            adj[src].add(new Edge(dest, weight));
            adj[dest].add(new Edge(src, weight)); // Graph is undirected
        }

        void primMST() {
            boolean[] inMST = new boolean[V];
            int[] parent = new int[V];
            int[] key = new int[V];

            Arrays.fill(key, Integer.MAX_VALUE);
            Arrays.fill(parent, -1);

            PriorityQueue<Edge> pq = new PriorityQueue<>(V, Comparator.comparingInt(e -> e.weight));
            key[0] = 0;
            pq.add(new Edge(0, 0));

            while (!pq.isEmpty()) {
                int u = pq.poll().dest;
                inMST[u] = true;

                for (Edge e : adj[u]) {
                    int v = e.dest;
                    int weight = e.weight;

                    if (!inMST[v] && key[v] > weight) {
                        key[v] = weight;
                        parent[v] = u;
                        pq.add(new Edge(v, key[v]));
                    }
                }
            }

            System.out.println("Edges of MST:");
            for (int i = 1; i < V; i++)
                System.out.println(parent[i] + " - " + i);
        }
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        Graph graph = new Graph(V);

        // Adding edges
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 3, 6);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 8);
        graph.addEdge(1, 4, 5);
        graph.addEdge(2, 4, 7);
        graph.addEdge(3, 4, 9);

        graph.primMST();
    }
}
