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


}