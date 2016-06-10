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
    private ArrayList<Card> deckOfCards;

    public Deck() {
        this.deckOfCards = new ArrayList<Card>();
        
    }

    public Deck(int size) {
        this.deckOfCards = new ArrayList<Card>(); 
    }

    public ArrayList<Card> getDeckOfCards() {
        return deckOfCards;
    }

    public void setDeckOfCards(ArrayList<Card> deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

    public int getSize() {
        return deckOfCards.size();
    }

    public void addCardToEnd(PlayingCard newCard){
      deckOfCards.add(newCard);
    }
    
    public Card getCard(int index){
        return deckOfCards.get(index);
    }
    
    public Card getRandomCard(){
        int index = (int) (Math.random() * getSize());
        return getCard(index);
    }
    
    
    
    
}
