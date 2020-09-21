import java.util.Scanner;

public class Game {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("First card in hand (10,D = 10 of diamonds):");
    Card card1 = new Card(s.nextLine());
    System.out.println("Second card in hand:");
    Card[] hand = new Card[] { card1, new Card(s.nextLine()) };

    Player player = new Player(hand);
    System.out.println(player.move());
  }

}
