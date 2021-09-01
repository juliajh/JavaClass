//Lab9 32191826 박주희

public class DecimalState implements State{  
	DoubleParser dp;
	
	public DecimalState(DoubleParser dp) {
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
	public void dot() throws NumberFormatException{
		System.out.println("Error: NumberFormatException");
		dp.check=false;  //오류가 떴으니 false로 check
	} 

	@Override
	public void digit() {
		dp.value+=dp.power*(dp.ch-'0');
		dp.power/=10;
		dp.setState(dp.getDecimalState());
	}

	@Override
	public void other() throws NumberFormatException{
		System.out.println("Error: NumberFormatException");
		dp.check=false;  //오류가 떴으니 false로 check
	}

}
