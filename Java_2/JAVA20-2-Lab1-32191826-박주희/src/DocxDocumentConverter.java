//Lab1 32191826 π⁄¡÷»Ò
public class DocxDocumentConverter extends DocumentConverter{

	//constructor
	public DocxDocumentConverter(String extension) {
		super(extension);
	}

	public DocxDocumentConverter() {
		super("docx");
	}

	@Override
	public void save(String filename) {
		System.out.println("Convert the file to "+filename+"."+this.getExtension()); //this.getExtention=docx
	}

}
