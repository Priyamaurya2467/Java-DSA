public class find_ith_bit
{
    public static int findBit(int n , int i){
        if ((n&(1<<i)) != 0){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int n = 10110110;
        int i = 2;
        System.out.println(findBit(n , i));
    }
}
