public class PatternSwitch {
    public static void main(String[] args) {
        printObjectType(42);
        printObjectType("Hello");
        printObjectType(3.14);
    }

    static void printObjectType(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("Integer: " + i);
            case String s -> System.out.println("String: " + s);
            case Double d -> System.out.println("Double: " + d);
            default -> System.out.println("Unknown type");
        }
    }
}
