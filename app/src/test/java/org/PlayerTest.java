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
  }
}
