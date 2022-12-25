package application;

import java.util.Scanner;

public class SumOfTwoValues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first value: ");
		int n1 = sc.nextInt();
		System.out.print("Enter the second value: ");
		int n2 = sc.nextInt();
		
		int result = n1 + n2;
		
		System.out.println("\nThe sum of these two values is: "+result);
		
		
		
		sc.close();
	}

}
