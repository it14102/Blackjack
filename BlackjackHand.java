
public class BlackjackHand extends Hand {

	public int getBlackjackValue() {
		int v; //the value of this hand for the game of blackjack
		boolean ace; //sets true if there is an ace in hand
		int cards; // number of cards in hand
		
		v = 0;
		ace = false; 
		cards = getCardCount();
		
		for ( int i = 0; i < cards; i++ ) {
			Card card; //this is the i-th card
			int cardValue; //blackjack value of the i-th card
			card = getCard(i);
			cardValue = card.getValue();
			
			if (cardValue > 10) {
				cardValue = 10; //Jack,Queen and King values are 10 for blackjack
			}
			if (cardValue ==1) {
				ace = true; //at least one ace in hand
			}
			v = v + cardValue;
		}
		
		if (ace == true && v +10 <=21)
			v = v +10;
		//aces count for 11, unless value (v) gets over 21,in which case they count for 1
		
		return v;
	}
}
