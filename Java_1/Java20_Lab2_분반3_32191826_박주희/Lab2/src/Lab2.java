
public class Lab2 {
	
	private static final int NUM=20;  //변수 NUM을 원소의 개수인 20개로 초기화
	public static void print(int number, String symbol, String name, double weight)    //print 메소드 생성
	{
		System.out.println("PeriodicElement[number="+number+",symbol="+symbol+
			",name="+name+",weight="+weight+"]"); //출력형태
	}
	private static void print(int element) {  //element를 입력받아 위 print를 호출
		print(element,PTable.getSymbol(element),PTable.getName(element),PTable.getWeight(element));
	}  //element(원소 번호)를 입력받아 그 원소의 number,symbol,name,weight를 위 print의 입력값으로 들어갈 수 있도록 함

	//self code
	private static void print2(String elementN) {
		int element=PTable.getNumber(elementN);
		print(element,PTable.getSymbol(element),elementN,PTable.getWeight(element));
	}
	
	public static void main(String[] args) {
	
		//for & PTable methods
		for (int i=1;i<=NUM;i++) {   //변수 i가 1에서 NUM까지 반복
			System.out.println(PTable.getSymbol(i));  //PTable Class의 getSymbol method에 i를 입력했을 때 리턴값 출력
			System.out.println(PTable.getName(i));   //PTable Class의 getName method에 i를 입력했을 때 리턴값 출력
			System.out.println(PTable.getWeight(i));  //PTable Class의 getWeight method에 i를 입력했을 때 리턴값 출력
		}
		System.out.println();  //한줄 띄기
		
		//for & PTable methods
		for(int i=1;i<=NUM;i++) {   //변수 i가 1에서 NUM까지 반복
			print(i,PTable.getSymbol(i),PTable.getName(i),PTable.getWeight(i));  //print메소드를 이용하여 출력
		}
		System.out.println();  //한줄 띄기
		
		//array(0~length-1)
		String[] elementSymbols=new String[NUM];  //String형 원소가 20개인 elementSymbols 배열 선언 및 생성 
		String[] elementNames=new String[NUM];   //String형 원소가 20개인 elementNames 배열 선언 및 생성
		double[] elementsWeight=new double[NUM];  //double형 원소가 20개인 elementsWeight 배열 선언 및 생성
		for (int i=0;i<NUM;i++) {   //변수 i가 1에서 NUM까지 반복
			elementSymbols[i]=PTable.getSymbol(i+1);   //elementSymbols의 i번째 원소는 PTable의 getSymbol에 (i+1)를 입력했을 때 리턴값
			elementNames[i]=PTable.getName(i+1);  //elementSymbols의 i번째 원소는 PTable의 getName에 (i+1)를 입력했을 때 리턴값
			elementsWeight[i]=PTable.getWeight(i+1); //elementSymbols의 i번째 원소는 PTable의 getWeight에 (i+1)를 입력했을 때 리턴값
		}
		
		//for-each
		for(String symbol:elementSymbols) {  //elementSymbols.length번 반복.symbol은 elementSymbols[0],...,elementSymbols[20]로 번갈아 반복
			System.out.println(symbol);  //symbol 출력
		}
		for(String name:elementNames) {  //elementNames.length번 반복.name은 elementNames[0],...,elementNames[20]로 번갈아 반복
			System.out.println(name);  //name 출력
		}
		for(double weight:elementsWeight) { //elementsWeight.length번 반복.weight은 elementsWeight[0],...,elementsWeight[20]로 번갈아 반복
			System.out.println(weight);  //weight 출력 
		}
		System.out.println();  //한줄 띄기
		
		//while 
		int k=1;  //변수 k 생성 및 0으로 초기화
		while(k<=20) { //k가 20보다 작을 동안
			print(k);  //k를 입력하여 원하는 출력 형태로 출력하게 하는 print메소드를 이용하여 출력
			k++;  //k는 1씩 증가		
		}
		System.out.println();  //한줄 띄기
		
		//do while
		int a=1;   //변수 a 생성 및 0으로 초기화
		do {   //while뒤 조건문 동안 실행
			print(a);  //a를 입력하여 원하는 출력 형태로 출력하게 하는 print메소드를 이용하여 출력
			a++;	//a는 1씩 증가	
		}while (a<=20);  //a가 20보다 작을 때
		System.out.println();  //한줄 띄기
		
		//UserInput
		System.out.println("UserInput");  //UserInput 출력
		do {   //while뒤 조건문이 true일 동안 실행
			System.out.println("Please enter element #:");  //Please enter element # 출력
			int element=UserInput.getInteger();  //입력 받은 값을 integer형으로 변환하여 읽기
			print(element); //element를 입력하여 원하는 출력 형태로 출력하게 하는 print메소드를 이용하여 출력
			
			//self code
			System.out.println("Please enter element name in Korean:");
			String elementN=UserInput.getString();
			print2(elementN);
			} while(!UserInput.getExitKey());  //UserInput의 getExitKey가 false일 때
		System.out.println("done");	//done 출력
		System.out.println();  //한줄 띄기
	}

}
