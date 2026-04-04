import java.util.Arrays;

public class moveZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        move(arr);
    }
    public static void move(int[] arr){
        int i=0;
        int j = 1;
        while(j<arr.length){
            if(arr[j]!=0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
