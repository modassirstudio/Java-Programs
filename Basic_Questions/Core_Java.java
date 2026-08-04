import java.util.Scanner;
public class Core_Java {
	public static void main(String [] args) {
		// Question 1: Hello World
		// Write a program that prints: "Hello, I am Modassir. I am learning Java."
		System.out.println("Hello, I am Modassir. I am learning Java.");
		
		// Question 2: Variables
		// Create variables for your name, age, and city. Print them in one sentence.
		String myName = "Modassir";
		int myAge = 21;
		String myCity = "Bihar Sharif";
		System.out.println("My name is " + myName + ", I am " + myAge + " years old and I live in " + myCity + ".");
		
		// Question 3: Shop Profit Calculator
		// Your shop sells a product at ₹180. Cost price is ₹167. Calculate and print:
		//	1. Profit per unit
		//	2. Total profit for 5 units
		int sellPrice = 180;
		int costPrice = 167;
		int profitPerUnit = sellPrice - costPrice;
		int totalProfit = profitPerUnit * 5;
		System.out.println("Profit per unit = " + profitPerUnit + "\nTotal profit for 5 units = " + totalProfit);
		
		// Question 4: Check if Number is Even or Odd
		// Write a program that checks if int number = 7; is even or odd.
		int number = 7;
		if(number % 2 == 0) {
			System.out.println("Given number is even.");
		}else {
			System.out.println("Given number is odd.");
		}
		
		// Question 5: Find Largest of Two Numbers
		// Write a program that takes two numbers and prints which is larger.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your first number: ");
		int firstNumber = sc.nextInt();
		System.out.print("Enter your second number: ");
		int secondNumber = sc.nextInt();
		if(firstNumber > secondNumber) {
			System.out.println(firstNumber + " is larger.");
		}else if(secondNumber > firstNumber) {
			System.out.println(secondNumber + " is larger.");
		}else {
			System.out.println("Both are equal."); // I added an else option where, if the number will be same so it will print "Both are equal".
		}
		sc.close();
	
		// Question 6: Loop — Print Numbers 1 to 10
		// Use a for loop to print numbers from 1 to 10.
		
		// this is naive way to do it
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// this is better approach
		int n = 10;
		for(int i = 1; i <= n; i++) {
			System.out.println(i);
		}
		
		// Question 7: Array — Sum of Numbers
		// Create an array {10, 20, 30, 40, 50}. Find and print the sum.
		
		// simple way
		int arr[] = {10, 20, 30, 40, 50};
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
			sum = sum + arr[i];
		}
		System.out.println("Sum of array = " + sum);
		
		// better approach
		int arr1[] = {10, 20, 30, 40, 50};
		int sum1 = 0;
		for(int e:arr1) {
			System.out.println(e);
			sum1 += e;
		}
		System.out.println("Sum of the array = " + sum1);
		
		// Question 8: Method — Profit Calculator
		// Write a method that takes sellPrice and costPrice as parameters and returns profit.
		// call the method in main
		int profit = calculateProfit(180,167);
		System.out.println("Profit: " + profit);

	}
	// a method always defined outside main, in the class
	public static int calculateProfit(int sellPrice, int costPrice) {
	    return sellPrice - costPrice;
	}
}
