//Lab1 32191826 ������
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set; 

public class WordProcessor {
	private ISpellChecker spellChecker=null;
	private HashMap<String, DocumentConverter> documentConverters=new HashMap<String, DocumentConverter>();
	private String fileName=null;
	
	//getter, setter
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public void setSpellChecker(ISpellChecker spellChecker) {
		 this.spellChecker=spellChecker;
	}

	//constructor
	public WordProcessor(){
		this(null);
	}
	
	public WordProcessor(String fn) {
		//substring�� �̿��Ͽ� �������� �ڸ� ���� fileName�� ����
		this.fileName=fn.substring(0,fn.lastIndexOf("."));  //0��° �ε������� .���� �ε������� �ڸ���
	}
	
	//HashMap documentConverters�� ������ ������ �����ϴ� �޼ҵ�
	public void addDocumentConverter(DocumentConverter dc) {
		//���ǹ��� �̿��Ͽ� ������ ����
		//documentConverters�� key=������(string) value=��ü(DocumentConverter)
		if(dc instanceof PdfDocumentConverter){
			documentConverters.put(((PdfDocumentConverter)dc).getExtension(), dc);
		}
		else if(dc instanceof TxtDocumentConverter) {
			documentConverters.put(((TxtDocumentConverter)dc).getExtension(), dc);
		}
		else if(dc instanceof DocxDocumentConverter) {
			documentConverters.put(((DocxDocumentConverter)dc).getExtension(),dc);
		}
	}
	
	//�������� �ٲ��ִ� �޼ҵ�
	public void convertDocumentTo(String ext) {
		if(documentConverters.containsKey(ext)) {
			DocumentConverter dc=documentConverters.get(ext);
			dc.save(this.fileName);
		}
		else {
			System.out.println("cannot convertDocumentTo "+ext+" file format");
		}
	}
	
	public void checkSpelling() {
		spellChecker.check();
	}

	//My code
	public void deleteDocument(String ext) {
		if(documentConverters.containsKey(ext)) {
			documentConverters.remove(ext);
			
			Set<String> keys=documentConverters.keySet(); //��� key�� ���� Set �÷��� ����
			Iterator<String> it=keys.iterator(); //Set�� �ִ� ��� key�� ������� �˻��ϴ� Iterator ����
			
			while(it.hasNext()) {
				String s=it.next();  //���� Ű
				System.out.println(this.fileName+"."+s);
			}
		}
		else {
			System.out.println("cannot delete "+ext);
		}
	}
	

}
  