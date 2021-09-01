import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class HeartDecorator extends TshirtsDecorator {
	Image logo;
	
	public HeartDecorator(Tshirt decoratedTshirt) {
		super(decoratedTshirt);
		logo=new ImageIcon("heart.jpg").getImage();
	}
	
	public void paintComponent(Graphics g) {
		super.decoratedTshirt.paintComponent(g); 
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(super.decoratedTshirt.image, 0, 0, WIDTH, HEIGHT, this);  //tshirt draw
		g2.drawImage(logo,225,225,WIDTH/4, HEIGHT/4, this);  //deco draw

	}
	@Override
	public String getDescription() {
		return super.decoratedTshirt.getDescription()+"Heart ";  //decoratedTshirt.getDescription()->기존의 정보 text 부르기
	}

	@Override
	public double cost() {
		return super.decoratedTshirt.cost()+20;  //decoratedTshirt.cost()->기존의 값 부르기
	}

	
	


}
