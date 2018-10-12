import java.util.Scanner; 
public class TargetDice {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		System.out.print("Please enter in an integer");
		
		while (!in.hasNextInt()) {
		in.nextLine();
		System.out.print("Please enter in an integer");
		}
		
	in.nextInt();
		System.out.print("Bourgeoisie");
	}
}
