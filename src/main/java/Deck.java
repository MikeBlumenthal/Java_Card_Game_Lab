import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
    }

    public ArrayList getCards() {
        return cards;
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

    public void shuffle(){
        Collections.shuffle(cards);
    }
}
