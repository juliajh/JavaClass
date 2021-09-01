//Lab7 32191826 박주희
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class Shape extends JPanel {
   protected java.awt.Shape drawShape;
   protected String name;
   protected int x, y;
   protected double sx=1;
   protected double sy=1;
   
   public java.awt.Shape getDrawShape() {
      return drawShape;
   }

   public void setDrawShape(java.awt.Shape drawShape) {
      this.drawShape = drawShape;
   }
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
	   this.name=name;
   }
   
   public void move(int dx, int dy) {
	   this.x += dx;
	   this.y += dy;
	   System.out.println(this.name + " is moving to " + x + " " + y);
	   
   }
   
   //mycode
   public void changesize(double sx, double sy) {
	  this.sx += sx;
	  this.sy += sy;
	  if(sx>0) {
		  System.out.println(this.name+" bigger");  
	  }
	  else
		  System.out.println(this.name+" smaller");
   }
   
   @Override
   public void paintComponent(Graphics g) {
      super.paintComponent(g); // JPanel paintComponent
      Graphics2D g2 = (Graphics2D) g;
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      // translate
      g2.translate(x, y);
      //scale: 도형의 scale을 설정하는 함수
      g2.scale(sx,sy);
      // fill
      g2.setPaint(Color.GREEN);
      g2.fill(drawShape);
      // border line
      g2.setPaint(Color.BLUE);
      g2.draw(drawShape);
   }
}