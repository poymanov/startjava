import java.util.Scanner;

public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private int computerNumber;
    private Player winner;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void init() {
        computerNumber = (int) (Math.random() * 101);
        System.out.println("Guess the number from 0 to 100");
    }

    public boolean makeTurn() {
        Scanner scan = new Scanner(System.in);

        System.out.println(firstPlayer.getName() + "'s number is:");
        firstPlayer.setNumber(scan.nextInt());

        if (firstPlayer.getNumber() == computerNumber) {
            winner = firstPlayer;
            return true;
        }

        System.out.println(secondPlayer.getName() + "'s number is:");
        secondPlayer.setNumber(scan.nextInt());

        if (secondPlayer.getNumber() == computerNumber) {
            winner = secondPlayer;
            return true;
        }

        return false;
    }

    public void results() {
        System.out.println("Computer number is: " + computerNumber);
        System.out.println(firstPlayer.getName() + "'s number is: " + firstPlayer.getNumber());
        System.out.println(secondPlayer.getName() + "'s number is: " + secondPlayer.getNumber());

        System.out.println(winner.getName() + " wins!");
    }
}
