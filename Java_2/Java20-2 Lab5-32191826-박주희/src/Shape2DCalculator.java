//Lab5 32191826 ������

public class Shape2DCalculator extends ShapeCalculator{

	//name�� �޾Ƽ� �ش� ��ü�� �����ϴ� �޼ҵ�
	@Override
	public Shape2D createShape(String name) {
		Shape2D shape2D=null;
		if(name.equals("triangle"))
			shape2D=new Triangle();
		else if(name.equals("square"))
			shape2D= new Square();
		else if(name.equals("rectangle"))
			shape2D=new Rectangle();
		else if(name.equals("trapeziod"))
			shape2D=new Trapeziod();
		else if(name.equals("paralleogram"))
			shape2D= new Paralleogram();
		else if(name.equals("kite"))
			shape2D=new Kite();
		else if(name.equals("circle"))
			shape2D=new Circle();
		return shape2D;
		
	}
	
	//shape2d �������� �̸��� ��ȯ�ϴ� �޼ҵ�
	public static String[] names() {
		String[] names={"triangle","square","rectangle","trapeziod","paralleogram","kite","circle"};
		return names;
	}

}
