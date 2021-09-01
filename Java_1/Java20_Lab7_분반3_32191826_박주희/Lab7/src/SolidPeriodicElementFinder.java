//Lab7 3분반 6/02 32191826 박주희

//PeriodicELementFinder를 상속받는 SolidPeriodicElementFinder 클래스
public class SolidPeriodicElementFinder extends PeriodicElementFinder
{
	@Override
	public boolean isInstanceOf(PeriodicElement e) {
		if(e instanceof SolidPeriodicElement) return true; //e가 SolidPeriodicElement클래스의 객체라면 true 반환
		return false;
	}
}
