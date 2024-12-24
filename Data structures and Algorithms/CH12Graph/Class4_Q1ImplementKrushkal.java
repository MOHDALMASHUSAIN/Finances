package CH12Graph;

import java.util.*;

public class Class4_Q1ImplementKrushkal {
    static class Graph {
        static class Edge implements Comparable<Edge> {
            int src, dest, weight;

            public int compareTo(Edge compareEdge) {
                return this.weight - compareEdge.weight;
            }
        }

        static class Subset {
            int parent, rank;
        }

        int V, E;
        Edge edge[];

        Graph(int v, int e) {
            V = v;
            E = e;
            edge = new Edge[E];
            for (int i = 0; i < e; ++i)
                edge[i] = new Edge();
        }

        int find(Subset subsets[], int i) {
            if (subsets[i].parent != i)
                subsets[i].parent = find(subsets, subsets[i].parent);
            return subsets[i].parent;
        }

        void union(Subset subsets[], int x, int y) {
            int xroot = find(subsets, x);
            int yroot = find(subsets, y);

            if (subsets[xroot].rank < subsets[yroot].rank)
                subsets[xroot].parent = yroot;
            else if (subsets[xroot].rank > subsets[yroot].rank)
                subsets[yroot].parent = xroot;
            else {
                subsets[yroot].parent = xroot;
                subsets[xroot].rank++;
            }
        }

        void KruskalMST() {
            Edge result[] = new Edge[V];
            int e = 0;
            int i = 0;
            for (i = 0; i < V; ++i)
                result[i] = new Edge();

            Arrays.sort(edge);

            Subset subsets[] = new Subset[V];
            for (i = 0; i < V; ++i)
                subsets[i] = new Subset();

            for (int v = 0; v < V; ++v) {
                subsets[v].parent = v;
                subsets[v].rank = 0;
            }

            i = 0;

            while (e < V - 1) {
                Edge next_edge = new Edge();
                next_edge = edge[i++];
                int x = find(subsets, next_edge.src);
                int y = find(subsets, next_edge.dest);
                if (x != y) {
                    result[e++] = next_edge;
                    union(subsets, x, y);
                }
            }

            System.out.println("Edges of MST:");
            for (i = 0; i < e; ++i)
                System.out.println(result[i].src + " -- " + result[i].dest + " == " + result[i].weight);
        }
    }

    public static void main(String[] args) {
        int V = 4; // Number of vertices
        int E = 5; // Number of edges
        Graph graph = new Graph(V, E);

        // Adding edges
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = 10;

        graph.edge[1].src = 0;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = 6;

        graph.edge[2].src = 0;
        graph.edge[2].dest = 3;
        graph.edge[2].weight = 5;

        graph.edge[3].src = 1;
        graph.edge[3].dest = 3;
        graph.edge[3].weight = 15;

        graph.edge[4].src = 2;
        graph.edge[4].dest = 3;
        graph.edge[4].weight = 4;

        graph.KruskalMST();
    }
}
