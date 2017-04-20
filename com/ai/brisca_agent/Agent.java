package com.ai.brisca_agent;

import com.ai.brisca_agent.entities.Card;

/**
 *
 */
public class Agent {
    public Card selectedPlay(String triunfo, Card[] myCards, Card[] tableCards) {
        ActualPlay ply = new ActualPlay(triunfo,tableCards);
        Card highest = ply.highestCard();
        //TODO


        Card selectedCard=null;
        return selectedCard ;


    }
    public void maxValue(){
        //TODO
    }
    public void minValue(){
        //TODO
    }
}