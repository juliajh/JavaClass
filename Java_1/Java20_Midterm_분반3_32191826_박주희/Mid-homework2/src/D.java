//3분반 32191826 박주희

class D extends A {
	public D(int v) {
		super(Mode.D,v);   //A의 생성자 A(mode,v) 호출
	}
	public void method1(int v) {
		System.out.println("d1="+v);
	}
}
