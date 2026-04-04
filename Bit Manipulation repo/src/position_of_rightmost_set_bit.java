public class position_of_rightmost_set_bit {
    public static void main(String[] args) {
        int n = 18;
        System.out.println(position(n));
    }
    public static int position(int n) {
        return(n & (-n));
    }
}
