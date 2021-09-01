//Lab9 32191826 박주희

public class DoubleParser {
	State startState;
	State integerState;
	State decimalState;
	State state=startState;
	
	double sign;
	double value;
	double power;
	char ch;
	boolean check;   //한번이라도 오류가 발생했는지를 check하는 boolean
	//true=no error 
	
	public DoubleParser() {
		startState=new StartState(this);
		integerState=new IntegerState(this);
		decimalState=new DecimalState(this);
		
	}
	
	public void setState(State state) {
		this.state=state;
	}
	
	public State getState() {
		return state;
	}
	
	public State getStartState() {
		return startState;
	}

	public State getIntegerState() {
		return integerState;
	}

	public State getDecimalState() {
		return decimalState;
	}


	public void init() {
		sign=1;
		value=0;
		power=0.1;
		ch=' ';
		state=startState;
		check=true;
		
	}
	
	public double toDouble(String str) {
		init();
		int i=0;
		while(i<str.length()){
			ch=str.charAt(i++);
			if(ch=='.') {
				state.dot();
			}
			else if(ch=='+') {
				state.plus();
			}
			else if(ch=='-') {
				state.minus();
			}
			else if(Character.isDigit(ch)) {
				state.digit();
			}
			else {
				state.other();
			}
		}
		
		if(check==true)  //한번도 오류가 안떴을 때
			return sign*value;   
		else    //한번이라도 오류가 떴을 때
			return 0.0000; 
	}
}
