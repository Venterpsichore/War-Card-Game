package org.jase.questions;

import java.util.ArrayList;
import java.util.List;
// Sets up hand and name for the player to
public class Player {
    private int score = 0; // Initializes score to be incremented by
    private String name;
    private List<Card> hand = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
// Traversing card over hand array for each player's cards, needing to declare card for the .describe() method
    public String describe() {
        List<String> descriptions = new ArrayList<>();
        for (Card card : hand) {
            descriptions.add(card.describe());
        }
        // Returning the winner and their score w/ remaining cards
        return "Name: " + name
                + "\nScore: " + score
                + "\nHand (" + descriptions.size() + " cards):\n" + String.join( "\n", descriptions)
                + "\n";
    }
// Sets up flip method to be used in App file
    public Card flip() {
        return hand.removeFirst();
    }
// Adds the drawn cards to hands
    public void draw(Deck deck) {
        hand.add(deck.draw());
    }
// Increments score one per call for each win, putting towards tally for war
    public void incrementScore() {
        score++;
    }
}
