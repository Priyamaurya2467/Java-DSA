import java.util.Arrays;
public class missing {
    public static void main(String[] args) {

        int[] arr = {1,4,6,5,2};
        System.out.println(missingNum(arr));
    }

      static  int missingNum(int[] arr) {
            // code here
            Arrays.sort(arr);

            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] != i+1){
                    return i+1;
                }
            }
                return arr.length+1;
            }
}

