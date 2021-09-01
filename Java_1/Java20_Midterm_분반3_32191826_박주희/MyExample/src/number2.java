//3분반 32191826 박주희

public class number2 {
	public static void main(String[] args) {
		//(2.2)
		Celebrity a1=new Singer("김영지",22);
		Celebrity a2=new Actor("신정우",22);
		a1.print2();
		a2.print2();
		System.out.println();
		
		//(2.3)
		Celebrity[] people= {new Singer("박주희",22),new Actor("이건우",24)};
		for(Celebrity i:people)  //반복될 때마다 i는 Celebrity[0],Celebrity[1],...값으로 설정된다.
		{
			i.print1(); 
			i.print2();
			i.work();
			//각 원소들을 메소드에 따라 출력한다.
		}
		
		//(2.5)
		Comedian a3=new Comedian("박주영",88); //Comedian 객체 생성
		a3.setage(17); //a3.age가 88에서 17로 바뀐다.
		//age는 static변수가 아니기 때문에 Comedian.age=17는 오류난다.
		System.out.println(a3);
	}

}
