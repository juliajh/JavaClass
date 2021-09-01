//Lab1 32191826 冠林锐
public class Main{

	public static void main(String[] args) {
		
		WordProcessor wp=new WordProcessor("doc1.docx");  //按眉 积己
		wp.setSpellChecker(new EnglishSpellChecker());
		wp.addDocumentConverter(new DocxDocumentConverter());
		wp.addDocumentConverter(new PdfDocumentConverter());
		wp.addDocumentConverter(new TxtDocumentConverter());
		wp.checkSpelling();
		wp.convertDocumentTo("txt");
		wp.convertDocumentTo("pdf");
		wp.convertDocumentTo("docx");
		wp.convertDocumentTo("wps");
		
		System.out.println();
		//My code
		wp.deleteDocument("docx");
		

	}

}
