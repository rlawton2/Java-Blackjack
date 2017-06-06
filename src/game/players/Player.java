/*
 * Created by: Ron Lawton 
 * Date: 5/16/17
 */
package game.players;

import game.players.hand.CardHand;
/*
 * Player class inherits from the Players class hand and name fields.
*/
public class Player extends Players{
//  Instantiate a player object    
    public Player() {
        this.hand = new CardHand();
        this.name = "Player";
    }
}
