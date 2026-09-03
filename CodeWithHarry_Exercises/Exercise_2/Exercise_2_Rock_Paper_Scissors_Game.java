package Practices;

import java.util.Random;
import java.util.Scanner;

class Exercise_2_Rock_Paper_Scissors_Game {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0 for Rock\n1 for Paper\n2 for Scissor\nEnter: ");
		int userInput = sc.nextInt();
		
		Random rm = new Random();
		int computerInput = rm.nextInt(3);
		
		if(userInput == 0) {
			System.out.println("\nYour Choice: Rock");
		}else if(userInput == 1) {
			System.out.println("\nYour Choice: Paper");
		}else {
			System.out.println("\nYour Choice: Scissor");
		}
		
		if(computerInput == 0) {
			System.out.println("Computer Choice: Rock");
		}else if(computerInput == 1) {
			System.out.println("Computer Choice: Paper");
		}else {
			System.out.println("Computer Choice: Scissor");
		}
		
		if(userInput == computerInput) {
			System.out.println("Result: Draw");
		}else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
			System.out.println("Result: You Won!");
		}else {
			System.out.println("Result: Computer Won!");
		}
		
		sc.close();
	}
}
