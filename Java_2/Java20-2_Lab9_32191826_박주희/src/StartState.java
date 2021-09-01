//Lab9 32191826 박주희

public class StartState implements State{
	DoubleParser dp;
	
	public StartState(DoubleParser dp) {
		this.dp=dp;
	}
	
	@Override
	public void plus() {
		dp.sign=1;  //+23 처럼 입력될 경우.
		//sign이 1이면 마지막에 sign*value이므로 +
		dp.setState(dp.getIntegerState());
	}

	@Override
	public void minus() {
		dp.sign=-1;  //-23 처럼 입력될 경우.
		//sign이 -1이면 마지막에 sign*value이므로 -
		dp.setState(dp.getIntegerState());
	}

	@Override
	public void dot() {
		dp.power=0.1;
		dp.setState(dp.getDecimalState());  //.으로 시작하는 것은 소수
	}

	@Override
	public void digit() {
		dp.value=dp.ch-'0';
		dp.setState(dp.getIntegerState());
	}

	@Override
	public void other() throws NumberFormatException{
		System.out.println("Error: NumberFormatException");
		dp.check=false;  //오류가 떴으니 false로 check
	}

}
