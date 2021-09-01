//Lab7 32191826 ¹ÚÁÖÈñ
public class MoveUpCommand implements Command{
	
	@Override
	public void execute(Shape shape) {
		shape.move(0,-50);
	}

	@Override
	public void undo(Shape shape) {
		System.out.print("undo move up command ");
		shape.move(0,+50);
	}

}
