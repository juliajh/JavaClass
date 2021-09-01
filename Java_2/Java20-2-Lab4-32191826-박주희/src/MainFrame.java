import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


//JFrame: �ֻ��� �����̳� 
public class MainFrame extends JFrame implements ActionListener, ItemListener {
	private static final String MAIN_TITLE = "Decorating Tshirts";
	private static final String[] comboboxItems =  {"ShortSleeveTshirt","LongSleeveTShirt","Sweatshirt","HoodedSweatshirt"};

	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JComboBox<String> combobox;
	private Tshirt[] products = {new ShortSleeveTshirt(),new LongSleeveTshirt(),new Sweatshirt(),new HoodedSweatshirt()};
	private Tshirt product = products[0];
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
        combobox.addItemListener(this);  //�޺��ڽ��� item ������ ��� 
        buttonPanel.add(combobox);
        button1 = new JButton("Heart");
        button1.addActionListener(this);  //�޺��ڽ��� item ������ ��� 
        buttonPanel.add(button1);
        button2 = new JButton("Tree");
        button2.addActionListener(this);  //�޺��ڽ��� item ������ ��� 
        buttonPanel.add(button2);
        button3 = new JButton("Text");
        button3.addActionListener(this);  //�޺��ڽ��� item ������ ��� 
        buttonPanel.add(button3);
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        this.setSize(600, 700);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		sizePanel=new JPanel(new BorderLayout());
		JSlider slider=new JSlider(JSlider.HORIZONTAL,0,100,50);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setMajorTickSpacing(10);
		sizePanel.add(slider);
		slider.addMouseListener(new MouseAdapter() {
			   @Override
			   public void mouseClicked(MouseEvent e) {
				   System.out.println(slider.getValue());
			   }
		 });
		displayPanel.add(sizePanel);*/
		
	}
	
	//Action �̺�Ʈ �߻� ó��
	//deco ���� ��ư control
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		if (button == button1) {
			displayPanel.remove(product); // remove previous tshirt
			product = new HeartDecorator(product); // decorate with HeartDecorator
			displayPanel.add(product); // add decorated tshirt
	        System.out.println(product.getDescription() + " " + product.cost() + " won");
			displayPanel.revalidate();
			displayPanel.repaint();
		}
		else if (button == button2) {
			displayPanel.remove(product); // remove previous tshirt
			product = new TreeDecorator(product); // decorate with HeartDecorator
			displayPanel.add(product); // add decorated tshirt
	        System.out.println(product.getDescription() + " " + product.cost() + " won");
			displayPanel.revalidate();
			displayPanel.repaint();
		}
		else if (button == button3) {
			displayPanel.remove(product); // remove previous tshirt
			product = new TextDecorator(product); // decorate with HeartDecorator
			displayPanel.add(product); // add decorated tshirt
	        System.out.println(product.getDescription() + " " + product.cost() + " won");
			displayPanel.revalidate();
			displayPanel.repaint();
		}
	}
	
	//item  �̺�Ʈ �߻� ó��
	//tshirt ���� control
	@Override
	public void itemStateChanged(ItemEvent e) {	
		//ItemEvent.SELECTED -->1.���õǾ��ų� 2.���õ� ���¿��� ���õ��� ���� ���·� �ٲ�� ��
		if (e.getStateChange() == ItemEvent.SELECTED) {  //���õǾ��ٸ�
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
