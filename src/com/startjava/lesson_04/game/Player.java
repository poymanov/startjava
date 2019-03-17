package com.startjava.lesson_04.game;

public class Player {
    private String name;
    private int currentNumber;
    private int[] numbers;
    private boolean isWinner;

    public Player(String name) {
        this.name = name;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean isWinner) {
        this.isWinner = isWinner;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public void addNumberVariant(int index) {
        this.numbers[index - 1] = currentNumber;
    }

    public String getName() {
        return name;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        this.currentNumber = currentNumber;
    }

    public void setDefaults() {
        setWinner(false);
        setNumbers(new int[10]);
    }
}