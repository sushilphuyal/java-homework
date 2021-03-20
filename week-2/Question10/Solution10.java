public class Solution10 {
    static int a = 20; // static variable
    int b = 30; // instance variable

    public static void main(String args[]) {
        int c = 40; // local variable
        Solution10 obj = new Solution10(); // instance of class
        System.out.println("Static variable value " + Solution10.a); // Static variable can be called without creating
                                                                     // instances of class

        System.out.println("Instance variable value " + obj.b); // instance variable can only be access from instance of
                                                                // class
        System.out.println("Local variable value " + c); // local variable can be only accessed inside the same method

    }
}
