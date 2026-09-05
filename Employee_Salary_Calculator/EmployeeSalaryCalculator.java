package Practices;

import java.util.Scanner;
public class EmployeeSalaryCalculator {
	
	static double calculateHRA(double basic) {
		return basic * 0.10;
	}
	
	static double calculateDA(double basic) {
		return basic * 0.08;
	}
	
	static double calculateTax(double gross) {
		if(gross > 50000) {
			return gross * 0.05;
		}
		return 0;
	}
	
	static double calculatePF(double basic) {
		return basic * 0.12;
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter employee name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter basic salary : ");
		double basic = sc.nextDouble();
		
		double pf = calculatePF(basic);
		double hra = calculateHRA(basic);
		double da = calculateDA(basic);
		double gross = hra + da + basic;
		double tax = calculateTax(gross);
		int net = (int)(gross - (tax + pf));
		
		double monthlySalary = net;
		double yearlySalary = net * 12;
		
		System.out.println("\n===== SALARY SLIP =====");
		System.out.println("Employee: " + name);
		System.out.println("Basic Salary: ₹" + basic);
		System.out.println("\nPF (12%): ₹" + pf);
		System.out.println("HRA (10%): ₹" + hra);
		System.out.println("DA (8%): ₹" + da);
		System.out.println("Gross Salary: ₹" + gross);
		System.out.println("Tax: ₹" + tax);
		
		System.out.println("\nNet Salary: ₹" + net);
		if(net < 25000) {
			System.out.println("Grade (Net Salary): C");
		}else if(net < 50000) {
			System.out.println("Grade (Net Salary): B");
		}else if(net < 100000) {
			System.out.println("Grade (Net Salary): A");
		}else {
			System.out.println("Grade (Net Salary): A+");
		}
		sc.close();
	}
}
