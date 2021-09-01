import javax.swing.ImageIcon;

public class Sweatshirt extends Tshirt {

	public Sweatshirt() {
		description = "Sweatshirt ";
		image = new ImageIcon("sweatshirt-white.jpg").getImage();
	}
	
	@Override
	public double cost() {
		return 18000.5;
	}

}
