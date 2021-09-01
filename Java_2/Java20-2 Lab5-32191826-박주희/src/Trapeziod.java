//Lab5 32191826 π⁄¡÷»Ò

public class Trapeziod extends Shape2D {
	private double top;
	private double bottom;
	private double height;
	
	public Trapeziod() {
		this(1,1,1);
	}

	public Trapeziod(double top,double bottom,double height) {
		this.top=top;
		this.bottom=bottom;
		this.height=height;
	}
	
	@Override
	public double getArea() {
		return (top+bottom)*height/2;
	}

	@Override
	public String getName() {
		return "TRAPEZIOD";
	}

	@Override
	public void getUserInput() {
		System.out.println("Please enter Trapeziod top: ");
		top=UserInput.getDouble();
		System.out.println("Please enter Trapeziod bottom: ");
		bottom=UserInput.getDouble();
		System.out.println("Please enter Trapeziod height: ");
		height=UserInput.getDouble();
	}

}
