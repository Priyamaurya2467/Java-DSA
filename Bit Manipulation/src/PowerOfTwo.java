public class PowerOfTwo {
    public static void main(String[] args) {
        int n = -16;
        System.out.println(isPowerOfTwo(n));
    }
    static boolean isPowerOfTwo(int n){
        int count = 0;
        while (n!=0){
            if ((n&1)==1){
                count++;
            }
            n = n>>1;
        }
        return count == 1;
    }
}
