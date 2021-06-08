public class DeckOfCardTest<i> {
    public static void main(String[] args) {

        DeckOfCard myDeck = new DeckOfCard();

        myDeck.shuffle();
     for (int i = 1; i <= 52; i++) {
            System.out.printf("%-19s", myDeck.dealCard());
            if (i % 4 == 0)
                System.out.println();
          }


    }

}