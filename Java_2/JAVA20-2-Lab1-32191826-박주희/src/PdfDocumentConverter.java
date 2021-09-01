//Lab1 32191826 π⁄¡÷»Ò
public class PdfDocumentConverter extends DocumentConverter{

	public PdfDocumentConverter(String extension) {
		super(extension);
	}

	public PdfDocumentConverter() {
		super("pdf");
	} 

	@Override
	public void save(String filename) {
		System.out.println("Convert the file to "+filename+"."+this.getExtension()); //this.getExtention=pdf
	} 

}
