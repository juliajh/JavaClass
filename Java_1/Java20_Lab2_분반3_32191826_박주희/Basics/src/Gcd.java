import java.util.*;

public class Gcd {
	public static void main(String[] args) {
		int x, y, r;  //���� x,y,z ����
		System.out.print("�ΰ��� ������ �Է��Ͻÿ�(ū��, ������): ");
		Scanner scan = new Scanner(System.in);  //scanner ��ü ����
		x = scan.nextInt();  //���� ��ū�� int Ÿ������ ����
		y = scan.nextInt();  //���� ��ū�� int Ÿ������ ����
		while (y != 0) {  //y�� 0�� �ƴ� ����
			r = x % y;  //r�� x�� y�� ���� ������ ����
			x = y;  //x�� y�� ����
			y = r;  //y�� r�� ����
		}  //x���� �ִ�����
		System.out.println("�ִ� ������� " + x);  //�ִ������� ���
	}
}