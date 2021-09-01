//Lab7 32191826 박주희
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

//MainFrame
public class Client extends JFrame implements ActionListener,ItemListener{
	private static final String MAIN_TITLE = "Shape Move Command ";
	private static final String[] comboboxItems =  {"Triangle","Rectangle","Circle"};
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JComboBox<String> combobox;
	private Shape[] products = {new Triangle(),new Rectangle(),new Circle()};
	private Shape product = products[0];  //처음 화면에는 Triangle이 보이게
	private JPanel displayPanel;
	private String text="Triangle";  //처음 Shape의 name은 Triangle
	
	private ShapeMoveControl shapecontrol=new ShapeMoveControl();
	
	
	public Client(String title) {
		super(title);
		// displayPanel
		displayPanel = new JPanel(new BorderLayout());
		displayPanel.add(product);
        this.getContentPane().add(displayPanel, BorderLayout.CENTER);
		
        // buttonPanel
		JPanel buttonPanel = new JPanel(new GridLayout(1, 8));
        combobox = new JComboBox<String>(comboboxItems); // shapes combobox
        combobox.addItemListener(this);  //콤보박스에 item 리스너 등록 
        buttonPanel.add(combobox);
        
        button1 = new JButton("Left");    //button1 -> Left
        button1.addActionListener(this);  //콤보박스에 item 리스너 등록 
        buttonPanel.add(button1);
        
        button2 = new JButton("Right");   //button2 -> Right
        button2.addActionListener(this);  //콤보박스에 item 리스너 등록 
        buttonPanel.add(button2);
        
        button3 = new JButton("Up");   //button3 -> Up
        button3.addActionListener(this);  //콤보박스에 item 리스너 등록 
        buttonPanel.add(button3);
       
        button4 = new JButton("Down");   //button4 -> Down
        button4.addActionListener(this);  //콤보박스에 item 리스너 등록 
        buttonPanel.add(button4);
     
        button5 = new JButton("Bigger");  //button5 -> Bigger
        button5.addActionListener(this);  //콤보박스에 item 리스너 등록 
        buttonPanel.add(button5);

        button6 = new JButton("Smaller");  //button6 -> Smaller
        button6.addActionListener(this);  //콤보박스에 item 리스너 등록 
        buttonPanel.add(button6);

        button7 = new JButton("Undo");  //button7 -> Undo
        button7.addActionListener(this);  //콤보박스에 item 리스너 등록 
        buttonPanel.add(button7);   

        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        this.setSize(700,800);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		product.setName(text);
		if (button == button1) {  //Left
			shapecontrol.setCommand("Left", new MoveLeftCommand());  //shapecontrol의 map에 저장하는 메소드 setCommand 호출
			shapecontrol.execute(product,"Left");  //shapecontrol의 execute 호출
			displayPanel.add(product);
			displayPanel.revalidate();
			displayPanel.repaint();
		}
		else if (button == button2) {  //Right
			shapecontrol.setCommand("Right", new MoveRightCommand());
			shapecontrol.execute(product,"Right");
			displayPanel.add(product); 
			displayPanel.revalidate();
			displayPanel.repaint();
		}
		else if (button == button3) {  //Up
			shapecontrol.setCommand("Up", new MoveUpCommand());
			shapecontrol.execute(product,"Up");
			displayPanel.add(product); 
			displayPanel.revalidate();
			displayPanel.repaint();
		}
		else if (button == button4) {  //Down
			shapecontrol.setCommand("Down", new MoveDownCommand());
			shapecontrol.execute(product,"Down");
			displayPanel.add(product); 
			displayPanel.revalidate();
			displayPanel.repaint();
		}
		//mycode
		else if(button==button5) {  //Bigger
			shapecontrol.setCommand("Bigger",new BiggerCommand());
			shapecontrol.execute(product, "Bigger");
			displayPanel.add(product); 
			displayPanel.revalidate();
			displayPanel.repaint();
		}
		//mycode
		else if(button==button6) {  //Smaller
			shapecontrol.setCommand("Smaller",new SmallerCommand());
			shapecontrol.execute(product, "Smaller");
			displayPanel.add(product); 
			displayPanel.revalidate();
			displayPanel.repaint();
		}
		
		else if (button == button7) {   //Undo
			shapecontrol.undo(product);
			displayPanel.add(product); 
			displayPanel.revalidate();
			displayPanel.repaint();
		}
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {//ItemEvent.SELECTED -->1.선택되었거나 2.선택된 상태에서 선택되지 않은 상태로 바뀌는 것
		if (e.getStateChange() == ItemEvent.SELECTED) {  //선택되었다면
			displayPanel.remove(product);
			if(e.getItem()==comboboxItems[0])  //Triangle
			{
				product=products[0];
				text="Triangle";  //shape name을 의미하는 text 수정
			}
			else if(e.getItem()==comboboxItems[1])  //Rectangle
			{
				product=products[1];
				text="Rectangle";  //shape name을 의미하는 text 수정
			}
			else if(e.getItem()==comboboxItems[2])  //Circle
			{
				product=products[2];
				text="Circle";  //shape name을 의미하는 text 수정
			}
			product.setName(text);
			displayPanel.add(product); 
			displayPanel.revalidate();
			displayPanel.repaint(); 
			
		}
	}
	
	public static void main(String[] args) {
		new Client(MAIN_TITLE);
	}



}
