package com.startjava.lesson_02.game;

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
        generateComputerNumber();
        boolean endGame = false;
        Scanner scan = new Scanner(System.in);

        while (!endGame) {
            endGame = makeTurn(scan);
        }

        printNumbers();
        printWinner();
    }

    private void generateComputerNumber() {
        computerNumber = (int) (Math.random() * 101);
    }

    private boolean makeTurn(Scanner scan) {        
        System.out.println(firstPlayer.getName() + "'s number is:");
        firstPlayer.setNumber(scan.nextInt());

        if (firstPlayer.getNumber() == computerNumber) {
            return true;
        }

        System.out.println(secondPlayer.getName() + "'s number is:");
        secondPlayer.setNumber(scan.nextInt());

        if (secondPlayer.getNumber() == computerNumber) {
            return true;
        }

        System.out.println("No one has guessed the number");

        return false;
    }

    private void printNumbers() {
        System.out.println("Computer number is: " + computerNumber);
        System.out.println(firstPlayer.getName() + "'s number is: " + firstPlayer.getNumber());
        System.out.println(secondPlayer.getName() + "'s number is: " + secondPlayer.getNumber());
    }

    private void printWinner() {
        String winnerName = "";

        if (firstPlayer.getNumber() == computerNumber) {
            winnerName = firstPlayer.getName();  
        } else if (secondPlayer.getNumber() == computerNumber) {
            winnerName = secondPlayer.getName();
        }   

        System.out.println(winnerName + " wins!");     
    }
}
