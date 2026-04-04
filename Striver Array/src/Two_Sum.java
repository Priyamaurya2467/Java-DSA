import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;
        System.out.println(Arrays.toString(sum(arr,target)));
        System.out.println(Arrays.toString(sum3(arr,target)));
    }


    //Brute Force Approach  === 0(N^  2)
    static int[] sum (int[] arr , int target){
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i==j){
                    continue;
                }
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }


    /* beeter approach == 0(N)
    static boolean sum1 (int[] arr , int target){
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i = 0 ; i < arr.length ; i++){
        int a = arr[i];
        int more = target-a;
        if(map.find(more) != map.en)
    }
    }
    */

    //optimal Approach - 0(N)

    static int[] sum3 (int[] arr , int target){
        int left = 0 , right = arr.length - 1;
        while (left < right){
            if(arr[left] + arr[right] == target){
                return new int[]{left,right};
            }
            else if(arr[left] + arr[right] < target){
                left++;
            }
            else{
                right--;
            }

        }
        return null;
    }

}
