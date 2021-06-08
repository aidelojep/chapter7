public class SchBoyPoll {
    public static void main(String[] args) {

        int [] responses = {2, 4, 6, 8, 10, 12,14,16,18, 20, 24, 26, 28, 30 };
        int frequency [] = new int[20];

       for(int answers = 0; answers < responses.length; answers++){
           try{
              ++frequency[responses[answers]];
           }
           catch (ArrayIndexOutOfBoundsException e){
               System.out.println(e);
               System.out.printf( " responses[%d] = %d%n%n", answers, responses[answers]);
           }

       }
        System.out.printf("%s%5s%n", "Ratings\t", "Frequency" );

       for(int ratings =1; ratings < frequency.length; ratings++){

           System.out.printf("%6d%5d%n", ratings, frequency[ratings]);
       }

    }
}
