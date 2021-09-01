//Lab6 5/21 박주희

//PeriodicELementFinder를 상속받는 GasPeriodicElementFinder 클래스
public class GasPeriodicElementFinder extends PeriodicElementFinder {

	@Override
	public boolean isInstanceOf(PeriodicElement e) {
		if(e instanceof GasPeriodicElement) return true; //e가 GasPeriodicElement클래스의 객체라면 true 반환
		return false;
	}

}
