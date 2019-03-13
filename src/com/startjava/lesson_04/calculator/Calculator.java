package com.startjava.lesson_04.calculator;

public class Calculator {
    private int firstNumber;
    private char operation;
    private int secondNumber;

    public int getFirstNumber() {
        return firstNumber;
    }

    public char getOperation() {
        return operation;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public Calculator(String[] expression) {
        firstNumber = Integer.parseInt(expression[0]);
        operation = expression[1].charAt(0);
        secondNumber = Integer.parseInt(expression[2]);
    }

    public int calculate() {
        switch(operation) {
            case '+':
                return Math.addExact(firstNumber, secondNumber);
            case '-':
                return Math.subtractExact(firstNumber, secondNumber);
            case '*':
                return Math.multiplyExact(firstNumber, secondNumber);
            case '/':
                return firstNumber / secondNumber;
            case '%':
                return firstNumber % secondNumber;
            case '^':
                return (int) Math.pow(firstNumber, secondNumber);
            default:
                System.out.println("The wrong operation sign");
                return 0;
        }
    }
}