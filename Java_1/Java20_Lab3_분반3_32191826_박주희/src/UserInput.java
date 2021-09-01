import java.util.Scanner;

public class UserInput {
	private static Scanner input=new Scanner(System.in);  //scanner ��ü ����
	
	public static String getString() {
		return input.nextLine();  //���� �б�
	}
	public static int getInteger() { //getInteger �޼ҵ� ����
		int value=0;  //���� value ���� �� 0���� �ʱ�ȭ
		value=Integer.parseInt(input.nextLine()); //������ �о integer������ parse 
		return value;  //value�� return
	}
	public static double getDouble() {  //getDouble �޼ҵ� ����
		double value=0.0;  //���� value�� 0.0����
		value=Double.parseDouble(input.nextLine());  //������ �о double������ parse
		return value;  //value�� return
		}
	public static boolean getExitKey() {  //getExitKet �޼ҵ� ����
		System.out.print("Press q-ket to exit of enter-key to continue:");  //Press q-ket to exit of enter-key to continue ���
		String str=input.nextLine();  //�� �� �б�
		if(str.contentEquals("q"))  //���� ���� q�̸�
			return true;   //true ��ȯ
		else  //q�� �ƴҰ��
			return false;  //false ��ȯ
	}
	
	//getElement from user input(String -> Element) "1" or "Hydrogen" -> HYDROGEN 
	public static Element getElement() {
	    Element element=null;  //�ʱ�ȭ
		String str=input.nextLine();  //�Է¹��� ���� str�� ����
		element=Element.nameOf(str);  //Element�� nameOf�� str�� �Է��Ͽ� �װ��� element�� ����
		return element; 
		
	}
}
