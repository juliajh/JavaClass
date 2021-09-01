
public enum Element {
	HYDROGEN(1),
	HELIUM(2),
	LITHIUM(3),
	BERYLLIUM(4),
	BORON(5),
	CARBON(6),
	NITROGEN(7),
	OXYGEN(8),
	FLUORINE(9),
	NEON(10),
	NATRIUM(11),
	MAGNESIUM(12),
	ALUMINIUM(13),
	SILICON(14),
	PHOSPHORUS(15),
	SULPHUR(16),
	CHLORIUM(17),
	ARGON(18),
	KALUIM(19),
	CALCIUM(20),
	SCANDIUM(21),
	TITANIUM(22),
	VANADIUM(23),
	CHROMIUM(24),
	MANGANESE(25),
	IRON(26),
	COBALT(27),
	NICKEL(28),
	COPPER(29),
	ZINC(30),
	GALLIUM(31),
	GERMANIUM(32),
	ARSENIC(33),
	SELENIUM(34),
	BROMINE(35),
	KRYPTON(36),
	RUBIDIUM(37),
	STRONTIUM(38),
	YTTRIUM(39),
	ZIRCONIUM(40),
	NIOBIUM(41),
	MOLYBDENUM(42),
	TECHNETIU(43),
	RUTHENIUM(44),
	RHODIUM(45),
	PALLADIUM(46),
	SILVER(47),
	CADMIUM(48),
	INDIUM(49),
	TIN(50);
	
	private final int value;
	Element(int value){ //생성자
		this.value=value;  //열거값에 value 대입
	}
	
	//getValue:value값 반환
	public int getValue() { 
		return value;  
	}
	
	//get Element by index
	public static Element valueOf(int value) {
		switch(value) {
		case 1: return HYDROGEN;
		case 2: return HELIUM;
		case 3: return LITHIUM;
		case 4: return BERYLLIUM;
		case 5: return BORON;
		case 6: return CARBON;
		case 7: return NITROGEN;
		case 8: return OXYGEN;
		case 9: return FLUORINE;
		case 10: return NEON;
		case 11: return NATRIUM;
		case 12: return MAGNESIUM;
		case 13: return ALUMINIUM;
		case 14: return SILICON;
		case 15: return PHOSPHORUS;
		case 16: return SULPHUR;
		case 17: return CHLORIUM;
		case 18: return ARGON;
		case 19: return KALUIM;
		case 20: return CALCIUM;
		case 21: return SCANDIUM;
		case 22: return TITANIUM;
		case 23: return VANADIUM;
		case 24: return CHROMIUM;
		case 25: return MANGANESE;
		case 26: return IRON;
		case 27: return COBALT;
		case 28: return NICKEL;
		case 29: return COPPER;
		case 30: return ZINC;
		case 31: return GALLIUM;
		case 32: return GERMANIUM;
		case 33: return ARSENIC;
		case 34: return SELENIUM;
		case 35: return BROMINE;
		case 36: return KRYPTON;
		case 37: return RUBIDIUM;
		case 38: return STRONTIUM;
		case 39: return YTTRIUM;
		case 40: return ZIRCONIUM;
		case 41: return NIOBIUM;
		case 42: return MOLYBDENUM;
		case 43: return TECHNETIU;
		case 44: return RUTHENIUM;
		case 45: return RHODIUM;
		case 46: return PALLADIUM;
		case 47: return SILVER;
		case 48: return CADMIUM;
		case 49: return INDIUM;
		case 50: return TIN;
		default: return null;
		}
	}
	
	//String형의 원소번호 또는 원소이름을 입력받으면 integer형의 원소번호를 return
		public static Element nameOf(String name) {
			switch(name) {
			case "1":
			case "Hydrogen":
				return HYDROGEN;
			case "2":
			case "Helium":
				return HELIUM;
			case "3":
			case "Lithium":
				return LITHIUM;
			case "4": 
			case "Beryllium":
				return BERYLLIUM;
			case "5":
			case "Boron":
				return BORON;
			case "6":
			case "Carbon":
				return CARBON;
			case "7": 
			case "Nitrogen":
				return NITROGEN;
			case "8": 
			case "Oxygen": 
				return OXYGEN;
			case "9":
			case "Fluorine":
				return FLUORINE;
			case "10": 
			case "Neon":
				return NEON;
			case "11":
			case "Natrium":
				return NATRIUM;
			case "12":
			case "Magnesium":
				return MAGNESIUM;
			case "13":
			case "Aluminuim":
				return ALUMINIUM;
			case "14": 
			case "Silicon":
				return SILICON;
			case "15":
			case "Phosphorus":
				return PHOSPHORUS;
			case "16":
			case "Sulphur":
				return SULPHUR;
			case "17":
			case "Chlorium":
				return CHLORIUM;
			case "18":
			case "Argon":
				return ARGON;
			case "19":
			case "Kaluim":
				return KALUIM;
			case "20":
			case "Calcium":
				return CALCIUM;
			case "21":
			case "Scandium":
				return SCANDIUM;
			case "22":
			case "Titanium":
				return TITANIUM;
			case "23":
			case "Vanadium":
				return VANADIUM;
			case "24":
			case "Chromium":
				return CHROMIUM;
			case "25": 
			case "Manganese":
				return MANGANESE;
			case "26": 
			case "Iron":
				return IRON;
			case "27":
			case "Cobalt":
				return COBALT;
			case "28": 
			case "Nickel":
				return NICKEL;
			case "29":
			case "Copper":
				return COPPER;
			case "30":
			case "Zinc":
				return ZINC;
			case "31":
			case "Gallium":
				return GALLIUM;
			case "32":
			case "Germanium":
				return GERMANIUM;
			case "33":
			case "Arseniuc":
				return ARSENIC;
			case "34":
			case "Selenium":
				return SELENIUM;
			case "35":
			case "Bromine":
				return BROMINE;
			case "36":
			case "Krypton":
				return KRYPTON;
			case "37":
			case "Rubidium":
				return RUBIDIUM;
			case "38":
			case "Strontium":
				return STRONTIUM;
			case "39":
			case "Yttrium":
				return YTTRIUM;
			case "40":
			case "Zirconium":
				return ZIRCONIUM;
			case "41":
			case "Niobium":
				return NIOBIUM;
			case "42":
			case "Molybdenum":
				return MOLYBDENUM;
			case "43":
			case "Technetiu":
				return TECHNETIU;
			case "44":
			case "Ruthenium":
				return RUTHENIUM;
			case "45":
			case "Rhodium":
				return RHODIUM;
			case "46":
			case "Palladium":
				return PALLADIUM;
			case "47":
			case "Silver":
				return SILVER;
			case "48":
			case "Cadmium":
				return CADMIUM;
			case "49":
			case "Indium":
				return INDIUM;
			case "50":
			case "Tin":
				return TIN;
			default: return null;
			}
		}
		
		//4.Foreach문을 이용해서 Element.names() return
		public static String[] names() {
			String[] names=new String[Element.values().length];  //values(): enum의 요소들을 순서대로 enum타입의 배열로 리턴 
			for(Element n:Element.values()) {
				names[n.ordinal()]=n.toString(); //ordinal(): 원소에 열거된 순서를 정수 값으로 리턴
			}
			return names;
		}
		
	}


