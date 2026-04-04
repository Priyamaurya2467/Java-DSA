import java.util.Arrays;

public class move {
    public static void main(String[] args) {
        int[] arr = {2,95,32,41,0,41,0,2,0,70,4,0,01};
        rotate(arr);
    }

    static void rotate(int[] arr) {
        int[] list = new int[arr.length];
        int j = 0;
        int i = 0;

        while (j < arr.length) {
            if (arr[j] != 0) {
                list[i] = arr[j];
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(list));
    }
}

