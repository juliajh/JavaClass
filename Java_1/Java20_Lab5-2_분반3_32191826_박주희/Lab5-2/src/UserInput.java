
import java.util.Scanner;
public class UserInput {

	static Scanner input=new Scanner(System.in);
	
	//���� ���� ����(number, symbol,name, weight, state)�� ����ڷκ��� �Է¹޾Ƽ� state�� ������ü ��ȯ
	public static PeriodicElement getPeriodicElement()
	{
		int number=input.nextInt(); 
		String symbol=input.next();
		String name=input.next();
		Double weight=input.nextDouble();
		State state=State.valueOf(input.next());  //�Է��� token������ �޾� ���ϴ� ���·� �ٲ� �� ���� number, symbol, name, weight, state�� ����

		return PeriodicElementFactory.getInstance(number, symbol, name, weight, state); 
		//�߻�Ŭ������ �ν��Ͻ� ������ �Ұ� 
		//PeriodicElementFatory.getInstance���� state�� ���� ��ü ����
	}
	
	public static Element getElement() {
		return Element.nameOf(input.nextLine());
	}

}
