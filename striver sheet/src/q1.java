
public class q1 {
    public static void main(String[] args) {
        int[] arr = {2,5,6,1,3};
        System.out.println(largestElement(arr));
    }
    //Brute Force Approach
    static int largestElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length-i; j++) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr[arr.length-1];
    }

}
