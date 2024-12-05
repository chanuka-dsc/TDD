package org;

import static org.junit.jupiter.api.Assertions.*;

import org.components.Card;
import org.components.Deck;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeckTest {

    // Test the initialization of the deck
    /* This test validates that the deck is initialized with 52 cards.
     * It checks only the total count and does not validate uniqueness.
     * WILL PASS THIS TIME AS CODE LOGIC IS CORRECT
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
     * WILL PASS THIS TIME AS CODE LOGIC IS CORRECT
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
    // Both test cases will pass this time as the code logic is correct.

    // Added more test to check code logic
        @Test
    void testDeckContainsOnlyCards() {
        Deck deck = new Deck();
        List<Card> cards = deck.getCards();

        for (Object card : cards) {
            assertTrue(card instanceof Card, "Deck contains an object that is not a Card.");
        }
    }

    // Test that the deck has the correct total number of suites
    @Test
    void testDeckContainsAllSuites() {
        Deck deck = new Deck();
        Set<Object> suites = new HashSet<>();

        for (Card card : deck.getCards()) {
            suites.add(card.getSuite());
        }

        assertEquals(4, suites.size(), "Deck does not contain all 4 suites.");
    }

    // Test that the deck has the correct total number of values
    @Test
    void testDeckContainsAllValues() {
        Deck deck = new Deck();
        Set<Object> values = new HashSet<>();

        for (Card card : deck.getCards()) {
            values.add(card.getValue());
        }

        assertEquals(13, values.size(), "Deck does not contain all 13 values.");
    }

    // Test that the deck does not contain any extra cards
    @Test
    void testDeckFailForExtraCards() {
        Deck deck = new Deck();
        assertFalse(deck.getCards().size() > 52, "Deck contains more than 52 cards, which is incorrect.");
    }

    // Test that the deck does not contain any null cards
    @Test
    void testDeckDoesNotContainNullCards() {
        Deck deck = new Deck();
        for (Card card : deck.getCards()) {
            assertNotNull(card, "Deck contains a null card, which is not allowed.");
        }
    }


}


