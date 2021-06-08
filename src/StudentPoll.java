public class StudentPoll {
    public static void main(String[] args) {
        int [] responses = {2, 4, 6, 8, 10, 9, 14, 8, 6, 9};
          int [] frequency = new int [10];

              for (int counter=0; counter< responses.length; counter++ )
              {
                  try {
                      ++frequency[responses[counter]];
                  }
                  catch (ArrayIndexOutOfBoundsException e) {
                      System.out.println(e);
                      System.out.printf(" responses[%d] = %d%n%n", counter, responses[counter]);
                  }
              }
        System.out.printf("%s%10s%n ", " Rating", "Frequency");
              for(int rating=0; rating< frequency.length; rating++){
                  System.out.printf("%6d%10d%n ",rating, frequency[rating]);

              }

    }
}
