//32191826 ������ ��й�ȣ 9426 Java2 Midterm
package Number2;

import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;

public class Circle extends Shape{
	public static java.awt.Shape createCircle() {
		return new Ellipse2D.Double(100,100,400,400);
	}
	
	public Circle() {
		drawShape=createCircle();
	}
	
	@Override
	public String getDescription() {
		return "Circle";
	}

}
