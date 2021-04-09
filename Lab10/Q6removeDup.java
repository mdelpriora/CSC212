/*
 * Write program that generates n integers in an LL 
 * + remove duplicates
 */

import java.io.*; 
import java.util.*;
public class Q6removeDup {
	static Scanner in = new Scanner(System.in);
	public static void main (String [] args){
		LinkedList <Integer> L = new LinkedList <>();
		
		generate(L);
		System.out.println("Initial list: " + L);
		remove(L);
		System.out.println("Duplicate numbers removed: " + L);
	}//main
	static void generate(LinkedList <Integer> L) {
		System.out.print("Enter how many integers you want to add to list L");
		int n = in.nextInt();
		
		for(int i = 0; i <= n; i++) {
			int x = (int) (Math.random()*10)+1;
			L.add(x);
		}//for
	}//generate
	public static void remove (LinkedList <Integer> L) {
		LinkedList <Integer> L1 = new LinkedList <>();
		for(int i = 0; i < L.size(); i++) {
			for(int j = i+1; j < L.size() ; j++) {
				if(L.get(i).equals(L.get(j))) {
					L.remove(L.get(i));//remove value at index j
					//adjust list length when value is removed
				}//if
			}//for
		}//for
	}//remove
}//class main
