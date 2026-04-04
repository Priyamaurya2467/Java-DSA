import java.util.HashSet;

public class intersection_array {

    public static int intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int j = 0; j < nums2.length; j++) {
            if (set1.contains(nums2[j])) {
                count++;
                set1.remove(nums2[j]);
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] arr = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 4};
        System.out.println(intersection(arr, arr2));


    }
}
