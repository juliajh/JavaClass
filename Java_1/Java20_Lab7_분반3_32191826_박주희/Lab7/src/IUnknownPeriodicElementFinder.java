//Lab7 3�й� 6/02 32191826 ������

class IUnknownPeriodicElementFinder implements IPeriodicElementFinder{  //�������̽� ����

	@Override
	public boolean isInstanceOf(PeriodicElement e) {
		if(e instanceof UnknownPeriodicElement) return true;  //e�� UnknownPeriodicElementŬ������ ��ü��� true ��ȯ
		return false;
	}

}
