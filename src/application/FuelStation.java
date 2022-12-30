package application;

import java.util.Scanner;

public class FuelStation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose fuel type:");
		System.out.println("1 - Alcohol");
		System.out.println("2 - Gasoline");
		System.out.println("3 - Diesel");
		
		int x = sc.nextInt();
		int alcohol = 0;
		int gasoline = 0;
		int diesel = 0;
		
		while(x != 4)
		{			
			if(x == 1)
			{
				alcohol++;
			}
			else if(x==2)
			{
				gasoline++;
			}
			else if(x==3)
			{
				diesel++;
			}
			
			x = sc.nextInt();
		}
		System.out.println("Thank you very much!");
		System.out.printf("Alcohol: %d\n", alcohol);
		System.out.printf("Gasoline: %d\n",gasoline);
		System.out.printf("Diesel: %d\n", diesel);
		
		sc.close();
	}

}
