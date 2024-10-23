package org.jase.questions;

public class App {
    public static void main(String[] args) {
        Deck deck = new Deck(); // Instantiates a deck for shuffling and drawing
        Player player1 = new Player("Jase"); // Names players to draw and battle in the war to either win or lose
        Player player2 = new Player("Adam");
        deck.shuffle(); // Uses shuffle method to randomize cards from deck file to cut the deck in half
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }
        // Prints both players names, scores, and hands w/ a blank line beforehand to separate blocks
        System.out.println();
        System.out.println(player1.describe());
        System.out.println(player2.describe());
// Sets up a draw for each side's 26 cards, using flip from Player file
        for (int i = 0; i < 26; i++) {
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();
            System.out.println(player1.getName() + " drew a " + player1Card.describe());
            System.out.println(player2.getName() + " drew a " + player2Card.describe());
            if (player1Card.getValue() > player2Card.getValue()) { // Battle i+1 ensues to increment 1 winner's score
                System.out.println(player1.getName() + " wins battle " + (i + 1));
                player1.incrementScore();
            } else if (player2Card.getValue() > player1Card.getValue()) {
                System.out.println(player2.getName() + " wins battle " + (i + 1));
                player2.incrementScore();
            } else {
                System.out.println("Battle " + (i + 1) + " was a tie, so no points to either player.");
            }
            System.out.println(player1.describe());
            System.out.println(player2.describe());
        }
        // Printing the winner or lack of winners at end
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins this war with a score of " + player1.getScore() + "!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " wins this war with a score of " + player2.getScore() + "!");
        } else {
            System.out.println("Everybody died.");
        }
    }
}
