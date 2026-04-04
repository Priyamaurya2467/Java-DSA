public class binary {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 1;
        int start = 0;
        int end = arr.length - 1;
        System.out.println(search(arr, target, start, end));

    }

    static int search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;


            }
            if (arr[mid] > target) {
                return search(arr, target, start, mid - 1);
            }
            if (arr[mid] < target) {
                return search(arr, target, mid + 1, end);

            }


        }
        return -1;

    }
}
