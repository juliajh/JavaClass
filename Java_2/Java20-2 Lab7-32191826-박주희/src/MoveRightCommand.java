//Lab7 32191826 ¹ÚÁÖÈñ
public class MoveRightCommand implements Command{

	@Override
	public void execute(Shape shape) {
		shape.move(+50,0);
	}

	@Override
	public void undo(Shape shape) {
		System.out.print("undo move right command ");
		shape.move(-50, 0);
	}

}
