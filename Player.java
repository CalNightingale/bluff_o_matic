public class Player {

  private Card[] hand;

  public Player(Card[] hand) {
    if(hand[0].getNum() == hand[1].getNum() && hand[0].getSuit() == hand[1].getSuit()) {
      System.out.println("ERROR: same card inputted twice!"); //TODO switch to error
    }
    this.hand = hand;
  }

  public String move() {
    if(isHandWorthPlaying()){
      return "call";
    } else {
      return "fold";
    }
  }

  private boolean isHandWorthPlaying() {
    int points = 0;
    if(hand[0].getNum() == hand[1].getNum()) {
      // pocket pair
      points++;
    } else if(Math.abs(hand[1].getNum() - hand[0].getNum()) < 5) {
      // straight is possible
      points++;
    }
    if(hand[0].getSuit() == hand[1].getSuit()) {
      // good hand for flush
      points++;
    }
    if(hand[0].getNum() > 12 || hand[1].getNum() > 12) {
      // high card
      points++;
    }
    if(points > 0) return true;
    else return false;
  }
}
