import java.util.Arrays;

public class sort_s {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2};
        sort012(arr);
    }
    static void sort012(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length - i ; j++){
                if(arr[i] > arr[j] ){
                    int temp = arr[j];
                    arr[j] = arr[i];

                    arr[i] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
