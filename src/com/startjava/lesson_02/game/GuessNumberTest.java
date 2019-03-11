package com.startjava.lesson_02.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("First player name is:");    
        Player firstPlayer = new Player(scan.nextLine());

        System.out.println("Second player name is:");    
        Player secondPlayer = new Player(scan.nextLine());
        
        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
        
        String continueValue = "";
                
        do {        
            game.play();            

            do {
                System.out.println("Want to continue? [yes/no]");    
                continueValue = scan.nextLine();
            } while (!continueValue.equals("yes") && !continueValue.equals("no"));

        } while (continueValue.equals("yes"));
    }
}