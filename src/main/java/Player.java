import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;

    public Player(){
        this.hand = new ArrayList<>();
    }

    public ArrayList getHand(){
        return hand;
    }

    public int cardCount() {
        return hand.size();
    }
}
