package application;

import java.util.Scanner;

public class BetweenTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value between 0 and 100");
		double n = sc.nextDouble();
		
		if (n <0 || n>100)
		{
			System.out.println("Number out of range");
		}
		else if( n<=25.0)
		{
			System.out.println("Between:([0,25])");
		}
		else if(n<=50.0)
		{
			System.out.println("Between:([25,50])");
		}
		else if( n<=75.0)
		{
			System.out.println("Between:([50,75])");
		}
		else if( n<=100.0)
		{
			System.out.println("Between:([75,100])");
		}
		
		
		sc.close();
	}

}
