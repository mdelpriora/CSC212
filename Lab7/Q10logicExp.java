/*
 * What is the value of the following logical expression if x = true, and y =false?
 */

import java.util.*;
public class Q10logicExp {
	public static void main(String[] args) {
		boolean x = true;
		boolean y = false;
		
		boolean a = ((x && !y) && ( !x && y ));
		boolean b = ((x && y) || ( !x && !y ));
		boolean c = (!x  ||  y) && (x || !y);
		boolean d = (!x || !y ) && !( x && y);
		boolean e = !(x || !y) && !(x || y) || !y; 
	}
}
