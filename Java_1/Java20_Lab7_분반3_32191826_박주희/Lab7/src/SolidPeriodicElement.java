//Lab7 3�й� 6/02 32191826 ������

public class SolidPeriodicElement extends PeriodicElement{

	//constructor
	public SolidPeriodicElement(int number, String symbol, String name, double weight) 
	{
		super(number, symbol, name, weight, State.SOLID);
	}
		
	//toString(), print() �������̵�
	@Override
	public String toString() 
	{
		return "SolidPeriodicElement[number=" +number+", symbol="+symbol+", name="+name+
				", weight="+weight+", state=Solid]";
	}
	
	@Override
	public void print()
	{
		System.out.println("GasPeriodicElement");
		System.out.println("number: "+number);
		System.out.println("symbol: "+symbol);
		System.out.println("name: "+name);
		System.out.println("weight: "+weight);
		System.out.println("state: Solid");
	}
}
