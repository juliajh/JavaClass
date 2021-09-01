//Lab7 3분반 6/02 32191826 박주희

//PeriodicELementFinder를 상속받는 UnknownPeriodicElementFinder 클래스
public class UnknownPeriodicElementFinder extends PeriodicElementFinder
{
	@Override
	public boolean isInstanceOf(PeriodicElement e) {
		if(e instanceof UnknownPeriodicElement) return true;  //e가 UnknownPeriodicElement클래스의 객체라면 true 반환
		return false;
	}
}