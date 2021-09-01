//Lab5 32191826 ¹ÚÁÖÈñ

//¼Ä¼ºÀÚ Å¬·¡½º
public abstract class ShapeCalculator {
	public abstract Shape createShape(String name);
	
	public void calculate(String name) {
		Shape shape=createShape(name);
		System.out.println("\n"+shape.getName());
		shape.getUserInput();
		shape.calculate();
	}
}
