//Lab7 3�й� 6/02 32191826 ������

//PeriodicELementFinder�� ��ӹ޴� SolidPeriodicElementFinder Ŭ����
public class SolidPeriodicElementFinder extends PeriodicElementFinder
{
	@Override
	public boolean isInstanceOf(PeriodicElement e) {
		if(e instanceof SolidPeriodicElement) return true; //e�� SolidPeriodicElementŬ������ ��ü��� true ��ȯ
		return false;
	}
}
