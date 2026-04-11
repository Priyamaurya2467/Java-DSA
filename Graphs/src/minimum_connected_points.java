import java.util.*;

public class minimum_connected_points {

    public static void main(String[] args) {

        int V = 5;

        int[][] edges = {
                {0, 1, 2},
                {0, 3, 6},
                {1, 2, 3},
                {1, 3, 8},
                {1, 4, 5},
                {2, 4, 7},
                {3, 4, 9}
        };

        int result = spanningTree(V, edges);

        System.out.println("Minimum Spanning Tree Cost: " + result);
    }

    public static int spanningTree(int V, int[][] edges) {

        // ✅ Build adjacency list
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            int wt = e[2];

            adj.get(u).add(new int[]{v, wt});
            adj.get(v).add(new int[]{u, wt});
        }

        boolean[] visited = new boolean[V];

        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> a[0] - b[0]
        );

        pq.add(new int[]{0, 0}); // {weight, node}

        int minCost = 0;

        while (!pq.isEmpty()) {

            int[] curr = pq.poll();
            int cost = curr[0];
            int node = curr[1];

            if (visited[node]) continue;

            visited[node] = true;
            minCost += cost;

            for (int[] neighbor : adj.get(node)) {
                int nextNode = neighbor[0];
                int weight = neighbor[1];

                if (!visited[nextNode]) {
                    pq.add(new int[]{weight, nextNode});
                }
            }
        }

        return minCost;
    }
}