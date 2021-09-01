//32191826 박주희 비밀번호 9426 Java2 Midterm
package Number2;

import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Shape{
	
	public static java.awt.Shape createRectangle() {
		return new Rectangle2D.Double(130,130,400,400);
	}
	
	public Rectangle() {
		drawShape=createRectangle();
	}
	
	@Override
	public String getDescription() {
		return "Rectangle";
	}

}
