//3분반 32191826 박주희

class Comedian extends Celebrity {

	//생성자
	protected Comedian(String name, int age) {
		super(name, age); //Celebrity의 생성자 Celebrity(name,age) 호출
	}

	//추상메소드 구현
	@Override
	public void work() {
		System.out.println("사람들을 웃깁니다.");
	}
	@Override
	public void print1() {
		System.out.println("Comedian "+age+"살 "+name+"입니다.");
	}
	
	//(2.4)
	//getter,setter
	public void setage(int age)
	{
		this.age=age;
	}
	public int getage() {
		return age;
	}
	//toString
	public String toString() {
		return "Comedian "+age+"살 "+name;
	}


}
