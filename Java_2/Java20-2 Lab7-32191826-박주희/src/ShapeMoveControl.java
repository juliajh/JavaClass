//Lab7 32191826 ������
import java.util.HashMap;
import java.util.Stack;

//invoker
public class ShapeMoveControl{
	HashMap<String, Command> map=new HashMap<String, Command>();  //String=UP/Down/Left/Right
	Stack <Command> stack=new Stack<Command>();
	
	public void setCommand(String key, Command command) {  //hashmap�� key�� commpand ����
		map.put(key,command);
	}
	
	//key�� �̿��Ͽ� map���� command�� ã��  execute ȣ��, stack�� command �ױ�
	public void execute(Shape shape, String key) {  
		stack.add(map.get(key));
	    map.get(key).execute(shape);
		/*
		if(key.equals("Up")) {
			MoveUpCommand up=new MoveUpCommand();
			up.execute(shape);
		}
		else if(key.equals("Down")) {
			MoveDownCommand down=new MoveDownCommand();
			down.execute(shape);
		}
		else if(key.equals("Left")) {
			MoveLeftCommand left=new MoveLeftCommand();
			left.execute(shape);
		}
		else if(key.equals("Right")) {
			MoveRightCommand right=new MoveRightCommand();
			right.execute(shape);
		}*/
		
	}
	
	public void undo(Shape shape) {
		if(stack.size()>0) {
			Command s=stack.get(stack.size()-1);
			s.undo(shape);
			stack.pop();
		}
	}
}
