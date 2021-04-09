/*
 * Read numbers (float) from a file (file is myints.txt) and 
 * compute their mode, mean, median and standard deviation. 
 */

import java.io.*;
import java.util.*;
public class Q6statsFile {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner fin = null;
		
		System.out.println("Enter file name you are looking for");
		String file = in.nextLine();
		try  {
			fin = new Scanner(new File(file)); 
		}//try
		catch (FileNotFoundException ex) { 
			System.out.print(file + "not found"); 
			System.exit(1); 
		}//catch
		ArrayList <Float> A = new ArrayList<>();
		while (fin.hasNext()){
			A.add(fin.nextFloat());
		}
		fin.close();
		
		sort(A);
		System.out.println("Mean: " + mean(A));
		System.out.println("Median: " + median(A));
		System.out.println("Mode: " + mode(A));
		System.out.println("Standard deviation: " + sd(A));
		
	}//main
	static float mean(ArrayList <Float> a) {
		float sum = 0;
		for (int i = 0; i < a.size(); i++) {
			sum += a.get(i);
			
		}
		return sum/a.size();
	
	}//mean
	
	static float median(ArrayList <Float> a) {
		if(a.size() %2 == 0) 
			return (((a.size() / 2) - 1) + (a.size() / 2)) / 2;
		else 
			return a.get(a.size()/2);	
	}//median
	
	static float mode(ArrayList <Float> a) {
		int count = 0;
		int maxcount = 0;
		float max = 0;
		for (int i = 0; i < a.size(); ++i) {
			for (int j = 0; j < a.size(); ++j) {
				if (a.get(i) == a.get(j)) {
					count++;
				}//if
			}//for
			if (count > maxcount) {
				maxcount = count;
				max = a.get(i);
			}//if
		}//for
		return max;
	}//mode
	
	static float sd(ArrayList <Float> a) {
		float sum = 0;
		float sd = 0;
		for (int i = 0; i < a.size(); i++) {
			sum += a.get(i);	
		}
		float mean = sum/a.size();
		for (int i = 0; i < a.size(); i++) {
			sd += Math.pow(a.get(i)-mean,2);	
		}
		return (float)(Math.sqrt(sd/a.size()));
		
	}//sd
	static void sort(List <Float> A) {
		float hold; //temp variable to help switch
        boolean change = true;
        while (change){
            change = false;
            //V.set(index,w)
            for (int i = 0; i < A.size() - 1; i++){
                if (A.get(i) > A.get(i+1)) {
                    hold = A.get(i);
                    A.set(i, A.get(i+1));
                    A.set(i+1, hold);
                    change = true;
                } //else change = false;
            }//for
        }//while   
        System.out.println(A);
	}//sort
	
}//class main
	









