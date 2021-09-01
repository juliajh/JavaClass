//Lab1 32191826 π⁄¡÷»Ò
public abstract class DocumentConverter {
	private String ext;
	
	public DocumentConverter(String extension) {
		ext=extension;
	} 
	
	public String getExtension() {
		return ext;
	}
	
	public abstract void save(String filename);
}
