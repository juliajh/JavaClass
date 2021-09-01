// Kyoung Shin Park (June 2020)
//Java20_Final, 6/25, 32191826 ¹ÚÁÖÈñ 
import javax.swing.JFrame;

public class Java20Final extends JFrame{

	public static void main(String[] args) {
		//8
		DietaryReferenceIntakeFindFrame f=new DietaryReferenceIntakeFindFrame("name",new DietaryReferenceIntakeManager("JAVA20-FINAL.csv"));
		f.average("6~8");
		f.average("9~11");
		f.average("12~14");
		f.average("15~18");
		f.average("19~29");
		f.average("30~49");
		f.average("50~64");
		f.average("65~74");
		f.average("75~");
	}


}
