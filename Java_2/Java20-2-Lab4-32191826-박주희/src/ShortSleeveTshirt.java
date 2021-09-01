import javax.swing.ImageIcon;

public class ShortSleeveTshirt extends Tshirt {
	public ShortSleeveTshirt() {
		description = "Short Sleeve Tshirt ";
		image = new ImageIcon("short-tshirt-white.jpg").getImage();
	}

	@Override
	public double cost() {
		return 12500;
	}

}
