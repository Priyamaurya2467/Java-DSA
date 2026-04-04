
public class evenDigits {
    public static void main(String[] args) {


        int[] arr = {18, 124, 9, 1764, 98, 1};
        System.out.println(search(arr));

    }
    static int search(int[] arr) {
        int even = 0;
        for (int k : arr) {
            int j = count(k);
            if (j % 2 == 0) {
                even++;
            }

        }
        return even;
    }
    static int count(int num) {
        int count = 0;
        while (num != 0) {

            count++;
            num /= 10;

        }
        return count;
    }
}
