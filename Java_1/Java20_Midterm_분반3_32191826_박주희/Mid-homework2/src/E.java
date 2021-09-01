//3분반 32191826 박주희

class E {
	private int x;
	public static int y;
	
	public E() {  //매개변수가 없는 생성자
		this(0,0);  //x,y를 0으로 초기화
	}
	public E(int x,int y) { //매개변수 x,y를 입력받는 생성자
		//매개변수로 필드 초기화
		this.x=x;
		this.y=y;
	}
	
	//(2.4)
	//getter,setter
	public void setX(int x) {
		this.x=x;
	}
	public int getX() {
		return x;
	}
	public String toString() {
		return"E[x="+x+" y="+y+"]";
	}

}
