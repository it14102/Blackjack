import java.util.Scanner; 

public class Blackjack {
	public static void main(String[] args) {
		Scanner bet = new Scanner(System.in);
		int money; //user's available funds
		int bet; // money the user bets
		boolean win; //set true if user wins the game
		System.out.println("Welcome to the game of blackjack.");
		System.out.println();
		
		money = 5000;
		
		while (true) {
			System.out.println("Your available funds are" + money + " dollars.");
			do {
				System.out.println("What would you like to bet? (Enter 0 to stop playing)");
				bet = scanner.next();
				System.out.println();
				if (bet < 0 || bet > money);
					System.out.println("Please place a valid bet");
			} while (bet <0 || bet > money);
			if (bet == 0)
				break;
			win = playBlackjack();
			if (win)
				money = money + bet;
			else
				money = money - bet;
			System.out.println();
			if (money == 0) {
				System.out.println("You lost all your funds");
				break;
			}
		}
		System.out.println();
		System.out.println("Your funds now are $" + money + ".");
			
			}
		}
		static boolean playBlackjack() {
			//returns true if user wins, false if he loses.
			Deck deck;
			BlackjackHand dealerHand;
			BlackjackHand userHand;
			
			deck.shuffle(); //shuffles deck
			dealerHand.addCard( deck.deal() );
			dealerHand.addCard( deck.deal() );
			userHand.addCard( deck.deal() );
			userHand.addCard( deck.deal() );
			//dealer and user each get two cards.
			
			System.out.println();
			System.out.println();
			
			if (dealerHand.getBlackjackValue() == 21) {
				System.out.println("Dealer has the" + dealerHand.getCard(0) + "and the " + dealerHand.getCard(1) + ".");
				System.out.println("User has the" + userHand.getCard(0) + "and the " + userHand.getCard(1) + ".");
				System.out.println();
				System.out.println("Dealer has Blackjack. You lose.");
				return false;
			} // if the dealer has blackjack he wins.Also if both the dealer and user have blackjack, dealer still wins.
			
			if (userHand.getBlackjackValue() == 21) {
				System.out.println("Dealer has the" + dealerHand.getCard(0) + "and the " + dealerHand.getCard(1) + ".");
				System.out.println("User has the" + userHand.getCard(0) + "and the " + userHand.getCard(1) + ".");
				System.out.println();
				System.out.println("You have Blackjack. You win!");
				return true;
			} // if the user has blackjack he wins
			
			while (true) {
				System.out.println();
				System.out.println();
				System.out.println("Your cards are:");
				for ( int i = 0; i < userHand.getCardCount(); i++ )
					System.out.println("   " + userHand.getCard(i));
				System.out.println("Your total is " + user.getBlackjackValue);
				System.out.println();
				System.out.println("Dealer is showing the " + dealerHand.getCard(0));
				System.out.println();
				System.out.println("Hit (H) or Stand (S)? ");
				char userAction;   //user's response
				do {
					userAction = Character.toUpperCase(scanner.next); //???????????????????????????
					if (userAction != 'H' && userAction != 'S')
						System.out.println("Please respond H or S: ");
				}while (userAction != 'H' && userAction != 'S');
				
				//if the user hits he gets a card.If he stands, it's the dealer's turn.
				if ( userAction == 'S' ) 
					break;
				else {
					Card newCard = deck.deal();
					userHand.addCard(newCard);
					System.out.println();
					System.out.println("User hits");
					System.out.println("Your card is the " newCard);
					System.out.println("Your new total is " + userHand.getBlackjackValue());
					//user chooses to hit,so he gets a card
					
					if (userHand.getBlackjackValue() > 21) {
						System.out.println();
						System.out.println("You busted by going over 21. You lose");
						System.out.println("Dealer's other card was the " + dealerHand.getCard(1));
						return false;
						//if by hiting he goes over 21 the user loses
					}
				}
			}
			
			System.out.println();
			System.out.println("User stands.");
			System.out.println("Dealer's cards are the " + dealerHand.getCard(0) + " and the " + dealerHand.getCard(1));
			while (dealerHand.getBlackjackValue() <= 16) {
				Card newCard = deck.deal();
				System.out.println("Dealer hits and gets the " + newCard);
				dealerHand.addCard(newCard);
				if (dealerHand.getBlackjackValue() > 21) {
					System.out.println();
					System.out.println("Dealer busted by going over 21. You win");
					return true;
				}
			}
			System.out.println("Dealer's total is " + dealerHand.getBlackjackValue());
			//both players have 21 or less,so we compare their hands' values.
			
			System.out.println();
			if (dealerHand.getBlackjackValue() == userHand.getBlackjackValue()) {
				System.out.println("Dealer wins on a tie. You lose.");
				return false;
			}
			else if (dealerHand.getBlackjackValue() > userHand.getBlackjackValue()) {
					System.out.println("Dealer wins, " + dealerHand.getBlackjackValue() + "points to " + userHand.getBlackjackValue() + ".");
					return false;
			}
			else {
				System.out.println("You win, " + userHand.getBlackjackValue() + "points to  "	+ dealerHand.getBlackjackValue() + ".");
				return true;
				
			}
		}
		
			
					
