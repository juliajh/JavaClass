//Lab6 5/21 ������

//PeriodicELementFinder�� ��ӹ޴� GasPeriodicElementFinder Ŭ����
public class GasPeriodicElementFinder extends PeriodicElementFinder {

	@Override
	public boolean isInstanceOf(PeriodicElement e) {
		if(e instanceof GasPeriodicElement) return true; //e�� GasPeriodicElementŬ������ ��ü��� true ��ȯ
		return false;
	}

}
