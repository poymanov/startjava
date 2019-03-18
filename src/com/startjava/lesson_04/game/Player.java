package com.startjava.lesson_04.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int currentNumber;
    private int[] numbers;
    private boolean isWinner;

    public Player(String name) {
        this.name = name;
        numbers = new int[10];
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean isWinner) {
        this.isWinner = isWinner;
    }

    public int[] getNumbers(int index) {
        return Arrays.copyOf(numbers, index);
    }

    public String getName() {
        return name;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber, int index) {
        this.currentNumber = currentNumber;
        this.numbers[index - 1] = currentNumber;
    }

    public void setDefaults(int index) {
        setWinner(false);
        Arrays.fill(numbers, 0, index, 0);
    }
}