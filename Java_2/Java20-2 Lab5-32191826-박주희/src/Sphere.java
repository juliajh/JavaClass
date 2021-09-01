//Lab5 32191826 ¹ÚÁÖÈñ

public class Sphere extends Shape3D{
	
	private double radius;
	
	public Sphere() {
		this(1);
	}
	public Sphere(double radius) {
		this.radius = radius;
	}

	@Override
	public double getVolume() {
		return Math.PI*radius*radius*radius*4/3;
	}

	@Override
	public String getName() {
		return "SPHERE";
	}

	@Override
	public void getUserInput() {
		System.out.println("Please enter Sphere Radius: ");
		radius=UserInput.getDouble();
	}
}
