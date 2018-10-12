import java.util.Scanner; 
public class TargetDice {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		Dice die1 = new Dice();
		Dice die2 = new Dice();
		
		boolean gamewon = false;
		//Biggest Loop
		while (!gamewon) {
		
		System.out.print("Please enter in an integer");
		
		while (!in.hasNextInt()) {
		in.nextLine();
		System.out.print("Please enter in an integer");
		}
		
		
		
		int target =in.nextInt();
		int face1 = die1.roll();
		int face2 = die2.roll();
		if (face1+face2 != target) {
			System.out.print("You rolled a" + face1+ " and a "+ face2+" so you did not roll your target");
		}
		
		
		
		
		
		
		
		
		System.out.print("Bourgeoisie");
	}
}
