//Lab1 32191826 박주희
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
		//substring을 이용하여 파일형을 자른 값을 fileName에 저장
		this.fileName=fn.substring(0,fn.lastIndexOf("."));  //0번째 인덱스에서 .전의 인덱스까지 자르기
	}
	
	//HashMap documentConverters에 각자의 정보를 저장하는 메소드
	public void addDocumentConverter(DocumentConverter dc) {
		//조건문을 이용하여 파일형 구분
		//documentConverters의 key=파일형(string) value=객체(DocumentConverter)
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
	
	//파일형을 바꿔주는 메소드
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
			
			Set<String> keys=documentConverters.keySet(); //모든 key를 가진 Set 컬렉션 리턴
			Iterator<String> it=keys.iterator(); //Set에 있는 모든 key를 순서대로 검색하는 Iterator 리턴
			
			while(it.hasNext()) {
				String s=it.next();  //다음 키
				System.out.println(this.fileName+"."+s);
			}
		}
		else {
			System.out.println("cannot delete "+ext);
		}
	}
	

}
  