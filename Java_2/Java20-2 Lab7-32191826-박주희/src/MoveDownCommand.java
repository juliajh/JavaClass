//Lab7 32191826 ¹ÚÁÖÈñ
public class MoveDownCommand implements Command{

	private Shape shape;
	
	@Override
	public void execute(Shape shape) {
		shape.move(0,+50);
	}

	@Override
	public void undo(Shape shape) {
		System.out.print("undo move down command ");
		shape.move(0,-50);
	}

}
