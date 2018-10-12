
public class Doubles {

	public static void main(String[] args) {
		
	Dice die1 = new Dice();
	Dice die2 = new Dice();
	int face1 = -1;
	int face2 = -2;
	
	while (face1 != face2) {
		
		face1= die1.roll();
		face2= die2.roll();
		
		System.out.println("You rolled a "+ face1 +" and a "+ face2);
	}
System.out.print("So after "+ die1.getRolls()+ " roll(s) you finally rolled the same face");
		
	}
}
