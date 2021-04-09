/*
 * Read 2 arrays
 * Display the same elements in both arrays that are in the same place.
 */
import java.util.*;
public class Q9samePlace {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter Array Size : ");
	       int size = in.nextInt();
		   int [] arr = new int [50];
	       System.out.print("Enter Array Elements : ");
	       for(int i=0; i<size; i++)
	       {
	           arr[i] = in.nextInt();
	       }
	}
}
