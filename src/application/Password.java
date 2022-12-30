package application;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter password:");
		int x =sc.nextInt();
		
		while(x!=2002)
		{
			System.out.println("Password incorrect!\n");
			System.out.print("Enter password:");
			x =sc.nextInt();
		}
		System.out.println("Password correct!");
		
		sc.close();
	}

}
