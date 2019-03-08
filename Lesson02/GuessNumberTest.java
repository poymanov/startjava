import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("First player name is:");    
        Player firstPlayer = new Player(scan.nextLine());

        System.out.println("Second player name is:");    
        Player secondPlayer = new Player(scan.nextLine());
        
        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
        game.start();

        while (game.isAskVariants()) {
            if (game.getFirstPlayerNumber() >= 0 && game.getSecondPlayerNumber() >= 0) {
                System.out.println("Want to continue? [yes/no]");

                String continueValue = "";

                while (!continueValue.equals("yes") && !continueValue.equals("no")) {
                    continueValue = scan.nextLine();
                }

                if (continueValue.equals("no")) {
                    return;
                }
            }

            System.out.println(game.getFirstPlayerName() + "'s variant is:");
            game.setFirstPlayerNumber(scan.nextInt());

            System.out.println(game.getSecondPlayerName() + "'s variant is:");
            game.setSecondPlayerNumber(scan.nextInt());
        }

        game.finish();
    }
}