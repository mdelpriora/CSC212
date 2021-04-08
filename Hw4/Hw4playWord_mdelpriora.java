
import java.util.Scanner;
public class Hw4playWord_mdelpriora {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	
		char cont = 'y';
		System.out.println("Enter a word");
		String word = in.nextLine();
		
		do {
		
		System.out.println("Pick one: " + "\n1.Display size" + "\n2.Reverse" + "\n3.Write in uppercase" + "\n4.Count letter frequency" + "\n5.Delete first and last letter" + "\n6.Delete repeating letters" + "\n7.Display the ascii code" + "\n0.Exit");
		int op = in.nextInt();
		
		switch (op) {
		case 1: System.out.println(word + " has " + word.length() +" letters");
			break;
		case 2: reverse(word);
 			break;
		case 3: System.out.println(word + " in upercase: " + word.toUpperCase());;
			break;
		case 4: frequency(word);
			break;
		case 5: deletefirst(word);
			break;
		case 6: deleterepeat(word);
			break;
		case 7: ascii(word);
			break;
		case 0:	System.out.println("You have exited");		
		}
		
		System.out.println("Do you wann a play again? y/n");
		cont  = in.next().charAt(0);
		
		}while (cont == 'Y' || cont == 'y');
		
		System.out.println("Goodbye");
	}//main
	
	static void reverse(String word) {//2
	System.out.println("Your word backwards is: ");
		for (int i = word.length()-1; i >= 0; i--) {
		System.out.print(word.charAt(i));
		}//for
	}//reverse
	
	static void frequency(String word) {//4
		int[] frequency = new int[26];
		char c;
		for (int i = 0; i < word.length(); i++) {
			c = word.toLowerCase().charAt(i);
			if (Character.isLetter(c)) {
				int value = (int)c;
				int index = value-97;
				frequency[index]++;
			}//
		}
		for (int i=0; i<26; i++) {
			if(frequency[i] != 0) {
				c = (char)(i + 97);
			System.out.println("Frequency of letter " + c + " = " + frequency[i]);
				
			}//searchers for frequency of letter in alphabet
		}
	}

	static void deletefirst(String word) {//5
		/*
		String ch = Character.toString(word.charAt(0));
		String ch2 = Character.toString(word.charAt(word.length()-1));
		String newword = word.replace(ch, "");
		newword = word.replace(ch2,"");
		*/
		String ch = "";
		for (int i = 1; i < word.length()-1; i++) {
			ch += Character.toString(word.charAt(i));
		}//for
		System.out.println(ch);
	}//deletefirst
	
	static void deleterepeat(String word){//6
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
        System.out.println(newword);
    }//repeat
	
	static void ascii(String word) {//7
		for (int i = 0; i< word.length(); i++) {
			char ch = word.charAt(i);
			int asc = ((int) ch);
			System.out.println("Ascii code for " + ch + ": " + asc);
		}//for
	}//ascii
}	

