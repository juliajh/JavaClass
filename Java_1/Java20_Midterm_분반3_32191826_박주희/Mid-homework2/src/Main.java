//3분반 32191826 박주희

public class Main {

	public static void main(String[] args) {
		//(2.2)
		//A a1=new A();  //추상클래스 A는 객체 생성이 불가하다.
		//A a2=new B();  //생성자 B()는 없다. B클래스는 매개변수를 가진 생성자만 가지고 있지만 new B()는 매개변수가 없기 때문에 오류난다.
		//B 클래스에는 매개변수를 가진 생성자가 작성되어 있기 때문에 컴파일러는 기본 생성자를 만들어주지 않는다.
		A a3=new C(20);   //업캐스팅 발생
		C a4=(C)a3;   //다운캐스팅:업캐스팅된 것을 다시 원래대로 되돌리는 것
		//B a5=new D(30); //자식 클래스끼리는 변환 불가하다.
		//D a6=(D)a3;  //a3는 이미 C클래스 타입이므로 D클래스 타입으로 변환할 수 없다.

		//(2.3)
		A[] elements= {new C(10),new B(20),new D(30)}; //A[] 배열 생성
		//new C,new B,new A를 생성해서 배열에 저장한다.
		for(int i=0;i<elements.length;i++) { //각 원소들을 메소드에 따라 출력
			elements[i].method1(i);
			elements[i].method2();
			elements[i].method3();
		}
		
		/*실행결과:
		 * c1=0
		 * mode=C v=10
		 * c
		 * b1=1
		 * mode=B v=20
		 * b
		 * d1=2
		 * mode=D v=30
		 */
		
		//(2.5)
		E e1= new E();  //E 객체 생성
		//e1.x=100;  //x가 private 변수이므로 E클래스 외부에서 접근이 불가하다.
		//e1.setX(100);으로 수정하여야 한다.
		E.y=100;  //y가 static변수이기 떄문에 E.y 가능
		//static변수가 아닐 경우 e1.y=100
		System.out.println(e1);
		

	}

}
