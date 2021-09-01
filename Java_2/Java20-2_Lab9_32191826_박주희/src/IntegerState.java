//Lab9 32191826 박주희

public class IntegerState implements State{
	DoubleParser dp;
	
	public IntegerState(DoubleParser dp) {
		this.dp=dp;
	}
	
	@Override
	public void plus() throws NumberFormatException{
		System.out.println("Error: NumberFormatException");
		dp.check=false;  //오류가 떴으니 false로 check
	}

	@Override
	public void minus() throws NumberFormatException{
		System.out.println("Error: NumberFormatException");
		dp.check=false;  //오류가 떴으니 false로 check
	}

	@Override
	public void dot() {
		dp.power=0.1;
		dp.setState(dp.getDecimalState());
	}

	@Override
	public void digit() {
		dp.value=10*dp.value+dp.ch-'0';
		dp.setState(dp.getIntegerState());
	}

	@Override
	public void other() throws NumberFormatException{
		System.out.println("Error: NumberFormatException");
		dp.check=false;  //오류가 떴으니 false로 check
	}

}
