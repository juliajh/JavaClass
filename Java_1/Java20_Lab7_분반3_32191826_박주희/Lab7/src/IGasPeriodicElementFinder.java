//Lab7 3�й� 6/02 32191826 ������

public class IGasPeriodicElementFinder implements IPeriodicElementFinder {  //�������̽� ����

	@Override
	public boolean isInstanceOf(PeriodicElement e) {
		if(e instanceof GasPeriodicElement) return true;  //e�� GasPeriodicElementŬ������ ��ü��� true ��ȯ
		return false;
	}

}
