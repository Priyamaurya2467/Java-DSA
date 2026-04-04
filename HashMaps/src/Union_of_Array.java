import java.util.*;

public class Union_of_Array {


    public static int union(int[] arr1, int[] arr2) {
        HashSet <Integer> map = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            map.add(arr1[i]);

        }
        for (int i = 0; i < arr2.length; i++) {
            map.add(arr2[i]);

        }
        return map.size();

    }
    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};
        System.out.println(union(arr1, arr2));
    }
}
