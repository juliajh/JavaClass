
public class PeriodicElementFactory {

	//State에 따른 GasPeriodicElement, SolidPeriodicElement, LiquidPeriodicElement, UnknownPeriodicElement 객체 반환 메소드
	public static PeriodicElement getInstance(int number,String symbol, String name, double weight, State state)
	{
		
		if(state.equals(State.GAS)) //state가 GAS와 동일하다면
			return new GasPeriodicElement(number,symbol,name,weight);  //GasPeriodicElement객체 반환
		else if(state.equals(State.LIQUID))
			return new LiquidPeriodicElement(number,symbol,name,weight);
		else if(state.equals(State.SOLID))
			return new SolidPeriodicElement(number,symbol,name,weight);
		else
			return new UnknownPeriodicElement(number,symbol,name,weight);
		
	}
}
