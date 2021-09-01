//Lab8, 3�й�, 6/10, 32191826, ������

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
		List<PeriodicElement> pe = new ArrayList<>(); //PeriodicElement�� list pe����
		FileReader fr=null;

		try {
			fr=new FileReader(filename);  
			BufferedReader br=new BufferedReader(fr);  //�޼ҵ忡 �Է¹��� filename�� �̸��� �� ������ �д´�
			System.out.println("file: "+filename);
			String line="";
			while((line=br.readLine())!=null)  //������ ������ ���پ� �а� null�϶����� �ݺ��Ѵ�
			{
				String[] tokens=line.split(","); //������ ������ , �������� split�Ͽ� tokens �迭�� �����Ѵ�
				PeriodicElement p=PeriodicElement.parse(tokens);  //token�� ����� string�� �̿��Ͽ� PeriodicElement p ���� 
				pe.add(p);
				
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {  //�������
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
