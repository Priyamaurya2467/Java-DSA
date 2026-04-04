import java.util.HashMap;

public class Missing_number {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int n = 5;
        System.out.println(find(arr,n));
        System.out.println(find2(arr,n));
    }


    //better approach = 0(n) + 0(n)
    static int find(int[] arr,int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            map.put(arr[i],1);
        }
        for(int i = 1 ; i <= n ; i++){
            if(!map.containsKey(i)){
                return i;

            }
        }
        return -1;
    }

    //Optimal Approach = 0(n)

    static int find2(int[] arr,int n){
        int sum = n*(n+1)/2;
        for (int i = 0 ; i < arr.length ; i++){
            sum -= arr[i];

        }
        return sum;
    }
}
