//Generate 10 random letters in uppercase or lowercase  and count the vowels.
//Vowels are 
public class Q7vowelCount {
	public static void main (String [] args) {
		int n = 10;
		int count = 0;
		
		for (int i = 0; i< n; i++) {
			int x= randlet();
			if (x == 'A' || x== 'a'  || x == 'E' || x== 'e'  || x == 'I' || x== 'i'|| x== 'O'|| x== 'o'|| x== 'U'|| x== 'u'){
			count++;
			}
		}
		System.out.println("You generated " + count + " vowels");
	}
		static char randlet() {
			return (char) ((int) (Math.random()*26) + 'a');
		}
}//NOT DONE
