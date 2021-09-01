//3분반 32191826 박주희

public class number1 {
	//(1.5)
	public static void upper(int x,int y)
	{
		x++;
		y++;
	}
	//(1.3)
	static void Arrayprint1(String[] arr) //String배열을 매개변수로 갖는 Arrayprint1메소드
	{
		for(int i=0;i<arr.length;i++)
			System.out.println("배열의 "+i+"번째 요소="+arr[i]);
	}
    static void Arrayprint2(int[] arr)  //integer형 배열을 매개변수로 갖는 Arrayprint2메소드
	{
		for(int i=0;i<arr.length;i++)
			if(arr[i]<=10)  //원소값이 10보다 작을때에만 출력한다.
				System.out.println(arr[i]);
	}
    
    //(1.4)
    //메소드 오버로딩
	//매개변수가 다르지만 모두 더하는 기능을 수행한다.
    static int plus(int x, int y){
        return x+y;
    }
    static int plus(int x, int y, int z){
        return x + y + z;
    }
    static String plus(String x, String y){
        return x + y;
    }
	public static void main(String[] args){
		//(1.1)
		int i=1;
		int fact=1;
		while(i<=5) //i가 5보다 작을때까지
		{
			fact*=i; //fact에 i의 값을 곱한다
			i++;  //i의 값을 1씩 증가

		}
		System.out.println("5!="+fact);
		System.out.println();
		
		//(1.2)
		for(int j=0;j<10;j++)  //for문을 이용하여 j값을 0에서 9까지 1씩 증가시킨다.
		{
			if(j%2==0)  //j를 2로 나누어 0이 되면
				continue; //반복문 실행 도중 다음 반복을 진행하여 출력식까지 가지않아 짝수는 출력하지 않는다.
			System.out.println(j);
		}
		System.out.println();
		
		//(1.3)
		String[] arr1= {"My","name","is","Juhee"};
		Arrayprint1(arr1);
		int[] arr2= {10,8,30,6,40,88};
		Arrayprint2(arr2);
		System.out.println(); 
		
		//(1.4)
		System.out.println(plus(2,3));
		System.out.println(plus(1,4,5));
		System.out.println(plus("Happy","day"));
		System.out.println();
		
		//(1.5)
		int a=1;
		int b=2;
		System.out.println(a);
		System.out.println(b);
		upper(1,2);
		System.out.println(a); 
		System.out.println(b);
		//upper메소드 안에서 a,b값을 복사하여 사용하고 메소드 사용이 끝난 후 파괴되므로 a,b의 값은 변하지 않는다.
		System.out.println();
		
		//(1.7)
		String[] strArray= {"H","a","l","l","o"};
		strArray[1]="e"; //인데스1은 0과 4 사이이므로 사용가능하다.
		for(int j=0;j<strArray.length;j++)
			System.out.print(strArray[j]);
		
	}

}
