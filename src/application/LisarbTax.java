package application;

import java.util.Locale;
import java.util.Scanner;

public class LisarbTax {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your salary");
		double salary = sc.nextDouble();		
		
		double tax = 0;
		
		if(salary<2000.00)
		{
			tax = 0.0;
		}
		else if(salary <3000.00)
		{
			tax = (salary - 2000.00) * 8/100;
		}
		else if(salary <4500.00)
		{
			tax = (salary - 3000.00)* 18/100 + 1000.00 * 8/100;
		}
		else if(salary > 4500.01)
		{
			tax = (salary - 4500.00)* 28/100 + 1500.00 * 18/100 + 1000.00 * 8/100;
		}
		
		
		if(salary>2000.01)
		{			
			System.out.printf("Tax: R$%.2f",tax);
		}else
		{
			System.out.println("Tax exempt");
		}
		
		sc.close();
	}

}
