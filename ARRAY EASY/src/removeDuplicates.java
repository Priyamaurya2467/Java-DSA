public class removeDuplicates {

    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(output(arr));
    }
    public static int output(int[] arr) {
        if(arr.length==0){
            return 0;
        }
        int count =1;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i-1] !=arr[i]){
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }
}
