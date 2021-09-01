// Kyoung Shin Park (June 2020)
//Java20_Final, 6/25, 32191826 ������ 
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

// 9. outer class
//������ Ŭ������ �̺�Ʈ �����ʸ� �ۼ�
class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e)
	{
		new DietaryReferenceIntakeFindFrame().actionPerformed(e);
	}
}

public class DietaryReferenceIntakeFindFrame extends JFrame implements ActionListener
{  
	//ActionListener �������̽�: ����ڰ� Action�� ���� �� Action �̺�Ʈ�� �߻���Ű�� �������̽�
	static final int NUM = 29;
	DietaryReferenceIntakeManager manager = null; // manager
	
	JPanel panel = new JPanel(new BorderLayout()); // main panel
	JLabel label = new JLabel("Find the dietary reference intake"); 
	JPanel rpanel = new JPanel(); // rpanel
	JRadioButton[] rbuttons = new JRadioButton[2];  //JRadioButton: �׷� �� �ϳ��� ��ư�� üũ ����
	ButtonGroup rgroup = new ButtonGroup();
	String[] agenames = {"6~8", "9~11", "12~14", "15~18", "19~29", "30~49", "50~64", "65~74", "75~"};
	JComboBox<String> combobox = new JComboBox<>(agenames); //agenames�� ����� combobox�� ����
	JButton button = new JButton("Find");

	JPanel fpanel = new JPanel(new GridLayout(NUM, 2)); // found panel
	//29��� 2���� ������ GridLayout��ü ����
	JLabel[] labels = new JLabel[NUM]; 
	JTextField[] textfields = new JTextField[NUM];
	String[] titles = {
			"protein", "fiber", "water", "vitaminC", "thiamine", "riboflavin", "niacin", 
			"vitaminB6", "folacin", "vitaminB12", "pantothenic", "biotin", "vitaminA", "vitaminD",
			"vitaminE", "vitaminK", "calcium", "phosphorus", "sodium", "chlorine", "potassium",
			"magnesium", "iron", "zinc", "copper", "fluorine", "manganese", "iodine", "selenium"};
	
	//constructor
	public DietaryReferenceIntakeFindFrame()
	{
		super();
	}
	
	public DietaryReferenceIntakeFindFrame(String name, DietaryReferenceIntakeManager manager) 
	{
		super(name);
		this.manager = manager;
		//this.titles = manager.getTitles();
		
		// panel add label
		label.setHorizontalAlignment(JLabel.CENTER);
		panel.add(label, BorderLayout.NORTH);		
		
		// rpanel add rbuttons
		rbuttons[0] = new JRadioButton("MALE", true);
		rbuttons[1] = new JRadioButton("FEMALE");
		rgroup.add(rbuttons[0]);
		rgroup.add(rbuttons[1]);
		rpanel.add(rbuttons[0]);
		rpanel.add(rbuttons[1]);
		// rpanel add combobox
		rpanel.add(new JLabel("Age"));
		rpanel.add(combobox);
		// rpanel add button
		rpanel.add(button);
		// panel add rpanel
		panel.add(rpanel, BorderLayout.CENTER);		

		// fpanel add labels & textfields
		for (int i=0; i<NUM; i++) 
		{
			labels[i] = new JLabel(titles[i]);
			textfields[i] = new JTextField(10);
			fpanel.add(labels[i]);
			fpanel.add(textfields[i]);
		}
		// panel add fpanel
		panel.add(fpanel, BorderLayout.SOUTH);

		// event listener: �߻��� �̺�Ʈ ��ü�� �����Ͽ� �̺�Ʈ�� ó���ϴ� ��ü
		button.addActionListener(this);
		button.addActionListener(new MyListener());
		button.addActionListener(new MyActionListener());
		// generate button click event
		button.doClick();

		this.add(panel);
		this.setSize(350, 750);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		

	// 7. �̺�Ʈ ��ü
	public void actionPerformed(ActionEvent e) {
		String gender;
		String age;
		if (manager == null) return;
		if (button == (JButton)e.getSource()) {
			//get gender
			if (rbuttons[0].isSelected())  //rbuttons[0] ��,Male��ư�� ���õǾ��ٸ�
				gender="MALE";   //String gender�� MALE ����
			else    //Female��ư�� ���õǾ��ٸ�
				gender="FEMALE";   //String gender�� FEMALE ����

			// get age range
			age=combobox.getSelectedItem().toString();  //�޺��ڽ� �� ���õ� item�� String���� ��ȯ�Ͽ� age�� ���� 
			
			// find DietaryReferenceIntake by gender & age
			//predicate�� �̿��Ͽ� gender�� age�� ��ġ�ϴ� DietaryReferenceIntake�� ã�´�
			DietaryReferenceIntake dd=manager.find(p -> p.getGender().toString().equals(gender) && 
					AgeRange.valueOf(p.getAgeRange()).equals(age));  //getGender�� getAgeRange�� �ϸ� enum���̹Ƿ� toString�� �̿��Ͽ� String���� ��ȯ

			// set textfields
			textfields[0].setText(Integer.toString(dd.getprotein()));
			textfields[1].setText(Integer.toString(dd.getfiber()));
			textfields[2].setText(Integer.toString(dd.getwater()));
			textfields[3].setText(Integer.toString(dd.getvitaminC()));
			textfields[4].setText(Double.toString(dd.getthiamine()));
			textfields[5].setText(Double.toString(dd.getriboflavin()));
			textfields[6].setText(Integer.toString(dd.getniacin()));
			textfields[7].setText(Double.toString(dd.getvitaminB6()));
			textfields[8].setText(Integer.toString(dd.getfolacin()));
			textfields[9].setText(Double.toString(dd.getvitaminB12()));
			textfields[10].setText(Integer.toString(dd.getpantothenic()));
			textfields[11].setText(Integer.toString(dd.getbiotin()));
			textfields[12].setText(Integer.toString(dd.getvitaminA()));
			textfields[13].setText(Integer.toString(dd.getvitaminD()));
			textfields[14].setText(Integer.toString(dd.getvitaminE()));
			textfields[15].setText(Integer.toString(dd.getvitaminK()));
			textfields[16].setText(Integer.toString(dd.getcalcium()));
			textfields[17].setText(Integer.toString(dd.getphosphorus()));
			textfields[18].setText(Double.toString(dd.getsodium()));
			textfields[19].setText(Double.toString(dd.getchlorine()));
			textfields[20].setText(Double.toString(dd.getpotassium()));
			textfields[21].setText(Integer.toString(dd.getmagnesium()));
			textfields[22].setText(Integer.toString(dd.getiron()));
			textfields[23].setText(Integer.toString(dd.getzinc()));
			textfields[24].setText(Integer.toString(dd.getcopper()));
			textfields[25].setText(Double.toString(dd.getfluorine()));
			textfields[26].setText(Double.toString(dd.getmanganese()));
			textfields[27].setText(Integer.toString(dd.getiodine()));
			textfields[28].setText(Integer.toString(dd.getselenium()));

		}
	}
	
	// 10. �Էµ� ���̿� �ش��ϴ� ������� pretein, selenium ���
	public void average(String age)
	{
		double sumprotein = 0;
		double sumselenium=0;
		//�Է¹��� age�� �ش��ϴ� DietaryReferenceIntake���� ã�� ds�迭�� ����
		DietaryReferenceIntake[] ds=manager.finds(p -> AgeRange.valueOf(p.getAgeRange()).equals(age));
	
		for(DietaryReferenceIntake d:ds)  //for-each���� �̿��Ͽ�
		{
			sumprotein+=d.getprotein();   //������ �����ϴ� ds���ҵ��� protein�� ���� ��� ���Ѵ�.
			sumselenium+=d.getselenium();  //������ �����ϴ� ds���ҵ��� selenium�� ���� ��� ���Ѵ�.
		}
		System.out.println(age+"���� protein ���: "+sumprotein/ds.length);
		System.out.println(age+"����selenium ���: "+sumselenium/ds.length);
	}
	
	
	
	//9. inner Ŭ����
	private class MyListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)  //Action �̺�Ʈ�� ó���ϴ� �ڵ�
		{
			String gender;
			String age;
			if (manager == null) return;
			if (button == (JButton)e.getSource()) 
			{
				//get gender
				if (rbuttons[0].isSelected())
					gender="MALE";
				else
					gender="FEMALE";

				// get age range
				age=combobox.getSelectedItem().toString();
				
				// find DietaryReferenceIntake by gender & age
				DietaryReferenceIntake dd=manager.find(p -> p.getGender().toString().equals(gender) &&
						AgeRange.valueOf(p.getAgeRange()).equals(age));

				// set textfields
				textfields[0].setText(Integer.toString(dd.getprotein()));
				textfields[1].setText(Integer.toString(dd.getfiber()));
				textfields[2].setText(Integer.toString(dd.getwater()));
				textfields[3].setText(Integer.toString(dd.getvitaminC()));
				textfields[4].setText(Double.toString(dd.getthiamine()));
				textfields[5].setText(Double.toString(dd.getriboflavin()));
				textfields[6].setText(Integer.toString(dd.getniacin()));
				textfields[7].setText(Double.toString(dd.getvitaminB6()));
				textfields[8].setText(Integer.toString(dd.getfolacin()));
				textfields[9].setText(Double.toString(dd.getvitaminB12()));
				textfields[10].setText(Integer.toString(dd.getpantothenic()));
				textfields[11].setText(Integer.toString(dd.getbiotin()));
				textfields[12].setText(Integer.toString(dd.getvitaminA()));
				textfields[13].setText(Integer.toString(dd.getvitaminD()));
				textfields[14].setText(Integer.toString(dd.getvitaminE()));
				textfields[15].setText(Integer.toString(dd.getvitaminK()));
				textfields[16].setText(Integer.toString(dd.getcalcium()));
				textfields[17].setText(Integer.toString(dd.getphosphorus()));
				textfields[18].setText(Double.toString(dd.getsodium()));
				textfields[19].setText(Double.toString(dd.getchlorine()));
				textfields[20].setText(Double.toString(dd.getpotassium()));
				textfields[21].setText(Integer.toString(dd.getmagnesium()));
				textfields[22].setText(Integer.toString(dd.getiron()));
				textfields[23].setText(Integer.toString(dd.getzinc()));
				textfields[24].setText(Integer.toString(dd.getcopper()));
				textfields[25].setText(Double.toString(dd.getfluorine()));
				textfields[26].setText(Double.toString(dd.getmanganese()));
				textfields[27].setText(Integer.toString(dd.getiodine()));
				textfields[28].setText(Integer.toString(dd.getselenium()));
			}
		}
	}
}



