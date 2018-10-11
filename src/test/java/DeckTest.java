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
}
