//Lab5 32191826 π⁄¡÷»Ò

public class Rectangle extends Shape2D {
	private double width;
	private double height;
	
	public Rectangle() {
		this(1,1);
	}

	public Rectangle(double width,double height) {
		this.width=width;
		this.height=height;
	}
	
	@Override
	public double getArea() {
		return width*height;
	}

	@Override
	public String getName() {
		return "RECTANGLE";
	}

	@Override
	public void getUserInput() {
		System.out.println("Please enter Rectangle Width: ");
		width=UserInput.getDouble();
		System.out.println("Please enter Rectangle Height: ");
		height=UserInput.getDouble();
	}

}
