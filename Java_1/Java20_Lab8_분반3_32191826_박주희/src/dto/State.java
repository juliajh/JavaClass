package dto;

public enum State {
	GAS,
	SOLID,
	LIQUID,
	UNKNOWN;
	
	
	
	public static State nameOf(String name) {
		switch(name) {
		case "SOLID":
			return SOLID;
		case "GAS":
			return GAS;
		case "LIQUID":
			return LIQUID;
		case "UNKNOWN":
			return UNKNOWN;
		default: return null;
		}
	}
}
