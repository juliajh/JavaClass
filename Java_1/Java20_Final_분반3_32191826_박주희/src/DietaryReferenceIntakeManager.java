// Kyoung Shin Park (June 2020)
//Java20_Final, 6/25, 32191826 ������ 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;




public class DietaryReferenceIntakeManager {
	private List<DietaryReferenceIntake> list = new ArrayList<>();
	private String[] titles = null;

	// 3.constructor load data and set list & titles
	public DietaryReferenceIntakeManager(String filename) {
		FileReader fr=null;
		List<String> list1 = new ArrayList<>();
		try {
			fr=new FileReader(filename);  
			BufferedReader br=new BufferedReader(fr);  //�޼ҵ忡 �Է¹��� filename�� �̸��� �� ������ �д´�
			System.out.println("file: "+filename);
			String line="";
			boolean first = true; //boolean�� �̿��Ͽ� ù��° ���� �����Ѵ�

			while((line=br.readLine())!=null)  //������ ������ ���پ� �а� null�϶����� �ݺ��Ѵ�
			{
				String[] tokens=line.split(","); //������ ������ ","�������� split�Ͽ� tokens �迭�� �����Ѵ�
				//4
				if(first)  //ù°���̶��
				{
					first=false;
					for(String s:tokens)
						list1.add(s);  //title�� ������ List list1
					titles=list1.toArray(new String[list1.size()]);  //list1�� array�� ��ȯ�Ͽ� titles�� ����

				}
				else
				{
					DietaryReferenceIntake p=DietaryReferenceIntake.parse(tokens);  //token�� ����� string�� �̿��Ͽ� DietaryReferenceIntake p ���� 
					list.add(p);
				}
				
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {  //�������
            e.printStackTrace();
		} catch (IOException e) {	
			e.printStackTrace();
		}
    }
    
	// getTitles
	public String[] getTitles() {
		return titles;
	}

	// print
	public void print() {	
		for (DietaryReferenceIntake e : this.list) {
			System.out.println(e);
		}
	}

	// 5.find: ���ǿ� �ش��ϴ� DietaryReferenceIntake ��ȯ
	public DietaryReferenceIntake find(Predicate<DietaryReferenceIntake> predicate) {
		DietaryReferenceIntake d=new DietaryReferenceIntake();
		for(DietaryReferenceIntake di:list)   
		{
			if(predicate.test(di))
				d=di;
		}
		return d;
	}
	
	// 10. ���ǿ� �ش��ϴ� DietaryReferenceIntake���� ��ȯ
	public DietaryReferenceIntake[] finds(Predicate<DietaryReferenceIntake> predicate) {
		List<DietaryReferenceIntake> d2=new ArrayList<>();
		for(DietaryReferenceIntake di:list)
		{
			if(predicate.test(di))
				d2.add(di);
		}
		DietaryReferenceIntake[] array = d2.toArray(new DietaryReferenceIntake[d2.size()]); //d2 list�� array������ ��ȯ
		return array;
	}

}
