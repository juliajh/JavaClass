//Lab6 5/21 박주희

public class PeriodicElementFactory {

	//State에 따른 GasPeriodicElement, SolidPeriodicElement, LiquidPeriodicElement, UnknownPeriodicElement 객체 반환 메소드
	public static PeriodicElement getInstance(int number,String symbol, String name, double weight, State state)
	{
		
		if(state.equals(State.GAS)) //state가 GAS와 동일하다면
			return new GasPeriodicElement(number,symbol,name,weight);  //GasPeriodicElement객체 반환
		else if(state.equals(State.LIQUID)) //state가 LIQUID와 동일하다면
			return new LiquidPeriodicElement(number,symbol,name,weight);  //LiquidPeriodicElement객체 반환
		else if(state.equals(State.SOLID))  //state가 SOLID와 동일하다면
			return new SolidPeriodicElement(number,symbol,name,weight);  //SolidPeriodicElement객체 반환
		else //state가 Unknown와 동일하다면
			return new UnknownPeriodicElement(number,symbol,name,weight); //UnknownPeriodicElement객체 반환
		
	}
}
