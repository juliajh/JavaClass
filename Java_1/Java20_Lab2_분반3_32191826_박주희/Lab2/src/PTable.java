
public class PTable {

	//constant
	public static final int HYDROGEN=1;  //HYDROGEN=1
	public static final int HELIUM=2;   //HELIUM=2
	public static final int LITHIUM=3;  //LITHIUM=3
	public static final int BERYLLIUM=4;   //BERYLLIUM=4
	public static final int BORON=5;   //BORON=5
	public static final int CARBON=6;   //CARBON=6
	public static final int NITROGEN=7;   //NITROGEN=7
	public static final int OXYGEN=8;   //OXYGEN=8
	public static final int FLUORINE=9;   //FLUORINE=9
	public static final int NEON=10;   //NEON=10
	public static final int NATRIUM=11;   //NATRIUM=11
	public static final int MAGNESIUM=12;   //MAGNESIUM=12
	public static final int ALUMINIUM=13;   //ALUMINIUM=13
	public static final int SILICON=14;   //SILICON=14
	public static final int PHOSPHORUS=15;   //PHOSPHORUS=15
	public static final int SULPHUR=16;   //SULPHUR=16
	public static final int CHLORIUM=17;   //CHLORIUM=17
	public static final int ARGON=18;   //ARGON=18
	public static final int KALUIM=19;   //KALUIM=19
	public static final int CALCIUM=20;   //CALCIUM=20
	
	//getSymbol method:HYDROGEN->H
	public static String getSymbol(int element) {
		String symbol="";
		if(element==HYDROGEN)   //element���� HYDROGEN�̶��
			return "H";      //H return
		else if(element==HELIUM)  //element���� HELIUM�̶��
			return "He";    //He return
		else if(element==LITHIUM)  //element���� LITHIUM�̶��
			return "Li";   //Li return
		else if(element==BERYLLIUM)  //element���� BERYLLIUM�̶��
			return "Be";  //Be return
		else if(element==BORON)  //element���� BORON�̶��
			return "B";   //B return
		else if(element==CARBON)  //element���� CARBON�̶��
			return "C";   //C return
		else if(element==NITROGEN)  //element���� NITROGEN�̶��
			return "N";  //N return
		else if(element==OXYGEN)  //element���� OXYGEN�̶��
			return "O";  //O return
		else if(element==FLUORINE)  //element���� FLUORINE�̶��
			return "F";  //F return
		else if(element==NEON)   //element���� NEON�̶��
			return "Ne";  //Ne return
		else if(element==NATRIUM)  //element���� NATRIUM�̶��
			return "Na";  //Na return
		else if(element==MAGNESIUM)  //element����MAGNESIUM�̶��
			return "Mg";  //Mg return
		else if(element==ALUMINIUM)  //element���� ALUMINIUM�̶��
			return "Al";  //Al return
		else if(element==SILICON)  //element���� SILICON�̶��
			return "Si";  //Si return
		else if(element==PHOSPHORUS)  //element���� PHOSPHORUS�̶��
			return "P";  //P return
		else if(element==SULPHUR)  //element���� SULPHUR�̶��
			return "S";  //S return
		else if(element==CHLORIUM)  //element���� CHLORIUM�̶��
			return "Cl";  //Cl return
		else if(element==ARGON)  //element���� ARGON�̶��
			return "Ar";   //Ar return
		else if(element==KALUIM)  //element���� KALUIM�̶��
			return "K";  //K return
		else if(element==CALCIUM)  //element���� CALCIUM�̶��
			return "Ca";   //Ca return
		return symbol;
	}
	
	//getName method:HYDROGEN->����
	public static String getName(int element) {
		if(element==HYDROGEN)  //element���� HYDROGEN�̶��
			return "����";   //���� return
		else if(element==HELIUM)  //element���� HELIUM�̶��
			return "���";  //��� return
		else if(element==LITHIUM)  //element���� LITHIUM�̶��
			return "��Ƭ";  //��Ƭ return
		else if(element==BERYLLIUM)  //element���� BERYLLIUM�̶��
			return "������";  //������ return
		else if(element==BORON)   //element���� BORON�̶��
			return "�ؼ�";  //�ؼ� return
		else if(element==CARBON)  //element���� CARBON�̶��
			return "ź��";  //ź�� return
		else if(element==NITROGEN)   //element���� NITROGEN�̶��
			return "����";  //���� return
		else if(element==OXYGEN)   //element���� OXYGEN�̶��
			return "���";  //��� return
		else if(element==FLUORINE)   //element���� FLUORINE�̶��
			return "�÷����";  //�÷���� return
		else if(element==NEON)   //element���� NEON�̶��
			return "�׿�";  //�׿� return
		else if(element==NATRIUM)   //element���� NATRIUM�̶��
			return "��Ʈ��";  //��Ʈ�� return
		else if(element==MAGNESIUM)  //element����MAGNESIUM�̶��
			return "���׳׽�";  //���׳׽� return
		else if(element==ALUMINIUM)   //element���� ALUMINIUM�̶��
			return "�˷�̴�";  //�˷�̴� return
		else if(element==SILICON)  //element���� SILICON�̶��
			return "�Լ�";  //�Լ� return
		else if(element==PHOSPHORUS)  //element���� PHOSPHORUS�̶��
			return "��";  //�� return
		else if(element==SULPHUR)    //element���� SULPHUR�̶��
			return "Ȳ";  //Ȳ return
		else if(element==CHLORIUM)  //element���� CHLORIUM�̶��
			return "����";  //���� return
		else if(element==ARGON)   //element���� ARGON�̶��
			return "�Ƹ���";  //�Ƹ��� return
		else if(element==KALUIM)   //element���� KALUIM�̶��
			return "Į��";  //Į�� return
		else if(element==CALCIUM)   //element���� CALCIUM�̶��
			return "Į��";  //Į�� return
		return "Unknown";
	}
	
	//getWeight method:HYDROGEN->1.008
	public static double getWeight(int element){
		if(element==HYDROGEN)  //element���� HYDROGEN�̶��
			return 1.008;   //1.008 return
		else if(element==HELIUM)  //element���� HELIUM�̶��
			return 4.0026;  //4.0026 return
		else if(element==LITHIUM)   //element���� LITHIUM�̶��
			return 6.94;  //6.94 return
		else if(element==BERYLLIUM)  //element���� BERYLLIUM�̶��
			return 9.0122;  //9.0122 return
		else if(element==BORON)   //element���� BORON�̶��
			return 10.81;  //10.81 return
		else if(element==CARBON)  //element���� CARBON�̶��
			return 12.011;  //12.011 return
		else if(element==NITROGEN)  //element���� NITROGEN�̶��
			return 14.007;  //14.007 return
		else if(element==OXYGEN)  //element���� OXYGEN�̶��
			return 15.999;  //15.999 return
		else if(element==FLUORINE)   //element���� FLUORINE�̶��
			return 18.998;  //18.998 return
		else if(element==NEON)   //element���� NEON�̶��
			return 20.180;  //20.180 return
		else if(element==NATRIUM)  //element���� NATRIUM�̶��
			return 22.990;  //22.990 return
		else if(element==MAGNESIUM)  //element����MAGNESIUM�̶��
			return 24.305;  //24.305 return
		else if(element==ALUMINIUM)    //element���� ALUMINIUM�̶��
			return 26.982;  //26.982 return
		else if(element==SILICON)  //element���� SILICON�̶��
			return 28.085;  //28.085 return
		else if(element==PHOSPHORUS)  //element���� PHOSPHORUS�̶��
			return 30.974;  //30.974 return
		else if(element==SULPHUR)  //element���� SULPHUR�̶��
			return 32.06;  //32.06 return
		else if(element==CHLORIUM)   //element���� CHLORIUM�̶��
			return 35.45;  //35.45 return
		else if(element==ARGON)   //element���� ARGON�̶��
			return 39.948;  //39.948 return
		else if(element==KALUIM)   //element���� KALUIM�̶��
			return 39.098;  //39.098 return
		else if(element==CALCIUM)   //element���� CALCIUM�̶��
			return 40.078;  //40.078 return
		return 0.0;
	}
	
	//self code
	//getName method:����->HYDROGEN
	public static int getNumber(String elementN) {
		if(elementN.equals("����"))  
			return HYDROGEN;   
		else if(elementN.equals("���")) 
			return HELIUM;  
		else if(elementN.equals("��Ƭ"))  
			return LITHIUM;  
		else if(elementN.equals("������"))  
			return BERYLLIUM; 
		else if(elementN.equals("�ؼ�"))  
			return BORON;
		else if(elementN.equals("ź��"))  
			return CARBON;
		else if(elementN.equals("����"))  
			return NITROGEN;
		else if(elementN.equals("�÷����"))  
			return FLUORINE;
		else if(elementN.equals("�׿�"))  
			return NEON;
		else if(elementN.equals("��Ʈ��"))  
			return NATRIUM;
		else if(elementN.equals("���׳׽�"))  
			return MAGNESIUM;
		else if(elementN.equals("�˷�̴�"))  
			return ALUMINIUM;
		else if(elementN.equals("�Լ�"))  
			return SILICON;
		else if(elementN.equals("��"))  
			return PHOSPHORUS;
		else if(elementN.equals("Ȳ"))  
			return SULPHUR;
		else if(elementN.equals("����"))  
			return CHLORIUM;
		else if(elementN.equals("�Ƹ���"))  
			return ARGON;
		else if(elementN.equals("Į��"))  
			return KALUIM;
		else if(elementN.equals("Į��"))  
			return CALCIUM;		
		return 0;
	}
}
		

