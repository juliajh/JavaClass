//Lab6 5/21 ������

//PeriodicELementFinder�� ��ӹ޴� UnknownPeriodicElementFinder Ŭ����
public class UnknownPeriodicElementFinder extends PeriodicElementFinder
{
	@Override
	public boolean isInstanceOf(PeriodicElement e) {
		if(e instanceof UnknownPeriodicElement) return true;  //e�� UnknownPeriodicElementŬ������ ��ü��� true ��ȯ
		return false;
	}
}