//Lab6 5/21 ������

class IUnknownPeriodicElementFinder implements IPeriodicElementFinder{  //�������̽� ����

	@Override
	public boolean isInstanceOf(PeriodicElement e) {
		if(e instanceof UnknownPeriodicElement) return true;  //e�� UnknownPeriodicElementŬ������ ��ü��� true ��ȯ
		return false;
	}

}
