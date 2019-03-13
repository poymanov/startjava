package com.startjava.lesson_04.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String continueValue;

        do {
            System.out.print("Enter a mathematical expression: ");
            String input = scan.nextLine();

            String[] expression = input.split(" ");

            Calculator calculator = new Calculator(expression);
            int result = calculator.calculate();

            System.out.println(calculator.getFirstNumber() + " " + calculator.getOperation() + " " + calculator.getSecondNumber() + " = " + result);

            do {
                System.out.println("Want to continue? [yes/no]");
                continueValue = scan.nextLine();
            } while (!continueValue.equals("yes") && !continueValue.equals("no"));

        } while (continueValue.equals("yes"));
    }
}