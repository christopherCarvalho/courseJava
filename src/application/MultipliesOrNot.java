package application;

import java.util.Scanner;

public class MultipliesOrNot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter two integer values: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(n1%n2==0 || n2%n1==0)
		{
			System.out.println("Are multiplies");
		}
		else {
			System.out.println("Aren't multiplies");
		}
		sc.close();
	}

}
