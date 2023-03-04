package ru.smirnov.point21.model;

public enum Suit {
    CROSSES("\033[0;30m♠\033[0m"),
    HEARTS("\033[0;31m♥\033[0m"),
    DIAMONDS("\033[0;31m♦\033[0m"),
    SPADES("\033[0;30m♣\033[0m");

    private final String value;

    Suit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
