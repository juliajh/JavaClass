import java.util.*;

public class CheckUserInput {

	static Scanner scan = new Scanner(System.in);  //scanner 객체 생성
	static public int getUserInputIntegerBetween(int min, int max) {  //getUserInputIntegerBetween 메소드 생성
		int value = 0;  //변수 value값을 생성하고 0으로 초기화
		do {  //while 뒤 조건문이 true일 동안 실행
			System.out.printf("Please enter value [%d-%d]: ", min, max);
			try {
				value = scan.nextInt(); //다음 토큰 값을 integer형으로 리턴
			}
			catch (Exception e) {  //Exception e 예외가 뜰 때
				System.out.printf("Error! Please re-enter!\n");
				scan.next();  //다음 토큰 값 리턴
				continue;
			}
		} while (value < min || value > max);  //value값이 min보다 작거나 value값이 max보다 클때
		return value; //value값 return
	}

	static public double getUserInputDouble() {
		 double value;
		 while(true) {
			 try {
				 value = scan.nextDouble();  //다음 토큰 값을 double형으로 리턴
				 break;
			 }
			 catch (Exception e) {
				 System.out.print("Error! Please re-enter [double value]: ");
				 scan.next();
			 }
		 }
		 return value;
	}
	
	/*public static double[] getUserInput() {
		double[] numbers = new double[2];
		System.out.print("Please enter the first number: ");
		numbers[0] = getUserInputDouble();
		System.out.print("Please enter the second number: ");
		numbers[1] = getUserInputDouble();
		return numbers;
	}
	*/
	
	public static void main(String args[]) {
		int value = getUserInputIntegerBetween(1, 12);
		System.out.println("User entered: " + value); 
	}
}