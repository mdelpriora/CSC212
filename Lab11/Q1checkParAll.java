import java.util.Stack;

/*
 *  Using the STACK data structure
 *  write a program that checks if an arithmetic expression string has the correct number of parenthesis, 
 *  you can use (,),{,},[,].
 */
public class Q1checkParAll {
	public static void main (String [] args){
		String exp = "((3 * (4 + 5))/2)";
		System.out.println(exp + " is " + (check(exp) ? "correct" : "incorrect"));

	}
	static boolean check(String w) {
		Stack <Character> s = new Stack <>();
		//var s = new Stack <Integer> (); same as above
		for (int i = 0; i < w.length(); i++) {
			if(w.charAt(i) == '(') s.push('(');
			if(w.charAt(i) == ')') {
				if(!s.isEmpty()) {//if s is not empty, we can pop
					s.pop();
				}
				else {
					return false;
				}//else		
			}
		}//for, finished checking
		return (s.isEmpty());
		
	}//check
}
