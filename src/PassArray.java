public class PassArray {
    public static void main(String[] args) {
            int [] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.printf("EFFECTS OF PASSING REFERENCE TO AN ENTIRE ARRAY: %n" +
                "THE VALUES OF THE ORIGINAL ARRAYS ARE: %n");
        for (int value: array )
            System.out.printf( "%d ", value);

        modifyArray(array);
        System.out.println("The values of the modified arrays are: %n");

        for (int value : array )
            System.out.printf(" %d", value);

        System.out.printf("THE EFFECTS OF PASSING ARRAY ELEMENTS VALUE: %n" + "array[3] before modifyElement:%d%n", array[5] );


        modifyElements(array[5]);
        System.out.printf("array [3] after modification: %d%n", array[3]);


    }

    private static void modifyElements(int elements) {
        elements *= 2;
        System.out.printf("The modified value of elements are:", elements);

    }

    private static void modifyArray(int[] array) {

    for (int counter =0; counter < array.length; counter++)
             array[counter] *= 2;





    int [] peter = {2,4,6,8,10,12,14,16,18,20};
        System.out.printf("EFFECTS OF PASSING REFERENCE TO AN ENTIRE ARRAY: %n" +
                "THE VALUES OF THE ORIGINAL ARRAYS ARE: %n");
        for (int value : peter)
            System.out.printf(" %d", value);

        modifyPeter(peter);
        System.out.println("The values of the modified arrays are: %n");

        for(int value : peter)
            System.out.printf(" %d", value);

        System.out.println(" ");

    }





    private static void modifyPeter(int[] peter) {
       for(int counter =0; counter < peter.length; counter++)
           peter[counter] *= 2;
    }
}