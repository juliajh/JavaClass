//Lab7 32191826 ������
//mycode
//shape�� �۰��ϴ� command
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
