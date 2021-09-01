//Lab7 32191826 ¹ÚÁÖÈñ
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
		drawShape=createTriangle(200);
	}
}
