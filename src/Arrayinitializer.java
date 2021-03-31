public class Arrayinitializer{
    public static void main(String[] args) {
        int peter [] = {0,2,4,6,8,9,10};
        System.out.printf("%5s%8s%n", "Index", "Value");

        for(int counter=0; counter< peter.length; counter++){
            System.out.printf("%4d%6d%n", counter, peter[counter]);


        }



    }
}
