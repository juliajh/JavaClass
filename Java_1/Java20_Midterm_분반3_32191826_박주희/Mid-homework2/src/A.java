//3�й� 32191826 ������

//(2.1)
/* �߻� Ŭ������ �ڼ�Ŭ������ �������� �κ�(����,�޼ҵ�)�� �����ؼ� ������ Ŭ����
 * ��ü���� ���� ��ü���̱� �ʱ� ������ �߻�Ŭ������ ��ü�� ������ �� ����
 * �߻�Ŭ������ �ڼ�Ŭ������ ��Ӱ���
 * �߻� �޼ҵ�� ����θ� �ۼ��ϰ� �����δ� �ۼ����� ���� ä�� ���ܵ� ��
 * ��ӹ޴� �ڼ�Ŭ�������� �߻�޼ҵ带 �������Ѵ�
 * �ڼ�Ŭ�������� �߻�޼ҵ带 �ݵ�� �����ϵ��� �����ϱ� ���ؼ� ���
 * A�� �߻�Ŭ����. method1�� �߻�޼ҵ�.
 */
abstract class A {  //�߻� Ŭ����
	protected Mode mode;
	protected int v;
	
	//������
	protected A(Mode mode,int v)  //�Ű������� ���� ������
	{
		//�Ű������� �ʵ� �ʱ�ȭ
		this.mode=mode;
		this.v=v;
	}
	public abstract void method1(int v);  //�߻� �޼ҵ�
	public void method2() {
		System.out.println("mode="+mode+" v="+v);
	}
	public void method3() {
		System.out.println(this);  //�ڱ� �ڽ� Ŭ������ print
	}
	public String toString() {
		return "a";
	}
}
