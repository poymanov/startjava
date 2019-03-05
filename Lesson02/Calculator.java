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

	public int calc() {
		int result = 0;

		switch(operation) {
			case '+':
				result = firstNumber + secondNumber; 
				break;
			case '-':
				result = firstNumber - secondNumber; 
				break;				
			case '*':
				result = firstNumber * secondNumber; 
				break;								
			case '/':
				result = firstNumber / secondNumber; 
				break;		
			case '%':
				result = firstNumber % secondNumber; 
				break;														
			case '^':
				result = 1;

        for(int i = 1; i <= secondNumber; i++) {
            result *= firstNumber;
        }          
				break;								
		}

		return result;
	}
}