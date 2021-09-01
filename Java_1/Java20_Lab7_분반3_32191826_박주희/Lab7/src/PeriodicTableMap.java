//Lab7 3분반 6/02 32191826 박주희
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;


public class PeriodicTableMap {
	private Map<Element,PeriodicElement> elements=null;
	
	//constructor
	public PeriodicTableMap() {
		this.elements=new HashMap<>();
	}
	
	//map에 새로 추가하는 메소드
	public void add(Element e,PeriodicElement pe)
	{
		elements.put(e,pe);
	}
	
	//map에서 해당 pe를 삭제하는 메소드
	public void remove(Element e)
	{
		elements.remove(e);
	}
	
	//map에서 해당 Element를 pe로 교체하는 메소드
	public void set(Element e,PeriodicElement pe)
	{
		elements.replace(e,pe);
	}
	
	//map에서 해당 Element의 pe를 반환하는 메소드
	public PeriodicElement get(Element e)
	{
		PeriodicElement pe=elements.get(e);
		return pe;
	}
	
	//map에서 랜덤하게 하나 선택해서 반환하는 메소드
	public PeriodicElement getRandomElement()
	{
		Random rd=new Random();
		int idx = rd.nextInt(elements.size());  // 0~elements.size-1 사이의 정수를 랜덤하게 뽑아 idx에 저장
		PeriodicElement pe=(new ArrayList<PeriodicElement>(elements.values())).get(idx); 
		//새로운 list를 생성하여 elements의 모든 값을 저장하고 idx번째 원소만 pe에 저장
		return pe;
	}
	
	//map의 크기를 반환하는 메소드
	public int size()
	{
		return elements.size();
	}
	
	//map에서 해당 e의 pe를 반환하는 메소드
	public PeriodicElement find(Element e)
	{
		PeriodicElement pe=elements.get(e);
		return pe;
		
	}

	//map에서 해당 symbol의 pe를 반환하는 메소드
	public PeriodicElement find(String symbol)
	{
		Element e=Element.symbolOf(symbol); //Element의 symbolOf메소드를 이용하여 입력한 symbol로 Element enum에 저장된 값 호출
		PeriodicElement pe=elements.get(e); 
		return pe;
	}

	//map에서 해당 finder의 pe list를 반환하는 메소드
	public List<PeriodicElement> find(IPeriodicElementFinder ifinder)
	{

		List<PeriodicElement> pe = new ArrayList<>();
		for(Map.Entry<Element, PeriodicElement> entry:elements.entrySet())
		{
			PeriodicElement p=entry.getValue();
			if((p!=null)&&(ifinder.isInstanceOf(p)==true))
					pe.add(p);
		}
		return pe;
	}
	
	//map 정렬하는 메소드
	public void sort()
	{
		List<Map.Entry<Element,PeriodicElement>> entries=new ArrayList<>(elements.entrySet());
		entries.sort(new Comparator<Map.Entry<Element,PeriodicElement>>() 
		{
			@Override
			public int compare(Entry<Element,PeriodicElement> o1, Entry<Element,PeriodicElement> o2)
			{
				return o1.getValue().compareTo(o2.getValue());
			}		
		});
		Map<Element,PeriodicElement> sortedMap=new LinkedHashMap<>();
		for(Map.Entry<Element,PeriodicElement>entry:entries)
		{
			sortedMap.put(entry.getKey(),entry.getValue());
		}
		elements=sortedMap;
		
	}
	public void print()
	{
		for(Map.Entry<Element, PeriodicElement> entry:elements.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	
	//map의 key를 프린트하는 메소드
	public void printKeys()
	{
		for(Map.Entry<Element, PeriodicElement> entry:elements.entrySet())
		{
			System.out.println(entry.getKey());
		}
	}
	
	//map의 value를 프린트하는 메소드
	public void printValues()
	{
		for(Map.Entry<Element, PeriodicElement> entry:elements.entrySet())
		{
			System.out.println(entry.getValue());
		}
	}
	

}
