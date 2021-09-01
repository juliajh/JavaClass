
package dto;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import dto.State;
import dto.Type;

public class PeriodicElement implements Comparable <PeriodicElement> {

	protected int number;
	protected String symbol;
	protected String name;
	protected double weight;
	protected int period;
	protected int group;
	protected Type type;
	protected State state;
	
	//constructor
	public PeriodicElement(int number, String symbol, String name, double weight,int period, int group, Type type, State state) {
		this.number = number;
		this.symbol = symbol;
		this.name = name;
		this.weight = weight;
		this.period=period;
		this.group=group;
		this.type=type;
		this.state=state;
		
	}
	public PeriodicElement() {
		super();
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
	
	public int getGroup() {
		return group;
	}
	
	public void setGroup(int group) {
		this.group=group;
	}
	
	public int getPeriod() {
		return period;
	}
	
	public void setPeriod(int period) {
		this.period=period;
	}
	
	public Type getType() {
		return type;
	}
	
	public void setType(Type type) {
		this.type=type;
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state=state;
	}
	
	@Override
	public int compareTo(PeriodicElement o) {
		int n1=this.getNumber();
		int n2=o.getNumber();
		return n1-n2;
	}
	
	//string�� �迭�� �Է��ϸ� �׹迭 ���� PeriodicElement�� �����Ͽ� ��ȯ�ϴ� �޼ҵ�
	public static PeriodicElement parse(String[] fields)
	{
		//fields�� ���ҵ��� string���̹Ƿ� �˸��� ���·� ��ȯ���־�� �Ѵ�.
		int group;
		int number = Integer.parseInt(fields[0]); 
		String symbol=fields[1];
		String name=fields[2];
		double weight=Double.parseDouble(fields[3]);
		int period=Integer.parseInt(fields[4]);
		//group�� type�� ���� ���ҵ鵵 ����
		if(fields[5] == null || fields[5].equals("")) 
			group=-1;  //group�� ���� ���Ҵ� ���� group�� -1 ����
		else
			group=Integer.parseInt(fields[5]);
			
		Type type;
		if(fields[6]==null) 
			type=null;  //type�� ���� ���Ҵ� ���� type�� -1 ����
		else
			type=Type.nameOf(fields[6]);
		
		State state=State.nameOf(fields[7]);
		
		//PeriodicElement�� �����ڿ� �Է�
		PeriodicElement pe=new PeriodicElement(number,symbol,name,weight,period,group,type,state);
		return pe;
		
	}

	public String toString()
	{
		if(group==-1)  //���� group�� -1�� ���ҵ�, �� group�� ���� ���ҵ��� ��� ����
			return number+","+symbol+","+name+","+weight+","+period+","+" "+","+type+","+state;
		if(type==null)  //���� type�� null�� ���ҵ�, �� type�� ���� ���ҵ��� ��� ����
			return number+","+symbol+","+name+","+weight+","+period+","+group+","+" "+","+state;
		//group�� type�� ���ÿ� ���� ���Ҵ� �������� ����
		return number+","+symbol+","+name+","+weight+","+period+","+group+","+type+","+state;
	}
	
	
	public static Comparator <PeriodicElement> NumberComparator=new Comparator<>(){
		public int compare(PeriodicElement p1,PeriodicElement p2)
		{
			if(p1.getNumber()>p2.getNumber()) return 1;
			else if(p1.getNumber()<p2.getNumber()) return -1;
			else return 0;
		}
	};

	public static Comparator <PeriodicElement> SymbolComparator=new Comparator<>(){
		public int compare(PeriodicElement p1,PeriodicElement p2)
		{
			String symbol1=p1.getSymbol();
			String symbol2=p2.getSymbol();
			return symbol1.compareTo(symbol2);
		}
	};
	
	public static Comparator <PeriodicElement> NameComparator=new Comparator<>(){
		public int compare(PeriodicElement p1,PeriodicElement p2)
		{
			String name1=p1.getName();
			String name2=p2.getName();
			return name1.compareTo(name2);
		}
	};
	
	public static Comparator <PeriodicElement> WeightComparator=new Comparator<>(){
		public int compare(PeriodicElement p1,PeriodicElement p2)
		{
			Double weight1=p1.getWeight();
			Double weight2=p2.getWeight();
			return Double.compare(weight1, weight2);
		}
	};
	
	public static Comparator <PeriodicElement> PeriodComparator=new Comparator<>(){
		public int compare(PeriodicElement p1,PeriodicElement p2)
		{
			if(p1.getPeriod()>p2.getPeriod()) return 1;
			else if(p1.getPeriod()<p2.getPeriod()) return -1;
			else return 0;
		}
	};
	
	public static Comparator <PeriodicElement> GroupComparator=new Comparator<>(){
		public int compare(PeriodicElement p1,PeriodicElement p2)
		{
			if(p1.getGroup()>p2.getGroup()) return 1;
			else if(p1.getGroup()<p2.getGroup()) return -1;
			else return 0;
		}
	};
	
	public static Comparator <PeriodicElement> TypeComparator=new Comparator<>(){
		public int compare(PeriodicElement p1,PeriodicElement p2)
		{
			int a=-3;
			Type type1=p1.getType();
			Type type2=p2.getType();
			if((type1!=null)&&(type2!=null))
					a=type1.compareTo(type2);
			return a;

		}
	};
	public static Comparator <PeriodicElement> StateComparator=new Comparator<>(){
		public int compare(PeriodicElement p1,PeriodicElement p2)
		{
			State state1=p1.getState();
			State state2=p2.getState();
			return state1.compareTo(state2);
		}
	};
	
}