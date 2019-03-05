import java.util.Scanner;

public class CalculatorTest {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter first number:");    
    int firstNumber = scan.nextInt();

    String continueValue = askContinue(scan);

    if (continueValue.equals("no")) {
      return;
    }

    System.out.println("Enter the sign of the mathematical operation:");
    char operation = scan.next().charAt(0);

    continueValue = askContinue(scan);

    if (continueValue.equals("no")) {
      return;
    }

    System.out.println("Enter second number:");
    int secondNumber = scan.nextInt();

    Calculator calculator = new Calculator();
    calculator.setFirstNumber(firstNumber);
    calculator.setOperation(operation);
    calculator.setSecondNumber(secondNumber);

    int result = calculator.calc();

    System.out.println(calculator.getFirstNumber() + " " + calculator.getOperation() + " " + calculator.getSecondNumber() + " = " + result);
  }

  private static String askContinue(Scanner scan) {
    String continueValue = new String();

    System.out.println("Want to continue? [yes/no]");

    while (!continueValue.equals("yes") && !continueValue.equals("no")) {
      continueValue = new String(scan.nextLine());
    }

    return continueValue;
  }
}