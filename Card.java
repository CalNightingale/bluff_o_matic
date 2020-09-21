public class Card {

  private int number; // J=11, Q=12, K=13, A=14
  private Suit suit;

  public Card(String cardstr) {
    String[] pieces = cardstr.split(",");
    this.number = Integer.parseInt(pieces[0]);
    switch(pieces[1]) {
      case "D":
        this.suit = Suit.DIAMONDS;
        break;
      case "H":
        this.suit = Suit.HEARTS;
        break;
      case "C":
        this.suit = Suit.CLUBS;
        break;
      case "S":
        this.suit = Suit.SPADES;
        break;
      default:
        System.out.println("illegal input for suit: " + pieces[1]); //TODO throw exception
    }
  }

  public int getNum() {
    return number;
  }

  public Suit getSuit() {
    return suit;
  }
}
