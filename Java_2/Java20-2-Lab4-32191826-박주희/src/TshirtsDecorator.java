
public abstract class TshirtsDecorator extends Tshirt {
	protected Tshirt decoratedTshirt;
	public abstract String getDescription();
	
	public TshirtsDecorator(Tshirt decoratedTshirt) {
		this.decoratedTshirt=decoratedTshirt;
	}
}
