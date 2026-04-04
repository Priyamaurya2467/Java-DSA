import java.util.*;
public class one_Graph_Representation {
    public static void main(String[] args) {
        int V = 5; // number of vertices

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Initialize graph
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges (undirected)
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);

        boolean[] visited = new boolean[V];

        dfs(0, visited, graph);

    }
    public static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> graph) {
            visited[node] = true;
            System.out.print(node + " ");

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    dfs(neighbor, visited, graph);
                }
            }
        }
}
