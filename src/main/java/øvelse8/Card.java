package øvelse8;

public class Card {
    private String suit;
    private int value;

    public Card(String suit, int value){
        if(suit.equalsIgnoreCase("hearts") || suit.equalsIgnoreCase("diamonds")
        || suit.equalsIgnoreCase("clubs") ||suit.equalsIgnoreCase("spades")){
            this.suit = suit;
        }else this.suit = "hearts";

        if(value > 0 && value < 14){
            this.value = value;
        }else this.value = 1;
    }

    public boolean beats(Card card){
        return this.value < card.value;
    }

    public boolean beatsSuit(Card card){
        if(suit.equalsIgnoreCase("hearts") && card.suit.equalsIgnoreCase("spades") ||
        suit.equalsIgnoreCase("diamonds") && card.suit.equalsIgnoreCase("hearts") ||
        suit.equalsIgnoreCase("clubs") && card.suit.equalsIgnoreCase("diamonds") ||
        suit.equalsIgnoreCase("spades") && card.suit.equalsIgnoreCase("clubs")){
            return true;
        }

        return beats(card);
    }

    public String toString(){
        return suit + " : " + value;
    }
}
