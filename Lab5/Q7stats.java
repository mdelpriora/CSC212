
import java.util.*;
public class Q7stats {
	public static void main(String[] args) {
		int [] array = new int [5];
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random()*20);
			array[i] = num;
		}
	   double sum = sum(array);
	   double avrg = sum/5;
	   double sd = sd(array);
	   System.out.println("Array: " + Arrays.toString(array));
	   System.out.println("Sum: " + sum);
	   System.out.println("Average: " + avrg);
	   System.out.println("Standard deviation: " + sd);
	}
	static double sum(int [] array) {
		double sum = 0;
		for(int i = 0; i < 5; i++) {
			sum += array[i];	   
		}
		return sum;
	}
	static double sd (int [] array) {
		double sum = 0;
		for(int i = 0; i < 5; i++) {
			sum += array[i];	   
		}
		double mean = sum/5;
		double sd =0;
		for(int i = 0; i < 5; i++) {
			sd += Math.pow(array[i]-mean, 2);
		}
		return Math.sqrt(sd/5);
	}
}
