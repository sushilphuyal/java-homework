public class BhatBhateni {
    static int quantity = 10;
    static int price = quantity * 100;
    static float discount = 0.1f;
    static float discounted_price = price * (1 - discount);

    public static void main(String args[]) {
        if (price > 900)
            System.out.println("Total cost: " + discounted_price);
        else
            System.out.println("Total cost: " + price);

    }
}
