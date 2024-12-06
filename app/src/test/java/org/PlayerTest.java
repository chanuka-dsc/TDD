package org;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.components.Card;
import org.enums.Suite;
import org.enums.Value;
import org.junit.jupiter.api.Test;

import org.components.Player;

public class PlayerTest {

  @Test
  void initializationTest() {
    Player player = new Player();

    // player should have an empty hand
    assertTrue(player.getHand().size() == 0);
  }

  @Test
  void testDealCardToPlayer() {
    Player player = new Player();
    Card c = new Card(Value.ACE, Suite.SPADES);
    player.dealCard(c);

    // dealt card should be in the hand of the player
    assertTrue(player.getHand().contains(c));
    assertEquals(player.getHand().size(), 1);

    Card c2 = new Card(Value.TEN, Suite.DIAMONDS);
    player.dealCard(c2);
    assertTrue(player.getHand().contains(c2));
    assertEquals(player.getHand().size(), 2);

    Card c3 = new Card(Value.KING, Suite.CLUBS);
    player.dealCard(c3);
    assertTrue(player.getHand().contains(c3));
    assertEquals(player.getHand().size(), 3);
  }

  @Test

  void testClearHand() {
    Player player = new Player();
    Card c = new Card(Value.ACE, Suite.SPADES);
    Card c2 = new Card(Value.TEN, Suite.DIAMONDS);
    Card c3 = new Card(Value.KING, Suite.CLUBS);
    player.dealCard(c);
    player.dealCard(c2);
    player.dealCard(c3);

    assertEquals(player.getHand().size(), 3);
    player.clearHand();
    assertEquals(player.getHand().size(), 0);
  }
}
