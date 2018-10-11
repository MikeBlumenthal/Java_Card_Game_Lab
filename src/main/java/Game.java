import java.util.ArrayList;

public class Game {

    private int playerCount;
    private ArrayList<Player> players;
    private Deck deck;
    private String winner;

    public Game(int playerCount){
        this.playerCount = playerCount;
        this.players = new ArrayList<>();
        this.deck = new Deck();
        this.winner = "No turns yet";
        deck.populate();
        this.populate();
//        deck.shuffle();
    }

    public void populate(){
        for (int i = 1; i <= playerCount; i++) {
            String name = "Player " + i;
            Player player = new Player(name);
            players.add(player);
        }
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void turn() {
        for (Player player : players
             ) {
            deck.dealToPlayer(player);
        }

        Player leader = players.get(0);
        for (Player player : players
             ) {
            if(player.getHandValue() > leader.getHandValue()){
                leader = player;
            }
        }
        winner = leader.getName();
    }

    public String getWinner() {
        return winner;
    }
}
