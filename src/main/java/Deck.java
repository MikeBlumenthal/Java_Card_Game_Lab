import java.util.ArrayList;
import java.util.BitSet;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
    }

    public void populate(){
        for (Suit suit : Suit.values()
                ) {
            for (Rank rank : Rank.values()
                 ) {
                Card card = new Card(rank, suit);
                cards.add(card);
            }
        }
    }

    public ArrayList getCards() {
        return cards;
    }
}
