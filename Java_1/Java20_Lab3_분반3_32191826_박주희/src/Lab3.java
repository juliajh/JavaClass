
public class Lab3 {
	
	//1.PeriodicElement[] elements에 50개(1 수소 ~ 50 주석) 화학원소데이터 넣기
	private static PeriodicElement[] elements= {
			new PeriodicElement(1,"H","Hydrogen",1.008),
			new PeriodicElement(2,"He","Helium",4.0026),
			new PeriodicElement(3,"Li","Lithium",6.94),
			new PeriodicElement(4,"Be","Beryllium",9.0122),
			new PeriodicElement(5,"B","Boron",10.81),
			new PeriodicElement(6,"C","Carbon",12.011),
			new PeriodicElement(7,"N","Nitrogen",14.007),
			new PeriodicElement(8,"O","Oxygen",15.999),
			new PeriodicElement(9,"Fe","Fluorine",18.998),
			new PeriodicElement(10,"Ne","Neon",20.180),
			new PeriodicElement(11,"Na","Natrium",22.990),
			new PeriodicElement(12,"Mg","Magnesium",24.305),
			new PeriodicElement(13,"Al","Aluminium",26.982),
			new PeriodicElement(14,"Si","Silicon",28.085),
			new PeriodicElement(15,"P","Phosphorus",30.974),
			new PeriodicElement(16,"S","Sulphur",32.06),
			new PeriodicElement(17,"Cl","Chlorium",35.45),
			new PeriodicElement(18,"Ar","Argon",39.948),
			new PeriodicElement(19,"K","Kaluim",39.098),
			new PeriodicElement(20,"Ca","Calcium",40.078),
			new PeriodicElement(21,"Sc","Scandium",44.956),
			new PeriodicElement(22,"Ti","Titanium",47.867),
			new PeriodicElement(23,"V","Vanadium",50.942),
			new PeriodicElement(24,"Cr","Chromium",51.996),
			new PeriodicElement(25,"Mn","Manganese",54.938),
			new PeriodicElement(26,"Fe","Iron",55.845),
			new PeriodicElement(27,"Co","Cobalt",58.993),
			new PeriodicElement(28,"Ni","Nickel",58.693),
			new PeriodicElement(29,"Cu","Copper",63.546),
			new PeriodicElement(30,"Zn","Zinc",65.38),
			new PeriodicElement(31,"Ga","Gallium",69.723),
			new PeriodicElement(32,"Ge","Germanium",72.630),
			new PeriodicElement(33,"As","Arsenic",74.922),
			new PeriodicElement(34,"Se","Selenium",78.971),
			new PeriodicElement(35,"Br","Bromine",79.904),
			new PeriodicElement(36,"Kr","Krypton",83.798),
			new PeriodicElement(37,"Rb","Rubidium",85.468),
			new PeriodicElement(38,"Sr","Strontium",87.62),
			new PeriodicElement(39,"Y","Yttruim",88.906),
			new PeriodicElement(40,"Zr","Zirconium",91.224),
			new PeriodicElement(41,"Ga","Niobium",92.906),
			new PeriodicElement(42,"Ge","Molybdenum",95.95),
			new PeriodicElement(43,"As","Technetiu",98),
			new PeriodicElement(44,"Se","Ruthenium",101.07),
			new PeriodicElement(45,"Br","Rhodium",102.91),
			new PeriodicElement(46,"Kr","Palladium",106.42),
			new PeriodicElement(47,"Rb","Silver",107.87),
			new PeriodicElement(48,"Sr","Cadmuim",112.41),
			new PeriodicElement(49,"Y","Indium",114.82),
			new PeriodicElement(50,"Zr","Tin",118.71)		
	};
	
	//2. elements 배열데이터 안에서 Element에 따라 PeriodicElement를 반환하는 메소드
	private static PeriodicElement getPeriodicElement(PeriodicElement[] array,Element e) {
		PeriodicElement element=null;
		for(int i=0;i<50;i++)   //for문을 이용하여
		{
			if(e.getValue()==array[i].getNumber()) //입력받은 Element e의 원소번호값이 array[i]의 원소번호와 같다면
				element=array[i]; //element에 array[i]를 대입
		}
		return element; //element 반환
	}
	public static void main(String[] args) {
		System.out.println("class");
		//객체생성
		PeriodicElement e1= new PeriodicElement(1,"H","Hydrogen",1.008);
		PeriodicElement e2=new PeriodicElement(2,"He","Helium",4.0026);
		PeriodicElement e3=new PeriodicElement(3,"Li","Lithium",6.94);
		PeriodicElement e4=new PeriodicElement(4,"Be","Beryllium",9.0122);
		PeriodicElement e5=new PeriodicElement(5,"B","Boron",10.81);
		PeriodicElement e6=new PeriodicElement(6,"C","Carbon",12.011);
		PeriodicElement e7=new PeriodicElement(7,"N","Nitrogen",14.007);
		PeriodicElement e8=new PeriodicElement(8,"O","Oxygen",15.999);
		PeriodicElement e9=new PeriodicElement(9,"Fe","Fluorine",18.998);
		PeriodicElement e10=new PeriodicElement(10,"Ne","Neon",20.180);
		PeriodicElement e11=new PeriodicElement(11,"Na","Natrium",22.990);
		PeriodicElement e12=new PeriodicElement(12,"Mg","Magnesium",24.305);
		PeriodicElement e13=new PeriodicElement(13,"Al","Aluminium",26.982);
		PeriodicElement e14=new PeriodicElement(14,"Si","Silicon",28.085);
		PeriodicElement e15=new PeriodicElement(15,"P","Phosphorus",30.974);
		PeriodicElement e16=new PeriodicElement(16,"S","Sulphur",32.06);
		PeriodicElement e17=new PeriodicElement(17,"Cl","Chlorium",35.45);
		PeriodicElement e18=new PeriodicElement(18,"Ar","Argon",39.948);
		PeriodicElement e19=new PeriodicElement(19,"K","Kaluim",39.098);
		PeriodicElement e20=new PeriodicElement(20,"Ca","Calcium",40.078);
		PeriodicElement e21=new PeriodicElement(21,"Sc","Scandium",44.956);
		PeriodicElement e22=new PeriodicElement(22,"Ti","Titanium",47.867);
		PeriodicElement e23=new PeriodicElement(23,"V","Vanadium",50.942);
		PeriodicElement e24=new PeriodicElement(24,"Cr","Chromium",51.996);
		PeriodicElement e25=new PeriodicElement(25,"Mn","Manganese",54.938);
		PeriodicElement e26=new PeriodicElement(26,"Fe","Iron",55.845);
		PeriodicElement e27=new PeriodicElement(27,"Co","Cobalt",58.993);
		PeriodicElement e28=new PeriodicElement(28,"Ni","Nickel",58.693);
		PeriodicElement e29=new PeriodicElement(29,"Cu","Copper",63.546);
		PeriodicElement e30=new PeriodicElement(30,"Zn","Zinc",65.38);
		PeriodicElement e31=new PeriodicElement(31,"Ga","Gallium",69.723);
		PeriodicElement e32=new PeriodicElement(32,"Ge","Germanium",72.630);
		PeriodicElement e33=new PeriodicElement(33,"As","Arsenic",74.922);
		PeriodicElement e34=new PeriodicElement(34,"Se","Selenium",78.971);
		PeriodicElement e35=new PeriodicElement(35,"Br","Bromine",79.904);
		PeriodicElement e36=new PeriodicElement(36,"Kr","Krypton",83.798);
		PeriodicElement e37=new PeriodicElement(37,"Rb","Rubidium",85.468);
		PeriodicElement e38=new PeriodicElement(38,"Sr","Strontium",87.62);
		PeriodicElement e39=new PeriodicElement(39,"Y","Yttruim",88.906);
		PeriodicElement e40=new PeriodicElement(40,"Zr","Zirconium",91.224);
		PeriodicElement e41=new PeriodicElement(41,"Nb","Niobium",92.906);
		PeriodicElement e42=new PeriodicElement(42,"Mo","Molybdenum",95.95);
		PeriodicElement e43=new PeriodicElement(43,"Tc","Technetiu",98);
		PeriodicElement e44=new PeriodicElement(44,"Ru","Rethenium",101.07);
		PeriodicElement e45=new PeriodicElement(45,"Rh","Rhodium",102.91);
		PeriodicElement e46=new PeriodicElement(46,"Pd","Palladium",106.42);
		PeriodicElement e47=new PeriodicElement(47,"Ag","Silver",107.87);
		PeriodicElement e48=new PeriodicElement(48,"Cd","Cadmium",112.41);
		PeriodicElement e49=new PeriodicElement(49,"In","Indium",114.82);
		PeriodicElement e50=new PeriodicElement(50,"Sn","Tin",118.71);
		
		System.out.println(e1);
		System.out.println(e5);
		System.out.println(e18);
		System.out.println(e30);
		System.out.println(e48);
		
		
		//3.Foreach문을  이용하여 PeriodicElement[] elements 출력
		System.out.println("array");
		for(PeriodicElement i:elements)
			System.out.println(i);

		
		//5.Foreach문을 이용해서 Element의 이름과 State을 출력
		for(PeriodicElement i:elements)
		{
			System.out.print(i.getName()+" ");
			System.out.println(PeriodicElement.getState(i));
		}
		
		//6.사용자 입력을 받아서 PeriodicElement 출력
		String[] lines= {
				"1 H Hydrogen 1.008",
				"2 He Helium 4.0026",
				"3 Li Lithium 6.94",
				"4 Be Beryllium 9.0122",
				"5 B Boron 10.81",
				"6 C Carbon 12.011",
				"7 N Nitrogen 14.007",
				"8 O Oxygen 15.999",
				"9 Fe Fluorine 18.998",
				"10 Ne Neon 20.180",
				"11 Na Natrium 22.990",
				"12 Mg Magnesium 24.305",
				"13 Al Aluminium 26.982",
				"14 Si Silicon 28.085",
				"15 P Phosphorus 30.974",
				"16 S Sulphur 32.06",
				"17 Cl Chlorium 35.45",
				"18 Ar Argon 39.948",
				"19 K Kaluim 39.098",
				"20 Ca Calcium 40.078",
				"22 Ti Titanium 47.867",
				"23 V Vanadium 50.942",
				"24 Cr Chromium 51.996",
				"25 Mn Manganese 54.938",
				"26 Fe Iron 55.845",
				"27 Co Cobalt 58.993",
				"28 Ni Nickel 58.693",
				"29 Cu Copper 63.546",
				"30 Zn Zinc 65.38",
				"31 Ga Gallium 69.723",
				"32 Ge Germanium 72.630",
				"33 As Arsenic 74.922",
				"34 Se Selenium 78.971",
				"35 Br Bromine 79.904",
				"36 Kr Krypton 83.798",
				"37 Rb Rubidium 85.468",
				"38 Sr Strontium 87.62",
				"39 Y Yttruim 88.906",
				"40 Zr Zirconium 91.224",
				"41 Nb Niobium 92.906",
				"42 Mo Molybdenum 95.95",
				"43 Tc Technetiu 98",
				"44 Ru Rethenium 101.07",
				"45 Rh Rhodium 102.91",
				"46 Pd Palladium 106.42",
				"47 Ag Silver 107.87",
				"48 Cd Cadmium 112.41",
				"49 In Indium 114.82",
				"50 Sn Tin 118.71"
				
		};
		//Foreach문을 이용하여 lines 출력
		for(String s:lines) {
			System.out.println(PeriodicElement.parsePeriodicElement(s));
		}
		
		//4.Foreach문을 이용해서 Element.names() return
		for(String s: Element.names()) {
			System.out.println(s);
		}

		//7
		do {
			System.out.println("Please enter [#] or [name] of PeriodicElement: ");
			Element e=UserInput.getElement();  //원소번호 또는 원소이름을 입력받아 그에 해당하는 원소 번호를 Element e에 저장
			PeriodicElement element=getPeriodicElement(elements,e);  //e가 원소번호인 PeriodicElement를 element에 저장 
			System.out.print(element+" ");
			State state=PeriodicElement.getState(element); //PeriodicElement의 getState를 이용하여 state 찾기
			System.out.print(state+" ");
			//self code  e.getValue(원소번호)로 금속, 준금속, 비금속을 구분한다.
			if((e.getValue()==2)||(e.getValue()==7)||(e.getValue()==8)||(e.getValue()==9)||
					(e.getValue()==10)||(e.getValue()==15)||(e.getValue()==16)||(e.getValue()==17)||
					(e.getValue()==18)||(e.getValue()==34)||(e.getValue()==35)||(e.getValue()==36))
				System.out.println("비금속"); 
			else if((e.getValue()==5)||(e.getValue()==14)||(e.getValue()==32)||(e.getValue()==33))
				System.out.println("준금속");
			else
				System.out.println("금속");
				
		}while(!UserInput.getExitKey());
	}

}
