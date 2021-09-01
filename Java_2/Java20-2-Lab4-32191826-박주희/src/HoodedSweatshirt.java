import javax.swing.ImageIcon;

public class HoodedSweatshirt extends Tshirt {

	public HoodedSweatshirt() {
		description = "Hooded Sweat Tshirt ";
		image = new ImageIcon("hooded-sweatshirt-white.jpg").getImage();
	}
	
	@Override
	public double cost() {  
		return 17000;
	}

}
