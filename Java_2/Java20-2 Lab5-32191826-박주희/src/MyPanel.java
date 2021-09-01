import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	int radius;
	
	public MyPanel(int radius){
		setPreferredSize(new Dimension(300,300));
		this.radius=radius;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(150,150,radius,radius);
	}


}
