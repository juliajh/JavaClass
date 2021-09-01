//Lab5 32191826 ������

public class ShapeCalculatorFactory{
	//mode�� shape2d�� shape3d ����
	public static ShapeCalculator getShapeCalculator(int mode) {
		if(mode==1)
			return new Shape2DCalculator();
		else if(mode==2)
			return new Shape3DCalculator();
		else
			return null;
	}
	
	public static String[] getShapeNames(int mode) {
		if(mode==1) 
			return Shape2DCalculator.names();  
		else if(mode==2)
			return Shape3DCalculator.names(); 
		else
			return null;
	}
}
