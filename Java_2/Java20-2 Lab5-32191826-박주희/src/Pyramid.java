//Lab5 32191826 ������

public class Pyramid extends Shape3D {

	private double base; //�ظ��� �Ѻ� ����
	private double height;
	
	public Pyramid(double base, double height) {
		this.base = base;
		this.height = height;
	}
	public Pyramid() {
		this(1,1);
	}

	@Override
	public double getVolume() {
		return base*base*height/3;
	}

	@Override
	public String getName() {
		return "PYRAMID";
	}

	@Override
	public void getUserInput() {
		System.out.println("Please enter Pyramid Base: ");
		base=UserInput.getDouble();
		System.out.println("Please enter Pyramid Height: ");
		height=UserInput.getDouble();
	}

}
