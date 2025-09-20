
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Card;

/**
 * Card model for ICE 1 
 * Modifier: SamaAledan #991741787
 * Date modified: 2025-09-17
 */

public class Card {
    // 1..13 (ACE..king)
    private int value;
    // One of SUITS
    private String suit;
    
    public static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    
    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }
    
    public int getValue() {return value;}
    public void setValue(int value) {this.value = value;}
    
    public String getSuit() {return suit;}
    public void setSuit(String suit) {this.suit = suit;}
    
    @Override
    public String toString(){
        return suit + " " + value;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card c = (Card) o;
        return value == c.value && suit.equals(c.suit);
    }
    
    @Override
    public int hashCode() {
        return 31 * value + suit.hashCode();
    }
}

