# War Card Game
Week 6 Java Assignment
My favorite part of this game is the ability to change the response messages to winning, losing, tying in addition to the ability to use Maps to change all-uppercase words to words only capitalized at the first letter. I also like the ability to cut the deck in two with the modulo operater in a for loop.

We'll need the array(s), enum, (Hash)Map, and .util.* imports. The arrays and (Hash)Map imports will be used to make up the cards, deck, and hand. The enum is used specifically to manipulate the suits, as there are only a set number (4) of suit choices.
*********************************************************************************************************************************************

'''
Player player1 = new Player("Jase"); // Names players to draw and battle in the war to either win or lose
        Player player2 = new Player("Adam");
        deck.shuffle(); // Uses shuffle method to randomize cards from deck file to cut the deck in half
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
'''

'''
 public enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }

'''

'''
 public void setValue(int value) {
        if (value < 2 || value > 14)
        {
            throw new IllegalArgumentException("Unusable card value inputted.");
        }
        this.value = value;
    }
'''

To contribute or for any questions, feel free to message me at the following links:

LinkedIn: www.linkedin.com/in/jasevillarreal
Email: charybdiskylla@gmail.com
