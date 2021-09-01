import java.util.*;

public class CheckUserInput {

	static Scanner scan = new Scanner(System.in);  //scanner ��ü ����
	static public int getUserInputIntegerBetween(int min, int max) {  //getUserInputIntegerBetween �޼ҵ� ����
		int value = 0;  //���� value���� �����ϰ� 0���� �ʱ�ȭ
		do {  //while �� ���ǹ��� true�� ���� ����
			System.out.printf("Please enter value [%d-%d]: ", min, max);
			try {
				value = scan.nextInt(); //���� ��ū ���� integer������ ����
			}
			catch (Exception e) {  //Exception e ���ܰ� �� ��
				System.out.printf("Error! Please re-enter!\n");
				scan.next();  //���� ��ū �� ����
				continue;
			}
		} while (value < min || value > max);  //value���� min���� �۰ų� value���� max���� Ŭ��
		return value; //value�� return
	}

	static public double getUserInputDouble() {
		 double value;
		 while(true) {
			 try {
				 value = scan.nextDouble();  //���� ��ū ���� double������ ����
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