//32191826 박주희 비밀번호 9426 Java2 Midterm
package Number2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class ColorDecorator extends ShapeDecorator{
	
	Color color;
	public ColorDecorator(Shape shape,Color color) {
		super(shape);
		this.color=color;
	}

	@Override
	public String getDescription() {
		return decoratedShape.getDescription()+" ColorDecorator";
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.decoratedShape.paintComponent(g); 
		Graphics2D g2=(Graphics2D) g;
		g2.setColor(color);
		decoratedShape.paintComponent(g);
	}
}
