package application;

import java.util.Scanner;

public class BetweenValues {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("How many entries will there be?");
		int n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		for(int i = 0; i<n; i++)
		{
			int x = sc.nextInt();
			if(x >=10 && x<=20)
			{	
				in++;
			}
			else
			{
				out++;
			}
		}
		

		System.out.println(in +" In");
		System.out.println(out +" Out");
		
		sc.close();
	}

}
