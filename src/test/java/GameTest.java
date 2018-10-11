import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Game game;

    @Before
    public void before(){
        game = new Game(2);
    }

    @Test
    public void hasPlayers(){
        assertEquals(2, game.getPlayerCount());
        assertEquals(2, game.getPlayers().size());
    }

    @Test
    public void playersHaveCards(){
        game.turn();
        assertEquals(1, game.getPlayers().get(0).cardCount());
        assertEquals(1, game.getPlayers().get(1).cardCount());
    }
}
