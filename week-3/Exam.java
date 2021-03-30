public class Exam {
    static float total_class_held = 100;
    static float attend_class = 75;
    static float attend_class_perc = attend_class / total_class_held;

    public static void main(String args[]) {
        if (attend_class_perc < 0.75f) {
            System.out.println("Student is not allowed to attend exam");
        } else {
            System.out.println("Student is allowed to attend exam");

        }
    }
}
