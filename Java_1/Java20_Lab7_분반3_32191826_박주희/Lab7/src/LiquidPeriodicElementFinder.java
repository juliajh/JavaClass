//Lab7 3�й� 6/02 32191826 ������

//PeriodicELementFinder�� ��ӹ޴� LiquidPeriodicElementFinder Ŭ����
public class LiquidPeriodicElementFinder extends PeriodicElementFinder
{
	@Override
	public boolean isInstanceOf(PeriodicElement e) {
		if(e instanceof LiquidPeriodicElement) return true;  //e�� LiquidPeriodicElementŬ������ ��ü��� true ��ȯ
		return false;
	}
}