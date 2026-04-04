public class searchInRange {
    public static void main(String[] args) {
        int[] arr = {12, 65, 26, 12, 65 , 41 , 44, 23};
        int target = 65;
        System.out.println(range(arr, target));

    }
    static int range(int[] arr, int target){
        if(arr.length == 0){
            return 0;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
