//Lab5 32191826 박주희

public class Shape2DCalculator extends ShapeCalculator{

	//name를 받아서 해당 객체를 생성하는 메소드
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
	
	//shape2d 도형들의 이름을 반환하는 메소드
	public static String[] names() {
		String[] names={"triangle","square","rectangle","trapeziod","paralleogram","kite","circle"};
		return names;
	}

}
