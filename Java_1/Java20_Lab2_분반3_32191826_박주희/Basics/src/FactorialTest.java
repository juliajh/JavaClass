import java.util.*;

public class FactorialTest {

	public static long factorial(int number) {  //factorial �޼ҵ� ����
		long result = 1;  
		for (int i = 1; i <= number; i++)   //���� i�� 1���� number���� �ݺ�
			result = result * i;  //result���� result*i������ ����
		return result;  //return�� return
	}

	public static long recursive(int number) {  //recursive �޼ҵ� ����(factorial �޼ҵ�� ��������δ� ����)
		if (number <= 1)  //number���� 1���� �۰ų� �������
			return 1;  //return 1
		else  //�ƴ� ���
			return number * recursive(number - 1); //recursive �޼ҵ带 �ݺ������� ȣ���Ͽ� ����� ���
	}

	public static void printFactorial(int number) { //printFactorial �޼ҵ� ����
		System.out.printf("%d! = ", number);
		for (int i = number; i >= 1; i--) { //i�� number���� 1���� 1�� �۾����� �ݺ�
			if (i == 1)  //i�� 1�� ���  i= ���·� ���
				System.out.printf("%d = ", i);
			else  //i�� 1�� �ƴ� ��� i* ���·� ���
				System.out.printf("%d * ", i);
		}
	}

	public static void main(String[] args) {
		System.out.printf("Factorial! Please enter integer value: ");

		Scanner scan = new Scanner(System.in);  //scanner ��ü ����
		int n = scan.nextInt();  //���� ��ū�� integer������ ����

		long result1 = factorial(n);  //�޼ҵ� factorial�� n�� �Է����� �� return��(�����)�� result1�� ����
		printFactorial(n);  //�޼ҵ� printFactorial�� �̿��Ͽ� ���
		System.out.printf("%d\n", result1);  //������� ���

		long result2 = recursive(n); //�޼ҵ� recursive�� n�� �Է����� �� return��(�����)�� result2�� ����
		System.out.printf("%d! = %d\n", n, result2);  //������� ���
	}
}