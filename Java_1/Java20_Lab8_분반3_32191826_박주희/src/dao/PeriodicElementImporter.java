//Lab8, 3분반, 6/10, 32191826, 박주희

package dao;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import dto.PeriodicElement;
import dto.State;
import dto.Type;

public class PeriodicElementImporter {

	public static List<PeriodicElement> loadCSV(String filename) 
	{
		List<PeriodicElement> pe = new ArrayList<>(); //PeriodicElement형 list pe생성
		FileReader fr=null;

		try {
			fr=new FileReader(filename);  
			BufferedReader br=new BufferedReader(fr);  //메소드에 입력받은 filename의 이름을 한 파일을 읽는다
			System.out.println("file: "+filename);
			String line="";
			while((line=br.readLine())!=null)  //파일의 내용을 한줄씩 읽고 null일때까지 반복한다
			{
				String[] tokens=line.split(","); //한줄의 내용을 , 기준으로 split하여 tokens 배열에 저장한다
				PeriodicElement p=PeriodicElement.parse(tokens);  //token에 저장된 string을 이용하여 PeriodicElement p 생성 
				pe.add(p);
				
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {  //예외잡기
            e.printStackTrace();
		} catch (IOException e) {	
			e.printStackTrace();
		}
		
		
		return pe;
		
	}
	
	public static void saveCSV(String path,List <PeriodicElement> elements) throws IOException
	{
		try (PrintWriter writer = new PrintWriter(new File(path)))
		{

			for(PeriodicElement pe: elements)
			{	      
				StringBuilder sb = new StringBuilder();
				sb.append(pe.getNumber());
				sb.append(',');
				sb.append(pe.getSymbol());
				sb.append(',');
				sb.append(pe.getName());
				sb.append(',');
				sb.append(pe.getWeight());
				sb.append(',');
				sb.append(pe.getPeriod());
				sb.append(',');
				sb.append(pe.getGroup());
				sb.append(',');
				sb.append(pe.getType());
				sb.append(',');
				sb.append(pe.getState());
				sb.append('\n');
				writer.write(sb.toString());
			}
		}
	    
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}  
  

		System.out.println("done!");
	
	}
}
