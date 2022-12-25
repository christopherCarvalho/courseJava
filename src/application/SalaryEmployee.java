package application;

import java.util.Locale;
import java.util.Scanner;

public class SalaryEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====Employee date====");
		System.out.print("Employee ID: ");
		int number = sc.nextInt();
		System.out.print("Payment per hour: ");
		double salary = sc.nextDouble();
		System.out.print("Worked hours: ");
		int hours = sc.nextInt();
		
		double payment = hours * salary;
		
		System.out.println("NUMBER: "+number);
		System.out.printf("SALARY: U$ %.2f",payment);
		
		sc.close();
	}

}
