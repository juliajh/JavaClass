//Lab5 32191826 ������

import java.util.Scanner;

public class UserInput {

	//double���� �Է¹޴� �޼ҵ�
	public static double getDouble() {
		Scanner scanner=new Scanner(System.in);
		double d=scanner.nextDouble();
		return d;
	}

	//integer�� �Է¹ް� i�� j������ ������ ��� �� �� ��ȯ �ƴ� �� �ٽ� �Է��ϵ���
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
				System.out.println("���ڸ� �ٽ� �Է��ϼ���");
			}
		}
		return result;
	}
		

}
