//32191826 ������ ��й�ȣ 9426 Java2 Midterm
package Number2;

public abstract class ShapeDecorator extends Shape{
	protected Shape decoratedShape;
	public abstract String getDescription();
	
	public ShapeDecorator(Shape shape) {
		this.decoratedShape=shape;
	}

}
