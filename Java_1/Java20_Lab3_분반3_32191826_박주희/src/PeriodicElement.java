
public class PeriodicElement {
	private int number;
	private String symbol;
	private String name;
	private double weight;
	
	//constructor
	public PeriodicElement(int number, String symbol, String name, double weight) {
		super();
		this.number = number;
		this.symbol = symbol;
		this.name = name;
		this.weight = weight;
	}
	
	//getter/setter
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

	@Override //Object toString() override
	public String toString() {
		return "PeriodicElement [number=" + number + ", symbol=" + symbol + ", name=" + name + ", weight=" + weight
				+ "]";
	}
	
	//utility method(PeriodicElement -> State)
	public static State getState(PeriodicElement element) {
		switch(element.number) { //switch문을 이용하여 입력받은 element의 원소번호로 state 결정
		case 1:
			return State.GAS;
		case 2:
			return State.GAS;
		case 3:
			return State.SOLID;
		case 4:
			return State.SOLID;
		case 5:
			return State.SOLID;
		case 6:
			return State.SOLID;
		case 7:
			return State.GAS;
		case 8:
			return State.GAS;
		case 9:
			return State.GAS;
		case 10:
			return State.GAS;
		case 11:
			return State.SOLID;
		case 12:
			return State.SOLID;
		case 13:
			return State.SOLID;
		case 14:
			return State.SOLID;
		case 15:
			return State.SOLID;
		case 16:
			return State.SOLID;
		case 17:
			return State.GAS;
		case 18:
			return State.GAS;
		case 19:
			return State.SOLID;
		case 20:
			return State.SOLID;
		case 21:
			return State.SOLID;
		case 22:
			return State.SOLID;
		case 23:
			return State.SOLID;
		case 24:
			return State.SOLID;
		case 25:
			return State.SOLID;
		case 26:
			return State.SOLID;
		case 27:
			return State.SOLID;
		case 28:
			return State.SOLID;
		case 29:
			return State.SOLID;
		case 30:
			return State.SOLID;
		case 31:
			return State.SOLID;
		case 32:
			return State.SOLID;
		case 33:
			return State.SOLID;
		case 34:
			return State.SOLID;
		case 35:
			return State.LIQUID;
		case 36:
			return State.GAS;
		case 37:
			return State.SOLID;
		case 38:
			return State.SOLID;
		case 39:
			return State.SOLID;
		case 40:
			return State.SOLID;
		case 41:
			return State.SOLID;
		case 42:
			return State.SOLID;
		case 43:
			return State.SOLID;
		case 44:
			return State.SOLID;
		case 45:
			return State.SOLID;
		case 46:
			return State.SOLID;
		case 47:
			return State.SOLID;
		case 48:
			return State.SOLID;
		case 49:
			return State.SOLID;
		case 50:
			return State.SOLID;
		default: 
			return State.SOLID;
		}
		
		
	}
	
	
	//utility method(String -> PeriodicElement) "1 H Hydrogen 1.008" => PeriodicElement
	public static PeriodicElement parsePeriodicElement(String line) {
		PeriodicElement element=null;  //local variable : 초기화 필수
		String[] fields=line.split(" "); 
		int number=Integer.parseInt(fields[0]);
		String symbol=fields[1];
		String name=fields[2];
		double weight=Double.parseDouble(fields[3]);
		//fields 배열은 “ “단위로 split하여 fields에 number, symbol, name, weight를 차례대로 저장
		
		element=new PeriodicElement(number,symbol, name, weight); //PeriodicElement 객체 생성
		return element;
	}



	
	
}
