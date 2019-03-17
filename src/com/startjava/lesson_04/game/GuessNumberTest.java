package com.startjava.lesson_04.game;

import java.util.Scanner;

public class GuessNumberTest {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Player firstPlayer = createPlayer();
        Player secondPlayer = createPlayer();

        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
        start(game);
    }

    private static Player createPlayer() {
        System.out.print("Enter player name: ");
        return new Player(scan.nextLine());
    }

    private static void start(GuessNumber game) {
        String continueValue;

        do {
            game.play();

            do {
                System.out.println("Want to continue? [yes/no]");
                continueValue = scan.nextLine();
            } while (!continueValue.equals("yes") && !continueValue.equals("no"));

        } while (continueValue.equals("yes"));
    }
}