public class WorkshopThree {
    public static void main(String[] args) {
        byte b = 3;
        int i = 0;
        switch (b) {
        case 3 | 4:
            i = i + 4; // line n1
        case 2 | 3:
            i = i + 2;
        }
        System.out.println(i);

    }
}
