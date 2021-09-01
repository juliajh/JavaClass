//32191826 박주희 비밀번호 9426 Java2 Midterm

package Number2;

import java.awt.geom.GeneralPath;

public class Triangle extends Shape{

	public static java.awt.Shape createTriangle(final float s) {
		final GeneralPath p0=new GeneralPath();
		p0.moveTo(300, 300-s);
		p0.lineTo(300+s, 300+s);
		p0.lineTo(300-s, 300+s);
		p0.closePath();
		return p0;
	}
	
	public Triangle() {
		drawShape=createTriangle(250);
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Triangle";
	}
	
	
}
