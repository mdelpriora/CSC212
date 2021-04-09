//Roll a die till first 5 or 6
 
public class Q11aleaTill_5 {
	public static void main (String [] args) {
		
		int d=0;
		
		do {
			System.out.println("You did not roll a five or a six");
			d=(int) (Math.random()*6) + 1;
		}
	
		while (d != 5 || d !=6);
		}
		
		
	}

