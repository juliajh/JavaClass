import java.awt.Graphics;
import java.awt.Panel;
import javax.swing.JFrame;

public class Circle extends Shape2D{

	private int radius;
	
	@Override
	public double getArea() {
		return radius*radius*Math.PI;
	}

	@Override
	public String getName() {
		return "CIRCLE";
	}

	@Override
	public void getUserInput() {
		System.out.println("Please enter Circle radius: ");
		radius=(int)UserInput.getDouble();
	}
	
	public void draw() {
		JFrame f=new JFrame("Circle");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(new MyPanel(radius));
		f.pack();
		f.setVisible(true);
	}

}
