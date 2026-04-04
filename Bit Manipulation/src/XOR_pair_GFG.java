import java.util.ArrayList;

public class XOR_pair_GFG {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int k = 5;
        System.out.println(find(arr,k));
    }
    static int find(int[] arr, int k) {
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            int ans = 0;
            for(int j = i+1; j < arr.length; j++){
                ans = arr[i] ^ arr[j];
                if(ans < k){
                    count++;
                }
            }
        }
        return count;
    }
}
