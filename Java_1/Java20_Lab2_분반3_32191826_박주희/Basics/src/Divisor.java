import java.util.Scanner;

public class Divisor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //scanner��ü ����
		System.out.print("���� ������ �Է��Ͻÿ�: ");
		int n = scan.nextInt();  //���� ��ū ���� integer������ ����

		System.out.println(n + "�� ����� ������ �����ϴ�.");
		for (int i = 1; i <= n; ++i) { //���� i�� 1���� n���� �ݺ�
			if (n % i == 0) //n�� i�� ���� �������� 0�� ��� -> ����� ���
				System.out.print(" " + i);  //����� ���
		}
	}
}