public class AreaOfFourWalls {
    public static void main(String args[]) {
        int l = 10;
        int b = 20;
        int h = 30;
        int area = 2 * h * (l + b);
        System.out.printf("Area of four walls with length %d, breadth %d and height %d is: %d%n", l, b, h, area);
    }
}
