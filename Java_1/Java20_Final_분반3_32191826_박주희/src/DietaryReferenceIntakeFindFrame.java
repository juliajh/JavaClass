// Kyoung Shin Park (June 2020)
//Java20_Final, 6/25, 32191826 박주희 
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
//독립된 클래스로 이벤트 리스너를 작성
class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e)
	{
		new DietaryReferenceIntakeFindFrame().actionPerformed(e);
	}
}

public class DietaryReferenceIntakeFindFrame extends JFrame implements ActionListener
{  
	//ActionListener 인터페이스: 사용자가 Action을 했을 때 Action 이벤트를 발생시키는 인터페이스
	static final int NUM = 29;
	DietaryReferenceIntakeManager manager = null; // manager
	
	JPanel panel = new JPanel(new BorderLayout()); // main panel
	JLabel label = new JLabel("Find the dietary reference intake"); 
	JPanel rpanel = new JPanel(); // rpanel
	JRadioButton[] rbuttons = new JRadioButton[2];  //JRadioButton: 그룹 중 하나의 버튼만 체크 가능
	ButtonGroup rgroup = new ButtonGroup();
	String[] agenames = {"6~8", "9~11", "12~14", "15~18", "19~29", "30~49", "50~64", "65~74", "75~"};
	JComboBox<String> combobox = new JComboBox<>(agenames); //agenames의 값들로 combobox들 생성
	JButton button = new JButton("Find");

	JPanel fpanel = new JPanel(new GridLayout(NUM, 2)); // found panel
	//29행과 2열을 가지는 GridLayout객체 생성
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

		// event listener: 발생된 이벤트 객체에 반응하여 이벤트를 처리하는 객체
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
		

	// 7. 이벤트 객체
	public void actionPerformed(ActionEvent e) {
		String gender;
		String age;
		if (manager == null) return;
		if (button == (JButton)e.getSource()) {
			//get gender
			if (rbuttons[0].isSelected())  //rbuttons[0] 즉,Male버튼이 선택되었다면
				gender="MALE";   //String gender에 MALE 저장
			else    //Female버튼이 선택되었다면
				gender="FEMALE";   //String gender에 FEMALE 저장

			// get age range
			age=combobox.getSelectedItem().toString();  //콤보박스 중 선택된 item을 String으로 변환하여 age에 저장 
			
			// find DietaryReferenceIntake by gender & age
			//predicate를 이용하여 gender와 age가 일치하는 DietaryReferenceIntake를 찾는다
			DietaryReferenceIntake dd=manager.find(p -> p.getGender().toString().equals(gender) && 
					AgeRange.valueOf(p.getAgeRange()).equals(age));  //getGender와 getAgeRange를 하면 enum형이므로 toString을 이용하여 String으로 변환

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
	
	// 10. 입력된 나이에 해당하는 사람들의 pretein, selenium 평균
	public void average(String age)
	{
		double sumprotein = 0;
		double sumselenium=0;
		//입력받은 age에 해당하는 DietaryReferenceIntake들을 찾아 ds배열에 저장
		DietaryReferenceIntake[] ds=manager.finds(p -> AgeRange.valueOf(p.getAgeRange()).equals(age));
	
		for(DietaryReferenceIntake d:ds)  //for-each문을 이용하여
		{
			sumprotein+=d.getprotein();   //조건을 성립하는 ds원소들의 protein의 값을 모두 더한다.
			sumselenium+=d.getselenium();  //조건을 성립하는 ds원소들의 selenium의 값을 모두 더한다.
		}
		System.out.println(age+"세의 protein 평균: "+sumprotein/ds.length);
		System.out.println(age+"세의selenium 평균: "+sumselenium/ds.length);
	}
	
	
	
	//9. inner 클래스
	private class MyListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)  //Action 이벤트를 처리하는 코드
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



