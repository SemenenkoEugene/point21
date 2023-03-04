package ru.smirnov.point21.model;

public enum Index {
    TWO(2,"2"),
    THREE(3,"3"),
    FOUR(4,"4"),
    FIVE(5,"5"),
    SIX(6,"6"),
    SEVEN(7,"7"),
    EIGHT(8,"8"),
    NINE(9,"9"),
    TEN(10,"10"),
    JACK(2,"J"),
    QUEEN(3,"Q"),
    KING(4,"K"),
    ACE(11,"A");

    private final int value;
    private final String string;

    Index(int value, String string) {
        this.value = value;
        this.string = string;
    }

//    Index(int value) {
//        this.value = value;
//    }


    public String getString() {
        return string;
    }

    public int getValue() {
        return value;
    }
}
