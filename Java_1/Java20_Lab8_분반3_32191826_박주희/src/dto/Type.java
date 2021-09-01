package dto;

public enum Type {
	ACTINIDE,
	ALKALI_METAL,
	ALKALINE_EARTH_METAL,
	HOLOGEN, 
	LANTHANIDE,
	METALLOID, 
	METAL, 
	NOBLE_GAS,
	NONMETAL,
	TRANSACTINIDE,
	TRANSITION_METAL;


	public static Type nameOf(String name) {
		switch(name) {
		case "ACTINIDE":
			return ACTINIDE;
		case "ALKALI_METAL":
			return ALKALI_METAL;
		case "ALKALINE_EARTH_METAL":
			return ALKALINE_EARTH_METAL;
		case "HOLOGEN":
			return HOLOGEN;
		case "LANTHANIDE":
			return LANTHANIDE;
		case "METALLOID":
			return METALLOID;
		case "METAL":
			return METAL;
		case "NOBLE_GAS":
			return NOBLE_GAS;
		case "NONMETAL":
			return NONMETAL;
		case "TRANSACTINIDE":
			return TRANSACTINIDE;
		case "TRANSITION_METAL":
			return TRANSITION_METAL;
		
		default: return null;
		}
	}
}