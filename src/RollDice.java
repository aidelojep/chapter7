import java.security.SecureRandom;

public class RollDice {
    public static void main(String[] args) {
        SecureRandom myRandom = new SecureRandom();
         int [] frequency = new int [8];

         for (int counter = 1; counter < 7_000_000; counter++)
             ++frequency[1 + myRandom.nextInt(7)];
             System.out.printf("%s%10s%n", "Face", "Frequency");

             for (int roll = 1; roll < frequency.length; roll++)
                 System.out.printf("%d%10d%n", roll, frequency[roll]);


    }
}