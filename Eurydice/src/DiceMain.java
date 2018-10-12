
public class DiceMain {
	public static void main(String[] args) {
		
		Dice magicDice = new Dice();
		int timesRolled = 0;
		
		for (int i = 7; i < 17; i += 1) { 
          int roll = magicDice.roll();
          System.out.println("A " +roll+" was rolled");
          if (roll ==  3) {
          
        	 timesRolled +=1;
        	 
         }
	}

	System.out.println(magicDice.getRolls()+ " was the amount of times it rolled");
	System.out.print("but the amount of times 3 was rolled is "+ timesRolled);
		
	}
}
