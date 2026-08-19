package Practices;

import java.util.Scanner;

public class Code_10th_Result {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your Mathematics number : ");
		int maths = sc.nextInt();

		System.out.print("Enter your Science number : ");
		int science = sc.nextInt();

		System.out.print("Enter your Social Science number : ");
		int social_science = sc.nextInt();

		System.out.print("Enter your Hindi number : ");
		int hindi = sc.nextInt();

		System.out.print("Enter your Urdu number : ");
		int urdu = sc.nextInt();

		int total = (maths + science + hindi + social_science + urdu);
		System.out.println("Total Marks Obtained: " + total);
		
		double percentage = (total * 100) / 500;
		System.out.println("Percentage: " + percentage + " %");

		int failCount = 0;
		if (maths < 33) failCount++;
		if (science < 33) failCount++;
		if (social_science < 33) failCount++;
		if (hindi < 33) failCount++;
		if (urdu < 33) failCount++;

		if (failCount >= 3) {
			System.out.println("Status: Failed");
			System.out.print("You're failed because your ");
			
			StringBuilder failedSubjects = new StringBuilder();
			if (maths < 33) failedSubjects.append("Mathematics");
			if (science < 33) {
				if (failedSubjects.length() > 0) failedSubjects.append(", ");
				failedSubjects.append("Science");
			}
			if (social_science < 33) {
				if (failedSubjects.length() > 0) failedSubjects.append(", ");
				failedSubjects.append("Social Science");
			}
			if (hindi < 33) {
				if (failedSubjects.length() > 0) failedSubjects.append(", ");
				failedSubjects.append("Hindi");
			}
			if (urdu < 33) {
				if (failedSubjects.length() > 0) failedSubjects.append(" and ");
				failedSubjects.append("Urdu");
			}
			System.out.println(failedSubjects.toString() + " marks are low");
			
		} else if (percentage >= 60) {
			System.out.println("Status: 1st Division");
			System.out.println("Congratulations! You've passed.");
		} else if (percentage >= 45) {
			System.out.println("Status: 2nd Division");
			System.out.println("Congratulations! You've passed.");
		} else if (percentage >= 33) {
			System.out.println("Status: 3rd Division");
			System.out.println("Congratulations! You've passed.");
		} else {
			System.out.println("Status: Failed");
			System.out.println("Unfortunately! You're failed because your overall percentage is below 33%.");
		}
		
		sc.close();
	}
}