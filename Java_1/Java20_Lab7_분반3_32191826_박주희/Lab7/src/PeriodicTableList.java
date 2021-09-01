//Lab7 3분반 6/02 32191826 박주희

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
	
	//list에 새로 추가하는 메소드
	public void add(PeriodicElement pe)
	{
		elements.add(pe);
	}
	
	//list에서 해당 pe를 삭제하는 메소드
	public void remove(PeriodicElement pe)
	{
		elements.remove(pe);
	}
	
	//list에서 해당 index를 pe로 교체하는 메소드
	public void set(int index,PeriodicElement pe)
	{
		elements.add(index,pe);
	}
	
	//list에서 해당 index의 pe를 반환하는 메소드
	public PeriodicElement get(int index)
	{
		PeriodicElement pe=elements.get(index);
		return pe;
	}
	
	//list에서 해당 index의 이전 pe를 반환하는 메소드
	public PeriodicElement getPrev(int index)
	{
		PeriodicElement pe=elements.get(index-1);
		return pe;
	}
	
	//list에서 해당 index의 다음 pe를 반환하는 메소드
	public PeriodicElement getNext(int index)
	{
		PeriodicElement pe=elements.get(index+1);
		return pe;
	}
	
	//list에서 랜덤하게 하나 선택해서 반환하는 메소드
	public PeriodicElement getRandomElement()
	{
		Random rd=new Random();
		int len=elements.size(); 
		int i=rd.nextInt(len);  //0~len까지 정수를 랜덤하게 뽑아 i에 저장
		return elements.get(i);  //elements의 i번째 원소 반환
		
	}
	
	//list에서 해당 pe의 index를 반환하는 메소드
	public int indexOf(PeriodicElement pe)
	{
		int index = 0;
		for(int i=0;i<elements.size();i++)
		{
			if((elements.get(i)==pe)) //elements의 i번째 원소가 pe와 같다면
			{
				index=i; //index에 i값을 저장
				break;
			}
		}
		return index;
	}
	
	//list의 크기를 반환하는 메소드
	public int size()
	{
		return elements.size();
	}
	
	//list에서 해당 e의 pe를 반환하는 메소드
	public PeriodicElement find(Element e)
	{
		PeriodicElement pe = null;
		for(int i=0;i<elements.size();i++)
		{
			if((elements.get(i).getNumber())==(e.getValue()))  //e의 원소번호와 elements의 i번째 원소의 원소번호가 같다면
				pe=elements.get(i); //pe에 elements의 i번째 원소를 저장
		}
		return pe;
	}

	//list에서 해당 symbol의 pe를 반환하는 메소드
	public PeriodicElement find(String symbol)
	{
		Element e=Element.symbolOf(symbol); //Element의 symbolOf메소드를 이용하여 입력한 symbol로 Element enum에 저장된 값 호출
		
		for(PeriodicElement pe:this.elements)
		{
			if(e!=null&&pe!=null&&pe.getNumber()==e.getValue()) //e,pe가 null이 아니고 pe의 원소번호가 e의 원소번호가 같다면
				return pe;  //pe 반환
		}
		return null;
		
	}
	
	//list에서 해당 finder의 pe list를 반환하는 메소드
	public List<PeriodicElement> find(IPeriodicElementFinder ifinder)
	{

		List<PeriodicElement> pe = new ArrayList<>(); //PeriodicElement형 list pe생성
		int j=0;
		for(PeriodicElement pe1:this.elements)  //elements의 모든 원소들을 차례대로 pe1에 저장
		{
			if((pe1!=null)&&(ifinder.isInstanceOf(pe1)==true)) //pe가 null이 아니고 ifinder의 isInstance에 pe1을 넣은 값이 true라면
					pe.add(pe1); //pe에 pe1을 add한다.
		}
		return pe;
	}
	
	//list 정렬
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
