//32191826 박주희 비밀번호 9426 Java2 Midterm
package Number2;

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

public class MainFrame extends JFrame implements ActionListener,ItemListener{
	private static final String MAIN_TITLE = "Decorating Shapes";
	private static final String[] comboboxItems =  {"Triangle","Rectangle","Circle"};
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JComboBox<String> combobox;
	private Shape[] products = {new Triangle(),new Rectangle(),new Circle()};
	private Shape product = products[0];
	private int selectedIndex = 0;
	private JPanel displayPanel;
	private JPanel sizePanel;
	
	public MainFrame(String title) {
		super(title);

		// displayPanel
		displayPanel = new JPanel(new BorderLayout());
		displayPanel.add(product);
        this.getContentPane().add(displayPanel, BorderLayout.CENTER);
		
        // buttonPanel
		JPanel buttonPanel = new JPanel(new GridLayout(1, 4));
        combobox = new JComboBox<String>(comboboxItems); // tshirts combobox
        combobox.addItemListener(this);  //콤보박스에 item 리스너 등록 
        buttonPanel.add(combobox);
        button1 = new JButton("color");
        button1.addActionListener(this);  //콤보박스에 item 리스너 등록 
        buttonPanel.add(button1);
        button2 = new JButton("thick border");
        button2.addActionListener(this);  //콤보박스에 item 리스너 등록 
        buttonPanel.add(button2);
        button3 = new JButton("text");
        button3.addActionListener(this);  //콤보박스에 item 리스너 등록 
        buttonPanel.add(button3);
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        this.setSize(600, 700);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		if (button == button1) {
			displayPanel.remove(product); // remove previous tshirt
			product = new ColorDecorator(product,Color.RED); // decorate with ColorDecorator
			displayPanel.add(product); // add decorated tshirt
	        System.out.println(product.getDescription());
			displayPanel.revalidate();
			displayPanel.repaint();
		}
		else if (button == button2) {
			displayPanel.remove(product); // remove previous tshirt
			product = new BorderDecorator(product,10); // decorate with BorderDecorator
			displayPanel.add(product); // add decorated tshirt
	        System.out.println(product.getDescription());
			displayPanel.revalidate();
			displayPanel.repaint();
		}
		else if (button == button3) {
			displayPanel.remove(product); // remove previous tshirt
			String text="";
			if(product instanceof Triangle) {
				text="Triangle";
			}
			else if(product instanceof Rectangle) {
				text="Rectangle";
			}
			if(product instanceof Circle) {
				text="Circle";
			}

			product = new TextDecorator(product,text); // decorate with TextDecorator
			displayPanel.add(product); // add decorated tshirt
	        System.out.println(product.getDescription());
			displayPanel.revalidate();
			displayPanel.repaint();
		}
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {//ItemEvent.SELECTED -->1.선택되었거나 2.선택된 상태에서 선택되지 않은 상태로 바뀌는 것
		if (e.getStateChange() == ItemEvent.SELECTED) {  //선택되었다면
			displayPanel.remove(product);
			if(e.getItem()==comboboxItems[0])
			{
				product=products[0];
			}
			else if(e.getItem()==comboboxItems[1])
			{
				product=products[1];
			}
			else if(e.getItem()==comboboxItems[2])
			{
				product=products[2];
			}
			else if(e.getItem()==comboboxItems[3])
			{
				product=products[3];
			}
			
			displayPanel.add(product); 
			displayPanel.revalidate();
			displayPanel.repaint(); 
		}

		
	}
	
	public static void main(String[] args) {
		new MainFrame(MAIN_TITLE);
	}



}
