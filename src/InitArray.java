public class InitArray {
    public static void main(String[] args) {
      int array [] = new int[10];
      System.out.printf("%5s%5s%n", "Index ", "Values");
     for (int counter=0; counter< array.length; counter++ ){
         System.out.printf("%4d%6d%n", counter, array[counter]);
     }

        }

    }

