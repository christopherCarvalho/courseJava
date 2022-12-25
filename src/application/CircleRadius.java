package application;

import java.util.Locale;
import java.util.Scanner;

public class CircleRadius {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double n = sc.nextDouble();
		
		double area = 3.14159 * (n*n);
		
		System.out.printf("AREA: %.4f", area);
		
		
		sc.close();
	}

}