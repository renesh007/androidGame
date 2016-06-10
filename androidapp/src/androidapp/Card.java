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
public class Card {

    private boolean chosen;
    private boolean matched;
    private String contents;

    public boolean equals(Card otherCard) {
        return contents.equalsIgnoreCase(otherCard.getContents());
    }

    public Card() {
        chosen = false;
        matched = false;
        contents = "";
    }

    public boolean isChosen() {
        return chosen;
    }

    public void setChosen(boolean chosen) {
        this.chosen = chosen;
    }

    public boolean isMatched() {
        return matched;
    }

    public void setMatched(boolean matched) {
        this.matched = matched;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

}
