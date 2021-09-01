import java.util.Scanner;

public class BasicCalculation {

	public static Scanner scan = new Scanner(System.in);  //scanner 객체 생성

	
	//if를 이용하여 +,-,*,/ 구별
	public static int calc(int x, int y, char op) {
		if (op == '+') return x + y;
		else if (op == '-') return x - y;
		else if (op == '*') return x * y;
		else if (op == '/') return x / y;
		else {
			System.out.println("op not found");
			return 0;
		}
	}
	
	//switch를 이용하여 +,-,*,/ 구별
	public static int calc2(int x, int y, char op) {
		switch(op) {
		case '+': 
			return x + y;
		case '-': 
			return x - y;
		case '*': 
			return x * y;
		case '/': 
			return x / y;
		default:
			System.out.println("op not found");
			return 0;
		}
	}

	static public char getUserInputOp() {
		char value = '\0';
		do {
			System.out.printf("Please enter the operator [+,-,*,/]: ");
			try {
				value = scan.next().charAt(0);
				System.out.println("value=" + value);
			}
			catch (Exception e) {  //사칙 연산 이외의 것이 입력되었을 경우
				System.out.printf("Error! Please re-enter!\n");
				scan.next();
				continue;
			}
		} while (value != '+' && value != '-' && value != '*' && value != '/');
		return value;
	}

	public static void main(String[] args) {

		// for
		for (int i = 0; i < 5; i++) {
			System.out.println("i=" + i);
		}
		// while
		int j = 0;
		while (j < 5) {
			System.out.println("j=" + j);
			j++;
		}
		// do-while
		int k = 0;
		do {
			System.out.println("k=" + k);
			k++;
		} while (k < 5);
		// break (0~4)
		int x = 0;
		while (true) {
			if (x >= 5)
				break;
			System.out.println("x=" + x);
			x++;
		}
		// continue (0~4)
		int y = 0;
		while (y < 5) {
			y++; // (1~5)
			if (y % 2 == 1) // 홀수
				continue;
			System.out.println("y=" + y); // 짝수만 출력
		}
		// for-each
		System.out.print("Please enter two numbers: ");
		x = scan.nextInt();
		y = scan.nextInt();
		char[] ops = {'+', '-', '*', '/', '^'};
		for (char op : ops) {
			int z = calc(x, y, op);
			System.out.printf("z = %d %s %d = %d\n", x, op, y, z);
		}

		// user input
		System.out.print("Please enter two numbers: ");
		x = scan.nextInt();
		y = scan.nextInt();
		char op = getUserInputOp();
		int w = calc2(x, y, op);
		System.out.printf("w = %d %s %d = %d\n", x, op, y, w);

		// prefix vs postfix increment/decrement operator
		int a = 10;
		System.out.println("a=" + a); // 10
		System.out.println("a=" + a++); // 10 and then increase
		System.out.println("a=" + a); // 11

		int b = 20;
		System.out.println("b=" + b); // 20
		System.out.println("b=" + ++b); // increase and then 21
		System.out.println("b=" + b); // 21		
	}

}

