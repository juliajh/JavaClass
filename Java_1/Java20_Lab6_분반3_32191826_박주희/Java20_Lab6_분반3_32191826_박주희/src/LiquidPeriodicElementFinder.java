//Lab6 5/21 박주희

//PeriodicELementFinder를 상속받는 LiquidPeriodicElementFinder 클래스
public class LiquidPeriodicElementFinder extends PeriodicElementFinder
{
	@Override
	public boolean isInstanceOf(PeriodicElement e) {
		if(e instanceof LiquidPeriodicElement) return true;  //e가 LiquidPeriodicElement클래스의 객체라면 true 반환
		return false;
	}
}