package application;

import java.util.Scanner;

public class CartesianSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X coordinate: ");
		int x = sc.nextInt();
		System.out.println("Enter Y coordinate: ");
		int y = sc.nextInt();
		
		while (x != 0 && y != 0)
		{	
		
			if(x>0 && y>0)
			{
				System.out.println("1º Quadrant\n");
			}
			else if(x<0 && y>0)
			{
				System.out.println("2º Quadrant\n");
			}
			else if(x<0 && y<0)
			{
				System.out.println("3º Quadrant\n");
			}
			else if(x>0 && y<0)
			{
				System.out.println("4º Quadrant\n");
			}
			else
			{
				System.out.println();
			}
			
			System.out.println("Enter X coordinate: ");
			x = sc.nextInt();
			System.out.println("Enter Y coordinate: ");
			y = sc.nextInt();
		}
		
		
		sc.close();
	}

}
