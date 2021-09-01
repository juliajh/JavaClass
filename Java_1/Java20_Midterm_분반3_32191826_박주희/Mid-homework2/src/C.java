//3분반 32191826 박주희

class C extends A{
	public C(int v) {
		super(Mode.C,v);   //A의 생성자 A(mode,v) 호출
	}
	public void method1(int v){
		System.out.println("c1="+v);
	}
	public String toString() {
		return "c";
	}

}
