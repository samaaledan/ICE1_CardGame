package Card;

import java.util.Random;

public class CardTrick {

    public static void main(String[] args) {
        Random rand = new Random();

        // 1) Create a hand of 7 random cards
        Card[] hand = new Card[7];
        for (int i = 0; i < hand.length; i++) {
            int value = 1 + rand.nextInt(13); // 1..13
            String suit = Card.SUITS[rand.nextInt(Card.SUITS.length)];
            hand[i] = new Card(value, suit);
        }

        // 2) Print the hand
        System.out.println("Your magic hand of cards:");
        for (Card c : hand) {
            System.out.println(c);
        }

        // 3) Hard-coded lucky card
        Card luckyCard = new Card(2, "Spades");

        // 4) Check if lucky card is in the hand
        boolean found = false;
        for (Card c : hand) {
            if (c.equals(luckyCard)) {
                found = true;
                break;
            }
        }

        // 5) Print result
        System.out.println();
        if (found) {
            System.out.println("Winner! Your lucky card (" + luckyCard + ") is in the magic hand.");
        } else {
            System.out.println("Sorry, your lucky card (" + luckyCard + ") is NOT in the magic hand.");
        }

        System.out.println("ICE1 -- Sama Aledan");
    }
}
