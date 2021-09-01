//Lab5 32191826 π⁄¡÷»Ò

public class ShapeMainTest {

	public static void main(String[] args) {
		System.out.println("Please select 1(Shape2DCalculator) or 2(Shape3DCalculator): ");
		int mode=UserInput.getIntegerBetween(1,2); 
		ShapeCalculator shapeCalculator=ShapeCalculatorFactory.getShapeCalculator(mode);
		String[] names=ShapeCalculatorFactory.getShapeNames(mode);
		for(String name:names) {
			shapeCalculator.calculate(name);  
		}
	}
}
