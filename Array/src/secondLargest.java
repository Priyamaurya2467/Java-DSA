public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {8,8,7,6,5};
        System.out.println(secondLarge(arr));
    }
    static int secondLarge(int[] arr) {
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i] > secondLargest ) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
