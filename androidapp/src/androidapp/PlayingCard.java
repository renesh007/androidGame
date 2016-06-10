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
public class PlayingCard extends Card {

    private String suit;
    private String rank;

    public PlayingCard() {
        super();
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

}
