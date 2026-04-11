////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Satisfiability_of_equation  {
//    class DSU{
//        int[] parent,rank;
//        DSU(int n){
//            parent=new int[n];
//            rank=new int[n];
//        }
//
//        public void union(int a,int b){
//            int p_a = find(a);
//            int p_b = find(b);
//            if(p_a==p_b){
//                return;
//            }
//            if(rank[p_a]>rank[p_b]){
//                parent[p_b] = p_a;
//            }
//            else if(rank[p_a]<rank[p_b]){
//                parent[p_a] = p_b;
//            }
//            else{
//                parent[p_b] = p_a;
//                rank[p_a]++;
//            }
//        }
//
//        public int find(int n){
//            if(n==parent[n]){
//                return n;
//            }
//            return parent[n] = find(parent[n]);
//        }
//    }
//    public static void main(String[] args) {
//
//    }
//}