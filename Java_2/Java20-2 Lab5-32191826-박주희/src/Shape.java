//Lab5 32191826 ������

public abstract class Shape {
	//�������� name�� �Է¹޴� ���� �ٸ��Ƿ� abstract method
	public abstract String getName();  
	public abstract void getUserInput();
	
	//��갪�� ����ϴ� �޼ҵ�
	public void calculate() {
		//shape2d�� getArea()�� ���̸� ���ؾ��ϰ� shape3d�� getVolume()�� ���Ǹ� ���ؾ��ϹǷ� ���ǹ� �̿�
		if(this instanceof Shape2D)  //Shape2D�� ��ü���
		{
			Shape2D shape2d=(Shape2D)this; //���ǹ��� ���� shape2d ��ü���� �˾����Ƿ� ������ ����ȯ
			if(shape2d instanceof Circle) {
				System.out.println("Area Calculate: "+shape2d.getArea());
				Circle circle=(Circle)shape2d;
				circle.draw();
			}
			else {
				System.out.println("Area Calculate: "+shape2d.getArea());
			}
		}
		else if(this instanceof Shape3D)  //Shape3D�� ��ü���
		{
			Shape3D shape3d=(Shape3D)this;  ////���ǹ��� ���� shape3d ��ü���� �˾����Ƿ� ������ ����ȯ
			System.out.println("Volume Calculate: "+shape3d.getVolume());
		}
	}
}
