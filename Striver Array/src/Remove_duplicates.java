import java.util.Arrays;

public class Remove_duplicates {
    public static void main(String[] args) {


        int[] arr = {1,0,0, 0, 1, 0, 1, 2, 2, 3, 3, 4};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr) {
        int j = -1;
        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        if(j == -1){
            return arr;

        }
        for(int i = j+ 1; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            j++;
        }
        return arr;
    }



}
