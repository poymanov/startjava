public class GuessTheNumber {

    public static void main(String[] args) {
        int computerVariant = 50;
        boolean isGuessed = false;
        int userVariant = 40;

        while (!isGuessed) {
            if (userVariant == computerVariant) {
                System.out.println("Вы угадали!");
                isGuessed = true;
            } else {
                System.out.println("Введенное вами число больше (меньше) того, что загадал компьютер");
                userVariant++;
            }
        }
    }
}