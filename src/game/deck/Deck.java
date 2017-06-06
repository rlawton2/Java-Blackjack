/*
 * Created by: Ron Lawton 
 * Date: 5/16/17
 */
package game.deck;

import game.card.CardSuit;
import game.card.CardFace;
import game.card.Card;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * The Deck class is used to interact with Card class to create a deck collection.
 * The constructor calls and instantiates each card object, adds it to the 
 * deck collection and then shuffles the deck.
 */
public class Deck {
    
    private List<Card> deck;
//  Constructor to load deck collection with Card objects    
    public Deck() {
       deck = new ArrayList();
       
       for(CardSuit cs: CardSuit.values())     
         for(CardFace cf: CardFace.values()){  
           Card card = new Card(cs, cf);
           deck.add(card);
       }
       Collections.shuffle(deck);
    }
//  The deck collection is private, method for access   
    public List<Card> getDeck(){
        return deck;
    }
//  Method to draw a card from the deck and then remove the card from the collection    
    public Card cardFromDeck() {    
        Card card = deck.get(0);   
        deck.remove(0);
        return card;
    }
}
