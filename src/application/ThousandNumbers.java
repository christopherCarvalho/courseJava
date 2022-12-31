package application;

import java.util.Scanner;

public class ThousandNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number between 1 and 1000");
		int x =sc.nextInt();
		
		for(int i=0; i<x;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
