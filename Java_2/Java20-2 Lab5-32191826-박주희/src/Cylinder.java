//Lab5 32191826 ¹ÚÁÖÈñ

public class Cylinder extends Shape3D{
	
	private double radius;
	private double length;
	
	public Cylinder() {
		this(1,1);
	}
	public Cylinder(double radius, double length) {
		this.radius = radius;
		this.length = length;
	}

	@Override
	public double getVolume() {
		return Math.PI*radius*radius*length;
	}

	@Override
	public String getName() {
		return "CYLINDER";
	}

	@Override
	public void getUserInput() {
		System.out.println("Please enter Cylinder Radius: ");
		radius=UserInput.getDouble();
		System.out.println("Please enter Cubiod Length: ");
		length=UserInput.getDouble();
	}

}
