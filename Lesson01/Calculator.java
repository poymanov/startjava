public class Calculator {

    public static void main(String[] args) {
        int number1 = 2;
        int number2 = 3;
        int result = 0;
        char operation = '^';

        if (operation == '+') {
            result = number1 + number2;
        } else if (operation == '-') {
            result = number1 - number2;
        } else if (operation == '*') {
            result = number1 * number2;
        } else if (operation == '/') {
            result = number1 / number2;
        } else if (operation == '^') {        
            result = 1;
            for(int i = 1; i <= number2; i++) {
                result = result * number1;
            }           
        } else if (operation == '%') {        
            result = number1 % number2;
        }

        System.out.println(number1 + " " + operation + " " + number2 + " = " + result);
    }
}