package org.jase.questions;
// Needs to import to allow arrays, enums, class HashMaps, interface Maps
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class Card {
//Sets up an enum so that constants are more efficiently processed through set choices
    public enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }
// Implements Map of an integer and its spelled out word
    private static final Map<Integer, String> CARD_NAMES = new HashMap<>(13);
// populates the Map w/ .put method
    static {
        CARD_NAMES.put(2, "Two");
        CARD_NAMES.put(3, "Three");
        CARD_NAMES.put(4, "Four");
        CARD_NAMES.put(5, "Five");
        CARD_NAMES.put(6, "Six");
        CARD_NAMES.put(7, "Seven");
        CARD_NAMES.put(8, "Eight");
        CARD_NAMES.put(9, "Nine");
        CARD_NAMES.put(10, "Ten");
        CARD_NAMES.put(11, "Jack");
        CARD_NAMES.put(12, "Queen");
        CARD_NAMES.put(13, "King");
        CARD_NAMES.put(14, "Ace");
    }
// Implements another Map for card suit and its spelled out word
    private static final Map<Suit, String> SUIT_NAMES = new HashMap<>(4);

    static {
        SUIT_NAMES.put(Suit.HEARTS, "Hearts");
        SUIT_NAMES.put(Suit.DIAMONDS, "Diamonds");
        SUIT_NAMES.put(Suit.CLUBS, "Clubs");
        SUIT_NAMES.put(Suit.SPADES, "Spades");
    }
//initializes value and suit for card name
    private int value;
    private Suit suit;
// Instantiates value and suit to differentiate between variables and method parameters
    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }
// Getter returning value from private access
    public int getValue() {
        return value;
    }
// Getter returning suit
    public Suit getSuit() {
        return suit;
    }
// Setter changing value to an instantiated value w/ thrown IllegalArgumentException checking if out of range
    public void setValue(int value) {
        if (value < 2 || value > 14)
        {
            throw new IllegalArgumentException("Unusable card value inputted.");
        }
        this.value = value;
    }
// Setter changing suit to an instantiated suit
    public void setSuit(Suit suit) {
        this.suit = suit;
    }
/* Names card by using .getOrDefault to return the String valueName "of" String suitName
 or the String value "of" value whereas there is no parallel for suit to substitute.
 .getOrDefault prevents an error if a null comes up from the key. */
    public String describe() {
        String valueName = CARD_NAMES.getOrDefault(value, String.valueOf(value));
        String suitName = SUIT_NAMES.getOrDefault(suit, "Unknown");
        return valueName + " of " + suitName;
    }
}