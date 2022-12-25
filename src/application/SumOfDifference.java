package application;

import java.util.Scanner;

public class SumOfDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter four values: ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int result = (A*B - C*D);
		
		System.out.printf("The result of sum by the difference is: %d",result);		
		
		sc.close();
	}

}
