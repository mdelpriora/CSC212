/*
 * Delete repeating chars from a word.
 */
import java.util.Scanner;
public class Q14deleteRepeat {
	public static void main (String [] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a word");
		String word = in.nextLine();
		
		repeat(word);
	}
	static void repeat(String word){
        int count;
        String newword = word;
        for (int i = 0; i<word.length(); i++){//Sets loop at each letter
            count = 0;
            for (int j = 0; j<word.length(); j++){//compares each following letter to the one at int i
                if (word.charAt(j) == word.charAt(i))//if any letters at index j are the same as the one at index i
                    count += 1;//how many times the letter at index j are the same as index i
            }//for
            if (count>1){//if frequency>1
                newword = newword.replace(Character.toString(word.charAt(i)), "");//delete char
            }//if
        }//for
        System.out.print(newword);
    }//repeat
	
}//class
