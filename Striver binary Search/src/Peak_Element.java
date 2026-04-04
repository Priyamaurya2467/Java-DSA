public class Peak_Element {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5,6,7,8,5,1};

        System.out.println(findPeakElement(arr));
    }
    static int findPeakElement(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        if(n == 1) return 0;
        if(arr[0] >  arr[1]){
            return arr[0];
        }
        if(arr[n-1]>arr[n-2]) return arr[n-1];
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                return arr[mid];
            }

            else if(arr[mid]>arr[mid-1]){
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return -1;
    }
}
