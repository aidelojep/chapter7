public class ArraySum {
    public static void main(String[] args) {
        int [] array= {45,90,135,180,225,270,315};
        int total=0;

        for(int counter=0; counter < array.length; counter++) {
            total += array[counter];

        }

        System.out.printf("The total value is: %d%n ", total);
    }
}
