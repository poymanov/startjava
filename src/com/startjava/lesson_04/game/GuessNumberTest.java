package com.startjava.lesson_04.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Player firstPlayer = createPlayer(scan);
        Player secondPlayer = createPlayer(scan);

        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);

        String continueValue;

        do {
            game.play();

            do {
                System.out.println("Want to continue? [yes/no]");
                continueValue = scan.nextLine();
            } while (!continueValue.equals("yes") && !continueValue.equals("no"));

        } while (continueValue.equals("yes"));
    }

    private static Player createPlayer(Scanner scan) {
        System.out.print("Enter player name: ");
        return new Player(scan.nextLine());
    }
}