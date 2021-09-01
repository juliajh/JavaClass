
import java.util.Scanner;
public class UserInput {

	static Scanner input=new Scanner(System.in);
	
	//각각 원소 정보(number, symbol,name, weight, state)를 사용자로부터 입력받아서 state에 따른객체 반환
	public static PeriodicElement getPeriodicElement()
	{
		int number=input.nextInt(); 
		String symbol=input.next();
		String name=input.next();
		Double weight=input.nextDouble();
		State state=State.valueOf(input.next());  //입력을 token단위로 받아 원하는 형태로 바꾼 후 각각 number, symbol, name, weight, state에 저장

		return PeriodicElementFactory.getInstance(number, symbol, name, weight, state); 
		//추상클래스는 인스턴스 생성이 불가 
		//PeriodicElementFatory.getInstance에서 state에 따른 객체 리턴
	}
	
	public static Element getElement() {
		return Element.nameOf(input.nextLine());
	}

}
