package com.startjava.lesson_01.game;

public class GuessNumber {

    public static void main(String[] args) {
        int computerVariant = 50;
        int userVariant = 60;

        while (computerVariant != userVariant) {
            if (userVariant > computerVariant) {
                System.out.println("The number you entered is greater than what the computer wished for");
                userVariant--;
            } else {
                System.out.println("The number you entered is less than what the computer wished for");
                userVariant++;
            }
        }

        System.out.println("You guessed it!");
    }
}