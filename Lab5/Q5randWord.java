import java.util.*;
public class Q5randWord {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Press enter to get a famous CS person");
		in.nextLine();
		int op = (int) (Math.random()*7);

		switch(op) {
		case 1: System.out.println("Pascal");
			break;
		case 2:System.out.println("Ada");
			break;
		case 3:System.out.println("Lovelace");
			break;
		case 4:System.out.println("Babbage");
			break;
		case 5:System.out.println("Boole");
			break;
		case 6:System.out.println("Turing");
			break;
		case 7:System.out.println("Leibniz");
			
		}
	}
}
