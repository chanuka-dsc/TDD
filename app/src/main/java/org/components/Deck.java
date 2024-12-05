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

    // Now making the shuffle method to swap every second card with the card that comes after it (if possible).
    public void shuffle() {
        for (int i = 0; i < cards.size(); i++) {
            // Generate a random index to swap with
            int swapIndex = (int) (Math.random() * cards.size());
            Card temp = cards.get(i);
            cards.set(i, cards.get(swapIndex));
            cards.set(swapIndex, temp);
        }
    }
}
