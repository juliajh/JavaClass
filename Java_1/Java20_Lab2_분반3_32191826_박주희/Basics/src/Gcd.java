import java.util.*;

public class Gcd {
	public static void main(String[] args) {
		int x, y, r;  //변수 x,y,z 생성
		System.out.print("두개의 정수를 입력하시오(큰수, 작은수): ");
		Scanner scan = new Scanner(System.in);  //scanner 객체 생성
		x = scan.nextInt();  //다음 토큰을 int 타입으로 리턴
		y = scan.nextInt();  //다음 토큰을 int 타입으로 리턴
		while (y != 0) {  //y가 0이 아닐 동안
			r = x % y;  //r에 x를 y로 나눈 나머지 저장
			x = y;  //x에 y값 저장
			y = r;  //y에 r값 저장
		}  //x값이 최대공약수
		System.out.println("최대 공약수는 " + x);  //최대공약수값 출력
	}
}