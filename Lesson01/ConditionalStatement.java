public class ConditionalStatement {

    public static void main(String[] args) {
        int age = 25;
        boolean isMale = true;
        int height = 2;
        char nameFirstChar = 'J';

        if (age > 20) {
            System.out.println("You are over 20 years old");
        }

        if (isMale) {
            System.out.println("You're a man");
        }

        if (!isMale) {
            System.out.println("You're a woman");
        }

        if (height < 1.80) {
            System.out.println("You're short");
        } else {
            System.out.println("You're high");
        }

        if (nameFirstChar == 'T') {
            System.out.println("Your name is not Tom");
        } else if (nameFirstChar == 'B') {
            System.out.println("Your name is not Bill");
        } else {
            System.out.println("Your name is unknown to us");
        } 
    }
}