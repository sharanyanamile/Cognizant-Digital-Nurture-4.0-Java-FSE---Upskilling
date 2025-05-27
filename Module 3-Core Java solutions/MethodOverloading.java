public class MethodOverloading {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();

        // Call overloaded methods and display results
        System.out.println("Sum of two integers: " + mo.add(5, 10));
        System.out.println("Sum of two doubles: " + mo.add(4.5, 6.3));
        System.out.println("Sum of three integers: " + mo.add(1, 2, 3));
    }
}
