//Play with the shell. Try all math operations. Reproduce ppt
public class Q1 {
	public static void main(String[] args) {

	System.out.println(5>3);
	System.out.println(6>9);
	System.out.println(5==5);
	System.out.println(true||false);
	System.out.println(true&&false);
	System.out.println(true&&!false);
	System.out.println(!true);
	boolean b1=true ;
	boolean b2=false;
	System.out.println(b1&&!b2);
	System.out.println(b1||!b2);
	System.out.println(!(b1&&b2));

	int n=4, m=(n-4), m2=m*n, k2=m/7, n2=5;
	float k=m/7;
	double o=Math.pow(2,3), sq=Math.sqrt(9), d=Math.log10(10) ;
	System.out.println(n);
	System.out.println(n++);
	System.out.println(m);
	System.out.println(m--);
	System.out.println(m2);
	System.out.println(k);
	System.out.println(k2);
	System.out.println(o);
	System.out.println(sq);
	System.out.println(d);
	System.out.println(Math.sqrt(d));
	System.out.println(n2);
	System.out.println(n2%1);
	System.out.println(n2%n2);
	System.out.println(n2%(n2-1));
	//System.out.println(n2%0);
	System.out.println(n2%(n2+3));
	System.out.println((2*n)%n);



	}
}
