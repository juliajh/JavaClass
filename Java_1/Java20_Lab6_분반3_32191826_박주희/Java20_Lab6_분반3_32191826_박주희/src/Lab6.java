//Lab6 5/21 3분반 32191826 박주희

public class Lab6 {

	//PeriodicElement[] elements에 50개(1 수소 ~ 50 주석) 화학원소데이터 넣기
	//state에 따른 객체 생성
	private static PeriodicElement[] elements = {
	        new GasPeriodicElement(1, "H", "HYDROGEN", 1.008),
	        new GasPeriodicElement(2, "He", "HELIUM", 4.0026),
	        new SolidPeriodicElement(3, "Li", "LITHIUM", 6.94),
	        new SolidPeriodicElement(4, "Be", "BERYLLIUM", 9.0122),
	        new SolidPeriodicElement(5, "B", "BORON", 10.81),
	        new SolidPeriodicElement(6, "C", "CARBON", 12.011),
	        new GasPeriodicElement(7, "N", "NITROGEN", 14.007),
	        new GasPeriodicElement(8, "O", "OXYGEN", 15.999),            
	        new GasPeriodicElement(9, "F", "FLUORINE", 18.998),
	        new GasPeriodicElement(10, "Ne", "NEON", 20.18),
	        new SolidPeriodicElement(11, "Na", "SODIUM", 22.99),
	        new SolidPeriodicElement(12, "Mg", "MAGNESIUM", 24.305),
	        new SolidPeriodicElement(13, "Al", "ALUMINIUM", 26.982),
	        new SolidPeriodicElement(14, "Si", "SILLICON", 28.085),
	        new SolidPeriodicElement(15, "P", "PHOSPHOROUS", 30.974),
	        new SolidPeriodicElement(16, "S", "SULFUR", 32.06),
	        new GasPeriodicElement(17, "Cl", "CHLORINE", 35.45),            
	        new GasPeriodicElement(18, "Ar", "ARGON", 39.948),
	        new SolidPeriodicElement(19, "K", "POTASSIUM", 39.098),
	        new SolidPeriodicElement(20, "Ca", "CALCIUM", 40.078),    
	        new SolidPeriodicElement(21, "Sc", "SCANDIUM", 44.956),
	        new SolidPeriodicElement(22, "Ti", "TITANIUM", 47.867),
	        new SolidPeriodicElement(23, "V", "VANADIUM", 50.942),
	        new SolidPeriodicElement(24, "Cr", "CHROMIUM", 51.996),
	        new SolidPeriodicElement(25, "Mn", "MANGANESE", 54.938),
	        new SolidPeriodicElement(26, "Fe", "FERRUM", 55.845),            
	        new SolidPeriodicElement(27, "Co", "COBALT", 58.933),
	        new SolidPeriodicElement(28, "Ni", "NICKEL", 58.693),
	        new SolidPeriodicElement(29, "Cu", "CUPRUM", 63.546),    
	        new SolidPeriodicElement(30, "Zn", "ZINC", 65.38),
	        new SolidPeriodicElement(31, "Ga", "GALLIUM", 69.723),
	        new SolidPeriodicElement(32, "Ge", "GERMANIUM", 72.63),
	        new SolidPeriodicElement(33, "As", "ARSENIC", 74.922),
	        new SolidPeriodicElement(34, "Se", "SELENIUM", 78.971),            
	        new LiquidPeriodicElement(35, "Br", "BROMINE", 79.904),
	        new GasPeriodicElement(36, "Kr", "KRYPTON", 83.798),
	        new SolidPeriodicElement(37, "Rb", "RUBIDIUM", 85.468),
	        new SolidPeriodicElement(38, "Sr", "STRONTIUM", 87.62),
	        new SolidPeriodicElement(39, "Y", "YTTRIUM", 88.906),    
	        new SolidPeriodicElement(40, "Zr", "ZIRCONIUM", 91.224),
	        new SolidPeriodicElement(41, "Nb", "NIOBIUM", 92.906),
	        new SolidPeriodicElement(42, "Mo", "MOLYBDENUM", 95.95),
	        new UnknownPeriodicElement(43, "Tc", "TECHNETIUM", 98),
	        new SolidPeriodicElement(44, "Ru", "RUTHENIUM", 101.07),            
	        new SolidPeriodicElement(45, "Rh", "RHODIUM", 102.91),
	        new SolidPeriodicElement(46, "Pd", "PALLADIUM", 106.42),
	        new SolidPeriodicElement(47, "Ag", "SILVER", 107.87),
	        new SolidPeriodicElement(48, "Cd", "CADMIUM", 112.41),
	        new SolidPeriodicElement(49, "In", "INDIUM", 114.82),    
	        new SolidPeriodicElement(50, "Sn", "TIN", 118.71)
	};
	
	public static void main(String[] args) {
		
	PeriodicTable ptable=new PeriodicTable(elements);
	
	PeriodicElement[] gasElements=ptable.find(new GasPeriodicElementFinder());  //finder를 이용하여 Gas객체만 뽑아 gasElements에 저장
	PeriodicElement[] solidElements=ptable.find(new SolidPeriodicElementFinder());  //finder를 이용하여 Solid객체만 뽑아 solidElements에 저장
	PeriodicElement[] liquidElements=ptable.find(new LiquidPeriodicElementFinder());  //finder를 이용하여 Liquid객체만 뽑아 liquidElements에 저장
	PeriodicElement[] unknownElements=ptable.find(new UnknownPeriodicElementFinder());  //finder를 이용하여 Unknown객체만 뽑아 unknownElements에 저장
	 
	//gasElements, solidElements, liquidElements, unknownElements 각각 출력
	for(PeriodicElement i:gasElements)
		System.out.println(i);
	for(PeriodicElement i:solidElements)
		System.out.println(i);
	for(PeriodicElement i:liquidElements)
		System.out.println(i);
	for(PeriodicElement i:unknownElements)
		System.out.println(i);
	System.out.println();
	
	PeriodicElement[] igasElements=ptable.find(new IGasPeriodicElementFinder());  //ifinder를 이용하여 Gas객체만 뽑아 igasElements에 저장
	PeriodicElement[] isolidElements=ptable.find(new ISolidPeriodicElementFinder());  //ifinder를 이용하여 Solid객체만 뽑아 isolidElements에 저장
	PeriodicElement[] iliquidElements=ptable.find(new ILiquidPeriodicElementFinder());  //ifinder를 이용하여 Liquid객체만 뽑아 iliquidElements에 저장
	PeriodicElement[] iunknownElements=ptable.find(new IUnknownPeriodicElementFinder());  //ifinder를 이용하여 Unknown객체만 뽑아 iunknownElements에 저장
	
	//igasElements, isolidElements, iliquidElements, iunknownElements 각각 출력
	for(PeriodicElement i:igasElements)
		System.out.println(i);
	for(PeriodicElement i:isolidElements)
		System.out.println(i);
	for(PeriodicElement i:iliquidElements)
		System.out.println(i);
	for(PeriodicElement i:iunknownElements)
		System.out.println(i);
	System.out.println();
	
	//my code
	System.out.println("Gas원소 중 원자량이 50 이상인 원소");
	for(int a=0;a<gasElements.length;a++)   //a가 0에서부터 gasElement배열의 length까지 1씩 증가
	{
		if(gasElements[a].weight>=50)  //gasElement의 a번째 원소의 weight가 50이상이라면
			System.out.println(gasElements[a]);  //출력
	}
	System.out.println("Solid원소 중 원자량이 100 이상인 원소");
	for(int a=0;a<solidElements.length;a++)   //a가 0에서부터 solidElement배열의 length까지 1씩 증가
	{
		if(solidElements[a].weight>=100)  //solidElement의 a번째 원소의 weight가 100이상이라면
			System.out.println(solidElements[a]); //출력
	}
	}

}
