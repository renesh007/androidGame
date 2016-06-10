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
    private CardContents contents;

    public boolean equals(Card otherCard) {
        return contents.equals(otherCard.getContents());
    }

    public Card() {
        chosen = false;
        matched = false;
        contents = new CardContents();
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

    public CardContents getContents() {
        return contents;
    }

    public void setContents(CardContents contents) {
        this.contents = contents;
    }

}
