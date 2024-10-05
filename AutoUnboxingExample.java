import java.util.ArrayList;

public class AutoUnboxingExample {
    public static void main(String[] args) {
        // Autoboxing: Primitive to Wrapper object
        int primitiveValue = 10;
        Integer wrappedValue = primitiveValue;  // Autoboxing
        System.out.println("Wrapped value: " + wrappedValue);

        // Unboxing: Wrapper object to Primitive
        Integer wrappedNum = new Integer(50);
        int primitiveNum = wrappedNum;  // Unboxing
        System.out.println("Primitive value: " + primitiveNum);

        // Autoboxing and unboxing with ArrayList
        ArrayList<Double> list = new ArrayList<>();
        list.add(5.5);  // Autoboxing of double to Double

        double value = list.get(0);  // Unboxing of Double to double
        System.out.println("Unboxed value from ArrayList: " + value);
    }
}
