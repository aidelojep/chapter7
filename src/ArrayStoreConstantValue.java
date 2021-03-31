import jdk.swing.interop.SwingInterOpUtils;

public class ArrayStoreConstantValue{
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
      int array [] = new int [ARRAY_LENGTH];
      for(int counter=0; counter< array.length; counter++) {
          array[counter] = 2 + 2 * counter;
          System.out.printf("%s%5s%n", "Index", "Value");

          for(int roller=0; roller< array.length; roller++){
              System.out.printf("%d%5d%n", counter, array[counter]);

          }
      }






    }
}
