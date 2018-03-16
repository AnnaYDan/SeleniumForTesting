package miniCalc;

public class SmThing {

	public static void main(String[] args) {
		// this code is using MiniCalcMethod class
		
		// calling and verifying output with expecting result
		MiniCalcMethod.division(8, 2); // printed 4 
		System.out.println(MiniCalcMethod.multiplication(2, 5)); // I will  see 10
		System.out.println(MiniCalcMethod.subtraction(2, 2)); // I will  see 0
		System.out.println(MiniCalcMethod.summarizing(1, 99)); // I will  see 100

		// declare a variable <type> <name> = <value>;
		/*  int i = 1; boolean check = true; double f = 0.9; int k = 23; int l = 676;  */
		
		// printing a string
		String myBestStrinEver = "Hello          >>>>>      ";
		System.out.println(myBestStrinEver + (12 + 3) + " string concationation");

		// declare variables for calculator
		int a = 85;
		int b = 5;
		// printing sum for a and b
		System.out.println("Sum a and b inside printing " + (a + b));
		
		// calculator subtraction
		int sub = a - b;
		System.out.println("Subtraction " + sub);
		
		// calculator multiplication
		int mult = a * b;
		System.out.println("Multiplication " + mult);
		
		// calculator division
		int div = a / b;
		System.out.println("Division " + div);
		
		// calling sum method
		sum(2, 5);
		sum(10, 100);
		sum(5825, 2356);

		int s1 = sub(1000, 2); // output 998
		int s2 = sub(5, 3); // output 2
		System.out.println(sub(s1,s2)); // output 996
	
	}

	// calculator sum method
	public static void sum(int k, int l) {
		int result = k + l;
		System.out.println("Sumarize " + result);
		
	}
	
	// calculator subtraction method
	public static int sub(int m, int n) {
	int result = m - n;
	return result;
	}
}
