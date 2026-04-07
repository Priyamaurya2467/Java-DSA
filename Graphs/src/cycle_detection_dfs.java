import java.util.*;
public class cycle_detection_dfs {
    public boolean isCycle(int V, int[][] edges) {
        // Step 1: Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Step 2: Convert edges → adjacency list
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u); // undirected graph
        }

        // Step 3: DFS traversal
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (isCycleDFS(adj, i, visited, -1)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean isCycleDFS(ArrayList<ArrayList<Integer>> adj, int node, boolean[] visited, int parent) {

        visited[node] = true;

        for (int neighbor : adj.get(node)) {

            if (!visited[neighbor]) {
                if (isCycleDFS(adj, neighbor, visited, node)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {


            cycle_detection_dfs obj = new cycle_detection_dfs(); // create object

            int V = 4;

            int[][] edges = {
                    {0,1},
                    {1,2},
                    {2,3},
                    {3,1}  // This creates a cycle
            };

            boolean result = obj.isCycle(V, edges); // call using object

            if(result){
                System.out.println("Cycle detected");
            } else {
                System.out.println("No cycle");
            }
        }

}

