//3분반 32191826 박주희

class Actor extends Celebrity {

	//생성자
	protected Actor(String name,int age) {
		super(name,age);  //Celebrity의 생성자 Celebrity(name,age) 호출
		
	}
	//추상메소드 구현
	@Override
	public void work() {
		System.out.println("연기합니다.");
	}
	@Override
	public void print1() {
		System.out.println("Actor "+age+"살 "+name+"입니다.");
		
	}
}
