//Lab7 3�й� 6/02 32191826 ������

public class PeriodicElementFactory {

	//State�� ���� GasPeriodicElement, SolidPeriodicElement, LiquidPeriodicElement, UnknownPeriodicElement ��ü ��ȯ �޼ҵ�
	public static PeriodicElement getInstance(int number,String symbol, String name, double weight, State state)
	{
		
		if(state.equals(State.GAS)) //state�� GAS�� �����ϴٸ�
			return new GasPeriodicElement(number,symbol,name,weight);  //GasPeriodicElement��ü ��ȯ
		else if(state.equals(State.LIQUID)) //state�� LIQUID�� �����ϴٸ�
			return new LiquidPeriodicElement(number,symbol,name,weight);  //LiquidPeriodicElement��ü ��ȯ
		else if(state.equals(State.SOLID))  //state�� SOLID�� �����ϴٸ�
			return new SolidPeriodicElement(number,symbol,name,weight);  //SolidPeriodicElement��ü ��ȯ
		else //state�� Unknown�� �����ϴٸ�
			return new UnknownPeriodicElement(number,symbol,name,weight); //UnknownPeriodicElement��ü ��ȯ
		
	}
}
