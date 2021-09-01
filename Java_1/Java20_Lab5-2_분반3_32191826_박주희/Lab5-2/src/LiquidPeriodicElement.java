
public class LiquidPeriodicElement extends PeriodicElement{

	//constructor
	public LiquidPeriodicElement(int number, String symbol, String name, double weight) 
	{
		super(number, symbol, name, weight, State.LIQUID);
	}
		
	//toString(), print() �������̵�
	@Override
	public String toString() 
	{
		return "GasPeriodicElement[number=" +number+", symbol="+symbol+", name="+name+
				", weight="+weight+", state=Liquid]";
	}
	
	@Override
	public void print()
	{
		System.out.println("GasPeriodicElement");
		System.out.println("number: "+number);
		System.out.println("symbol: "+symbol);
		System.out.println("name: "+name);
		System.out.println("weight: "+weight);
		System.out.println("state: Liquid");
	}
}
