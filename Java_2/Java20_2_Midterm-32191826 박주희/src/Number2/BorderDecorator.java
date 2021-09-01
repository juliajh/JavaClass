//32191826 박주희 비밀번호 9426 Java2 Midterm
package Number2;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class BorderDecorator extends ShapeDecorator{

	BasicStroke stroke;
	
	public BorderDecorator(Shape decoratedShape, float lineWidth) {
		super(decoratedShape);
		stroke=new BasicStroke(lineWidth);
	}

	@Override
	public String getDescription() {
		return decoratedShape.getDescription()+" BorderDecorator";
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.decoratedShape.paintComponent(g); 
		Graphics2D g2=(Graphics2D) g;
		g2.setStroke(stroke);
		decoratedShape.paintComponent(g);
	}

}
