package org.enums;

public enum Value {
  ACE("Ace"),
  TWO("Two"),
  THREE("Three"),
  FOUR("Four"),
  FIVE("Five"),
  SIX("Six"),
  SEVEN("Seven"),
  EIGHT("Eight"),
  NINE("Nine"),
  TEN("Ten"),
  JACK("Jack"),
  QUEEN("Queen"),
  KING("King");

  private final String displayName;

  Value(String displayName) {
    this.displayName = displayName;
  }

  public String getDisplayName() {
    return this.displayName;
  }
}
