//Lab7 3�й� 6/02 32191826 ������
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
	
	Element(int value){ //������
		this.value=value;  //���Ű��� value ����
	}
	
	//getValue:value�� ��ȯ
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
	
	//H -> HYDROGEN
		public static Element symbolOf(String symbol) {
			switch(symbol) {
			case "H":
				return HYDROGEN;
			case "He":
				return HELIUM;
			case "Li":
				return LITHIUM;
			case "Be":
				return BERYLLIUM;
			case "B":
				return BORON;
			case "C":
				return CARBON;
			case "N":
				return NITROGEN;
			case "O": 
				return OXYGEN;
			case "F":
				return FLUORINE;
			case "Ne":
				return NEON;
			case "Na":
				return NATRIUM;
			case "Mg":
				return MAGNESIUM;
			case "Al":
				return ALUMINIUM;
			case "Si":
				return SILICON;
			case "P":
				return PHOSPHORUS;
			case "S":
				return SULPHUR;
			case "Cl":
				return CHLORIUM;
			case "Ar":
				return ARGON;
			case "Ka":
				return KALUIM;
			case "Ca":
				return CALCIUM;
			case "Sc":
				return SCANDIUM;
			case "Ti":
				return TITANIUM;
			case "V":
				return VANADIUM;
			case "Cr":
				return CHROMIUM;
			case "Mn":
				return MANGANESE;
			case "Fe":
				return IRON;
			case "Co":
				return COBALT;
			case "Ni":
				return NICKEL;
			case "Cu":
				return COPPER;
			case "Zn":
				return ZINC;
			case "Ga":
				return GALLIUM;
			case "Ge":
				return GERMANIUM;
			case "As":
				return ARSENIC;
			case "Se":
				return SELENIUM;
			case "Br":
				return BROMINE;
			case "Kr":
				return KRYPTON;
			case "Rb":
				return RUBIDIUM;
			case "Sr":
				return STRONTIUM;
			case "Y":
				return YTTRIUM;
			case "Zr":
				return ZIRCONIUM;
			case "Nb":
				return NIOBIUM;
			case "Mo":
				return MOLYBDENUM;
			case "Tc":
				return TECHNETIU;
			case "Ru":
				return RUTHENIUM;
			case "Rh":
				return RHODIUM;
			case "Pd":
				return PALLADIUM;
			case "Ag":
				return SILVER;
			case "Cd":
				return CADMIUM;
			case "In":
				return INDIUM;
			case "Sn":
				return TIN;
			default: return null;
			}
		}
		
		//"1" or "Hydrogen" -> HYDROGEN
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
}
