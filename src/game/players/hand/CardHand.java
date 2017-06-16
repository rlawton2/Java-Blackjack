/*
 * Created by: Ron Lawton 
 * Date: 5/16/17
 */
package game.players.hand;

import game.card.Card;
import java.util.*;

/*
 * The CardHand class represents the cards dealt to a player. 
 */
public class CardHand {
    
    private List<Card> handOfCards;        // Collection of cards dealt
    private boolean bust;                       // Bool var if card value over 21
    private int total;                          // Var to hold card value
//  Constructor to initialize the handOfCards collection    
    public CardHand() {
      this.handOfCards = new ArrayList(); 
    } 
//  Add a Card to the collection and update the total value of cards held  
    public void addToHand(Card card) {
        handOfCards.add(card);
        total += card.getValue();
    }
//  Reset all class fields   
    public void emptyHand() {
        handOfCards.clear();
        bust = false;
        total = 0;
    }
//  Set the value of the bust var if cards held have a value over 21  
    public void setHandBust(boolean b){
        bust = b;
    }
//  Return if collection of cards have a value over 21  
    public boolean getHandBust() {
        return bust;
    }
//  Returns the value of the collection of cards  
    public int handTotal() {
        return total;
    }
//  Returns the first card dealt    
    public String showFirstCard() {
        String firstCard;
        return firstCard = handOfCards.get(0).toString();
    }
//  Display the collection of cards  
    public String showHand() {
        String str = "";
        for(Card c: handOfCards)
            str = str.concat(c.toString());
        return str;
    }
}
