import java.util.*;
public class topological_sort_DAG {
    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Example DAG edges
        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        System.out.println("Topological Sort:");
        System.out.println(Arrays.toString(topologicalSort(V, adj)));


    }

    public static int[] topologicalSort(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(adj, i, visited, stack);
            }
        }
        int[] res = new int[V];
        int i = 0;
        while (!stack.isEmpty()) {
            res[i++] = stack.pop();
        }

        return res;
    }
    public static void dfs(ArrayList<ArrayList<Integer>> adj, int v, boolean[] visited, Stack<Integer> stack) {
        visited[v] = true;
        for(int w : adj.get(v)) {
            if(!visited[w]) {
                dfs(adj, w, visited, stack);
            }
        }
        stack.push(v);
    }

}


