//3분반 32191826 박주희

//(2.1)
/* 추상 클래스란 자손클래스의 공통적인 부분(변수,메소드)를 추출해서 선언한 클래스
 * 실체성이 없고 구체적이기 않기 때문데 추상클래스는 객체를 생성할 수 없다
 * 추상클래스와 자손클래스는 상속관계
 * 추상 메소드란 선언부만 작성하고 구현부는 작성하지 않은 채로 남겨둔 것
 * 상속받는 자손클래스에서 추상메소드를 재정의한다
 * 자손클래스에서 추상메소드를 반드시 구현하도록 강요하기 위해서 사용
 * A가 추상클래스. method1이 추상메소드.
 */
abstract class A {  //추상 클래스
	protected Mode mode;
	protected int v;
	
	//생성자
	protected A(Mode mode,int v)  //매개변수를 가진 생성자
	{
		//매개변수로 필드 초기화
		this.mode=mode;
		this.v=v;
	}
	public abstract void method1(int v);  //추상 메소드
	public void method2() {
		System.out.println("mode="+mode+" v="+v);
	}
	public void method3() {
		System.out.println(this);  //자기 자신 클래스를 print
	}
	public String toString() {
		return "a";
	}
}
