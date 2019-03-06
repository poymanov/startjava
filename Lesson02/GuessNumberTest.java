import java.util.Scanner;

public class GuessNumberTest {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("First player name is:");    
    String firstPlayerName = scan.nextLine();

    System.out.println("Second player name is:");    
    String secondPlayerName = scan.nextLine();

    Player firstPlayer = new Player(firstPlayerName);
    Player secondPlayer = new Player(secondPlayerName);

    GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
    game.play();
  }
}