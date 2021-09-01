//Lab5 32191826 ¹ÚÁÖÈñ

public class Square extends Shape2D{
	private double side;
	
	public Square() {
		this(1);
	}
	public Square(double side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		return side*side;
	}

	@Override
	public String getName() {
		return "SQUARE";
	}

	@Override
	public void getUserInput() {
		System.out.println("Please enter Square side: ");
		side=UserInput.getDouble();
	}

}
