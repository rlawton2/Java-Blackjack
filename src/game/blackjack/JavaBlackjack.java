/*
 * Created by: Ron Lawton 
 * Date: 5/16/17
 */
package game.blackjack;

import game.card.Card;
import game.deck.Deck;
import game.players.Dealer;
import game.players.Player;
import game.players.hand.CardHand;
import java.util.Scanner;

/**
 * This project was created to test skills in object design, inheritance, 
 * aggregation, enumerations, and collection types. The game runs in object
 * code and no UI was created for this version. 
 * 
 */
public class JavaBlackjack {
  
    private static Deck deck;               // A Deck object
    private static Player player;           // A Player object
    private static Dealer dealer;           // A Dealer object
//  Constructor to initialize all JavaBlackjack objects    
    public JavaBlackjack(){
        deck = new Deck();
        player = new Player();
        dealer = new Dealer();
    }
//  Main method
    public static void main(String[] args) {
       // This is the game loop
       boolean playGame = true;
       initializeGame();
       while(playGame){
           deal();
           playerTurn();
           dealerTurn();
           winner();
           player.getHand().emptyHand();
           dealer.getHand().emptyHand();
           playGame = playAgain();
       } 
    }
//  Instantiate a JavaBlackjack object to create deck, player, and dealer objects
//  Methods are static, no use for JavaBlackjack object    
    public static void initializeGame(){
       new JavaBlackjack(); 
    }
//  Make initial deal    
    public static void deal() {
       player.getHand().addToHand(deck.cardFromDeck());
       dealer.getHand().addToHand(deck.cardFromDeck());
       player.getHand().addToHand(deck.cardFromDeck());
       dealer.getHand().addToHand(deck.cardFromDeck());
    }
//  Method for player to either hit or stay with current hand     
    public static void playerTurn() {
       Scanner input = new Scanner(System.in);
       String option ="";
       System.out.println(player);
       System.out.println(dealer.oneCardShowing());
       do {
            System.out.println("Take a card? Y or N");
            option = input.nextLine();
            if("Y".equals(option) || "y".equals(option)) {
                cardDraw(player.getHand()); 
                checkBust(player.getHand());
                if(player.getHand().getHandBust()){
                    option = "N";
                }
            }
        }while("Y".equals(option) || "y".equals(option));
    }
//  Method for dealer to either hit or stay with current hand    
    public static void dealerTurn() {
        System.out.println(dealer);
        while(dealer.dealerDesicion() == true && !player.getHand().getHandBust()) {
            cardDraw(dealer.getHand());
            checkBust(dealer.getHand());
        }
    }
//  Draws a card for the current player. Also, checks if the deck is empty 
    public static void cardDraw(CardHand currentPlayer){
        if(deck.getDeck().isEmpty())
            deck = new Deck();
        Card newCard = deck.cardFromDeck();
        currentPlayer.addToHand(newCard);
        System.out.println("Card drawn:");
        System.out.println(newCard);
        System.out.println("New total is: " + currentPlayer.handTotal()); 
    }
//  Checks if current player has a hand total of over 21    
    public static void checkBust(CardHand currentPlayer){
        if(currentPlayer.handTotal() > 21){     
            System.out.println("BUST!\n"); 
            currentPlayer.setHandBust(true);
        }
    }
//  Determines who has the highest scores without going over 21    
    public static void winner() {
       if(player.getHand().handTotal() > dealer.getHand().handTotal() &&
               !player.getHand().getHandBust() || dealer.getHand().getHandBust())
           System.out.println("Player Wins!");
       else if(player.getHand().handTotal() < dealer.getHand().handTotal() &&
               !dealer.getHand().getHandBust() || player.getHand().getHandBust())
           System.out.println("Dealer Wins!");
       else
           System.out.println("Push!");
    }
//  Check if player wants to play another game    
    public static boolean playAgain() {
       Scanner input = new Scanner(System.in);
       System.out.println("Play again? Y or N");
       String option = input.nextLine();
       if("Y".equals(option) || "y".equals(option))
           return true;
       else
           return false;
    }
}