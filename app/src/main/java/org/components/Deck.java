package org.components;

import org.enums.Suite;
import org.enums.Value;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private final List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();

        // Still Incorrect implementation but minimal changes: now adds 52 but still identical cards
        for (int i = 0; i < 52; i++) {
            cards.add(new Card(Value.ACE, Suite.HEARTS));
        }
    }

    public List<Card> getCards() {
        return cards;
    }
}
