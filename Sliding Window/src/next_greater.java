import java.util.Arrays;
public class next_greater {
    public static void main(String[] args) {
        int[] arr = {5,5,5,5,5};
        int n = arr.length;
        System.out.println(Arrays.toString(nextGreaterElement(arr,n)));
    }
    public static int[] nextGreaterElement(int[] arr,int n){
        int[] ans = new int[n];
        int max = -1;
        for(int i = 0 ; i < n-1 ; i++){
            max = arr[i];
            for(int j = i+1 ; j < n-1 ; j++){
                if(arr[j] > max){
                    max = arr[j];
                    break;
                }
            }

            if(arr[i] == max){
                ans[i] = -1;
            }
            else{
                ans[i] = max;
            }

        }
        ans[n-1] = -1;
        return ans;
    }
}
