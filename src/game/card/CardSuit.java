/*
 * Created by: Ron Lawton 
 * Date: 5/16/17
 */
package game.card;

/**
 * This enumeration will serve as the suit of a playing card.
 */
public enum CardSuit {DIAMONDS("Diamonds"), SPADES("Spades"), CLUBS("Clubs"), 
        HEARTS("Hearts");
    private String name;

    CardSuit(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}
