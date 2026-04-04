import java.util.Arrays;

public class next_permutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(permutation(arr)));
    }
    public static int[] permutation(int[] arr){
        int n = arr.length;
        int index = -1;
        for(int i = n-1 ; i > 0 ; i--) {
            if (arr[i] > arr[i - 1]) {
                index = i - 1;
                break;
            }
        }
        if(index == -1){
            reverse(arr,0,n-1);
            return arr;
        }

            int swapIndex = index;
            for (int j = n - 1; j >= index + 1; j--) {
                if (arr[j] > arr[swapIndex]) {
                    swapIndex = j;
                    break;
                }
            }
            swap(arr, index, swapIndex);


        reverse(arr,index+1 , n-1);

        return arr;

    }



    public static void swap(int[]arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void reverse(int[]arr,int a, int b){
        int low = a;
        int high = b;
        while(low < high){
            swap(arr,low,high);
            low++;
            high--;
        }
    }
}
