package com.startjava.lesson_04.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private int computerNumber;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void play() {
        System.out.println("Guess the number from 0 to 100");
        System.out.println("You have 10 attempts");
        System.out.println();

        generateComputerNumber();

        resetPlayersVariants();

        Scanner scan = new Scanner(System.in);

        int currentAttempt = 0;
        Player winner = null;

        while (currentAttempt < 10) {
            currentAttempt++;

            winner = makeTurn(scan, currentAttempt);

            if (winner != null) {
                break;
            }
        }

        if (winner == null) {
            printAttemptsEnding();
        }

        printResults(winner, currentAttempt);
    }

    private void generateComputerNumber() {
        computerNumber = (int) (Math.random() * 101);
    }

    private Player makeTurn(Scanner scan, int attempt) {
        addPlayerVariant(scan, firstPlayer, attempt);

        if (firstPlayer.getNumber() == computerNumber) {
            return firstPlayer;
        }

        addPlayerVariant(scan, secondPlayer, attempt);

        if (secondPlayer.getNumber() == computerNumber) {
            return secondPlayer;
        };

        return null;
    }

    private void printResults(Player winner, int winnerAttempt) {
        if (winner == null) {
            System.out.println("Computer number is: " + computerNumber);

            printPlayerNumbers(firstPlayer);
            printPlayerNumbers(secondPlayer);
        } else {
            System.out.println("The " + winner.getName() + " guessed the number " + computerNumber + " with " + winnerAttempt + " attempts");

            if (winner == firstPlayer) {
                printPlayerNumbers(secondPlayer);
            } else if (winner == secondPlayer) {
                printPlayerNumbers(firstPlayer);
            }
        }
    }

    private void printPlayerNumbers(Player player) {
        System.out.println(player.getName() + "'s variants are: " + Arrays.toString(player.getNumberVariants()));
    }

    private void printAttemptsEnding() {
        System.out.println(firstPlayer.getName() + " has run out of attempts");
        System.out.println(secondPlayer.getName() + " has run out of attempts");
    }

    private void addPlayerVariant(Scanner scan, Player player, int attempt) {
        System.out.println(player.getName() + "'s number is: ");
        int playerNumber = scan.nextInt();
        player.setNumber(playerNumber);
        player.addNumberVariant(attempt, playerNumber);
    }

    private void resetPlayersVariants() {
        firstPlayer.setNumberVariants(new int[10]);
        secondPlayer.setNumberVariants(new int[10]);
    }
}
