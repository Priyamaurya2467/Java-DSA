import java.util.Arrays;

public class Next_Permutation {
    public static void main(String[] args) {
        int[] arr  = {1,2,3};
        nextPermutation(arr);
    }
    static void nextPermutation(int[] arr){
        int n = arr.length;
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i+1]){
            i--;
        }
        if(i >= 0){
            int j = n - 1;
            while (j >= i && arr[j] <= arr[i]){
                j--;
            }
            swap(arr , i ,j);
        }
        reverse(arr , i+1 , n-1);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int[] arr, int start, int end){
        while(start<end){
            swap(arr , start , end);
            start++;
            end--;
        }

    }

}
