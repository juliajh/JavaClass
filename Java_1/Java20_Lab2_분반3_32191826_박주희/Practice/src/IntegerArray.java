import java.util.Scanner;

public class IntegerArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		int[] integerArray = new int[3];
		integerArray[0] = 1;
		integerArray[1] = 2;
		integerArray[2] = 3;

		for (int i : integerArray) //integerArray�� ��� ���� �� ���
		    System.out.println(i); 

		for (int j = 0; j < integerArray.length; j++)  //integerArray�� ��� ���� �� ���
		    System.out.println(integerArray[ j ]);

		int k = 0;
		while (k < integerArray.length)  //integerArray�� ��� ���� �� ���
		    System.out.println(integerArray[k++]);
		// int array
		// ���� int value1�� for������ ������ ����Ѵ��ص� 
		// intArray1[i]�� ���� ���Ƿ� ���� �ٸ� �Է°��� ���� ��
		int value1 = 0;
		int[] intArray1 = new int[3];
		for (int i = 0; i < intArray1.length; i++) {  //i�� 0���� (intArray1�� length��-1)���� �ݺ�
			System.out.print("Please enter int number: ");
			value1 = scan.nextInt(); //���� ��ū ���� integer���·� ����
			intArray1[i] = value1;  //value1���� intArray1�� i��° ���ҷ� ����
		}
		for (int v : intArray1)	System.out.println(v); //intArray1�� ��� ���� ���

		// int value2�� for������ ���ο��� �Ź� �����ؼ� ����Ѵ��ص� 
		// intArray2[i]�� ���� ���Ƿ� ���� �ٸ� �Է°��� ���� ��
		int[] intArray2 = new int[3];
		for (int i = 0; i < intArray1.length; i++) {
			System.out.print("Please enter int number: ");
			int value2 = scan.nextInt(); 
			intArray2[i] = value2;
		}
		for (int v : intArray2)	System.out.println(v); 

	}

}
