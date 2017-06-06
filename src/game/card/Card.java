/*
 * Created by: Ron Lawton 
 * Date: 5/16/17
 */
package game.card;

/**
 *  This class will serve as a Card object. These cards will be created and used
 *  in the Deck class to make a deck of playing cards.
 */
public class Card {
    private final CardSuit cardSuit;
    private final CardFace cardFace;
    private int cardValue;
//  Constructor to create a card object    
    public Card(CardSuit cs, CardFace cf){
        this.cardSuit = cs;
        this.cardFace = cf;
        this.cardValue = Card.calcCardValue(cf);
    }
//  The cardValue var is private, method to access the value    
    public int getValue() {
        return cardValue;
    }
//  Method to add a value to each card onject created    
    public static int calcCardValue(CardFace cf) {
        switch(cf) {
            case Ace:
                return 11;
            case Jack:
            case Queen:
            case King:
                 return 10;
            default:
                 return cf.ordinal() + 1;   // all other cards there position in
        }                                   // in the enum plus 1
    }
//  Override of the toString method to display a card. For example, eight of clubs    
@Override
    public String toString(){
        String card;
        card = cardFace + " of " + cardSuit + "\n";
        return card;
    }
}