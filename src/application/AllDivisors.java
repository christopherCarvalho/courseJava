package application;

import java.util.Scanner;

public class AllDivisors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to find all your divisors:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{	
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
		
		
		sc.close();
	}

}
