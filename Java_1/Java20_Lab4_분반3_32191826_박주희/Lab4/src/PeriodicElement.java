
public class PeriodicElement {
	
	//field
	private int number;
	private String symbol;
	private String name;
	private double weight;
	private State state;
	
	//constructor
	public PeriodicElement(int number, String symbol, String name, double weight,State state) {
		super();
		this.number = number;
		this.symbol = symbol;
		this.name = name;
		this.weight = weight;
		this.state=state;
	}
	
	//getter, setter
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public State getstate() {
		return state;
	}

	public void setState(State state) {
		this.state=state;
	}
	
	public String toString() 
	{
		return "PeriodicElement [number=" + number + ", symbol=" + symbol + ", name=" + name + ","
				+ " weight=" + weight+", state="+state+ "]";
	}
	
	public void print(PeriodicElement element)
	{
		if(element!=null)
		{
		System.out.println("PeriodicElement["+number);
		System.out.println(symbol);
		System.out.println(name);
		System.out.println(weight);
		System.out.println(state+"]");
		}
	}
}
	
	
