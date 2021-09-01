//Lab 5-2, 5/7, 박주희

import java.util.Scanner;

public class Lab5 {

	static Scanner input= new Scanner(System.in);  //scanner 객체 생성
		
	public static void main(String[] args) {

		PeriodicElement[] element2= new PeriodicElement[5];  //레퍼런스 변수 element2 선언 및 PeriodicElement[] 배열 생성
		
		System.out.println("원소 정보 5개를 입력하시오(원소번호, 원소기호, 원소이름, 원소량, 상태):");
		for(int i=0;i<5;i++) //for문을 이용하여 PeriodicELement를 받아서 element2에 넣어줌
		{
			element2[i]=UserInput.getPeriodicElement();  //UserInput.getPeriodicElement를 통해 입력받은 원소의 state에 따라 리턴 받은 객체를 element[i]에 저장
		}
		
		for(PeriodicElement i:element2) 
		{
			System.out.println(i); //for-each문을 이용하여 element2의 모든 원소 출력
		}
		PeriodicTable ptable2=new PeriodicTable(element2);  //입력받은 element2를 이용하여  PeriodicTable 생성
		
		//set test
		System.out.println("원소 정보를 변경할 index를 입력하시오(0이상 4이하): ");
		int index=input.nextInt();  //사용자가 입력한 값을 integer형으로 바꾼 후 index에 저장
		System.out.println("변경할 원소 정보를 입력하시오: ");
		PeriodicElement pe=UserInput.getPeriodicElement();  //사용자가 입력한 값을 UserInput.getPeriodicElement()로 받은 후 pe에 저장
		ptable2.set(index, pe); //set메소드로 index에 pe원소 정보를 저장
		for(int i=0;i<5;i++) //for문을 이용하여 element2 출력
		{
			System.out.println(element2[i]);
		}
		System.out.println("원소 정보가 변경되었습니다.");
		
		//find test
		System.out.print("Please enter [name] of PeriodicElement: ");
		String str=input.next();  //입력받은 값을 str에 저장
		Element e=Element.nameOf(str);
		PeriodicElement element = ptable2.find(e);
		if(element != null) element.print();

	
		System.out.println("Please enter [symbol] of PeriodicElement:");
		String symbol=input.next(); //사용자가 입력한 값을 symbol에 저장
		System.out.println(ptable2.find(symbol));  //find by Symbol. 입력값 symbol에 해당하는 원소 정보 출력
		
		System.out.println("Please enter [number] of PeriodicElement:");
		int number=input.nextInt();   //사용자가 입력한 값을 integer형으로 바꾼 후 number에 저장
		System.out.println(ptable2.find(number)); //find by Number. 입력값 number에 해당하는 원소 정보 출력
		
		System.out.println("Please enter [state] of PeriodicElement:"); 
		String str1=input.next();    //사용자가 입력한 값을 str1에 저장
		State str2=State.valueOf(str1); //입력한 str1을 Enum형으로 변환하여 str2에 저장
		PeriodicElement[] foundElements = ptable2.find(str2); //find by State. str2에 해당하는 원소들의 정보를 foundElements배열에 저장
		for (PeriodicElement pe1 : foundElements) {
			pe1.print();		//for-each문을 이용하여 foundElements의 모든 원소 정보 출력	
		}
		
		//get test
		System.out.println("Please enter an index: ");
		int index1=input.nextInt();
		System.out.println(ptable2.get(index1));
		System.out.println(ptable2.getNext(index1));
		System.out.println(ptable2.getPrevious(index1));
		
		//my code
		//두개의 index를 입력하면 그 사이의 모든 원소 정보 출력
		System.out.println("index 두개를 작은것, 큰것 순으로 입력하세요: ");
		int index2=input.nextInt();  
		int index3=input.nextInt();
		int j=index2;
		if((index2<4)&&(index3>0)&&(index2>=0)&&(index3<=4))
		{
			PeriodicElement[] pe3=new PeriodicElement[index3-index2+1]; //레퍼런스 변수 pe3 선언 및 PeriodicElement[] 배열 생성
			for(int i=0;i<=index3-index2;i++) //for문을 이용하여 두 index사이의 원소들의 정보를 pe3에 저장
			{
				pe3[i]=element2[j++];
			}
			for(PeriodicElement i:pe3) //for-each문을 이용하여 pe3의 모든 PeriodicElement 출력
				System.out.println(i);
			
		}
	}
}


