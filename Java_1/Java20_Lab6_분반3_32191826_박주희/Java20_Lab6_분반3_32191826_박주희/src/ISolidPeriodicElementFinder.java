//Lab6 5/21 ������

class ISolidPeriodicElementFinder implements IPeriodicElementFinder {  //�������̽� ����

	@Override
	public boolean isInstanceOf(PeriodicElement e) {
		if(e instanceof SolidPeriodicElement) return true;  //e�� SolidPeriodicElementŬ������ ��ü��� true ��ȯ
		return false;
	}

}
