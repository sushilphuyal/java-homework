public class IIC {
    static float bonus = 0.15f;
    static int salary = 20000;
    static int year_of_service = 50;
    static float net_bonus = (year_of_service > 5) ? salary * bonus : 0;

    public static void main(String args[]) {
        System.out.println("Bonus amount: " + net_bonus);
    }
}
