//3�й� 32191826 ������

class E {
	private int x;
	public static int y;
	
	public E() {  //�Ű������� ���� ������
		this(0,0);  //x,y�� 0���� �ʱ�ȭ
	}
	public E(int x,int y) { //�Ű����� x,y�� �Է¹޴� ������
		//�Ű������� �ʵ� �ʱ�ȭ
		this.x=x;
		this.y=y;
	}
	
	//(2.4)
	//getter,setter
	public void setX(int x) {
		this.x=x;
	}
	public int getX() {
		return x;
	}
	public String toString() {
		return"E[x="+x+" y="+y+"]";
	}

}
