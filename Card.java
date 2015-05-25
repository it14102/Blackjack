
public class Card {
	public final static int SPADES = 0, HEARTS = 1, DIAMONDS = 2, CLUBS=3;
	
	public final static int ACE = 1, JACK = 11, QUEEN = 12, KING = 13;
	
	// Codes for card suits and non-numerical cards.
	
	private final int suit;
	
	private final int value; 
	
	//Suit and value of the card
	
	public Card(int VALUE, int SUIT) {
		value = VALUE;
		suit = SUIT;
		//creation of a card
	}
	
	public int getSuit () {
		return suit;
		//the int-type code of the card's suit
	}
	
	public int getValue () {
		return value;
		//the int-type code of the card's value
	}
	
	public String getSuitAsString () {
		switch ( suit ) {
		case SPADES: return "Spades";
		case HEARTS: return "Hearts";
		case DIAMONDS: return "Diamonds";
		case CLUBS: return "Clubs";
		default: return "??";
		//the suit of the card.If invalid, "??" is returned.
		}
	}
		
		public String getValueAsString () {
			switch ( value ) {
			case 1: return "Ace";
			case 2: return "2";
			case 3: return "3";
			case 4: return "4";
			case 5: return "5";
			case 6: return "6";
			case 7: return "7";
			case 8: return "8";
			case 9: return "9";
			case 10: return "10";
			case 11: return "Jack";
			case 12: return "Queen";
			case 13: return "King";
			default: return "??";
		// the value of the card.If invalid, "??" is returned.
			}
		}
			
			public String toString () {
				
				return getValueAsString () + " of " + getSuitAsString () ;
				//the name of the card, for example "Queen of Hearts"
			}
			
			
			
			
			
}
	
	


