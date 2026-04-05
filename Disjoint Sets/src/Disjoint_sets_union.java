public class Disjoint_sets_union {


        static class DSU {
            int[] parent, rank;

            public DSU(int n) {
                parent = new int[n];
                rank = new int[n];
                for (int i = 0; i < n; i++) parent[i] = i;
            }

            public int find(int x) {
                if (parent[x] == x){
                    return x;
                }
                return find(parent[x]);
            }

            public void union(int x, int y) {
                int px = find(x);
                int py = find(y);
                if (px != py){
                    parent[py] = px;

                }
            }
        }

        public static void main(String[] args) {
            DSU dsu = new DSU(5);
            dsu.union(0, 1);
            System.out.println(dsu.find(1));
        }
    }