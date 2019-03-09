import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("First player name is:");    
        Player firstPlayer = new Player(scan.nextLine());

        System.out.println("Second player name is:");    
        Player secondPlayer = new Player(scan.nextLine());
        
        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);

        String continueValue = "";
        
        do {        
            game.play();            

            continueValue = "";

            System.out.println("Want to continue? [yes/no]");

            while (!continueValue.equals("yes") && !continueValue.equals("no")) {
                continueValue = scan.nextLine();
            }
        } while (continueValue.equals("yes"));
    }
}