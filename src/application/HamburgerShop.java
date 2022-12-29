package application;

import java.util.Scanner;

public class HamburgerShop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==============================================");
		System.out.printf("%s		%s		%s",   "CODE","ESPECIFICATONS","PRICE"+"\n");
		System.out.printf("%s		%10s	%13s", " 1","Hot Dog","4.50"+"\n");
		System.out.printf("%s		%10s	%13s", " 2","X-Salad","4.50"+"\n");
		System.out.printf("%s		%10s	%13s", " 3","X-Bacon","5.50"+"\n");
		System.out.printf("%s		%10s	%13s", " 4","Toast Cheese","2.50"+"\n");
		System.out.printf("%s		%8s  	%13s",     " 5","Soda","1.50"+"\n");
		
		System.out.println("Enter your order code: ");
		int order = sc.nextInt();
		System.out.println("Enter quantity: ");
		int qde = sc.nextInt();		
		
		double total = 0;
		
		if(order == 1)
		{
			total = qde * 4.50;
		}
		else if(order==2)
		{
			total = qde * 4.50;
		}
		else if( order == 3)
		{
			total = qde * 5.50;
		}
		else if(order== 4)
		{
			total = qde * 2.50;
		}
		else
		{
			total = qde * 1.50;
		}
		
		System.out.printf("Total payable: %.2f", total);
		
		sc.close();
	}

}
