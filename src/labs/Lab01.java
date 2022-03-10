package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	/*As the user for 2 positive integers. The return the first number to 
	 * the power of the second number as formatted below.
	 * 
	 * Enter a positive integer: 3 
	 * Enter another positive integer: 5 
	 * 3^5 = 243.0
	 */
	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in); //activating the scanner
		int entnum;
		System.out.println("Put in an positive integer: ");
		entnum = inKey.nextInt();
		int entnum1;
		System.out.println("Enter another in an positive integer: ");
		entnum1 = inKey.nextInt();
		
		double num1Pow = Math.pow(entnum, entnum1);
		System.out.println(num1Pow + "\n");
		
	}
		
	/*Ask the user for a positive number (any number will do). Then print 
	 * that number’s square root as formatted below.
	 * 
	 * Enter a positive integer: 30 
	 * The square root of 16 is 5.477225575051661
	 */
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		int entnum;
		System.out.println("Put in an positive integer: ");
		entnum = inKey.nextInt();
		double num2 = Math.sqrt(entnum);
		System.out.println(num2 + "\n");
		
	}

	/*Ask the user for sides of a right triangle. Then print out the length 
	 * of the hypotenuse as formatted below.
	 * 
	 * Length of side A: 5 
	 * Length of side B: 7 
	 * Hypotenuse = 8.602325267042627
	 */
	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		double entA, entB, hypotenuse;
		System.out.println("Length of side A");
		entA = inKey.nextInt();
		System.out.println("Length of side B");
		entB = inKey.nextInt();
		hypotenuse = Math.sqrt((entA*entA)+(entB*entB));
		System.out.println("Hypotenuse = " + hypotenuse);

	}

	/*Repeatedly ask the user for integers. When they finally enter 0, print 
	 * out the largest and smallest input.
	 * 
	 * Enter an integer: 4 
	 * Enter an integer: 9 
	 * Enter an integer: -3 
	 * Enter an integer: 0 
	 * Max = 9 
	 * Min = -3
	 */
	public static void problem04() {
		Scanner inKey = new Scanner(System.in);
		int entnum;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		System.out.print("Enter an integer: ");
		entnum = inKey.nextInt();
		while (entnum > 0)  {
			System.out.print("Enter an integer: ");
			entnum = inKey.nextInt();
			if (entnum < 0)  {
				System.out.print("Enter an integer: ");
				entnum = inKey.nextInt();
				max = Math.max (max, entnum);
				System.out.println(max);
				System.out.println("Max = " + max);
				min = Math.min (min, entnum);
				System.out.println(min);
				System.out.println("Min = " + min);
			}
		}		
	}
	
	
	
	
	
	
}
