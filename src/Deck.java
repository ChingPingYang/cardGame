
public class Deck {
	
	
	
	//array that contains cards.
	Card[] cards;
	
	
	
	//constructor- Checking how many cards in this deck and create an array which has same length.
	public Deck(int numOfCards) 
	{
		if (numOfCards != 52) 
		{
			System.out.println("This game needs 52 cards.");
		}
		else 
		{
			cards = new Card[numOfCards];
		}
	}
	
	
	
	
	
	
	
	
	

}
