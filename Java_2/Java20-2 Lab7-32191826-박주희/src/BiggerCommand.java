//Lab7 32191826 박주희
//mycode
//shape을 크게하는 command
public class BiggerCommand implements Command{

	@Override
	public void execute(Shape shape) {
		shape.changesize(0.1,0.1);
	}

	@Override
	public void undo(Shape shape) {
		System.out.print("undo move bigger command ");
		shape.changesize(-0.1,-0.1);
	}

}
