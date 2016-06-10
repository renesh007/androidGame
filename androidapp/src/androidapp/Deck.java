/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package androidapp;

import java.util.ArrayList;

/**
 *
 * @author ReneshN
 */
public class Deck {
    private ArrayList<PlayingCard> deckOfCards;

    public Deck() {
        this.deckOfCards = new ArrayList<PlayingCard>();
        
    }

    public Deck(int size) {
        this.deckOfCards = new ArrayList<PlayingCard>(); 
    }

    public ArrayList<PlayingCard> getDeckOfCards() {
        return deckOfCards;
    }

    public void setDeckOfCards(ArrayList<PlayingCard> deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

    public int getSize() {
        return deckOfCards.size();
    }

    public void addCardToEnd(PlayingCard newCard){
      deckOfCards.add(newCard);
    }
    
    public PlayingCard getCard(int index){
        return deckOfCards.get(index);
    }
    
    public PlayingCard getRandomCard(){
        int index = (int) (Math.random() * getSize());
        return getCard(index);
    }
    
    
    
    
}
