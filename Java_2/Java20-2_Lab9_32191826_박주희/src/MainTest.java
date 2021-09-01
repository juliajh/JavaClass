import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Lab9 32191826 ������

public class MainTest extends JFrame{	
	JFrame f=new JFrame("DoubleParser");
	JPanel p=new JPanel();
	JLabel label=new JLabel("Input");
	JButton button=new JButton("Start");
	JTextField text=new JTextField(10);   //�Է�ĭ
	static DoubleParser doubleparser=new DoubleParser();
	
	public MainTest() {
		//frame ����
		f.add(p);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocation(600,300);
		f.setSize(400,200);
		f.setVisible(true);
		p.add(label);
		p.add(text);
		p.add(button);
		button.addActionListener(new Listener(this));
	}
	
	class Listener implements ActionListener{
		JFrame frame;
		public Listener (JFrame f) {
			frame=f;
		}
		@Override
		public void actionPerformed(ActionEvent e) { 
			String input=text.getText();   //�Է°��� �޾Ƶ鿩 input�� ����
			JOptionPane.showMessageDialog(frame,doubleparser.toDouble(input));  
		}
		
	}
	public static void main(String[] args) {
		String[] str= {".1234567","-.45","12abc","ab45","12.-3","1+2","143e-3",  
				"12..","12,","-25.78","+25.78","--.2"};
		
		for(int i=0;i<str.length;i++) {   //for���� �̿��Ͽ� str�迭�� ��� ���Ҹ� toDouble�� �Ű�������
			System.out.println(str[i]+"->");
			System.out.println(doubleparser.toDouble(str[i]));
			System.out.println();
			
		}	
		
		MainTest panel=new MainTest();
	}
}
