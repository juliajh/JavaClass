//Lab5 32191826 ¹ÚÁÖÈñ

public class Triangle extends Shape2D {
	private double base;
	private double height;
	
	public Triangle() {
		this(1,1);
	}
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return base*height/2.0;
	}
	@Override
	public String getName() {
		return "TRANGLE";
	}
	@Override
	public void getUserInput() {
		System.out.println("Please enter Triangle Base: ");
		base=UserInput.getDouble();
		System.out.println("Please enter Triangle Height: ");
		height=UserInput.getDouble();
	}
	
	
	

}
