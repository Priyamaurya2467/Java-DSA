public class squareroot {
    public static void main(String[] args) {
        int[][] matrix = {
                {1}
        };
        int target = 0;
        System.out.println(searchMatrix(matrix, target));
    }
   static boolean searchMatrix(int[][] matrix, int target) {

        for(int row = 0 ; row < matrix.length ; row++ ){
            if(matrix[row].length == 1){
                if(matrix[row][0]==target){
                    return true;
                }
            }
            else if (matrix[row].length < 3){
                if(matrix[row][0]==target ){
                    return true;

                }
                else  if(matrix[row][1]==target){
                    return true;
                }
            }
            else{

                int start = 0;
                int end = matrix[row].length-1 ;
                while (start <= end){
                    int mid = start + (end-start)/2;
                    if (matrix[row][mid]==target){
                        return true;
                    }
                    else if (matrix[row][mid] < target ){
                        end = mid-1;
                    }
                    else{
                        start = mid +1;
                    }
                }
            }
        }
        return false;
    }

}



