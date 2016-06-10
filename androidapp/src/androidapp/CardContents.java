/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package androidapp;

/**
 *
 * @author ReneshN
 */
public class CardContents {

    private String suit;
    private String rank;

    public CardContents() {
        suit = "";
        rank = "";
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public boolean equals(CardContents otherCardContents) {
        if (otherCardContents.rank.equalsIgnoreCase(rank) && otherCardContents.suit.equalsIgnoreCase(suit)) {
            return true;
        }
        return false;
    }

    public boolean equalRank(String rank) {
        return this.rank.equalsIgnoreCase(rank);
    }

    public boolean equalSuit(String suit) {
        return this.suit.equalsIgnoreCase(suit);
    }
}
