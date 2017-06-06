/*
 * Created by: Ron Lawton 
 * Date: 5/16/17
 */
package game.players;

import game.players.hand.CardHand;

/**
 *  The Players class represents all the players of a blackjack game
 */
public class Players {
    
    CardHand hand;                      // Card hand held by that player
    String name;                        // Var to hold name of player or type
//  Provides acces to the hand held by player    
    public CardHand getHand() {
        return this.hand;
    }
//  Override of toString method to display the card held held by player and the 
//  total value of those cards    
    @Override
    public String toString() {
        String str = this.name + " hand is:\n" + hand.showHand() +
                this.name + " total is : " + hand.handTotal() + "\n";
        return str;
    }
}
