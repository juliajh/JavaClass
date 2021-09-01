import java.util.Scanner;

public class Lab4 {
	private static Scanner input=new Scanner(System.in);  //scanner��ü ����
	
	//PeriodicElement[] elements�� 50��(1 ���� ~ 50 �ּ�) ȭ�п��ҵ����� �ֱ�
	private static PeriodicElement[] elements= {
			new PeriodicElement(1,"H","Hydrogen",1.008,State.GAS),
			new PeriodicElement(2,"He","Helium",4.0026,State.GAS),
			new PeriodicElement(3,"Li","Lithium",6.94,State.SOLID),
			new PeriodicElement(4,"Be","Beryllium",9.0122,State.SOLID),
			new PeriodicElement(5,"B","Boron",10.81,State.SOLID),
			new PeriodicElement(6,"C","Carbon",12.011,State.SOLID),
			new PeriodicElement(7,"N","Nitrogen",14.007,State.GAS),
			new PeriodicElement(8,"O","Oxygen",15.999,State.GAS),
			new PeriodicElement(9,"Fe","Fluorine",18.998,State.GAS),
			new PeriodicElement(10,"Ne","Neon",20.180,State.GAS),
			new PeriodicElement(11,"Na","Natrium",22.990,State.SOLID),
			new PeriodicElement(12,"Mg","Magnesium",24.305,State.SOLID),
			new PeriodicElement(13,"Al","Aluminium",26.982,State.SOLID),
			new PeriodicElement(14,"Si","Silicon",28.085,State.SOLID),
			new PeriodicElement(15,"P","Phosphorus",30.974,State.SOLID),
			new PeriodicElement(16,"S","Sulphur",32.06,State.SOLID),
			new PeriodicElement(17,"Cl","Chlorium",35.45,State.GAS),
			new PeriodicElement(18,"Ar","Argon",39.948,State.GAS),
			new PeriodicElement(19,"K","Kaluim",39.098,State.SOLID),
			new PeriodicElement(20,"Ca","Calcium",40.078,State.SOLID),
			new PeriodicElement(21,"Sc","Scandium",44.956,State.SOLID),
			new PeriodicElement(22,"Ti","Titanium",47.867,State.SOLID),
			new PeriodicElement(23,"V","Vanadium",50.942,State.SOLID),
			new PeriodicElement(24,"Cr","Chromium",51.996,State.SOLID),
			new PeriodicElement(25,"Mn","Manganese",54.938,State.SOLID),
			new PeriodicElement(26,"Fe","Iron",55.845,State.SOLID),
			new PeriodicElement(27,"Co","Cobalt",58.993,State.SOLID),
			new PeriodicElement(28,"Ni","Nickel",58.693,State.SOLID),
			new PeriodicElement(29,"Cu","Copper",63.546,State.SOLID),
			new PeriodicElement(30,"Zn","Zinc",65.38,State.SOLID),
			new PeriodicElement(31,"Ga","Gallium",69.723,State.SOLID),
			new PeriodicElement(32,"Ge","Germanium",72.630,State.SOLID),
			new PeriodicElement(33,"As","Arsenic",74.922,State.SOLID),
			new PeriodicElement(34,"Se","Selenium",78.971,State.SOLID),
			new PeriodicElement(35,"Br","Bromine",79.904,State.LIQUID),
			new PeriodicElement(36,"Kr","Krypton",83.798,State.GAS),
			new PeriodicElement(37,"Rb","Rubidium",85.468,State.SOLID),
			new PeriodicElement(38,"Sr","Strontium",87.62,State.SOLID),
			new PeriodicElement(39,"Y","Yttruim",88.906,State.SOLID),
			new PeriodicElement(40,"Zr","Zirconium",91.224,State.SOLID),
			new PeriodicElement(41,"Ga","Niobium",92.906,State.SOLID),
			new PeriodicElement(42,"Ge","Molybdenum",95.95,State.SOLID),
			new PeriodicElement(43,"As","Technetiu",98,State.SOLID),
			new PeriodicElement(44,"Se","Ruthenium",101.07,State.SOLID),
			new PeriodicElement(45,"Br","Rhodium",102.91,State.SOLID),
			new PeriodicElement(46,"Kr","Palladium",106.42,State.SOLID),
			new PeriodicElement(47,"Rb","Silver",107.87,State.SOLID),
			new PeriodicElement(48,"Sr","Cadmuim",112.41,State.SOLID),
			new PeriodicElement(49,"Y","Indium",114.82,State.SOLID),
			new PeriodicElement(50,"Zr","Tin",118.71,State.SOLID)
	};
	
	//elements�� ��ȯ�ϴ� method
	//PeriodicElement[] elements�� private�̱� ������ �ٸ� Ŭ���������� �̿��� �� �ֵ��� method�� ���� �ۼ�
	public static PeriodicElement[] get_elements() 
	{
		return elements;
	}
	
	

	public static void main(String[] args) 
	{
		PeriodicTable ptable = new PeriodicTable(elements);
		
		//find(Element e)�� �̿��Ͽ� ���
		PeriodicElement element=ptable.find(1);
		PeriodicElement element1=ptable.find(37);
		element.print(element);
		element1.print(element1);
		
		do{
			//find(int number)�� �̿�
			System.out.println("Please enter [#] of PeriodicElement: ");
			Element e=UserInput.getElement();  //���ҹ�ȣ �Ǵ� �����̸��� �Է¹޾� �׿� �ش��ϴ� ���� ��ȣ�� Element e�� ����
			PeriodicElement element2=ptable.find(e.getValue());	
			element2.print(element2);  //���
			
			//find(String symbol)�� �̿�
			System.out.println("Please enter symbol of PeriodicElement: ");
			String str=input.nextLine(); 
			PeriodicElement element3=ptable.find(str);   
			element3.print(element3);  //���
			
			//find(State state)�� �̿�
			System.out.println("Please enter state of PeriodicElement: ");
			String str1=input.nextLine();  
			State str2=State.valueOf(str1);  //�Է��� str1�� Enum������ ��ȯ�Ͽ� str2�� ����
			PeriodicElement[] element4=null;
			int total=0;
			for(int j=0;j<elements.length;j++)  //�Է��� state�� �ش��ϴ� ������ ���� total ���ϱ�
			{
				element4=ptable.find(str2);
				if(element4[j]!=null)
					total++;
			}
			for(int j=0;j<total;j++)  //�� for������ ���� ������ŭ�� ���
			{
				System.out.println(element4[j].toString()); //���
			}
			
		}while(!UserInput.getExitKey());  //user�� q�� �Է��� ������ �ݺ�
	}



}