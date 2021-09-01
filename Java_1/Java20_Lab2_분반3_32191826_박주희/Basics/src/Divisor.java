import java.util.Scanner;

public class Divisor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //scanner객체 생성
		System.out.print("양의 정수를 입력하시오: ");
		int n = scan.nextInt();  //다음 토큰 값을 integer형으로 리턴

		System.out.println(n + "의 약수는 다음과 같습니다.");
		for (int i = 1; i <= n; ++i) { //변수 i는 1에서 n까지 반복
			if (n % i == 0) //n을 i로 나눈 나머지가 0일 경우 -> 약수일 경우
				System.out.print(" " + i);  //약수들 출력
		}
	}
}