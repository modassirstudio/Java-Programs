package codeWithHarry;

public class CWH_32_Practice_Set {
	static void multiplicationTable(int n) {
		for(int i = 1; i <= 10; i++) {
			System.out.format("%d X %d = %d\n", n, i, n*i);
		}
	}
	
	static void printPattern(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static int factorialSum(int n) {
		if(n > 0) {
			return n + factorialSum(n - 1);
		}else {
			return 0;
		}
	}
	
	static void printPattern2(int n) {
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String [] args) {
		multiplicationTable(5);
		printPattern(4);
		int n = 6;
		System.out.println(factorialSum(n));
		printPattern2(4);
	}
}
