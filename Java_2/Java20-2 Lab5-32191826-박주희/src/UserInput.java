//Lab5 32191826 박주희

import java.util.Scanner;

public class UserInput {

	//double값을 입력받는 메소드
	public static double getDouble() {
		Scanner scanner=new Scanner(System.in);
		double d=scanner.nextDouble();
		return d;
	}

	//integer를 입력받고 i와 j사이의 숫자일 경우 그 값 반환 아닐 시 다시 입력하도록
	public static int getIntegerBetween(int i, int j) {
		int result=0;
		while(true) {
			Scanner scanner=new Scanner(System.in);
			int num=scanner.nextInt();
			if ((num>=i)&&(num<=j)) 
			{
				result=num;
				break;
			}
			else
			{
				System.out.println("숫자를 다시 입력하세요");
			}
		}
		return result;
	}
		

}
