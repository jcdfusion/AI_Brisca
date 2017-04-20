package com.ai.brisca_agent;

import com.ai.brisca_agent.entities.Card;

import java.util.ArrayList;

/**
 * Created by ale_v on 4/20/2017.
 */
public class ActualPlay {
    private Card highestCard = null;

    public ActualPlay(String triunfo, Card[] tableCards) {
        ArrayList<Card> triunfoCards = new ArrayList<>();
        for (Card c : tableCards) {
            if (c.getSuit().equalsIgnoreCase(triunfo))
                triunfoCards.add(c);
        }
        int value = 0;
        if (!triunfoCards.isEmpty()) {
            for (Card c : triunfoCards)
                if (c.getValue() >= value) {
                    value = c.getValue();
                    highestCard = c;
                }
        } else {
            for (Card c : tableCards) {
                if (c.getValue() >= value) {
                    value = c.getValue();
                    highestCard = c;
                }
            }
        }
    }
    public Card highestCard(){
        return highestCard;
    }
}
