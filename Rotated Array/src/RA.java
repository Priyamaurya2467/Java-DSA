public class RA {
    public static void   main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        //countingNo. Of rotations
        int pivot = findPivot(arr);
        System.out.println(pivot+1);

    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;


            //4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            else if (mid > start && arr[mid] < arr[mid - 1]){
                return mid ;
            }
            else if (arr[start] < arr[mid]){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }


        }
        return -1;
    }
}
