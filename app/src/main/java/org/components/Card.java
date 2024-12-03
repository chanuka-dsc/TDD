package org.components;

import org.enums.Suite;
import org.enums.Value;

public class Card {

  private boolean hidden = true;

  public Card(Value value, Suite suite) {

  }

  public boolean isHidden() {
    return hidden;
  }

  public void show() {
    hidden = false;
  }

  @Override
  public String toString() {
    return "Hidden";
  }
}
