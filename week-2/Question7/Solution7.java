public class Solution7 {
    public static void main(String args[]) {
        int m = 39;
        m++; // post increment 40
        --m; // pre decrement 39
        int x = m++; // 39
        int y = --m; // 39
        System.out.println(m++); // 39
        System.out.println(m); // 40
        System.out.println(x); // 39
        System.out.println(y); // 39
    }
}
