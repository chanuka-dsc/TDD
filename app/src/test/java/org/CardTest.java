package org;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.enums.Suite;
import org.junit.jupiter.api.Test;

public class CardTest {

  @Test
  void testSuiteEnum() {
    Suite suite = Suite.HEARTS;
    assertEquals(suite.getDisplayName(), "Hearts");
  }

  @Test
  void testValueEnum() {
    Value value = Value.JACK;
    assertEquals(suite.getDisplayName(), "Jack");
  }

  // @Test
  // void testShowCard() {

  // Suite suite = Suite.HEARTS;
  // Value value = Value.QUEEN;

  // Card card = new Card(value, suite);

  // assertEquals(card.isHidden(), true);
  // assertEquals(card.toString(), "Hidden");

  // card.show();
  // assertEquals(card.isHidden(), false);
  // assertEquals(card.toString(), "Queen of Hearts");

  // }
}
