package com.startjava.lesson_02.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter first number:");    
            int firstNumber = scan.nextInt();  

            System.out.println("Enter the sign of the mathematical operation:");
            char operation = scan.next().charAt(0);

            System.out.println("Enter second number:");
            int secondNumber = scan.nextInt();

            Calculator calculator = new Calculator();
            calculator.setFirstNumber(firstNumber);
            calculator.setOperation(operation);
            calculator.setSecondNumber(secondNumber);

            int result = calculator.calculate();

            System.out.println(calculator.getFirstNumber() + " " + calculator.getOperation() + " " + calculator.getSecondNumber() + " = " + result);

            String continueValue = "";

            System.out.println("Want to continue? [yes/no]");

            while (!continueValue.equals("yes") && !continueValue.equals("no")) {
                continueValue = new String(scan.nextLine());
            }

            if (continueValue.equals("no")) {
                break;
            }
        }        
    }
}