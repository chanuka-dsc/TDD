package org;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.components.Card;
import org.components.Deck;
import org.enums.Suite;
import org.enums.Value;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DeckTest {

    // Test the initialization of the deck
    /* As I run a failing test because right now the deck class doew not exist, So this test is bound to fail
     * I will create the class Deck in the components package.
     * Why I added hash set and set is to check for no duplicates in the deck,
     * getCards() method should return the list of cards in the deck.
     */
    @Test
    void testDeckInitialization() {
        // Create a deck
        Deck deck = new Deck();

        // Check that it has 52 cards
        assertEquals(52, deck.getCards().size());

        // Ensure all cards are unique
        Set<Card> uniqueCards = new HashSet<>(deck.getCards());
        assertEquals(52, uniqueCards.size());
    }
}
