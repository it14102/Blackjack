
public class Deck {
	private Card[] deck; //array of 52 playing cards
	private int cardsUsed; // number of cards used
	
	public Deck () {
		deck = new Card[52];
		int cardCount = 0; //number of created cards up to this point
		for ( int suit = 0; suit <=3; suit++) {
			for ( int value = 0; value <=13; value++) {
				deck[cardCount] = new Card (value, suit);
				//creates a deck of cards
			}
		}
		cardsUsed = 0;
	}
	
	public void shuffle () {
		for (int i = 51; i>0; i--) {
			int rand = (int) (Math.random() * (i+1));
			Card temp = deck[i];
			deck[i] = deck[rand];
			deck[rand] = temp;
		//puts used cards back in the deck and shuffles the deck
		}
		cardsUsed = 0;
	}
	
	public int cardsLeft() {
		return 52 - cardsUsed;
		//returns the number of cards still in the deck
		
	}
	
	public Card deal() {
		if (cardsUsed == 52)
			shuffle();
		cardsUsed++;
		return deck[cardsUsed - 1];
	//deals (and returns) a card 
	}
	
}
