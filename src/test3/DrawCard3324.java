package test3;

public class DrawCard3324 {
	public static void main(String[] args) {
		String[] card = {"0","Ace","1","2","3","3","4","5","6","7","8","9","10","JACK","QUEEN","KING"};
		String[] color = {"Clubs","Diamonds","Hearts","Spades"};
		int cardnum = (int)(Math.random()*13+1);
		int colornum = (int)(Math.random()*4);
		System.out.println("The card you pick is "+card[cardnum]+" of "+color[colornum]);
		}
}
