
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
		if(element==HYDROGEN)   //element값이 HYDROGEN이라면
			return "H";      //H return
		else if(element==HELIUM)  //element값이 HELIUM이라면
			return "He";    //He return
		else if(element==LITHIUM)  //element값이 LITHIUM이라면
			return "Li";   //Li return
		else if(element==BERYLLIUM)  //element값이 BERYLLIUM이라면
			return "Be";  //Be return
		else if(element==BORON)  //element값이 BORON이라면
			return "B";   //B return
		else if(element==CARBON)  //element값이 CARBON이라면
			return "C";   //C return
		else if(element==NITROGEN)  //element값이 NITROGEN이라면
			return "N";  //N return
		else if(element==OXYGEN)  //element값이 OXYGEN이라면
			return "O";  //O return
		else if(element==FLUORINE)  //element값이 FLUORINE이라면
			return "F";  //F return
		else if(element==NEON)   //element값이 NEON이라면
			return "Ne";  //Ne return
		else if(element==NATRIUM)  //element값이 NATRIUM이라면
			return "Na";  //Na return
		else if(element==MAGNESIUM)  //element값이MAGNESIUM이라면
			return "Mg";  //Mg return
		else if(element==ALUMINIUM)  //element값이 ALUMINIUM이라면
			return "Al";  //Al return
		else if(element==SILICON)  //element값이 SILICON이라면
			return "Si";  //Si return
		else if(element==PHOSPHORUS)  //element값이 PHOSPHORUS이라면
			return "P";  //P return
		else if(element==SULPHUR)  //element값이 SULPHUR이라면
			return "S";  //S return
		else if(element==CHLORIUM)  //element값이 CHLORIUM이라면
			return "Cl";  //Cl return
		else if(element==ARGON)  //element값이 ARGON이라면
			return "Ar";   //Ar return
		else if(element==KALUIM)  //element값이 KALUIM이라면
			return "K";  //K return
		else if(element==CALCIUM)  //element값이 CALCIUM이라면
			return "Ca";   //Ca return
		return symbol;
	}
	
	//getName method:HYDROGEN->수소
	public static String getName(int element) {
		if(element==HYDROGEN)  //element값이 HYDROGEN이라면
			return "수소";   //수소 return
		else if(element==HELIUM)  //element값이 HELIUM이라면
			return "헬륨";  //헬륨 return
		else if(element==LITHIUM)  //element값이 LITHIUM이라면
			return "리튬";  //리튬 return
		else if(element==BERYLLIUM)  //element값이 BERYLLIUM이라면
			return "베릴륨";  //베릴륨 return
		else if(element==BORON)   //element값이 BORON이라면
			return "붕소";  //붕소 return
		else if(element==CARBON)  //element값이 CARBON이라면
			return "탄소";  //탄소 return
		else if(element==NITROGEN)   //element값이 NITROGEN이라면
			return "질소";  //질소 return
		else if(element==OXYGEN)   //element값이 OXYGEN이라면
			return "산소";  //산소 return
		else if(element==FLUORINE)   //element값이 FLUORINE이라면
			return "플루오린";  //플루오린 return
		else if(element==NEON)   //element값이 NEON이라면
			return "네온";  //네온 return
		else if(element==NATRIUM)   //element값이 NATRIUM이라면
			return "나트륨";  //나트륨 return
		else if(element==MAGNESIUM)  //element값이MAGNESIUM이라면
			return "마그네슘";  //마그네슘 return
		else if(element==ALUMINIUM)   //element값이 ALUMINIUM이라면
			return "알루미늄";  //알루미늄 return
		else if(element==SILICON)  //element값이 SILICON이라면
			return "규소";  //규소 return
		else if(element==PHOSPHORUS)  //element값이 PHOSPHORUS이라면
			return "인";  //인 return
		else if(element==SULPHUR)    //element값이 SULPHUR이라면
			return "황";  //황 return
		else if(element==CHLORIUM)  //element값이 CHLORIUM이라면
			return "염소";  //염소 return
		else if(element==ARGON)   //element값이 ARGON이라면
			return "아르곤";  //아르곤 return
		else if(element==KALUIM)   //element값이 KALUIM이라면
			return "칼륨";  //칼륨 return
		else if(element==CALCIUM)   //element값이 CALCIUM이라면
			return "칼슘";  //칼슐 return
		return "Unknown";
	}
	
	//getWeight method:HYDROGEN->1.008
	public static double getWeight(int element){
		if(element==HYDROGEN)  //element값이 HYDROGEN이라면
			return 1.008;   //1.008 return
		else if(element==HELIUM)  //element값이 HELIUM이라면
			return 4.0026;  //4.0026 return
		else if(element==LITHIUM)   //element값이 LITHIUM이라면
			return 6.94;  //6.94 return
		else if(element==BERYLLIUM)  //element값이 BERYLLIUM이라면
			return 9.0122;  //9.0122 return
		else if(element==BORON)   //element값이 BORON이라면
			return 10.81;  //10.81 return
		else if(element==CARBON)  //element값이 CARBON이라면
			return 12.011;  //12.011 return
		else if(element==NITROGEN)  //element값이 NITROGEN이라면
			return 14.007;  //14.007 return
		else if(element==OXYGEN)  //element값이 OXYGEN이라면
			return 15.999;  //15.999 return
		else if(element==FLUORINE)   //element값이 FLUORINE이라면
			return 18.998;  //18.998 return
		else if(element==NEON)   //element값이 NEON이라면
			return 20.180;  //20.180 return
		else if(element==NATRIUM)  //element값이 NATRIUM이라면
			return 22.990;  //22.990 return
		else if(element==MAGNESIUM)  //element값이MAGNESIUM이라면
			return 24.305;  //24.305 return
		else if(element==ALUMINIUM)    //element값이 ALUMINIUM이라면
			return 26.982;  //26.982 return
		else if(element==SILICON)  //element값이 SILICON이라면
			return 28.085;  //28.085 return
		else if(element==PHOSPHORUS)  //element값이 PHOSPHORUS이라면
			return 30.974;  //30.974 return
		else if(element==SULPHUR)  //element값이 SULPHUR이라면
			return 32.06;  //32.06 return
		else if(element==CHLORIUM)   //element값이 CHLORIUM이라면
			return 35.45;  //35.45 return
		else if(element==ARGON)   //element값이 ARGON이라면
			return 39.948;  //39.948 return
		else if(element==KALUIM)   //element값이 KALUIM이라면
			return 39.098;  //39.098 return
		else if(element==CALCIUM)   //element값이 CALCIUM이라면
			return 40.078;  //40.078 return
		return 0.0;
	}
	
	//self code
	//getName method:수소->HYDROGEN
	public static int getNumber(String elementN) {
		if(elementN.equals("수소"))  
			return HYDROGEN;   
		else if(elementN.equals("헬륨")) 
			return HELIUM;  
		else if(elementN.equals("리튬"))  
			return LITHIUM;  
		else if(elementN.equals("베릴륨"))  
			return BERYLLIUM; 
		else if(elementN.equals("붕소"))  
			return BORON;
		else if(elementN.equals("탄소"))  
			return CARBON;
		else if(elementN.equals("질소"))  
			return NITROGEN;
		else if(elementN.equals("플루오린"))  
			return FLUORINE;
		else if(elementN.equals("네온"))  
			return NEON;
		else if(elementN.equals("나트륨"))  
			return NATRIUM;
		else if(elementN.equals("마그네슘"))  
			return MAGNESIUM;
		else if(elementN.equals("알루미늄"))  
			return ALUMINIUM;
		else if(elementN.equals("규소"))  
			return SILICON;
		else if(elementN.equals("인"))  
			return PHOSPHORUS;
		else if(elementN.equals("황"))  
			return SULPHUR;
		else if(elementN.equals("염소"))  
			return CHLORIUM;
		else if(elementN.equals("아르곤"))  
			return ARGON;
		else if(elementN.equals("칼륨"))  
			return KALUIM;
		else if(elementN.equals("칼슘"))  
			return CALCIUM;		
		return 0;
	}
}
		

