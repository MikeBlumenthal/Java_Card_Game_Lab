import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Deck deck;
    Player player;

    @Before
    public void before(){
        deck = new Deck();
        player = new Player("Player 1");
    }

    @Test
    public void playerReceivesCard(){
        deck.populate();
        deck.dealToPlayer(player);
        assertEquals(1, player.cardCount());
    }
}
