import java.util.Scanner;

public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public Player getFirstPlayer() {
        return firstPlayer;
    }

    public Player getSecondPlayer() {
        return secondPlayer;
    }

    public void play() {
        Scanner scan = new Scanner(System.in);

        int computerVariant = (int) (Math.random() * 100);
        firstPlayer.setNumber(-1);
        secondPlayer.setNumber(-1);

        System.out.println("Guess the numbers from 0 to 100");

        while (computerVariant != firstPlayer.getNumber() && computerVariant != secondPlayer.getNumber()) {
            if (firstPlayer.getNumber() >= 0 && secondPlayer.getNumber() >= 0) {
                System.out.println("Want to continue? [yes/no]");

                String continueValue = new String();

                while (!continueValue.equals("yes") && !continueValue.equals("no")) {
                    continueValue = new String(scan.nextLine());
                }

                if (continueValue.equals("no")) {
                    return;
                }
            }

            System.out.println(firstPlayer.getName() + "'s variant is:");
            firstPlayer.setNumber(scan.nextInt());

            System.out.println(secondPlayer.getName() + "'s variant is:");
            secondPlayer.setNumber(scan.nextInt());
        }

        System.out.println("Computer variant is: " + computerVariant);
        System.out.println(firstPlayer.getName() + "'s variant is: " + firstPlayer.getNumber());
        System.out.println(secondPlayer.getName() + "'s variant is: " + secondPlayer.getNumber());

        if (computerVariant == firstPlayer.getNumber() && computerVariant == secondPlayer.getNumber()) {
            System.out.println("Draw!");
        } else if (computerVariant == firstPlayer.getNumber()) {
            System.out.println(firstPlayer.getName() + " wins!");
        } else if (computerVariant == secondPlayer.getNumber()) {
            System.out.println(secondPlayer.getName() + " wins!");
        }
    }
}
