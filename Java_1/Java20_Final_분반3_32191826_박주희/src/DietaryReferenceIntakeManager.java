// Kyoung Shin Park (June 2020)
//Java20_Final, 6/25, 32191826 박주희 
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
			BufferedReader br=new BufferedReader(fr);  //메소드에 입력받은 filename의 이름을 한 파일을 읽는다
			System.out.println("file: "+filename);
			String line="";
			boolean first = true; //boolean을 이용하여 첫번째 줄을 구분한다

			while((line=br.readLine())!=null)  //파일의 내용을 한줄씩 읽고 null일때까지 반복한다
			{
				String[] tokens=line.split(","); //한줄의 내용을 ","기준으로 split하여 tokens 배열에 저장한다
				//4
				if(first)  //첫째줄이라면
				{
					first=false;
					for(String s:tokens)
						list1.add(s);  //title만 저장한 List list1
					titles=list1.toArray(new String[list1.size()]);  //list1을 array로 변환하여 titles에 저장

				}
				else
				{
					DietaryReferenceIntake p=DietaryReferenceIntake.parse(tokens);  //token에 저장된 string을 이용하여 DietaryReferenceIntake p 생성 
					list.add(p);
				}
				
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {  //예외잡기
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

	// 5.find: 조건에 해당하는 DietaryReferenceIntake 반환
	public DietaryReferenceIntake find(Predicate<DietaryReferenceIntake> predicate) {
		DietaryReferenceIntake d=new DietaryReferenceIntake();
		for(DietaryReferenceIntake di:list)   
		{
			if(predicate.test(di))
				d=di;
		}
		return d;
	}
	
	// 10. 조건에 해당하는 DietaryReferenceIntake들을 반환
	public DietaryReferenceIntake[] finds(Predicate<DietaryReferenceIntake> predicate) {
		List<DietaryReferenceIntake> d2=new ArrayList<>();
		for(DietaryReferenceIntake di:list)
		{
			if(predicate.test(di))
				d2.add(di);
		}
		DietaryReferenceIntake[] array = d2.toArray(new DietaryReferenceIntake[d2.size()]); //d2 list를 array형으로 반환
		return array;
	}

}
