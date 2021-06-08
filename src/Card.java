public class Card {
    private final String face;
    private final String name;

    public Card ( String cardFace, String cardName ) {
        this.face = cardFace;
        this.name = cardName;
    }

    public String toString() {

        return face +  "  " + name;
    }

    public static void main(String[] args) {
        Card card = new Card("Peter", "Aideloje" );
        System.out.println(card);
    }


    }

