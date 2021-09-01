//Lab5 32191826 π⁄¡÷»Ò

public class Kite extends Shape2D{
	public double horizontalDiagonal;
	public double verticalDiagonal;
	
	public Kite() {
		this(1,1);
	}
	public Kite(double horizontalDiagonal, double verticalDiagonal) {
		super();
		this.horizontalDiagonal = horizontalDiagonal;
		this.verticalDiagonal = verticalDiagonal;
	}

	@Override
	public double getArea() {
		return horizontalDiagonal*verticalDiagonal/2;
	}

	@Override
	public String getName() {
		return "KITE";
	}

	@Override
	public void getUserInput() {
		System.out.println("Please enter Kite Horizontaldiagonal: ");
		horizontalDiagonal=UserInput.getDouble();
		System.out.println("Please enter Paralleogram Verticaldiagonal: ");
		verticalDiagonal=UserInput.getDouble();
	}

}
