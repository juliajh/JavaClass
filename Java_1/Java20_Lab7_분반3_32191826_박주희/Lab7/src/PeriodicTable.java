//Lab7 3분반 6/02 32191826 박주희

import java.util.Arrays;
import java.util.Random;

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
	
	//배열의 min부터 max까지의 인덱스의 PeriodicElement를 새로운 배열에 저장하여 반환하는 메소드
	public PeriodicElement[] getElements(int min,int max){
		PeriodicElement[] pe = new PeriodicElement[max-min+1]; //max-min+1 크기의 PeriodicElement형 pe배열 생성
		int j=0;
		for(int i=min;i<=max;i++)
			pe[j++]=elements[i]; //elements의 i번째 원소를 pe배열에 차례로 저장
		return pe; 
	}

	//size만큼 랜덤 선택하여 pe에 저장하여 반환하는 메소드
	public PeriodicElement[] getRandomElements(int size) {
		PeriodicElement[] pe=new PeriodicElement[size];  //입력받은 size 크기의 PeriodicElement형 pe배열 생성
		int j=0;
		Random rd=new Random();
		for(int i=0;i<pe.length;i++)
		{
			j=rd.nextInt(50);  //0~49까지 정수 중 랜덤하게 정수를 받아 j에 저장
			pe[i]=elements[j];  //elements의 j번째 원소를 pe의 i번째 에 저장
		}//pe의 length만큼 반복
		return pe;
	}
	
	//배열에서 랜덤하게 하나 선택하여 반환하는 메소드
	public PeriodicElement getRandomElement() {
		Random rd=new Random();
		int i;
		i=rd.nextInt(elements.length);   //0~elements.legnth-1까지 정수 중 랜덤하게 정수를 받아 i에 저장
		return elements[i];  //i번째 elements 원소를 반환
	}
	
	//배열을 랜덤하게 섞는 메소드
	public void shuffle() {
		Random rd=new Random();
		int j,k;
		PeriodicElement temp;
		for(int i=0;i<elements.length;i++)
		{
			j=rd.nextInt(50);  //0~49까지의 난수 생성
			k=rd.nextInt(50);  //0~49까지의 난수 생성
			temp=elements[j];  
			elements[j]=elements[k];
			elements[k]=temp;
		}
	
	}
	
	//배열을 정렬하는 메소드
	public void sort() {
		Arrays.sort(elements);  
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
