//Lab6 5/21 박주희

import java.util.Arrays;

public class PeriodicTable {
	private PeriodicElement[] elements = null;

	// constructor
	public PeriodicTable() {
		this(null);
	}
	
	// constructor
	public PeriodicTable(PeriodicElement[] elements) {
		this.elements = elements;
	}

	// getter & setter
	public PeriodicElement[] getElements() {
		return elements;
	}

	public void setElements(PeriodicElement[] elements) {
		this.elements = elements;
	}

	//PeriodicElementFinder 추상클래스의 find를 이용하여 상태에 해당하는 배열 반환
	public PeriodicElement[] find(PeriodicElementFinder finder)
	{
		PeriodicElement[] pe=finder.find(elements);
		return pe;
	}
	
	//IPeriodicElementFinder 인터페이스의 find를 이용하여 상태에 해당하는 배열 반환
	public PeriodicElement[] find(IPeriodicElementFinder ifinder)
	{
		int count=0;
		for(PeriodicElement i:elements) //i가 elements[0],elements[1],...로 전환
		{
			//i가 null이 아니고 
			//IPeriodicElementFinder클래스의 isInstanceOf메소드에 i를 입력하여 true라면
			if((i!=null)&&(ifinder.isInstanceOf(i)==true))  
				count++;  //count를 1 증가
		}

		PeriodicElement[] pe = new PeriodicElement[count]; //count 크기인 PeriodicElement배열 형의 pe 생성
		int j=0;
		for(int i=0;i<elements.length;i++)
		{
			//elements의 i번째 원소가 null이 아니고 
			//IPeriodicElementFinder클래스의 isInstanceOf메소드에 elements[i]를 입력하여 true라면
			if((elements[i]!=null)&&(ifinder.isInstanceOf(elements[i])==true))
					pe[j++]=elements[i]; //pe의 j번째 원소에 elements의 i번째 원소 저장, j를 1 증가
		}
		return pe;
	}
	
	public String toString() {
		return "PeriodicTable [elements=" + Arrays.toString(elements) + "]";
	}

	public void print() {
		for (PeriodicElement pe : elements) {
			System.out.println(pe);
		}
	}
}
