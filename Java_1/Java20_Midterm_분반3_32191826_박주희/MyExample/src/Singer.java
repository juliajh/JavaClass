//3�й� 32191826 ������

class Singer extends Celebrity {

	//������
	protected Singer(String name,int age) {
		super(name,age);  //Celebrity�� ������ Celebrity(name,age) ȣ��
		
	}
	//�߻�޼ҵ� ����
	@Override
	public void work() {
		System.out.println("�뷡�մϴ�.");
	}
	@Override
	public void print1() {
		System.out.println("Singer "+age+"�� "+name+"�Դϴ�.");
		
	}

}
