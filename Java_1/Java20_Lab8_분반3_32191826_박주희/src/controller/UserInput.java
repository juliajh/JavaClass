package controller;
import java.util.Scanner;

import dto.State;
import dto.Type;

public class UserInput {
private static Scanner input=new Scanner(System.in);  //scanner ��ü ����
	
	public static String getString() {
		return input.nextLine();  //���� �б�
	}
	public static int getInteger() { //getInteger �޼ҵ� ����
		int value;  //���� value ����
		value=Integer.parseInt(input.nextLine()); //������ �о integer������ parse 
		return value;  //value�� return
	}
	public static double getDouble() {  //getDouble �޼ҵ� ����
		double value=0.0;  //���� value�� 0.0����
		value=Double.parseDouble(input.nextLine());  //������ �о double������ parse
		return value;  //value�� return
		}
	public static Type getType() {
		Type type=Type.valueOf(input.nextLine());  //������ �о� Type�� ���� ��ȯ�Ͽ� ���� type�� ����
		return type;
	}
	public static State getState() {
		State state=State.valueOf(input.nextLine()); //������ �о� State�� ���� ��ȯ�Ͽ� ���� state�� ����
		return state;
	}
	public static boolean getExitKey() {  //getExitKet �޼ҵ� ����
		System.out.print("Press q-ket to exit of enter-key to continue:");  //Press q-ket to exit of enter-key to continue ���
		String str=input.nextLine();  //�� �� �б�
		if(str.contentEquals("q"))  //���� ���� q�̸�
			return true;   //true ��ȯ
		else  //q�� �ƴҰ��
			return false;  //false ��ȯ
	}
	

}
