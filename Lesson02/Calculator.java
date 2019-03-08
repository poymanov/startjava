public class Calculator {
    private int firstNumber;
    private char operation;
    private int secondNumber;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int calculate() {
        switch(operation) {
            case '-':
                return firstNumber - secondNumber;       
            case '*':
                return firstNumber * secondNumber;             
            case '/':
                return firstNumber / secondNumber;   
            case '%':
                return firstNumber % secondNumber;                            
            case '^':
                int result = 1;

                for(int i = 1; i <= secondNumber; i++) {
                    result *= firstNumber;
                }

                return result;          
            default:
                return firstNumber + secondNumber;     
        }
    }
}