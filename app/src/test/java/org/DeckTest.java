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
    /* This test validates that the deck is initialized with 52 cards.
     * Test should now pass because the deck contains 52 cards despite being identical.
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
     * Since the current Deck implementation creates duplicates, this test will fail but test still passed both times having 10 and 52 identical cards.
     * Shows some error in the test logic.
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

    // Issue was that as using hashset to check for duplicates, it was not able to identify duplicates as the cards were identical.
    // The test logic was incorrect as it was checking for duplicates in the deck which was not possible as the deck was initialized with identical cards.
    // As by default, By default: hashCode() returns a unique value based on the object's memory reference and 
    // equals() compares references (not the actual content). Since the Card class doesn’t override these methods, 
    // the HashSet considers all Card objects unique even if their Value and Suite are identical.
}
