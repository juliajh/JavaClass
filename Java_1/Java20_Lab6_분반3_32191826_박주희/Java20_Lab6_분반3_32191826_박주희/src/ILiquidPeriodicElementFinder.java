//Lab6 5/21 ������

public class ILiquidPeriodicElementFinder implements IPeriodicElementFinder { //�������̽� ����

	@Override
	public boolean isInstanceOf(PeriodicElement e) {
		if(e instanceof LiquidPeriodicElement) return true; //e�� LiquidPeriodicElementŬ������ ��ü��� true ��ȯ
		return false;
	}

}
