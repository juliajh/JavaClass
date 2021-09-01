//Lab5 32191826 π⁄¡÷»Ò

public class Paralleogram extends Shape2D{
	private double base;
	private double height;
	
	public Paralleogram() {
		this(1,1);
	}
	
	public Paralleogram(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return base*height;
	}
	@Override
	public String getName() {
		return "PARALLEOGRAM";
	}
	@Override
	public void getUserInput() {
		System.out.println("Please enter Paralleogram Base: ");
		base=UserInput.getDouble();
		System.out.println("Please enter Paralleogram Height: ");
		height=UserInput.getDouble();
	}
}
