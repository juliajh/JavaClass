// Kyoung Shin Park (June 2020)
//Java20_Final, 6/25, 32191826 박주희 
public class DietaryReferenceIntake {
	protected Gender gender;
	protected AgeRange age;
	protected int protein; // (g)
	protected int fiber; // (g)
	protected int water; // (ml)
	protected int vitaminC; // (mg) 
	protected double thiamine; // (mg) vitamin B1 C12H17N4OS+ 265.35 g 
	protected double riboflavin; // (mg) vitamin B2 C17H20N4O6
	protected int niacin; // (mg NE) vitamin B3 C6H5NO2
	protected double vitaminB6; // (mg) vitamin B6
	protected int folacin; // (μg DFE) vitamin B9
	protected double vitaminB12; // (μg) 
	protected int pantothenic; // (mg) vitamin B5
	protected int biotin; // (μg) vitamin B7
	protected int vitaminA; // (μg RAE) 
	protected int vitaminD; // (μg) 
	protected int vitaminE; // (mg α-TE) 
	protected int vitaminK; // (μg)
	protected int calcium; // (mg)	
	protected int phosphorus; // (mg)
	protected double sodium; // (g)
	protected double chlorine; // (g)
	protected double potassium; // (g)
	protected int magnesium; // (mg)
	protected int iron; // (mg)
	protected int zinc; // (mg)
	protected int copper; // (μg)
	protected double fluorine; // (mg)
	protected double manganese; // (mg)
	protected int iodine; // (μg)
	protected int selenium; // (μg)
	
	//constructor
	public DietaryReferenceIntake(Gender gender,AgeRange age, int protein,int fiber,int water,int vitaminC,double thiamine, double riboflavin,
			int niacin,double vitaminB6,int folacin,double vitaminB12, int pantothenic,int biotin,int vitaminA,int vitaminD,int vitaminE,
			int vitaminK,int calcium,int phosphorus,double sodium,double chlorine,double potassium,int magnesium,int iron,int zinc,int copper,
			double fluorine,double manganese,int iodine,int selenium) 
	{
		
		this.gender=gender;
		this.age=age;
		this.protein=protein;
		this.fiber=fiber;
		this.water=water;
		this.vitaminC=vitaminC;
		this.thiamine=thiamine;
		this.riboflavin=riboflavin;
		this.niacin=niacin;
		this.vitaminB6=vitaminB6;
		this.folacin=folacin;
		this.vitaminB12=vitaminB12;
		this.pantothenic=pantothenic;
		this.biotin=biotin;
		this.vitaminA=vitaminA;
		this.vitaminD=vitaminD;
		this.vitaminE=vitaminE;
		this.vitaminK=vitaminK;
		this.calcium=calcium;
		this.phosphorus=phosphorus;
		this.sodium=sodium;
		this.chlorine=chlorine;
		this.potassium=potassium;
		this.magnesium=magnesium;
		this.iron=iron;
		this.zinc=zinc;
		this.copper=copper;
		this.fluorine=fluorine;
		this.manganese=manganese;
		this.iodine=iodine;
		this.selenium=selenium;
		
	}
	public DietaryReferenceIntake() {
		super();
	}
	
	//1.getter
	public Gender getGender() {
		return gender;
	}
	public AgeRange getAgeRange() {
		return age;
	}
	public int getprotein() {
		return protein;
	}
	public int getfiber() {
		return fiber;
	}
	public int getwater() {
		return water;
	}
	public int getvitaminC() {
		return vitaminC;
	}
	public double getthiamine() {
		return thiamine;
	}
	public double getriboflavin() {
		return riboflavin;
	}
	public int getniacin() {
		return niacin;
	}
	public double getvitaminB6() {
		return vitaminB6;
	}
	public int getfolacin() {
		return folacin;
	}
	public double getvitaminB12() {
		return vitaminB12;
	}
	public int getpantothenic() {
		return pantothenic;
	}
	public int getbiotin() {
		return biotin;
	}
	public int getvitaminA() {
		return vitaminA;
	}
	public int getvitaminD() {
		return vitaminD;
	}
	public int getvitaminE() {
		return vitaminE;
	}
	public int getvitaminK() {
		return vitaminK;
	}
	public int getcalcium() {
		return calcium;
	}
	public int getphosphorus() {
		return phosphorus;
	}
	public double getsodium() {
		return sodium;
	}
	public double getchlorine() {
		return chlorine;
	}
	public double getpotassium() {
		return potassium;
	}
	public int getmagnesium() {
		return magnesium;
	}
	public int getiron() {
		return iron;
	}
	public int getzinc() {
		return zinc;
	}
	public int getcopper() {
		return copper;
	}
	public double getfluorine() {
		return fluorine;
	}
	public double getmanganese() {
		return manganese;
	}
	public int getiodine() {
		return iodine;
	}
	public int getselenium() {
		return selenium;
	}
	
	//1.setter
	public void setGender(Gender gender) {
		this.gender=gender;
	}
	public void setAgeRange(AgeRange age) {
		this.age=age;
	}
	public void setprotein(int protein) {
		this.protein=protein;
	}
	public void setfiber(int fiber) {
		this.fiber=fiber;
	}
	public void setwater(int water) {
		this.water=water;
	}
	public void setvitaminC(int vitaminC) {
		this.vitaminC=vitaminC;
	}
	public void setthiamine(double thiamine) {
		this.thiamine=thiamine;
	}
	public void setriboflavin(double riboflavin) {
		this.riboflavin=riboflavin;
	}
	public void setniacin(int niacin) {
		this.niacin=niacin;
	}
	public void setvitaminB6(double vitaminB6) {
		this.vitaminB6=vitaminB6;
	}
	public void setfolacin(int folacin) {
		this.folacin=folacin;
	}
	public void setvitaminB12(double vitaminB12) {
		this.vitaminB12=vitaminB12;
	}
	public void setpantothenic(int pantothenic) {
		this.pantothenic=pantothenic;
	}
	public void setbiotin(int biotin) {
		this.biotin=biotin;
	}
	public void setvitaminA(int vitaminA) {
		this.vitaminA=vitaminA;
	}
	public void setvitaminD(int vitaminD) {
		this.vitaminD=vitaminD;
	}
	public void setvitaminE(int vitaminE) {
		this.vitaminE=vitaminE;
	}
	public void setvitaminK(int vitaminK) {
		this.vitaminK=vitaminK;
	}
	public void setcalcium(int calcium) {
		this.calcium=calcium;
	}
	public void setphosphorus(int phosphorus) {
		this.phosphorus=phosphorus;
	}
	public void setmagnesium(double sodium) {
		this.sodium=sodium;
	}
	public void setchlorine(double chlorine) {
		this.chlorine=chlorine;
	}
	public void setpotassium(double potassium) {
		this.potassium=potassium;
	}
	public void setmagnesium(int magnesium) {
		this.magnesium=magnesium;
	}
	public void setiron(int iron) {
		this.iron=iron;
	}
	public void setzinc(int zinc) {
		this.zinc=zinc;
	}
	public void setcopper(int copper) {
		this.copper=copper;
	}
	public void setfluorine(double fluorine) {
		this.fluorine=fluorine;
	}
	public void setmanganese(double manganese) {
		this.manganese=manganese;
	}
	public void setiodin(int iodine) {
		this.iodine=iodine;
	}
	public void setselenium(int selenium) {
		this.selenium=selenium;
	}
	

	// String[] toTextfields()
	public String[] toTextfields() {
		String[] results = new String[29];
		results[0] = "" + protein;
		results[1] = "" + fiber;
		results[2] = "" + water;
		results[3] = "" + vitaminC;
		results[4] = "" + thiamine;
		results[5] = "" + riboflavin;
		results[6] = "" + niacin;
		results[7] = "" + vitaminB6;
		results[8] = "" + folacin;
		results[9] = "" + vitaminB12;
		results[10] = "" + pantothenic;
		results[11] = "" + biotin;
		results[12] = "" + vitaminA;
		results[13] = "" + vitaminD;
		results[14] = "" + vitaminE;
		results[15] = "" + vitaminK;
		results[16] = "" + calcium;
		results[17] = "" + phosphorus;
		results[18] = "" + sodium;
		results[19] = "" + chlorine;
		results[20] = "" + potassium;
		results[21] = "" + magnesium;
		results[22] = "" + iron;
		results[23] = "" + zinc;
		results[24] = "" + copper;
		results[25] = "" + fluorine;
		results[26] = "" + manganese;
		results[27] = "" + iodine;
		results[28] = "" + selenium;
		return results;
	}
	
	// 2.utility method (String[] -> DietaryReferenceIntake)
	// parse하여 각 정보를 변수에 저장하고 그 정보를 가진 DietaryReferenceIntake 반환
	public static DietaryReferenceIntake parse(String[] fields) {
		Gender gender=Gender.valueOf(fields[0]);
		AgeRange age=AgeRange.nameOf(fields[1]);
		int protein=Integer.parseInt(fields[2]);
		int fiber=Integer.parseInt(fields[3]);
		int water=Integer.parseInt(fields[4]);
		int vitaminC=Integer.parseInt(fields[5]);
		double thiamine=Double.parseDouble(fields[6]);
		double riboflavin=Double.parseDouble(fields[7]);
		int niacin=Integer.parseInt(fields[8]);
		double vitaminB6=Double.parseDouble(fields[9]);
		int folacin=Integer.parseInt(fields[10]);
		double vitaminB12=Double.parseDouble(fields[11]);
		int pantothenic=Integer.parseInt(fields[12]);
		int biotin=Integer.parseInt(fields[13]);
		int vitaminA=Integer.parseInt(fields[14]);
		int vittaminD=Integer.parseInt(fields[15]);
		int vitaminE=Integer.parseInt(fields[16]);
		int vitaminK=Integer.parseInt(fields[17]);
		int calcium=Integer.parseInt(fields[18]);
		int phosphorus=Integer.parseInt(fields[19]);
		double sodium=Double.parseDouble(fields[20]);
		double chlorine=Double.parseDouble(fields[21]);
		double potassium=Double.parseDouble(fields[22]);
		int magnesium=Integer.parseInt(fields[23]);
		int iron=Integer.parseInt(fields[24]);
		int zinc=Integer.parseInt(fields[25]);
		int copper=Integer.parseInt(fields[26]);
		double fluorine=Double.parseDouble(fields[27]);
		double manganese=Double.parseDouble(fields[28]);
		int iodine=Integer.parseInt(fields[29]);
		int selenium=Integer.parseInt(fields[30]);
		
		DietaryReferenceIntake p=new DietaryReferenceIntake(gender,age,protein,fiber,water,vitaminC,thiamine,riboflavin,niacin,vitaminB6,folacin,vitaminB12,pantothenic, biotin,
				vitaminA,vittaminD,vitaminE,vitaminK,calcium,phosphorus,sodium,chlorine,potassium,magnesium,iron,zinc,copper,fluorine,manganese,iodine,selenium);
		return p;

	}
	
	// 1.toString
	public String toString() {
		return "["+gender+", "+age+", "+protein+", "+fiber+", "+water+", "+vitaminC+", "+thiamine+", "+riboflavin+", "+niacin+", "+vitaminB6+", "+
	folacin+", "+vitaminB12+", "+pantothenic+", "+biotin+", "+vitaminA+", "+vitaminD+", "+vitaminE+", "+vitaminK+", "+calcium+", "+phosphorus+", "+
	sodium+", "+chlorine+", "+potassium+", "+magnesium+", "+iron+", "+zinc+", "+copper+", "+fluorine+", "+manganese+", "+iodine+", "+selenium+"]";			
		
	}
	
	

}