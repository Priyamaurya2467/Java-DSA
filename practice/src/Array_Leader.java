import java.util.ArrayList;
public class Array_Leader {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(leaders(arr));
    }

    static ArrayList<Integer> leaders(int[] arr) {
        // code here
        ArrayList<Integer> List = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                List.add(arr[i]);
            } else if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > temp) {

                    }
                }
                    List.add(temp);

            }
        }
        return List;
    }
}