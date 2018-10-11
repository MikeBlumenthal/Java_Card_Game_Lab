import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(Rank.ACE, Suit.SPADES);
    }

    @Test
    public void cardHasRankAce(){
        assertEquals(Rank.ACE, card.getRank());
    }

    @Test
    public void cardHasSuitSpades(){
        assertEquals(Suit.SPADES, card.getSuit());
    }

    @Test
    public void aceCardHasValue14(){
        assertEquals(14, card.getCardValue());
    }

}
