package com.startjava.lesson_04.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private Scanner scan;
    private int computerNumber;
    private int currentAttempt;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        scan = new Scanner(System.in);
        currentAttempt = 0;
    }

    public void play() {
        System.out.println("Guess the number from 0 to 100");
        System.out.println("You have 10 attempts\n");

        generateComputerNumber();
        resetGameData();

        while (currentAttempt < 10 && !firstPlayer.isWinner() && !secondPlayer.isWinner()) {
            currentAttempt++;

            makeTurn();
            addPlayersNumbers();
        }

        if (!firstPlayer.isWinner() && !secondPlayer.isWinner()) {
            printAttemptsEnding();
        }

        printResults();
    }

    private void generateComputerNumber() {
        computerNumber = (int) (Math.random() * 101);
    }

    private void resetGameData() {
        currentAttempt = 0;
        firstPlayer.setDefaults();
        secondPlayer.setDefaults();
    }

    private void makeTurn() {
        checkWinner(firstPlayer);

        if (firstPlayer.isWinner()) {
            return;
        }

        checkWinner(secondPlayer);
    }

    private void checkWinner(Player player) {
        System.out.println(player.getName() + "'s number is: ");
        player.setCurrentNumber(scan.nextInt());

        if (player.getCurrentNumber() == computerNumber) {
            player.setWinner(true);
        }
    }

    private void addPlayersNumbers() {
        firstPlayer.addNumberVariant(currentAttempt);
        secondPlayer.addNumberVariant(currentAttempt);
    }

    private void printAttemptsEnding() {
        System.out.println(firstPlayer.getName() + " has run out of attempts");
        System.out.println(secondPlayer.getName() + " has run out of attempts");
    }

    private void printResults() {
        if (firstPlayer.isWinner() || secondPlayer.isWinner()) {
            if (firstPlayer.isWinner()) {
                printWinnerResult(firstPlayer);
                printPlayerNumbers(secondPlayer);
            } else {
                printWinnerResult(secondPlayer);
                printPlayerNumbers(firstPlayer);
            }

        } else {
            System.out.println("Computer number is: " + computerNumber);

            printPlayerNumbers(firstPlayer);
            printPlayerNumbers(secondPlayer);
        }
    }

    private void printWinnerResult(Player player) {
        System.out.println("The " + player.getName() + " guessed the number " + computerNumber + " with " + currentAttempt + " attempts");
    }

    private void printPlayerNumbers(Player player) {
        System.out.println(player.getName() + "'s variants are: " + Arrays.toString(player.getNumbers()));
    }
}
