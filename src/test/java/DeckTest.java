import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void deckExists(){
        assertEquals(0, deck.getCards().size());
    }

    @Test
    public void deckPopulates(){
        deck.populate();
        assertEquals(52, deck.getCards().size());
    }

//    @Test
//    public void shuffleTest(){
//        deck.populate();
//        deck.shuffle();
//    }

    @Test
    public void dealDeckLoses1Card(){
        deck.populate();
        deck.deal();
        assertEquals(51, deck.getCards().size());
    }

    @Test
    public void dealGives2Hearts(){
        deck.populate();
        Card card = deck.deal();
        assertEquals(Rank.TWO, card.getRank());
        assertEquals(Suit.HEARTS, card.getSuit());
    }
}
