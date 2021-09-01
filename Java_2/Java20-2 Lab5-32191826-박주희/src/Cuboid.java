//Lab5 32191826 π⁄¡÷»Ò

public class Cuboid extends Shape3D {

	private double width;
	private double height;
	private double length;
	
	public Cuboid() {
		this(1,1,1);
	}
	
	public Cuboid(double width, double height, double length) {
		this.width = width;
		this.height = height;
		this.length = length;
	}

	@Override
	public double getVolume() {
		return width*height*length;
	}

	@Override
	public String getName() {
		return "CUBOID";
	}

	@Override
	public void getUserInput() {
		System.out.println("Please enter Cubiod Width: ");
		width=UserInput.getDouble();
		System.out.println("Please enter Cubiod Height: ");
		height=UserInput.getDouble();
		System.out.println("Please enter Cubiod Length: ");
		length=UserInput.getDouble();
	}

}
