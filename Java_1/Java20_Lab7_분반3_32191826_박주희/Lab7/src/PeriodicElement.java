//Lab7 3분반 6/02 32191826 박주희

abstract class PeriodicElement implements Comparable<PeriodicElement>{

	protected int number;
	protected String symbol;
	protected String name;
	protected double weight;
	protected State state;
	
	//생성자
	//private: PeriodicElement 클래스에만 사용 가능 --> protected: 다른 클래스에도 사용가능
	protected PeriodicElement(int number, String symbol, String name, double weight,State state) {
		super();
		this.number = number;
		this.symbol = symbol;
		this.name = name;
		this.weight = weight;
		this.state=state;
	}
	
	
	public static PeriodicElement parsePeriodicElement(String line) 
	{
		String[] token=line.split(" ");
		int number=Integer.parseInt(token[0]);
		String symbol=token[1];
		String name=token[2];
		double weight=Double.parseDouble(token[3]);
		State state=State.valueOf(token[4]);
		//token 배열은 “ “단위로 split하여 token에 number, symbol, name, weight를 차례대로 저장
		
		return PeriodicElementFactory.getInstance(number,symbol,name, weight,state);
		
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
	
	public State getState() {
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


	@Override
	//문자열 비교
	//두 문자열이 같으면 0, 현재 문자열이 anotherString의 문자열보다 먼저 나오면 음수, 뒤에 나오면 양수 return
	public int compareTo(PeriodicElement o) {
		return this.name.compareTo(o.name);
	}

	abstract public void print();

}
