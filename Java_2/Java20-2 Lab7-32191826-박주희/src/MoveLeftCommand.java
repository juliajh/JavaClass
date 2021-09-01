//Lab7 32191826 ¹ÚÁÖÈñ
public class MoveLeftCommand implements Command{

	@Override
	public void execute(Shape shape) {
		shape.move(-50,0);
	}

	@Override
	public void undo(Shape shape) {
		System.out.print("undo move left command ");
		shape.move(+50,0);
	}

}
