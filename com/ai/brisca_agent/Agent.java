package com.ai.brisca_agent;

import com.ai.brisca_agent.entities.Card;
import sun.reflect.generics.tree.Tree;

import javax.swing.tree.TreeNode;

/**
 *
 */
public class Agent {
    public Card selectedPlay(String triunfo, Card[] myCards, Card[] tableCards) {
        //TODO


        Card selectedCard=null;
        return selectedCard ;


    }
   public void maxValue(Card[] myCards, Card[] otherPlayerCards) {
		// TODO
		int value = fetchMaxValue(myCards);
		int opponentValue = fetchMaxValue(otherPlayerCards);
	}

	/**
	 * Retrieves the highest value card in a collection of Card objects.
	 * 
	 * @param cards
	 *            The array of cards to search.
	 * @return The highest value card in the collection.
	 */
	private int fetchMaxValue(Card[] cards) {
		// Stores the card with the highest value.
		int max = cards[0].getValue();
		// Loop through all cards and replace max with the highest value card.
		for (int i = 1; i < cards.length; i++) {
			if (cards[i].getValue() > max) {
				max = cards[i].getValue();
			}
		}
		return max;
	}
    public void minValue(){
        //TODO
    }
    private void createTree(){

    }
}
