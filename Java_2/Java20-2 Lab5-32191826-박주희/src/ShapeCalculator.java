//Lab5 32191826 ������

//�ļ��� Ŭ����
public abstract class ShapeCalculator {
	public abstract Shape createShape(String name);
	
	public void calculate(String name) {
		Shape shape=createShape(name);
		System.out.println("\n"+shape.getName());
		shape.getUserInput();
		shape.calculate();
	}
}
