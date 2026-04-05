public class rank_and_path_compression {
    static class DSU {
        int[] parent, rank;

        public DSU(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i;
        }
        public int find(int x){
            if (parent[x] == x){
                return x;
            }
            return parent[x] = find(parent[x]);
        }

        public void union(int x,int y){
            int x_parent = find(x);
            int y_parent = find(y);

            if (x_parent == y_parent){
                return;
            }
            if (rank[x_parent] > rank[y_parent]){
                parent[y_parent] = x_parent;
            }
            else if(rank[x_parent] < rank[y_parent]){
                parent[x_parent] = y_parent;
            }
            else {
                parent[y_parent] = x_parent;
                rank[x_parent]++;
            }
        }
    }

    public static void main(String[] args) {
        Disjoint_sets_union.DSU dsu = new Disjoint_sets_union.DSU(5);
        dsu.union(0, 1);
        System.out.println(dsu.find(1));
    }
}
