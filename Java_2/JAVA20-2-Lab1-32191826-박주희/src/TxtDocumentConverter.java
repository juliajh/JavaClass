//Lab1 32191826 π⁄¡÷»Ò
public class TxtDocumentConverter extends DocumentConverter{

	public TxtDocumentConverter(String extension) {
		super(extension);
	}

	public TxtDocumentConverter() {
		super("txt");
	}

	@Override
	public void save(String filename) {
		System.out.println("Convert the file to "+filename+ "."+this.getExtension()); //this.getExtention=txt
	}

}
 