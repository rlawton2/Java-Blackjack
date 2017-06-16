/*
 * Created by: Ron Lawton 
 * Date: 5/16/17
 */
package game.card;

/**
 * This enumeration will serve as the face of a playing card.
 */
public enum CardFace {ACE("Ace"), TWO("Two"), THREE("Three"), FOUR("Four"), FIVE("Five"), SIX("Six"), SEVEN("Seven"),
    EIGHT("Eight"), NINE("Nine"), TEN("Ten"), JACK("Jack"), QUEEN("Queen"), KING("King");
    private String name;

    CardFace(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }



}
