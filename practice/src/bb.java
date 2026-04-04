import java.util.Arrays;

//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
public class bb {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30, 40}, {15, 25, 35, 45}, {28, 29, 37, 49}, {33, 34, 38, 50}};
        int target = 37;

        System.out.println(Arrays.toString(search(matrix,target)));

    }

    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int []{row,col};
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return new int []{-1,-1};
    }
}