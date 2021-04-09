// Roll 2 dice n times and count how many times you got a double. 
 
public class Q7aleacountDouble {
	public static void main (String [] args) {

		int d1=0;
		int d2=0;
		int count=0;
		
		while (d1 != d2){
			d1 = (int)((Math.random()*6) +1);
			d2 = (int)((Math.random()*6) +1);
			count++;
			}
	System.out.println("The dice were rolled:" + count + " times before getting a double)");

	}
		
}
