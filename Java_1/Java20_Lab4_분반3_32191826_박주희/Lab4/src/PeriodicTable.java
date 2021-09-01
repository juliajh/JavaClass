import java.util.Scanner;
public class PeriodicTable {
	private static Scanner input=new Scanner(System.in);
	
	PeriodicElement[] elements;
	
	//생성자
	public PeriodicTable(PeriodicElement[] elements)
	{
		this.elements=elements;
	}
	
	//getter
	public PeriodicElement[] getElements() {
		return elements;
	}
	
	//setter
	public void setElements(PeriodicElement[] elements) {
		this.elements=elements;
	}
	
	public String toString(Element e) {
		return e.toString();
	}
	
	//index를 받아 elements의 index번째 원소를 리턴
	public PeriodicElement get(int index)
	{
		if(index>=0&&index<this.elements.length)
			return this.elements[index];
		return null;
	}
	
	//index를 받아 elements의 index-1번째 원소를 리턴
	public PeriodicElement getPrevious(int index)
	{
		if(index>=-1&&index<this.elements.length-1)
			return this.elements[index-1];
		return null;
	}
	
	//index를 받아 elements의 index+1번째 원소를 리턴
	public PeriodicElement getNext(int index)
	{
		if(index>=1&&index<this.elements.length+1)
			return this.elements[index+1];
		return null;
	}
	
	//Element의 원소번호와 같은 PeriodicElement를 찾아 반환하는 메소드
	private PeriodicElement getPeriodicElement(PeriodicElement[] array,Element e) 
	{
		PeriodicElement element=null;
		for(int i=0;i<50;i++)   //for문을 이용하여
		{
			if(e.getValue()==array[i].getNumber()) //입력받은 Element e의 원소번호값이 array[i]의 원소번호와 같다면
				element=array[i]; //element에 array[i]를 대입
		}
		return element; //element 반환
	}
	
	//Element -> PeriodicElement
	public PeriodicElement find(Element e)
	{  
		for(PeriodicElement pe:this.elements)  //for-each
		{
			if(e!=null&&pe!=null&&pe.getNumber()==e.getValue()) //e와 pe가 null이 아니고 e의 value값 pe의 number(원소번호)가 같다면 
				return pe;
		}
		return null;		
	}
	
	//number -> PeriodicElement
	public PeriodicElement find(int number)
	{
		Element e=Element.valueOf(number); //Element의 valueOf메소드
		
		for(PeriodicElement pe:this.elements)
		{
			if(e!=null&&pe!=null&&pe.getNumber()==e.getValue())
				return pe;
		}
		return null;
	}
	
	//symbol -> PeriodicElement
	public PeriodicElement find(String symbol)
	{
		Element e=Element.symbolOf(symbol); //Element의 symbolOf메소드를 이용하여 입력한 symbol로 Element enum에 저장된 값 호출
		
		for(PeriodicElement pe:this.elements)
		{
			if(e!=null&&pe!=null&&pe.getNumber()==e.getValue())
				return pe;
		}
		return null;
	}
	
		
	//state -> PeriodicElement
	public PeriodicElement[] find(State state)
	{
		PeriodicElement[] element1= new PeriodicElement[50]; //PeriodicElement[] 객체 생성
		//일단 배열의 크기를 50으로 잡은 뒤 Lab4에서 for문으로  null인 원소 빼고 출력
		PeriodicElement[] pe = Lab4.get_elements(); //배열에 대한 레퍼런스 선언, Lab4의 get_elements메소드를 이용하여 elements 반환
		int j=0;
		for(int i=0;i<50;i++) //for문을 이용하여
		{
			if(pe[i].getstate()==state) //pe[i]의 state와 입력받은 state가 같다면
				element1[j++]=pe[i]; //element1 배열에 차례로 저장
		}
		return element1; //element1 반환
	}
	
	public void print() 
	{
		PeriodicElement[] pe = Lab4.get_elements(); //배열에 대한 레퍼런스 선언, Lab4의 get_elements메소드를 이용하여 elements 반환
	
		int i=0;
		while(i<50)  //while문을 이용하여
		{
			pe[i].print(pe[i]); //print
			i++;
		}
	}


}