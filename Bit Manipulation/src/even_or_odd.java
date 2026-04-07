public class even_or_odd {

    public static boolean isOdd(int n){
        if ((n&1)==1){
            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(isOdd(n));
    }
}
