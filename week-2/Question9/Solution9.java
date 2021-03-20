public class Solution9 {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int min = (a > b) ? b : a;
        int max = (a > b) ? a : b;
        System.out.printf("Minimum %d, Maximum %d", min, max);

    }
}
