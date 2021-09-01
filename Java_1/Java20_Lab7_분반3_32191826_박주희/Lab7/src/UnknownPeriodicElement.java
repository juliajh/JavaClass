//Lab7 3분반 6/02 32191826 박주희

public class UnknownPeriodicElement extends PeriodicElement{

	//constructor
	public UnknownPeriodicElement(int number, String symbol, String name, double weight) 
	{
		super(number, symbol, name, weight, State.UNKNOWN);
	}
		
	//toString(), print() 오버라이드
	@Override
	public String toString() 
	{
		return "UnknownPeriodicElement[number=" +number+", symbol="+symbol+", name="+name+
				", weight="+weight+", state=Unknown]";
	}
	
	@Override
	public void print()
	{
		System.out.println("GasPeriodicElement");
		System.out.println("number: "+number);
		System.out.println("symbol: "+symbol);
		System.out.println("name: "+name);
		System.out.println("weight: "+weight);
		System.out.println("state: UNKNOWN");
	}
}
