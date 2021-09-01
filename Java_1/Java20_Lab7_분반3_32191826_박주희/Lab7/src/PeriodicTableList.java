//Lab7 3�й� 6/02 32191826 ������

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;


public class PeriodicTableList {
	private List<PeriodicElement> elements=null;
	
	//constructor
	public PeriodicTableList() {
		this.elements=new ArrayList<>();
	}
	
	//list�� ���� �߰��ϴ� �޼ҵ�
	public void add(PeriodicElement pe)
	{
		elements.add(pe);
	}
	
	//list���� �ش� pe�� �����ϴ� �޼ҵ�
	public void remove(PeriodicElement pe)
	{
		elements.remove(pe);
	}
	
	//list���� �ش� index�� pe�� ��ü�ϴ� �޼ҵ�
	public void set(int index,PeriodicElement pe)
	{
		elements.add(index,pe);
	}
	
	//list���� �ش� index�� pe�� ��ȯ�ϴ� �޼ҵ�
	public PeriodicElement get(int index)
	{
		PeriodicElement pe=elements.get(index);
		return pe;
	}
	
	//list���� �ش� index�� ���� pe�� ��ȯ�ϴ� �޼ҵ�
	public PeriodicElement getPrev(int index)
	{
		PeriodicElement pe=elements.get(index-1);
		return pe;
	}
	
	//list���� �ش� index�� ���� pe�� ��ȯ�ϴ� �޼ҵ�
	public PeriodicElement getNext(int index)
	{
		PeriodicElement pe=elements.get(index+1);
		return pe;
	}
	
	//list���� �����ϰ� �ϳ� �����ؼ� ��ȯ�ϴ� �޼ҵ�
	public PeriodicElement getRandomElement()
	{
		Random rd=new Random();
		int len=elements.size(); 
		int i=rd.nextInt(len);  //0~len���� ������ �����ϰ� �̾� i�� ����
		return elements.get(i);  //elements�� i��° ���� ��ȯ
		
	}
	
	//list���� �ش� pe�� index�� ��ȯ�ϴ� �޼ҵ�
	public int indexOf(PeriodicElement pe)
	{
		int index = 0;
		for(int i=0;i<elements.size();i++)
		{
			if((elements.get(i)==pe)) //elements�� i��° ���Ұ� pe�� ���ٸ�
			{
				index=i; //index�� i���� ����
				break;
			}
		}
		return index;
	}
	
	//list�� ũ�⸦ ��ȯ�ϴ� �޼ҵ�
	public int size()
	{
		return elements.size();
	}
	
	//list���� �ش� e�� pe�� ��ȯ�ϴ� �޼ҵ�
	public PeriodicElement find(Element e)
	{
		PeriodicElement pe = null;
		for(int i=0;i<elements.size();i++)
		{
			if((elements.get(i).getNumber())==(e.getValue()))  //e�� ���ҹ�ȣ�� elements�� i��° ������ ���ҹ�ȣ�� ���ٸ�
				pe=elements.get(i); //pe�� elements�� i��° ���Ҹ� ����
		}
		return pe;
	}

	//list���� �ش� symbol�� pe�� ��ȯ�ϴ� �޼ҵ�
	public PeriodicElement find(String symbol)
	{
		Element e=Element.symbolOf(symbol); //Element�� symbolOf�޼ҵ带 �̿��Ͽ� �Է��� symbol�� Element enum�� ����� �� ȣ��
		
		for(PeriodicElement pe:this.elements)
		{
			if(e!=null&&pe!=null&&pe.getNumber()==e.getValue()) //e,pe�� null�� �ƴϰ� pe�� ���ҹ�ȣ�� e�� ���ҹ�ȣ�� ���ٸ�
				return pe;  //pe ��ȯ
		}
		return null;
		
	}
	
	//list���� �ش� finder�� pe list�� ��ȯ�ϴ� �޼ҵ�
	public List<PeriodicElement> find(IPeriodicElementFinder ifinder)
	{

		List<PeriodicElement> pe = new ArrayList<>(); //PeriodicElement�� list pe����
		int j=0;
		for(PeriodicElement pe1:this.elements)  //elements�� ��� ���ҵ��� ���ʴ�� pe1�� ����
		{
			if((pe1!=null)&&(ifinder.isInstanceOf(pe1)==true)) //pe�� null�� �ƴϰ� ifinder�� isInstance�� pe1�� ���� ���� true���
					pe.add(pe1); //pe�� pe1�� add�Ѵ�.
		}
		return pe;
	}
	
	//list ����
	public void sort()
	{
		Collections.sort(elements);
	}
	
	public void print()
	{
		for(int i=0;i<elements.size();i++)
		{
			if(elements.get(i)!=null)
				System.out.println(elements.get(i));
		}
	}
	
	
	
}
