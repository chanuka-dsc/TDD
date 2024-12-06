package org.components;

import java.util.ArrayList;

public class Player {

    public ArrayList<Card> hand;

    public Player() {
        hand = new ArrayList<Card>();
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void dealCard(Card c) {
        hand.add(c);
    }

    public void clearHand() {
        hand.clear();
    }

    public void showHand() {
        for (Card c : hand) {
            c.show();;
        }
    }

}
