import java.util.Vector;

public class Hand {
	
	private Vector hand;  //cards in the hand 
	
	public Hand () {
		hand = new Vector();
	//creates an empty hand
	}
	
	public void clear() {
		hand.removeAllElements();
		//discards all cards
	}
	
	public void addCard(Card c) {
		if (c != null)
			hand.addElement(c);
		//if card c in non-null, it is added to the hand.
	}
	
	public void removeCard(Card c) {
		hand.removeElement(c);
		//if card c is in the hand ,it is removed.
	}
	
	public void removeCard(int position) {
		if (position >=0 && position < hand.size())
			hand.removeElementAt(position);
		//if position is valid,the card in the position is removed.
	}
	
	public int getCardCount() {
		return hand.size();
		//number of cards in hand is returned.
	}
	
	public Card getCard(int position) {
		if (position >=0 && position < hand.size())
			return (Card)hand.elementAt(position);
		else
			return null;
			
	}
}
