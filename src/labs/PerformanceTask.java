package labs;
import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter launch velocity (m/s): ");
		double Vel = inKey.nextDouble();
		System.out.print("Enter launch angel (degrees):");
		double Angle = inKey.nextDouble();
		System.out.print("Time 0s");
		System.out.print("      X position is 0.0");
		System.out.println("      Y  position is 0.0");
		int time = 1;
		double x = Math.cos(Math.toRadians(Angle))* time * Vel;
		double y = Math.sin(Math.toRadians(Angle))* time * Vel - 0.5 * 9.8 * (time * time);
		while (y > 0)  {
			x = Math.cos(Math.toRadians(Angle))* time * Vel;
			y = Math.sin(Math.toRadians(Angle))* time * Vel - 0.5 * 9.8 * (time * time);
			System.out.print("Time: " + time + "s");
			System.out.print("      X position is " + x);
		}
		
		
	}
	
	
}
