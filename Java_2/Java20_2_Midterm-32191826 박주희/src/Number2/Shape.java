//32191826 박주희 비밀번호 9426 Java2 Midterm
package Number2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public abstract class Shape extends JPanel{
	protected java.awt.Shape drawShape;
	
	//getter, setter
	public java.awt.Shape getDrawShape(){
		return drawShape;
	}
	
	public void setDrawShape(java.awt.Shape DrawShape) {
		this.drawShape=drawShape;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		if(g2!=null)
		{g2.fill(drawShape);
		g2.setPaint(Color.BLUE);
		g2.draw(drawShape);}
		
	}
	public abstract String getDescription();
}
