//Malia Moreno | 18 December 2024//
package com.mycompany.unit4test;
import java.util.ArrayList;
//imported for an array list//
import java.util.List;
import java.util.Random;

public class Unit4Test {

    public static void main(String[] args) {
        //make an array for the card list//
        List<Card> cardList = new ArrayList<Card>();
        //List<int> greatValArr = new ArrayList<int>();
        
        //general variables//
        int greatVal = 0;
        //int[] greatValArr = {};
        
        //instantiate 5 cards//
        for(int i=0; i<5; i++){
            cardList.add(new Card());
        }
        
        //cardList.get(0).getVal();
        //print suit and value of each card and indicated which card has the highest value//
        for(int i=0; i<5; i++){
            System.out.println("Card "+i+"\t"+cardList.get(i).getVal()+" of "+cardList.get(i).getFace());
            
            //check which  card has the highest value//
            for(int j=0; j<5; j++){
                if(Integer.parseInt(cardList.get(i).getVal())>Integer.parseInt(cardList.get(j).getVal())){
                    greatVal = i;
                }
            }
        }
        
        System.out.print("\nGreatest Cards: \t");
        //print out all cards with the greates Value//
        for(int i=0; i<5; i++){
            if(Integer.parseInt(cardList.get(i).getVal()) == Integer.parseInt(cardList.get(greatVal).getVal())){
                System.out.print(cardList.get(i).getVal()+" of "+cardList.get(i).getFace()+" \t ");
            }
        }
        
        
        //System.out.println(cardList.get(greatVal).getVal());
    }
}

class Card{
    //make arrays for face//
    String[] faceArr = {"clubs", "diamonds", "hearts", "spades"};
    final int valMax = 13;
    Random rand = new Random();
    
    //make global usable values in Class "Card"//
    String face;
    String val;
    
    //make constructor//
    public Card(){
        //setting random face//
        int randFace = rand.nextInt(0,4);
        face = faceArr[randFace];
        
        //setting random value//
        val = Integer.toString(rand.nextInt(1,14));
    }
    
    public String getFace(){
        return face;
    }
    public String getVal(){
        return val;
    }

}
