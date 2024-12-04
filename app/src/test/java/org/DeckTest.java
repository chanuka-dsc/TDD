package org;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.components.Card;
import org.components.Deck;
import org.enums.Suite;
import org.enums.Value;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class DeckTest {

    // Test the initialization of the deck
    /* As the class of deck exists now so the tests won't fail due to missing code.
     * As the getCards method is just a placeholder method and doesn't initialise with actual cards but simply return an empty list.
     * Test is bound to fail
     */
    @Test
    void testDeckInitialization() {
        // Create a deck
        Deck deck = new Deck();

        // Check that it has 52 cards
        // It will now compile but fail because the deck doesn’t have 52 cards.
        assertEquals(52, deck.getCards().size());

        // Ensure all cards are unique
        Set<Card> uniqueCards = new HashSet<>(deck.getCards());
        assertEquals(52, uniqueCards.size());
    }

    // Test to check for duplicates in the deck
    /* This test validates that there are no duplicate cards in the deck.
     * Since the current Deck implementation creates duplicates, this test will fail.
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
}
