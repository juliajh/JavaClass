//Lab7 3분반 6/02 32191826 박주희

import java.util.List;
public class Lab7 {
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
	        new SolidPeriodicElement(11, "Na", "NATRIUM", 22.99),
	        new SolidPeriodicElement(12, "Mg", "MAGNESIUM", 24.305),
	        new SolidPeriodicElement(13, "Al", "ALUMINIUM", 26.982),
	        new SolidPeriodicElement(14, "Si", "SILICON", 28.085),
	        new SolidPeriodicElement(15, "P", "PHOSPHORUS", 30.974),
	        new SolidPeriodicElement(16, "S", "SULPHUR", 32.06),
	        new GasPeriodicElement(17, "Cl", "CHLORIUM", 35.45),            
	        new GasPeriodicElement(18, "Ar", "ARGON", 39.948),
	        new SolidPeriodicElement(19, "K", "KALUIM", 39.098),
	        new SolidPeriodicElement(20, "Ca", "CALCIUM", 40.078),    
	        new SolidPeriodicElement(21, "Sc", "SCANDIUM", 44.956),
	        new SolidPeriodicElement(22, "Ti", "TITANIUM", 47.867),
	        new SolidPeriodicElement(23, "V", "VANADIUM", 50.942),
	        new SolidPeriodicElement(24, "Cr", "CHROMIUM", 51.996),
	        new SolidPeriodicElement(25, "Mn", "MANGANESE", 54.938),
	        new SolidPeriodicElement(26, "Fe", "IRON", 55.845),            
	        new SolidPeriodicElement(27, "Co", "COBALT", 58.933),
	        new SolidPeriodicElement(28, "Ni", "NICKEL", 58.693),
	        new SolidPeriodicElement(29, "Cu", "COPPER", 63.546),    
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
	        new UnknownPeriodicElement(43, "Tc", "TECHNETIU", 98),
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
		
		System.out.println("ptable shuffle test");
		ptable.shuffle();
		ptable.print();
		System.out.println();
		
		System.out.println("ptable sort test");
		ptable.sort();
		ptable.print();
		System.out.println();
		
		System.out.println("ptable find test:LiquidElements");
		PeriodicElement[] iliquidElements=ptable.find(new ILiquidPeriodicElementFinder());  //ifinder를 이용하여 Liquid객체만 뽑아 iliquidElements에 저장
		for(PeriodicElement i:iliquidElements)
			System.out.println(i);
		System.out.println();
		
		System.out.println("ptable get(min,max) test");
		PeriodicElement[] pp=ptable.getElements(3,6); 
		for(PeriodicElement p:pp)
			System.out.println(p);
		System.out.println();
		
		System.out.println("ptable random test");
		System.out.println(ptable.getRandomElement());
		System.out.println();
		
		System.out.println("ptable random test");
		pp=ptable.getRandomElements(3);
		for(PeriodicElement p:pp)
			System.out.println(p);
		System.out.println();
		
		System.out.println("plist add test");
		PeriodicTableList plist = new PeriodicTableList();
		PeriodicElement[] pe=ptable.getElements(0, 10);
		for(int i=0;i<pe.length;i++)
		{
			plist.add(pe[i]);
		}
		plist.print();
		System.out.println();
		
		System.out.println("plist random test");
		System.out.println(plist.getRandomElement());
		System.out.println();
		
		System.out.println("plist sort test");
		plist.sort();
		plist.print();
		System.out.println();
		
		System.out.println("plist get test");
		PeriodicElement p=plist.get(3);
		System.out.println(p);
		p=plist.getPrev(3);
		System.out.println(p);
		p=plist.getNext(3);
		System.out.println(p);
		System.out.println();
		
		System.out.println("plist index test");
		System.out.println(plist.indexOf(p));
		System.out.println();
		
		System.out.println("plist find test:Boron");
		Element e=Element.nameOf("Boron"); 
		PeriodicElement pe1=plist.find(e);
		if(pe1==null)
			System.out.println("해당 원소 없음");
		else
			System.out.println(pe1);
		System.out.println();
		
		System.out.println("plist find test:C");
		PeriodicElement pe2=plist.find("C");
		if(pe2==null)
			System.out.println("해당 원소 없음");
		else
			System.out.println(pe2);
		System.out.println();
		
		System.out.println("plist find test:GasElements");
		List<PeriodicElement> igasElements=plist.find(new IGasPeriodicElementFinder());
		for(PeriodicElement i:igasElements)
			System.out.println(i);
		System.out.println();
		
		PeriodicTableMap pmap=new PeriodicTableMap();
		PeriodicElement[] pe3=ptable.getElements(40, 49); //ptable의 40번째부터 49번째 원소를 pe3에 저장
		
		System.out.println("pmap add test");
		Element[] e1=new Element[5];
		for(int i=0;i<5;i++) 
		{
			String a=pe3[i].getName();  //a에 pe3의 i번째 원소의 이름을 저장
			String b= a.substring(0,1) +a.substring(1,a.length()).toLowerCase(); //b에 a의 첫글자를 제외한 나머지를 소문자로 변환한 것을 저장
			//Lab7의 elements는 원소이름이 모두 대문자이지만 Elements의 nameOf메소드는 첫글자만 대문자이고 모두 소문자이므로 변환해줘야 한다.
			e1[i]=Element.nameOf(b); //e1에 원소이름이 b인 Element를 저장
		}	
		int j=0;
		for(Element o:e1)
		{
			pmap.add(o,pe3[j++]);
		}
		pmap.print();
		pmap.printKeys();
		pmap.printValues();
		System.out.println();
		
		System.out.println("pmap random add test");
		PeriodicElement[] pe4=ptable.getRandomElements(5);
		Element[] e2=new Element[pe4.length];
		for(int i=0;i<pe4.length;i++) 
		{
			String a=pe4[i].getName();
			String b= a.substring(0,1) +a.substring(1,a.length()).toLowerCase();
			e2[i]=Element.nameOf(b);
		}	
		j=0;
		for(Element o:e2)
		{
			pmap.add(o,pe4[j++]);
		}
		pmap.print();
		pmap.printKeys();
		pmap.printValues();
		System.out.println();
		
		System.out.println("pmap random(one) add test");
		Element e3;
		p=ptable.getRandomElement();
		String a=p.getName();
		String b= a.substring(0,1) +a.substring(1,a.length()).toLowerCase();
		e3=Element.nameOf(b);
		System.out.println("random: "+e3);
		pmap.add(e3, p);
		pmap.print();
		pmap.printKeys();
		pmap.printValues();
		System.out.println();
		
		System.out.println("pmap random(one) add test");
		PeriodicElement p1=pmap.getRandomElement();
		System.out.println(p1);
		System.out.println();
		
		System.out.println("pmap sort test");
		pmap.sort();
		pmap.print();
		System.out.println();
		
		System.out.println("pmap find test: 10번");
		Element e4=Element.valueOf(10);
		p=pmap.find(e4);
		if(p==null)
			System.out.println("해당 원소 없음");
		else
			System.out.println(p);
		System.out.println();

		System.out.println("pmap find test: Sr");
		p=pmap.find("Sr");
		if(p==null)
			System.out.println("해당 원소 없음");
		else
			System.out.println(p);
		System.out.println();
		System.out.println("pmap find test:SolidElements");
		List<PeriodicElement> isolidElements=pmap.find(new ISolidPeriodicElementFinder());
		for(PeriodicElement i:isolidElements)
			System.out.println(i);
		System.out.println();
		

		
	}

}
