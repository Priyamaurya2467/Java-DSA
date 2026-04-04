package AUG14;



public class aug14 {
    public static void main(String[] args) {
        String num = "6339";
        System.out.println(largestGoodInteger(num));
    }

    static String largestGoodInteger(String num) {
        String p = "";
        return good(p, num);
    }

    private static String good(String p, String num) {
        if (p.length() == 3 || num.isEmpty()) {
            return p;

        }
        while (num.length() > 3) {
            Character ch = num.charAt(0);
            if (ch == num.charAt(1) && ch == num.charAt(2)) {
                return good(p + ch + num.charAt(2) + num.charAt(1), num.substring(1));
            }
            return good(p, num.substring(1));

        }
        return p;
    }
}
