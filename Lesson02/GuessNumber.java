import java.util.Scanner;

public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private int computerVariant;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public int getFirstPlayerNumber() {
        return firstPlayer.getNumber();
    }

    public int getSecondPlayerNumber() {
        return secondPlayer.getNumber();
    }

    public String getFirstPlayerName() {
        return firstPlayer.getName();
    }

    public String getSecondPlayerName() {
        return secondPlayer.getName();
    }

    public void setFirstPlayerNumber(int number) {
        firstPlayer.setNumber(number);
    }

    public void setSecondPlayerNumber(int number) {
        secondPlayer.setNumber(number);
    }

    public void start() {
        computerVariant = (int) (Math.random() * 101);
        System.out.println("Guess the numbers from 0 to 100");
    }

    public boolean isAskVariants() {
        return computerVariant != firstPlayer.getNumber() && computerVariant != secondPlayer.getNumber();
    }

    public void finish() {
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
