//Lab5 32191826 ¹ÚÁÖÈñ

public class Cone extends Shape3D {

	private double radius;
	private double height;
	
	public Cone() {
		this(1,1);
	}
	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double getVolume() {
		return radius*radius*Math.PI*height/3;
	}

	@Override
	public String getName() {
		return "CONE";
	}

	@Override
	public void getUserInput() {
		System.out.println("Please enter Cone Radius: ");
		radius=UserInput.getDouble();
		System.out.println("Please enter Cone Height: ");
		height=UserInput.getDouble();
	}

}
