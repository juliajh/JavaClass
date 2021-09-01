import java.util.Scanner;

public class ArithmeticOperator {

	// enum
	enum Operation {
		PLUS(1),
		MINUS(2),
		TIMES(3),
		DIVIDE(4);

		private final int value;
		Operation(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}

		double calculate(double x, double y) {
			switch (this) {
				case PLUS:
					return x + y;
				case MINUS:
					return x - y;
				case TIMES:
					return x * y;
				case DIVIDE:
					return x / y;
				default:
					throw new AssertionError("Unknown operations " + this);
			}
		}
	}

	// user input
	static Scanner scan = new Scanner(System.in);
	static public Operation getUserInputOp() {
		char value = scan.next().charAt(0);
		switch(value) {
			case '+': return Operation.PLUS;
			case '-': return Operation.MINUS;
			case '*': return Operation.TIMES;
			case '/': return Operation.DIVIDE;
			default: System.out.printf("Unknown operations\n"); return null;
		}
	}

	/*static public char getUserInputChar() {
		char value = scan.next().charAt(0);
		return value;
	}*/
	static public char getUserInputChar() {
		char value = '\0';
		do {
			System.out.printf("Please enter the operator [+,-,*,/]: ");
			try {
				value = scan.next().charAt(0);
				System.out.println("value=" + value);
			}
			catch (Exception e) {
				System.out.printf("Error! Please re-enter!\n");
				scan.next();
				continue;
			}
		} while (value != '+' && value != '-' && value != '*' && value != '/');
		return value;
	}

	//  integer[min-max] user input using try/catch
	/*static public int getUserInputIntegerBetween(int min, int max) {
		int value = scan.nextInt();
		return value;
	}*/
	static public int getUserInputIntegerBetween(int min, int max) {
		int value = 0;
		do {
			System.out.printf("Please enter value [%d-%d]: ", min, max);
			try {
				value = scan.nextInt();
			}
			catch (Exception e) {
				System.out.printf("Error! Please re-enter!\n");
				scan.next();
				continue;
			}
		} while (value < min || value > max);
		return value;
	}
	/*public static double getUserInputDouble() {
    	double value = scan.nextDouble();
        return value;
	}*/
	// double user input using try/catch
	static public double getUserInputDouble() {
		 double value;
		 while(true) {
			 try {
				 value = scan.nextDouble();
				 break;
			 }
			 catch (Exception e) {
				 System.out.print("Error! Please re-enter [double value]: ");
				 scan.next();
			 }
		 }
		 return value;
	}

	// get two double numbers
	public static double[] getUserInputTwoDoubleNumbers() {
		double[] numbers = new double[2];
		System.out.print("Please enter the first number: ");
		numbers[0] = getUserInputDouble();
		System.out.print("Please enter the second number: ");
		numbers[1] = getUserInputDouble();
		return numbers;
	}

	// +-*/ operation
	public static void operationByUserInput(double num1, double num2, int op) {
		double result = 0.0;
		switch(op) {
		case 1:
			result = Operation.PLUS.calculate(num1, num2);
			System.out.printf( "%f + %f = %f\n", num1, num2, result);
			break;
		case 2:
			result = Operation.MINUS.calculate(num1, num2);
			System.out.printf( "%f - %f = %f\n", num1, num2, result);
			break;
		case 3:
			result = Operation.TIMES.calculate(num1, num2);
			System.out.printf( "%f * %f = %f\n", num1, num2, result);
			break;
		case 4:
			result = Operation.DIVIDE.calculate(num1, num2);
			System.out.printf( "%f / %f = %f\n", num1, num2, result);
			break;
		default:
			System.out.printf("Unknown operations\n");
			break;
		}
	}

	public static void main(String[] args) {

		//System.out.print("Please select the operation. Enter the char [+, -, *, /]:");
		//char c = getUserInputChar();
		//System.out.printf("You entered: %s", c);
		
		double[] numbers;
		// select the operation and then do operation
		System.out.print("Please select the operation. Enter the char [+, -, *, /]:");
		Operation op = getUserInputOp();
		if (op != null) {
			numbers = getUserInputTwoDoubleNumbers();
			operationByUserInput(numbers[0], numbers[1], op.getValue());
		}

		// select the operation and then do operation
		System.out.print("Please select the operation. Enter the number [1.PLUS, 2.MINUS, 3.TIMES, 4.DIVIDE]:");
		int value = getUserInputIntegerBetween(1, 4);
		numbers = getUserInputTwoDoubleNumbers();
		operationByUserInput(numbers[0], numbers[1], value);

		// do all operations
		System.out.println("Calculate PLUS, MINUS, TIMES, and DIVIDE operations");
		numbers = getUserInputTwoDoubleNumbers();
		double sum = Operation.PLUS.calculate(numbers[0], numbers[1]);
        double diff = Operation.MINUS.calculate(numbers[0], numbers[1]);
        double mul = Operation.TIMES.calculate(numbers[0], numbers[1]);
        double div = Operation.DIVIDE.calculate(numbers[0], numbers[1]);
        System.out.printf( "%f + %f = %f\n", numbers[0], numbers[1], sum );
        System.out.printf( "%f - %f = %f\n", numbers[0], numbers[1], diff );
        System.out.printf( "%f * %f = %f\n", numbers[0], numbers[1], mul );
        System.out.printf( "%f / %f = %f\n", numbers[0], numbers[1], div );

		// do all operations
		System.out.println("Calculate PLUS, MINUS, TIMES, and DIVIDE operations");
        double[][] nums = { {2.5, 1.5}, {4.5, 5.5}, {10.5, 3.5}, {7.5, 8.5}};
		for (int i=0; i<4; i++) {
			operationByUserInput(nums[i][0], nums[i][1], i+1);
		}
		
	}
}



