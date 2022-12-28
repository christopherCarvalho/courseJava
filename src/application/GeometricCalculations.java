package application;

import java.util.Locale;
import java.util.Scanner;

public class GeometricCalculations {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter tree values: ");
		double A =sc.nextDouble();
		double B =sc.nextDouble();
		double C =sc.nextDouble();
		
		double TR = (A*C)/2;
		double AC = 3.14159 * (C*C);
		double AT = C/2 * (A+B);
		double S  = B*B;
		double AR = A*B;
		
		System.out.printf("TRIANGLE: %.3f\n",TR);
		System.out.printf("CIRCLE: %.3f\n", AC);
		System.out.printf("TRAPEZE: %.3f\n",AT);
		System.out.printf("SQARE: %.3f\n", S);
		System.out.printf("RECTANGLE: %.3f\n",AR);
		
		
		sc.close();
	}

}
