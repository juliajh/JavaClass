//3분반 32191826 박주희

//(2.1)
abstract class Celebrity {
	protected String name;
	protected String job;
	protected int age;
	
	//생성자
	protected Celebrity(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public abstract void work(); //추상메소드
	//직업에 따라 하는 일이 다르기 때문에 추상메소드 이용
	public abstract void print1();  //추상메소드
	//직업에 따라 자기소개 앞부분이 다르기 때문에 추상메소드 이용
	public void print2()
	{
		System.out.println(age+"살 "+name+"입니다.");
	}
	
}
