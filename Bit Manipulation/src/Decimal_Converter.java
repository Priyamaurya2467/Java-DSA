
public class Decimal_Converter {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1};
        int k =2;
        System.out.println(conversion(arr , k));
    }
    static int  conversion(int[] arr, int k) {
        int sum = 0;
        int pow  = 0;
        for(int i = arr.length-1 ; i >= 0 ; i--){
            sum += arr[i] * Math.pow(k, pow);
            pow++;

        }
        return sum;
    }
}
