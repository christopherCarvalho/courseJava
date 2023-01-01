package application;

import java.util.Locale;
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("How many entries will there be?");
		int n =sc.nextInt();
		
		int x =0, y=0;
		double result = 0;
		
		for(int i=0; i<n; i++)
		{
			 x = sc.nextInt();
			 y = sc.nextInt();
			 
			 if(y!=0)
			 {
				 result=(double)x/y;
				 System.out.printf("%.1f\n", result);
			 }
			 else
			 {
				 System.out.println("Impossible division!");
			 }
		}
		
		
		
		sc.close();
	}

}
