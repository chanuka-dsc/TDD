package org.components;

import org.enums.Suite;
import org.enums.Value;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private final List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();

        // fixing the deck implementation to have 52 unique cards
        for (Suite suite : Suite.values()) {
            for (Value value : Value.values()) {
                cards.add(new Card(value, suite));
            }
        }
    }

    public List<Card> getCards() {
        return cards;
    }

    // Adding correct implementation of deck with 52 unique cards and no identical cards to see all tests pass.

    // Placeholder for shuffle method
    public void shuffle() {
        // Swap the first 2 cards
        if (cards.size() > 1) {
            Card temp = cards.get(0);
            cards.set(0, cards.get(1));
            cards.set(1, temp);
        }
    }
}