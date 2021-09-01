//Lab7 3�й� 6/02 32191826 ������

abstract class PeriodicElement implements Comparable<PeriodicElement>{

	protected int number;
	protected String symbol;
	protected String name;
	protected double weight;
	protected State state;
	
	//������
	//private: PeriodicElement Ŭ�������� ��� ���� --> protected: �ٸ� Ŭ�������� ��밡��
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
		//token �迭�� �� �������� split�Ͽ� token�� number, symbol, name, weight�� ���ʴ�� ����
		
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
	//���ڿ� ��
	//�� ���ڿ��� ������ 0, ���� ���ڿ��� anotherString�� ���ڿ����� ���� ������ ����, �ڿ� ������ ��� return
	public int compareTo(PeriodicElement o) {
		return this.name.compareTo(o.name);
	}

	abstract public void print();

}
