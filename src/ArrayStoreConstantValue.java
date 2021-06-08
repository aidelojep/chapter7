import jdk.swing.interop.SwingInterOpUtils;

public class ArrayStoreConstantValue {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
        int array[] = new int[ARRAY_LENGTH];
        for (int counter = 0; counter < array.length; counter++)
            array[counter] = 2 + 2 * counter;
            System.out.printf("%5s%10s%n", "Index", "Value");

            for (int roller = 0; roller < array.length; roller++) {
                System.out.printf("%5d%10d%n", roller, array[roller]);}



    }

}