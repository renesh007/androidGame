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
public class Constants {
   private String[] validRanks;
   private String[] validSuits;

    public Constants(String[] validRanks, String[] validSuits) {
        this.validRanks = validRanks;
        this.validSuits = validSuits;
    }

    public Constants() {
        validRanks = new String[] {"A","1","2","3","4","5","6","7","8","9","J","Q","K"};
        validSuits = new String[] {"heart","club","diamond","spade"};
    }

    public String[] getValidRanks() {
        return validRanks;
    }

    public String[] getValidSuits() {
        return validSuits;
    }
    
    public String getValidRanks(int index) {
        if(index < validRanks.length && index >=0){
            return validRanks[index];
        }
        return "";
    }

    public String getValidSuits(int index) {
        if(index < validSuits.length && index >=0){
            return validSuits[index];
        }
        return "";
    }
   
  
   
}
