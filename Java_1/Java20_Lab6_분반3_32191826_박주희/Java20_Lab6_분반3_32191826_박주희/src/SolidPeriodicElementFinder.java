//Lab6 5/21 ������

//PeriodicELementFinder�� ��ӹ޴� SolidPeriodicElementFinder Ŭ����
public class SolidPeriodicElementFinder extends PeriodicElementFinder
{
	@Override
	public boolean isInstanceOf(PeriodicElement e) {
		if(e instanceof SolidPeriodicElement) return true; //e�� SolidPeriodicElementŬ������ ��ü��� true ��ȯ
		return false;
	}
}
