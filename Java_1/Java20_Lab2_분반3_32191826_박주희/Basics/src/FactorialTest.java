import java.util.*;

public class FactorialTest {

	public static long factorial(int number) {  //factorial 메소드 생성
		long result = 1;  
		for (int i = 1; i <= number; i++)   //변수 i가 1에서 number까지 반복
			result = result * i;  //result값을 result*i값으로 갱신
		return result;  //return값 return
	}

	public static long recursive(int number) {  //recursive 메소드 생성(factorial 메소드와 결론적으로는 같음)
		if (number <= 1)  //number값이 1보다 작거나 같은경우
			return 1;  //return 1
		else  //아닐 경우
			return number * recursive(number - 1); //recursive 메소드를 반복적으로 호출하여 결과값 계산
	}

	public static void printFactorial(int number) { //printFactorial 메소드 생성
		System.out.printf("%d! = ", number);
		for (int i = number; i >= 1; i--) { //i가 number에서 1까지 1씩 작아지며 반복
			if (i == 1)  //i가 1일 경우  i= 형태로 출력
				System.out.printf("%d = ", i);
			else  //i가 1이 아닐 경우 i* 형태로 출력
				System.out.printf("%d * ", i);
		}
	}

	public static void main(String[] args) {
		System.out.printf("Factorial! Please enter integer value: ");

		Scanner scan = new Scanner(System.in);  //scanner 객체 생성
		int n = scan.nextInt();  //다음 토큰을 integer형으로 리턴

		long result1 = factorial(n);  //메소드 factorial에 n을 입력했을 때 return값(결과값)을 result1에 저장
		printFactorial(n);  //메소드 printFactorial를 이용하여 출력
		System.out.printf("%d\n", result1);  //결과값을 출력

		long result2 = recursive(n); //메소드 recursive에 n을 입력했을 때 return값(결과값)을 result2에 저장
		System.out.printf("%d! = %d\n", n, result2);  //결과값을 출력
	}
}