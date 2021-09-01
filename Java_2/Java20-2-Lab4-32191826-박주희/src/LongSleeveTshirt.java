import javax.swing.ImageIcon;

public class LongSleeveTshirt extends Tshirt {

	public LongSleeveTshirt() {
		description = "Long Sleeve Tshirt ";
		image = new ImageIcon("long-tshirt-white.jpg").getImage();
	}
	
	@Override
	public double cost() {
		return 14000.5;
	}

}
