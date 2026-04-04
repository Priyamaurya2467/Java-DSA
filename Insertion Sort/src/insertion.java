import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] arr = {5, 4,6,7,2, 3, 2, 1,0};
        System.out.println(Arrays.toString(insert(arr)));
    }
    public static int[] insert(int[] arr){
        for(int i = 1; i < arr.length; i++){
            for(int j = 0; j <= i; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }

        }
        return arr;

    }
}