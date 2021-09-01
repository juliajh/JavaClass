//Lab9 32191826 ������

public class StartState implements State{
	DoubleParser dp;
	
	public StartState(DoubleParser dp) {
		this.dp=dp;
	}
	
	@Override
	public void plus() {
		dp.sign=1;  //+23 ó�� �Էµ� ���.
		//sign�� 1�̸� �������� sign*value�̹Ƿ� +
		dp.setState(dp.getIntegerState());
	}

	@Override
	public void minus() {
		dp.sign=-1;  //-23 ó�� �Էµ� ���.
		//sign�� -1�̸� �������� sign*value�̹Ƿ� -
		dp.setState(dp.getIntegerState());
	}

	@Override
	public void dot() {
		dp.power=0.1;
		dp.setState(dp.getDecimalState());  //.���� �����ϴ� ���� �Ҽ�
	}

	@Override
	public void digit() {
		dp.value=dp.ch-'0';
		dp.setState(dp.getIntegerState());
	}

	@Override
	public void other() throws NumberFormatException{
		System.out.println("Error: NumberFormatException");
		dp.check=false;  //������ ������ false�� check
	}

}
