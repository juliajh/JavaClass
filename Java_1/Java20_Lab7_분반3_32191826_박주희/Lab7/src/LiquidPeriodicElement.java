//Lab7 3분반 6/02 32191826 박주희

public class LiquidPeriodicElement extends PeriodicElement{

	//constructor
	public LiquidPeriodicElement(int number, String symbol, String name, double weight) 
	{
		super(number, symbol, name, weight, State.LIQUID);
	}
		
	//toString(), print() 오버라이드
	@Override
	public String toString() 
	{
		return "LiquidPeriodicElement[number=" +number+", symbol="+symbol+", name="+name+
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
