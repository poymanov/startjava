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
    }

    public void play() {
        System.out.println("Guess the number from 0 to 100");
        System.out.println("You have 10 attempts\n");

        generateComputerNumber();
        initGame();

        do {
            currentAttempt++;
            makeTurn();
        } while (isMakeTurn());

        printResults();
    }

    private void generateComputerNumber() {
        computerNumber = (int) (Math.random() * 101);
    }

    private void initGame() {
        currentAttempt = 0;
        firstPlayer.setDefaults(0);
        secondPlayer.setDefaults(0);
    }

    private void makeTurn() {
        if (checkWinner(firstPlayer)) {
            return;
        }

        checkWinner(secondPlayer);
    }

    private boolean isMakeTurn() {
        return currentAttempt < 10 && !firstPlayer.isWinner() && !secondPlayer.isWinner();
    }

    private boolean checkWinner(Player player) {
        System.out.println(player.getName() + "'s number is: ");
        player.setCurrentNumber(scan.nextInt(), currentAttempt);

        if (player.getCurrentNumber() == computerNumber) {
            player.setWinner(true);
            return true;
        }

        return false;
    }

    private void printResults() {
        if (firstPlayer.isWinner()) {
            printWinnerResult(firstPlayer);
            printPlayerNumbers(secondPlayer);
        } else if (secondPlayer.isWinner()) {
            printWinnerResult(secondPlayer);
            printPlayerNumbers(firstPlayer);
        } else {
            printAttemptsEnding();
            printComputerNumber();
            printPlayerNumbers(firstPlayer);
            printPlayerNumbers(secondPlayer);
        }
    }

    private void printWinnerResult(Player player) {
        System.out.println("The " + player.getName() + " guessed the number " + computerNumber + " with " + currentAttempt + " attempts");
    }

    private void printPlayerNumbers(Player player) {
        System.out.println(player.getName() + "'s variants are: " + Arrays.toString(player.getNumbers(currentAttempt)));
    }

    private void printAttemptsEnding() {
        System.out.println(firstPlayer.getName() + " has run out of attempts");
        System.out.println(secondPlayer.getName() + " has run out of attempts\n");
    }

    private void printComputerNumber() {
        System.out.println("Computer number is: " + computerNumber);
    }
}
