//3�й� 32191826 ������

//(2.1)
abstract class Celebrity {
	protected String name;
	protected String job;
	protected int age;
	
	//������
	protected Celebrity(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public abstract void work(); //�߻�޼ҵ�
	//������ ���� �ϴ� ���� �ٸ��� ������ �߻�޼ҵ� �̿�
	public abstract void print1();  //�߻�޼ҵ�
	//������ ���� �ڱ�Ұ� �պκ��� �ٸ��� ������ �߻�޼ҵ� �̿�
	public void print2()
	{
		System.out.println(age+"�� "+name+"�Դϴ�.");
	}
	
}
