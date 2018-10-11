import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;
    private String name;

    public Player(String name){
        this.hand = new ArrayList<>();
        this.name = name;
    }

    public ArrayList getHand(){
        return hand;
    }

    public int getHandValue(){
        return hand.get(0).getCardValue();
    }

    public int cardCount() {
        return hand.size();
    }

    public String getName() {
        return name;
    }
}
