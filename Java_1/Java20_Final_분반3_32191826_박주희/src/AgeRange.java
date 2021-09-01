// Kyoung Shin Park (June 2020)
//Java20_Final, 6/25, 32191826 ¹ÚÁÖÈñ 

public enum AgeRange {
	AGE_6_TO_8, 
	AGE_9_TO_11,
	AGE_12_TO_14, 
	AGE_15_TO_18,
	AGE_19_TO_29, 
	AGE_30_TO_49,
	AGE_50_TO_64, 
	AGE_65_TO_74,
	AGE_75_HIGHER;

	// 6.String "6~8" -> AgeRange AGE_6_TO_8
	public static AgeRange nameOf(String value) {
		switch(value) {
		case "6~8":
			return AGE_6_TO_8;
		case "9~11":
			return AGE_9_TO_11;
		case "12~14":
			return AGE_12_TO_14;
		case "15~18":
			return AGE_15_TO_18;
		case "19~29":
			return AGE_19_TO_29;
		case "30~49":
			return AGE_30_TO_49;
		case "50~64":
			return AGE_50_TO_64;
		case "65~74":
			return AGE_65_TO_74;
		case "75~":
			return AGE_75_HIGHER;
		default: return null;
		}
		
	}
	
	// AgeRange AGE_6_TO_8 -> String "6~8"
	public static String valueOf(AgeRange a) {
		switch(a) {
		case AGE_6_TO_8:
			return "6~8";
		case AGE_9_TO_11:
			return "9~11";
		case AGE_12_TO_14:
			return "12~14";
		case AGE_15_TO_18:
			return "15~18";
		case AGE_19_TO_29:
			return "19~29";
		case  AGE_30_TO_49:
			return "30~49";
		case AGE_50_TO_64:
			return "50~64";
		case AGE_65_TO_74:
			return "65~74";
		case AGE_75_HIGHER:
			return "75~";
		default: return null;
		}
		
	}
}
