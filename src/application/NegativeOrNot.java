package application;

import java.util.Scanner;

public class NegativeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer value: ");
		int n = sc.nextInt();
		
		if(n>=0)
		{
			System.out.println("POSITIVE NUMBER");
		}
		else
		{
			System.out.println("NEGATIVE NUMBER");
		}
		
		sc.close();
	}

}
