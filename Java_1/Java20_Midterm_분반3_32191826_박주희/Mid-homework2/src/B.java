//3�й� 32191826 ������

class B extends A {

	//������
	protected B(int v) { //�Ű������� ���� ������
		super(Mode.B, v);  //A�� ������ A(mode,v) ȣ��
	}
	public void method1(int v) {
		System.out.println("b1="+v);
	}
	public String toString() {
		return "b";
	}
}
