//3분반 32191826 박주희

public class Main {

	static void square1(int a) //integer형을 입력 받는 square1 메소드
	{
		a*=a; //a제곱 값을 a에 저장
		System.out.println("inside square1 a="+a);
	}
	static void square2(int[] arr)  //integer형 배열을 입력 받는 square2 메소드
	{
		for(int a:arr) //반복될 때마다 a는 arr[0],arr[1],...값으로 설정된다.
		{
			a*=a; //a의 제곱 값을 a에 저장
			System.out.println("inside square2 a="+a);
		}
	}
	static void square3(int[] arr)   //integer형 배열을 입력 받는 square3 메소드
	{
		for(int i=0;i<arr.length;i++) //i는 0에서 arr의 크기까지 1씩 증가한다.
		{
			arr[i]*=arr[i]; //arr의 i번째 원소의 제곱 값을 i번째 원소에 저장
			System.out.println("inside square3 a="+arr[i]);
		}
	}
	
	static void print(int[]arr) //integer형 배열을 입력 받는 print 메소드
	{
		System.out.println(java.util.Arrays.toString(arr));  //arr의 원소들을 문자열로 변환하여 출력한다.
	}
	static void print(int[][]arr) //integer형 2차원 배열을 입력 받는 print 메소드
	{
		System.out.println(java.util.Arrays.deepToString(arr)); //arr의 원소들을 문자열로 변환하여 출력한다.
	}
	//toString은 일차원 배열을 출력할때 사용, deepToSting은 다차원 배열을 출력할 때 사용
	static void print(String []arr) //string형 배열을 입력 받는 print 메소드
	{
		System.out.println(java.util.Arrays.toString(arr)); //arr의 원소들을 문자열로 변환하여 출력한다.
	}
	
	//(1.3)
	static int sum(int[] arr)  //arr의 오든 요소를 더해준 값을 반환하는 메소드
	{
		int result=0;
		for(int i=0;i<arr.length;i++) //i가 0에서 arr배열의 크기만큼 1씩 증가할 동안
			result+=arr[i];  //result에 arr[i]의 값을 더한다.
		return result;
	}
	static String join(String[] arr)  //arr의 모든 요소를 연결한 값을 반환하는 메소드
	{
		String result="";  //String형 변수 result을 ""으로 초기화
		for(int i=0;i<arr.length;i++) //i가 0에서 arr배열의 크기만큼 1씩 증가할 동안
			result+=arr[i]; //result에 arr[i]의 값을 더한다.
		return result;
	}
	public static void main(String[] args) {
		//(1.1)
		for(int i=1;i<=243;i*=3)
			System.out.println(i);
		
		//(1.2)
		int k=0;
		do {  //k가 10보다 작을동안 반복
			k++;
			if(k==5) break;
			//continue문: 반복문을 빠져 나가지 않으면서 반복문 실행 도중 다음 반복을 진행한다.
			//break대신 continue문을 이용하게 되면 k=5가 될때 바로 다음 반복이 진행되어 k++되고 System.out.println(5)가 실행되지 않는다.
			System.out.println(k);
		}while(k<10); 
		System.out.println();
		/*실행결과: 
		 * break -> 1 2 3 4
		 * continue -> 1 2 3 4 6 7 8 9 10
		*/
		
		//(1.3)
		int[] arr1= {1,2,3};  //integer형 배열 arr1 생성 및 초기화
		String[] arr2= {"a","b","c","d"};  //string형 배열 arr2 생성 및 초기화
		int sum=sum(arr1); //arr1을 sum메소드에 넘겨주어 반환값을 변수 sum에 저장
		System.out.println("sum="+sum);
		String join=join(arr2);  //arr2를 join메소드에 넘겨주어 반환값을 변수 join에 저장
		System.out.println("join="+join);
		
		//(1.4)
		print(arr1);  //실행결과:[1,2,3]
		print(arr2);  //실행결과:[a,b,c,d]
		int[][] arr3= {{4,-3,5},{-4,3,7},{7,-2,4}};  
		print(arr3);  //실행결과:[[4,-3,5],[-4,3,7],[7,-2,4]]
		//한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메소드가 있더라도 매개 변수의 개수 또는 타입이 다르면, 같은 이름을 사용하여 메소드를 정의할 수 있는데 이를 메소드 오버로딩이라고 한다.
		//메소드 오버로딩을 이용하면 매개 값을 다양하게 바당 처리할 수 있도록 할 수 있다. 
		
		//(1.5)
		int x=-1;
		square1(x); //x를 square1에 넘겨준다
		System.out.println("after square1 x="+x);  
		int[] y= {1,2,3}; //integer형 배열 y 생성 및 초기화
		square2(y); //y를 square2 메소드에 넘겨준다
		System.out.print("after square2 y=");
		print(y); //y를 print메소드에 넘겨준다
		int[] z= {-1,-2,-3,-4};  //integer형 배열 z 생성 및 초기화
		square3(z); //z를 square3 메소드에 넘겨준다
		System.out.print("after square3 z=");
		print(z);  //z를 print메소드에 넘겨준다
		/*실행결과:
		 * inside square1 a=1  //(-1)*(-1)=1
		 * after square1 x=-1  //x의 값은 변하지 않는다.
         * 인수로 x를 전달하여 square1 메소드를 호출한다. 
		 * square1 메소드 안에서 매개변수 a와 인수 x는 다르다.
		 * a는 x의 값을 복사하여 사용하고 메소드가 끝난 후 파괴된다.
		 * inside square2 a=1  //1*1=1
		 * inside square2 a=4  //2*2=4
		 * inside square2 a=9  //3*3=9
		 * after square2 y=[1, 2, 3]  //y배열의 값은 변하지 않는다.
         * 인수로 y[]을 전달하여 square2 메소드를 호출한다. 
		 * square2 메소드 안에서 로컬변수a와 인수 x는 다르다.
		 * a는 y[]의 값을 복사하여 사용하고 메소드가 끝난 후 파괴된다.
		 * inside square3 a=1   //(-1)*(-1)=1
		 * inside square3 a=4   //(-2)*(-2)=4
		 * inside square3 a=9   //(-3)*(-3)=9
		 * inside square3 a=16  //(-4)*(-4)=16
		 * after square3 z=[1, 4, 9, 16]  
         * 인수로 z[]을 전달하여 square3 메소드를 호출한다. 
         * z배열의 원소값들을 덮어썼기 때문에 z배열이 바꼈다.
		*/
		
		//(1.6)
		int[] intArray=new int[5]; //크기가 5인 integer형 배열 intArray생성
		intArray[0]=3; 
		intArray[4]=-18;
		intArray[2]=5;
		intArray[1]=intArray[2];  //2번째 인덱스의 원소값(5)을 1번째 인덱스에 저장
		int w=intArray[0];  //0번째 인덱스의 원소값(3)을 변수 w에 저장
		intArray[2]=6; 
		intArray[w]=intArray[1]*intArray[4]; //w번째 인덱스에 1번째 인덱스의 원소값(5)과 4번째 인덱스의 원소값(-18)을 곱한 값을 저장
		print(intArray);
		//3, 5, 6, -90, -18
		
		//(1.7)
		String[] strArray= {"a","b","c","d","e"};  //크기가 5인 strArray배열 생성
		//strArray[5]="f"; 
		//ArrayIndexOutOfBoundsException이 발생한다.
		//strArray는 크기가 5인 배열이므로 인덱스 0부터 4까지만 존재한다.
	}
}
