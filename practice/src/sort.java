import java.util.ArrayList;
import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 5, 1};
        System.out.println(sort(arr));
    }

    static int sort(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > 0) {
                if (arr[i] == arr[i + 1]+1) {
                    return arr[i]+1;
                }
            }
        }
        return -1;
    }
}





