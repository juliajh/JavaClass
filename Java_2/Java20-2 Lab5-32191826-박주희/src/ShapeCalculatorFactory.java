//Lab5 32191826 박주희

public class ShapeCalculatorFactory{
	//mode로 shape2d와 shape3d 구분
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
