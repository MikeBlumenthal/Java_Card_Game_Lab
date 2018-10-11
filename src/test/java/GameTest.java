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
}
