package codeWithHarry;

public class CWH_31_Methods {
	static int logic(int x, int y) {
		int z;
		if(x > y) {
			z = x - y;
		}else {
			z = x + y;
		}
		return z;
	}
	
	int logic2(int x, int y) {
		int z;
		if(x > y) {
			z = x - y;
		}else {
			z = x + y;
		}
		return z;
	}
	
	static void logic3(int x, int y) {
		int z;
		if(x > y) {
			z = x - y;
			System.out.println(z);
		}else {
			z = x + y;
			System.out.println(z);
		}
	}
	
	void logic4(int x, int y) {
		int z;
		if(x > y) {
			z = x - y;
			System.out.print(z);
		}else {
			z = x + y;
			System.out.println(z);
		}
	}
	
	static int vArgs(int ... arr) {
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		return sum;
	}
	
	static void vArgs2(int ... arr) {
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	static int factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}else {
			return n * factorial(n - 1);
		}
	}
	
	public static void main(String [] args) {
//		// You can direct use the integer method if the method is static
//		int a = 14;
//		int b = 5;
//		int c = logic(a, b);
//		System.out.println("Result by using static int method : " + c);
//		
//		// You've to call an object from the class when the integer method is non-static
//		CWH_31_Methods obj = new CWH_31_Methods();
//		int a1 = 5;
//		int b1 = 9;
//		int c1 = obj.logic2(a1, b1);
//		System.out.println("Result by using object invocation non-static int method : " + c1);
//		
//		// You can direct use the method if the method is static
//		System.out.print("Result by using static void method : ");
//		logic3(4, 7);
//		
//		// You've to call an object from the class when the method is non-static
//		CWH_31_Methods obj2 = new CWH_31_Methods();
//		System.out.print("Result by using object invocation non-static int method : ");
//		obj2.logic4(6, 2);
//		
//		// By using method type integer
//		System.out.println("\nResult by using integer type variable arguments : "+ vArgs(4, 5, 6, 8));
//		
//		// By using method type void
//		System.out.print("Result by using void type variable arguments : ");
//		vArgs2(4, 5, 6, 9);
//		
//		// You can direct use the integer method if the method is static
//		int n = 10;
//		System.out.println("Factorial of n : " + factorial(n));
		
	}
}