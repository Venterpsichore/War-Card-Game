package org.jase.questions;
// Imports .Card.Suit to curtail Suit.values
import java.util.*;
import org.jase.questions.Card.Suit;

public class Deck {
// Creates an array to be called upon
    private final List<Card> cards = new ArrayList<>();
// Populates array w/ each suit for 2 to ace values
    public Deck() {
        for (Suit suit : Suit.values()) {
            for (int i = 2; i < 15; i++) {
                cards.add(new Card(i, suit));
            }
        }
    }
    public Card draw() { // Uses .removeFirst() method to set up draw card ability
        return cards.removeFirst();
    }
// Uses .shuffle() method again
    public void shuffle() {
        Collections.shuffle(cards);
    }
}
