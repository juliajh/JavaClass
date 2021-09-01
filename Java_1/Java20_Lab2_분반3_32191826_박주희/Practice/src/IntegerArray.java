import java.util.Scanner;

public class IntegerArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		int[] integerArray = new int[3];
		integerArray[0] = 1;
		integerArray[1] = 2;
		integerArray[2] = 3;

		for (int i : integerArray) //integerArray의 모든 원소 값 출력
		    System.out.println(i); 

		for (int j = 0; j < integerArray.length; j++)  //integerArray의 모든 원소 값 출력
		    System.out.println(integerArray[ j ]);

		int k = 0;
		while (k < integerArray.length)  //integerArray의 모든 원소 값 출력
		    System.out.println(integerArray[k++]);
		// int array
		// 만약 int value1를 for문에서 공유해 사용한다해도 
		// intArray1[i]에 값이 들어가므로 각각 다른 입력값이 들어가게 됨
		int value1 = 0;
		int[] intArray1 = new int[3];
		for (int i = 0; i < intArray1.length; i++) {  //i는 0에서 (intArray1의 length값-1)까지 반복
			System.out.print("Please enter int number: ");
			value1 = scan.nextInt(); //다음 토큰 값을 integer형태로 리턴
			intArray1[i] = value1;  //value1값을 intArray1의 i번째 원소로 저장
		}
		for (int v : intArray1)	System.out.println(v); //intArray1의 모든 원소 출력

		// int value2를 for문에서 내부에서 매번 생성해서 사용한다해도 
		// intArray2[i]에 값이 들어가므로 각각 다른 입력값이 들어가게 됨
		int[] intArray2 = new int[3];
		for (int i = 0; i < intArray1.length; i++) {
			System.out.print("Please enter int number: ");
			int value2 = scan.nextInt(); 
			intArray2[i] = value2;
		}
		for (int v : intArray2)	System.out.println(v); 

	}

}
