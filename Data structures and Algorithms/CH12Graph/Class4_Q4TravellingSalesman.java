package CH12Graph;

import java.util.Arrays;

public class Class4_Q4TravellingSalesman {
    static final int INF = 99999;

    // Function to solve the Traveling Salesman Problem
    public static int tsp(int graph[][]) {
        int V = graph.length;
        int[][] dp = new int[V][1 << V];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        // Initialize dp array for base case (when there is only one vertex)
        for (int i = 0; i < V; i++) {
            dp[i][1 << i] = 0;
        }

        // Call recursive function to find the shortest Hamiltonian cycle
        return tspRecursive(graph, dp, 0, 1, V);
    }

    // Recursive function to calculate the shortest Hamiltonian cycle
    private static int tspRecursive(int[][] graph, int[][] dp, int u, int mask, int V) {
        if (mask == (1 << V) - 1) {
            return graph[u][0]; // Return the cost of returning to the starting vertex
        }

        if (dp[u][mask] != -1) {
            return dp[u][mask];
        }

        int minCost = INF;
        for (int v = 0; v < V; v++) {
            if ((mask & (1 << v)) == 0 && graph[u][v] != INF) {
                minCost = Math.min(minCost, graph[u][v] + tspRecursive(graph, dp, v, mask | (1 << v), V));
            }
        }

        return dp[u][mask] = minCost;
    }

    public static void main(String[] args) {
        int graph[][] = { { 0, 5, INF, 10 },
                          { INF, 0, 3, INF },
                          { INF, INF, 0, 1 },
                          { INF, INF, INF, 0 } };

        // Solve the TSP problem
        int minCost = tsp(graph);
        System.out.println("Minimum cost to visit all vertices: " + minCost);
    }
}

