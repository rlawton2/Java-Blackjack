/*
 * Created by: Ron Lawton 
 * Date: 5/16/17
 */
package game.players;

import game.players.hand.CardHand;
/*
 * Dealer class inherits from the Players class hand and name fields.
*/
public class Dealer extends Players{
    
    private boolean desicion;
//  Instantiate a dealer object   
    public Dealer() {
        this.hand = new CardHand();
        this.name = "Dealer";
    }
//  Display the first card delt to dealer 
    public String oneCardShowing() {
        String str = name + " showing " + hand.showFirstCard();
        return str;
    }
//  Decides if dealer will hit or stay with current hand    
    public boolean dealerDesicion(){
        if(hand.handTotal() >= 18)
            desicion = false;
        else
            desicion = true;
        return desicion;
    }
}