package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	/*As the user for 2 positive integers. Then print 10 random numbers 
	 * between them (inclusive). Note: the user might not put the smaller one first.
	 * 
	 * Enter a positive integer: 27 
	 * Enter another positive integer: 14 
	 * 17 26 14 18 15 21 27 15 19 19
	 */
	public static void problem01() {
		Scanner inKey = new Scanner(System.in); 
		double entnum;
		double entnum2;
		System.out.println("Put in an positive integer: ");
		entnum = inKey.nextInt();
		System.out.println("Put in another positive integer: ");
		entnum2 = inKey.nextInt();
		for(int  i = 1;i < 11; i++) {
			double scope = entnum;
			double min = entnum2;
			int num = (int) (Math.random() * scope +  min);
			System.out.print(num);
		}
	}
	
	//Ask the user for the radius and height of a cylinder. Then print 
	//out the cylinder’s volume
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		double Radius;
		double Height;
		double PI;
		PI = 3.14159265389793;
		System.out.println("Enter the radius: ");
		Radius = inKey.nextInt();
		System.out.println("Enter the height: ");
		Height = inKey.nextInt();
		
		System.out.println("The radiys is " + PI  * Radius * Radius * Height);
	}

	/*You’ll be replicating the distance formula. Ask the user for the 
	 * coordinates of 2 points (decimals allowed). Then print the distance between those points.
	 * 
	 * Enter x1: 2 
	 * Enter y1: 3 
	 * Enter x2: 5 
	 * Enter y2: 7 
	 * Distance between points = 5.0
	 */
	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		double x1;
		double y1;
		double x2;
		double y2;
		System.out.println("Enter x1: ");
		x1 = inKey.nextInt();
		System.out.println("Enter y1: ");
		y1 = inKey.nextInt();
		System.out.println("Enter x2: ");
		x2 = inKey.nextInt();
		System.out.println("Enter y2: ");
		y2 = inKey.nextInt();
		System.out.println("The distance between points");
		System.out.println( (x2 -  x1) * 2 + (y2 - y1 ) *2 );
	}
	
	/*You’ll be solving the quadratic formula. Ask the user for the a, b, and c values. Then print 
	 * BOTH x-intercepts as formatted below. Inputs may be doubles. Note: if the computer prints “NaN” 
	 * that means the inputs resulted in non-real numbers. Just try with new numbers.
	 * 
	 * Enter a-value: 2 
	 * Enter b-value: -14 
	 * Enter c-value: 24 
	 * x1 = 4.0 
	 * x2 = 3.0
	 */
	public static void problem04() {
		Scanner inKey = new Scanner(System.in);
		double avalue;
		double bvalue;
		double cvalue;
		double x1;
		double x2;
		System.out.println("Enter a-value: ");
		avalue = inKey.nextInt();
		System.out.println("Enter b-value: ");
		bvalue = inKey.nextInt();
		System.out.println("Enter c-value: ");
		cvalue = inKey.nextInt();
		System.out.print("x1 = " + bvalue + "\n x2=" + (bvalue * 2 - 4 * avalue * cvalue));
	}
	
	

	
}
