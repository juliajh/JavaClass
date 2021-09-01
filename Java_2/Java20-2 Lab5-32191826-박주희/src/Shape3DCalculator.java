//Lab5 32191826 ������

public class Shape3DCalculator extends ShapeCalculator{

	//name�� �޾Ƽ� �ش� ��ü�� �����ϴ� �޼ҵ�
	@Override
	public Shape3D createShape(String name) {
		Shape3D shape3D=null;
		if(name.equals("cuboid"))
			shape3D=new Cuboid();
		else if(name.equals("cylinder"))
			shape3D=new Cylinder();
		else if(name.equals("sphere"))
			shape3D=new Sphere();
		else if(name.equals("pyramid"))
			shape3D=new Pyramid();
		else if(name.equals("cone"))
			shape3D=new Cone();
		return shape3D;
		
	}

	//shape3d �������� �̸��� ��ȯ�ϴ� �޼ҵ�
	public static String[] names() {
		String[] names={"cuboid","cylinder","sphere","pyramid","cone"};
		return names;
	}

}
