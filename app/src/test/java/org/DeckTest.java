package org;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.components.Card;
import org.components.Deck;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class DeckTest {

    // Test the initialization of the deck
    /* This test validates that the deck is initialized with 52 cards.
     * It checks only the total count and does not validate uniqueness.
     */
    @Test
    void testDeckInitialization() {
        // Create a deck
        Deck deck = new Deck();

        // Check that it has 52 cards
        assertEquals(52, deck.getCards().size(), "Deck should contain exactly 52 cards.");
    }

    // Test to check for duplicates in the deck
    /* This test validates that there are no duplicate cards in the deck.
     * It will fail because the current implementation produces 52 identical cards.
     */
    @Test
    void testDeckHasNoDuplicates() {
        // Create a deck
        Deck deck = new Deck();

        // Check for duplicates
        Set<Card> uniqueCards = new HashSet<>(deck.getCards());

        // Assert that the number of unique cards matches the total number of cards
        assertEquals(deck.getCards().size(), uniqueCards.size(), "Deck contains duplicate cards!");
    }
    // Test of initialise deck with 52 cards pass as there are 52 identoical cards still 52 cards, but identical cards test fail as there are identical cards present.
}
