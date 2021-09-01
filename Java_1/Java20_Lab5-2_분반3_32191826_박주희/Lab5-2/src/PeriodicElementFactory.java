
public class PeriodicElementFactory {

	//State�� ���� GasPeriodicElement, SolidPeriodicElement, LiquidPeriodicElement, UnknownPeriodicElement ��ü ��ȯ �޼ҵ�
	public static PeriodicElement getInstance(int number,String symbol, String name, double weight, State state)
	{
		
		if(state.equals(State.GAS)) //state�� GAS�� �����ϴٸ�
			return new GasPeriodicElement(number,symbol,name,weight);  //GasPeriodicElement��ü ��ȯ
		else if(state.equals(State.LIQUID))
			return new LiquidPeriodicElement(number,symbol,name,weight);
		else if(state.equals(State.SOLID))
			return new SolidPeriodicElement(number,symbol,name,weight);
		else
			return new UnknownPeriodicElement(number,symbol,name,weight);
		
	}
}
