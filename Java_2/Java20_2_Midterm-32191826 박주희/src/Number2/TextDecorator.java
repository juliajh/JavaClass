//32191826 ������ ��й�ȣ 9426 Java2 Midterm
package Number2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class TextDecorator extends ShapeDecorator{

	String text="II";
	Graphics2D g2;
	int count=0;
	Color color;
	
	public String getText() {
		return text;
	}

	public TextDecorator(Shape decoratedShape,String text) {
		super(decoratedShape);
		this.text=text;
	}

	public void paintComponent(Graphics g) {
		super.decoratedShape.paintComponent(g); 
		g2 = (Graphics2D) g;
		g2.setFont(new Font("�ü�",Font.BOLD,20));  //�۾�ü ���� set
		g2.drawString(text,240,240);  //deco draw
		decoratedShape.paintComponent(g);  //decoratedShape paintComponent
	}
	
	@Override
	public String getDescription() {
		return decoratedShape.getDescription()+" TextDecorator"; 
	}

}
