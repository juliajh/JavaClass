//3�й� 32191826 ������

class Comedian extends Celebrity {

	//������
	protected Comedian(String name, int age) {
		super(name, age); //Celebrity�� ������ Celebrity(name,age) ȣ��
	}

	//�߻�޼ҵ� ����
	@Override
	public void work() {
		System.out.println("������� ����ϴ�.");
	}
	@Override
	public void print1() {
		System.out.println("Comedian "+age+"�� "+name+"�Դϴ�.");
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
		return "Comedian "+age+"�� "+name;
	}


}
