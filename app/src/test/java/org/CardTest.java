package org;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CardTest {

  @Test
  void testShowCard() {

    Value value = Value.QUEEN;
    Suite suite = Suite.HEARTS;

    Card card = new Card(value, suite);

    assertEquals(card.isHidden(), true);
    assertEquals(card.toString(), "Hidden");

    card.show();
    assertEquals(card.isHidden(), false);
    assertEquals(card.toString(), "Queen of Hearts");

  }
}
