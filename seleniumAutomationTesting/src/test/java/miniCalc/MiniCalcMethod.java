package miniCalc;

public class MiniCalcMethod {
	// java class with method for mini calculator
	
	// multiplication
	public static int multiplication(int number1, int number2) {
		int result = number1 * number2;
		return result;
	}
	
	// division
	public static void division(int divNum1, int divNum2) {
		int result = divNum1 / divNum2;
		System.out.println(result);
	}

	// subtraction
	public static int subtraction(int subNum1, int subNum2) {
		int result = subNum1 - subNum2;
		return result;
	}
	
	// sum
	public static int summarizing(int sumNum1, int sumNum2) {
		int result = sumNum1 + sumNum2;
		return result;
	}

}
