import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("First player name is:");    
        Player firstPlayer = new Player(scan.nextLine());

        System.out.println("Second player name is:");    
        Player secondPlayer = new Player(scan.nextLine());
        
        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
        game.init();

        while (true) {
            boolean hasWinner = game.makeTurn();

            if (hasWinner) {
                game.results();
                break;
            }

            String continueValue = "";

            System.out.println("Want to continue? [yes/no]");

            while (!continueValue.equals("yes") && !continueValue.equals("no")) {
                continueValue = scan.nextLine();
            }

            if (continueValue.equals("no")) {
                break;
            }
        }
    }
}