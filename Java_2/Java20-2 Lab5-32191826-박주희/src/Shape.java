//Lab5 32191826 박주희

public abstract class Shape {
	//도형마다 name와 입력받는 값이 다르므로 abstract method
	public abstract String getName();  
	public abstract void getUserInput();
	
	//계산값을 출력하는 메소드
	public void calculate() {
		//shape2d는 getArea()로 넓이를 구해야하고 shape3d는 getVolume()로 부피를 구해야하므로 조건문 이용
		if(this instanceof Shape2D)  //Shape2D의 객체라면
		{
			Shape2D shape2d=(Shape2D)this; //조건문을 통해 shape2d 객체임을 알았으므로 강제로 형변환
			if(shape2d instanceof Circle) {
				System.out.println("Area Calculate: "+shape2d.getArea());
				Circle circle=(Circle)shape2d;
				circle.draw();
			}
			else {
				System.out.println("Area Calculate: "+shape2d.getArea());
			}
		}
		else if(this instanceof Shape3D)  //Shape3D의 객체라면
		{
			Shape3D shape3d=(Shape3D)this;  ////조건문을 통해 shape3d 객체임을 알았으므로 강제로 형변환
			System.out.println("Volume Calculate: "+shape3d.getVolume());
		}
	}
}
