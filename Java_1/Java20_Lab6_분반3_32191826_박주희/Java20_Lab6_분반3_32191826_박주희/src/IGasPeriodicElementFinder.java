//Lab6 5/21 박주희

public class IGasPeriodicElementFinder implements IPeriodicElementFinder {  //인터페이스 구현

	@Override
	public boolean isInstanceOf(PeriodicElement e) {
		if(e instanceof GasPeriodicElement) return true;  //e가 GasPeriodicElement클래스의 객체라면 true 반환
		return false;
	}

}
