package org.components;

import org.enums.Suite;
import org.enums.Value;

public class Card {

  public Card(Value value, Suite suite) {

  }

  public boolean isHidden() {
    return true;
  }

  public void show() {

  }

  @Override
  public String toString() {
    return "Hidden";
  }
}
