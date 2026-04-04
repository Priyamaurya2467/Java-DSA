import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {
                {3,4,5},
                {6,7,8},
                {9,10,11,12}
        };
        int target = 9;
         int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr,target));
    }

    static int[] search(int[][] arr, int target){
        if(arr.length==0){
            return new int[]{-1,-1};

        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr, int target){
        if(arr.length==0){
            return -1 ;

        }
        int max = Integer.MIN_VALUE;

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max = arr[row][col];

                }
            }
        }
        return max;
    }
}
