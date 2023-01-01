package application;

import java.util.Locale;
import java.util.Scanner;

public class WeightedAverage {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many entries will there be?");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double average = (a*2.0+b*3.0+c*5.0)/(2.0 + 3.0 + 5.0);
			
			System.out.printf("WeightedAverage: %.1f",average);
		}
		sc.close();
	}

}
