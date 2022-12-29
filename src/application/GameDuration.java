package application;

import java.util.Scanner;

public class GameDuration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter game start hour: ");
		int h1 = sc.nextInt();
		System.out.print("Enter game finish hour: ");
		int h2 = sc.nextInt();
		
		if(h1>h2)
		{			
			int finalHour = 24 - h1 + h2;
			System.out.println("The game lasted: "+finalHour+" hours");
		}
		else if(h1<h2)
		{
			int finalHour = h2-h1;
			System.out.println("The game lasted: "+finalHour+" hours");
		}
		else
		{
			System.out.println("The game lasted: 24 hours");
		}
		
				
		
	   sc.close();	
	}

}
