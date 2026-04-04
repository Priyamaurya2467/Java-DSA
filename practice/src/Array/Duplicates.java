package Array;

import java.util.ArrayList;


public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,3};
        System.out.println(findDuplicates(arr));
    }
    static ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;


                }

            }

            if (count > 1) {
                list.add(arr[i]);
            }
            arr[i] = -1;
        }
        return list;
    }
}
