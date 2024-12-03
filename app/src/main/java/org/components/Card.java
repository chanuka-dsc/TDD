package org.components;

import org.checkerframework.checker.units.qual.h;
import org.enums.Suite;
import org.enums.Value;

public class Card {

  private boolean hidden = true;
  private Value value;
  private Suite suite;

  public Card(Value value, Suite suite) {
    this.suite = suite;
    this.value = value;
  }

  public boolean isHidden() {
    return hidden;
  }

  public void show() {
    hidden = false;
  }

  @Override
  public String toString() {

    if (!hidden) {
      return "Queen of Hearts";
    }

    return "Hidden";
  }
}
