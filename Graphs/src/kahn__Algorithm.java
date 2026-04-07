import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class kahn__Algorithm {
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

        System.out.println("Topological Sort : Kahn's Algorithm");
        System.out.println(Arrays.toString(kahnsAlgorithm(V, adj)));
    }

    public static int[] kahnsAlgorithm(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] indegree = new int[V];
        for(int i = 0 ; i < V ; i++){
            for(int neighbour : adj.get(i)){
                indegree[neighbour]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < V; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        int[] kahn = new int[V];
        int index = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            kahn[index++] = node;
            for(int neighbour : adj.get(node)){
                indegree[neighbour]--;

            if(indegree[neighbour] == 0) {
                q.add(neighbour);
            }
            }
        }
        return kahn;
    }
}
