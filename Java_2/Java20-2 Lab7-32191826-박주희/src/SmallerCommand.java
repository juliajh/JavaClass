//Lab7 32191826 박주희
//mycode
//shape을 작게하는 command
public class SmallerCommand implements Command {

	@Override
	public void execute(Shape shape) {
		shape.changesize(-0.1, -0.1);
	}

	@Override
	public void undo(Shape shape) {
		System.out.print("undo move smaller command ");
		shape.changesize(0.1,0.1);
	}

}
