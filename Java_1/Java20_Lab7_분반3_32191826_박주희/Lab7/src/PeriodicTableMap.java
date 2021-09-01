//Lab7 3�й� 6/02 32191826 ������
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
	
	//map�� ���� �߰��ϴ� �޼ҵ�
	public void add(Element e,PeriodicElement pe)
	{
		elements.put(e,pe);
	}
	
	//map���� �ش� pe�� �����ϴ� �޼ҵ�
	public void remove(Element e)
	{
		elements.remove(e);
	}
	
	//map���� �ش� Element�� pe�� ��ü�ϴ� �޼ҵ�
	public void set(Element e,PeriodicElement pe)
	{
		elements.replace(e,pe);
	}
	
	//map���� �ش� Element�� pe�� ��ȯ�ϴ� �޼ҵ�
	public PeriodicElement get(Element e)
	{
		PeriodicElement pe=elements.get(e);
		return pe;
	}
	
	//map���� �����ϰ� �ϳ� �����ؼ� ��ȯ�ϴ� �޼ҵ�
	public PeriodicElement getRandomElement()
	{
		Random rd=new Random();
		int idx = rd.nextInt(elements.size());  // 0~elements.size-1 ������ ������ �����ϰ� �̾� idx�� ����
		PeriodicElement pe=(new ArrayList<PeriodicElement>(elements.values())).get(idx); 
		//���ο� list�� �����Ͽ� elements�� ��� ���� �����ϰ� idx��° ���Ҹ� pe�� ����
		return pe;
	}
	
	//map�� ũ�⸦ ��ȯ�ϴ� �޼ҵ�
	public int size()
	{
		return elements.size();
	}
	
	//map���� �ش� e�� pe�� ��ȯ�ϴ� �޼ҵ�
	public PeriodicElement find(Element e)
	{
		PeriodicElement pe=elements.get(e);
		return pe;
		
	}

	//map���� �ش� symbol�� pe�� ��ȯ�ϴ� �޼ҵ�
	public PeriodicElement find(String symbol)
	{
		Element e=Element.symbolOf(symbol); //Element�� symbolOf�޼ҵ带 �̿��Ͽ� �Է��� symbol�� Element enum�� ����� �� ȣ��
		PeriodicElement pe=elements.get(e); 
		return pe;
	}

	//map���� �ش� finder�� pe list�� ��ȯ�ϴ� �޼ҵ�
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
	
	//map �����ϴ� �޼ҵ�
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
	
	//map�� key�� ����Ʈ�ϴ� �޼ҵ�
	public void printKeys()
	{
		for(Map.Entry<Element, PeriodicElement> entry:elements.entrySet())
		{
			System.out.println(entry.getKey());
		}
	}
	
	//map�� value�� ����Ʈ�ϴ� �޼ҵ�
	public void printValues()
	{
		for(Map.Entry<Element, PeriodicElement> entry:elements.entrySet())
		{
			System.out.println(entry.getValue());
		}
	}
	

}
