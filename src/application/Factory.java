package application;

import java.util.Locale;
import java.util.Scanner;

public class Factory {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1º Lot of parts: ");
		System.out.print("Part Code: ");
		int code = sc.nextInt();	
		System.out.print("Part quantity: ");
		int quantity = sc.nextInt();		
		System.out.print("Part price: ");
		double price =sc.nextDouble();
		
		System.out.println("========================");
		
		System.out.println("2º Lot of parts: ");
		System.out.print("Part Code: ");
		int code2 = sc.nextInt();	
		System.out.print("Part quantity: ");
		int quantity2 = sc.nextInt();		
		System.out.print("Part price: ");
		double price2 =sc.nextDouble();
		
		double result = quantity * price + quantity2 * price2;
		
		System.out.printf("Ammount payable: $%.2f",result);
		
		sc.close();
	}

}
