public class BarChartGraph {
    public static void main(String[] args) {
        int scores [] = {0,0,0,2,4,6,8,10,6,8,10,4,2,0,0,0,0,};

        System.out.println("StudentPoint");

        for(int counter =0; counter < scores.length; counter++){
            if (counter == 0)
                System.out.printf("%5d:", 100);
            else
                System.out.printf("%02d-%02d", counter * 10, counter* 10 + 9);

            for(int stars = 0; stars <=scores[counter]; stars++)

                System.out.printf("*");

                System.out.println();


        }





    }
}
