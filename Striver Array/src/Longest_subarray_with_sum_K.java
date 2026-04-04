import javax.swing.*;
import java.util.HashMap;

public class Longest_subarray_with_sum_K {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,4,2,3};
        int sum = 3;
        System.out.println(sum(arr , sum));
        System.out.println(sum3(arr , sum));
    }
    static int sum(int[] arr,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for(int i = 0 ; i < arr.length; i++){
            sum += arr[i];
            if(sum == target){

                maxLen = Math.max(maxLen , i + 1);
            }
            int ren = sum - target;
            if(map.containsKey(ren)){
                map.put(ren, map.get(ren) + 1);
                int len = i - map.get(ren);
                maxLen = Math.max(maxLen , len);
            }
            map.put(arr[i], i);
        }
        return maxLen;
    }


    //Optimal Approach = 0(N)
    static int sum3(int[] arr,int target){
        int l = 0 , r = 0 , sum = 0 , maxLen = 0;
        while(r < arr.length){
            sum += arr[l];
            if (sum >  target) {
                sum -= arr[l++];
                if(sum == target){
                    maxLen = Math.max(maxLen , r - l + 1);
                }
            }
            r++;
        }
        return maxLen;
    }
}
