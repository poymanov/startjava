package com.startjava.lesson_04.game;

public class Player {
    private String name;
    private int number;
    private int[] numberVariants;

    public int[] getNumberVariants() {
        return numberVariants;
    }

    public void setNumberVariants(int[] numberVariants) {
        this.numberVariants = numberVariants;
    }

    public void addNumberVariant(int index, int numberVariant) {
        this.numberVariants[index - 1] = numberVariant;
    }

    public Player(String name) {
        this.name = name;
        numberVariants = new int[10];
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}