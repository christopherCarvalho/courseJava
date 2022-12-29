package application;

import java.util.Locale;
import java.util.Scanner;

public class Coordinates {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a coordinate X: ");
		double x = sc.nextDouble();
		System.out.print("Enter a coordinate Y:");
		double y = sc.nextDouble();
		
		if(x==0 && y==0)
		{
			System.out.println("Origin");
		}
		else if(x>0 && y>0)
		{
			System.out.println("Q1");
		}
		else if(x<0 && y>0)
		{
			System.out.println("Q2");
		}
		else if(x<0 && y<0)
		{
			System.out.println("Q3");
		}
		else
		{
			System.out.println("Q4");
		}
		
		sc.close();
	}

}
