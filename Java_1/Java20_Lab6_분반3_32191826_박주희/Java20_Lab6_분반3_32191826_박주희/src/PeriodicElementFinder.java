//Lab6 5/21 박주희

//추상클래스 PeriodicElementFinder
abstract class PeriodicElementFinder {
	public abstract boolean isInstanceOf(PeriodicElement pe); //추상메소드
	
	//state에 따른 PeriodicElement[]를 반환하는 메소드
	public PeriodicElement[] find(PeriodicElement[] elements)
	{
		int count=0;
		for(int i=0;i<elements.length;i++) 
		{
			//elements의 i번째 원소가 null이 아니고 
			//isInstanceOf메소드에 elements[i]를 입력하여 true라면
			if((elements[i]!=null)&&(isInstanceOf(elements[i])==true))
					count++;  //원소의 개수를 세는 count를 1 증가
		}

		PeriodicElement[] pe = new PeriodicElement[count]; //count 크기인 PeriodicElement배열 형의 pe 생성
		int j=0;
		for(int i=0;i<elements.length;i++)
		{
			//elements의 i번째 원소가 null이 아니고 
			//isInstanceOf메소드에 elements[i]를 입력하여 true라면
			if((elements[i]!=null)&&(isInstanceOf(elements[i])==true))
					pe[j++]=elements[i]; //pe의 j번째 원소에 elements의 i번째 원소 저장, j를 1 증가
		}
		return pe;  //pe 반환
		
		
	}

	
	
}
