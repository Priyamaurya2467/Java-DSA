public class Swap_Numbers {
    public static void main(String[] args) {
        int a = 9;
        int b = 6;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a + " " + b);
    }
}
