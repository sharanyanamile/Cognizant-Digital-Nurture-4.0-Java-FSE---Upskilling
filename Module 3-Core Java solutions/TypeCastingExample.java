public class TypeCastingExample {
    public static void main(String[] args) {
        double d = 9.78;
        int i = (int) d; // Explicit casting

        int x = 7;
        double y = x; // Implicit casting

        System.out.println("Double to Int: " + i);
        System.out.println("Int to Double: " + y);
    }
}
