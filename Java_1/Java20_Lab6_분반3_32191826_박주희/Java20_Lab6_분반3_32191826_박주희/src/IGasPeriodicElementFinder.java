//Lab6 5/21 ������

public class IGasPeriodicElementFinder implements IPeriodicElementFinder {  //�������̽� ����

	@Override
	public boolean isInstanceOf(PeriodicElement e) {
		if(e instanceof GasPeriodicElement) return true;  //e�� GasPeriodicElementŬ������ ��ü��� true ��ȯ
		return false;
	}

}
