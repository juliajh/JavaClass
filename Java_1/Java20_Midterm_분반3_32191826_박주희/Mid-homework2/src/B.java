//3분반 32191826 박주희

class B extends A {

	//생성자
	protected B(int v) { //매개변수를 가진 생성자
		super(Mode.B, v);  //A의 생성자 A(mode,v) 호출
	}
	public void method1(int v) {
		System.out.println("b1="+v);
	}
	public String toString() {
		return "b";
	}
}
