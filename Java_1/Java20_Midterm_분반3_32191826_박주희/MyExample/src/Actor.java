//3�й� 32191826 ������

class Actor extends Celebrity {

	//������
	protected Actor(String name,int age) {
		super(name,age);  //Celebrity�� ������ Celebrity(name,age) ȣ��
		
	}
	//�߻�޼ҵ� ����
	@Override
	public void work() {
		System.out.println("�����մϴ�.");
	}
	@Override
	public void print1() {
		System.out.println("Actor "+age+"�� "+name+"�Դϴ�.");
		
	}
}
