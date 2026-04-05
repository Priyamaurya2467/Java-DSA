import java.util.ArrayList;
import java.util.List;

public class detect_cycle {

    static class DSU {
        int[] parent, rank;

        public DSU(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        // ✅ moved inside DSU
        public int find(int p) {
            if (p != parent[p]) {
                parent[p] = find(parent[p]); // path compression
            }
            return parent[p];
        }

        // ✅ moved inside DSU + fixed logic
        public boolean union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);

            if (rootP == rootQ) return false; // cycle

            if (rank[rootP] < rank[rootQ]) {
                parent[rootP] = rootQ;
            } else if (rank[rootQ] < rank[rootP]) {
                parent[rootQ] = rootP;
            } else {
                parent[rootQ] = rootP;
                rank[rootP]++;
            }
            return true;
        }
    }

    public static boolean hasCycle(int n, List<List<Integer>> adj) {
        DSU dsu = new DSU(n); // ✅ create object

        for (int i = 0; i < n; i++) {
            for (int j : adj.get(i)) {
                if (i < j) { // avoid duplicate edges
                    if (!dsu.union(i, j)) { // ✅ best check
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(3).add(4);
        adj.get(4).add(3);

        adj.get(4).add(1); // creates cycle
        adj.get(1).add(4);

        System.out.println(hasCycle(n, adj)); // true
    }
}