package controller;
import java.util.Scanner;

import dto.State;
import dto.Type;

public class UserInput {
private static Scanner input=new Scanner(System.in);  //scanner 객체 생성
	
	public static String getString() {
		return input.nextLine();  //한줄 읽기
	}
	public static int getInteger() { //getInteger 메소드 생성
		int value;  //변수 value 생성
		value=Integer.parseInt(input.nextLine()); //한줄을 읽어서 integer형으로 parse 
		return value;  //value값 return
	}
	public static double getDouble() {  //getDouble 메소드 생성
		double value=0.0;  //변수 value에 0.0저장
		value=Double.parseDouble(input.nextLine());  //한줄을 읽어서 double형으로 parse
		return value;  //value값 return
		}
	public static Type getType() {
		Type type=Type.valueOf(input.nextLine());  //한줄을 읽어 Type형 으로 변환하여 변수 type에 저장
		return type;
	}
	public static State getState() {
		State state=State.valueOf(input.nextLine()); //한줄을 읽어 State형 으로 변환하여 변수 state에 저장
		return state;
	}
	public static boolean getExitKey() {  //getExitKet 메소드 생성
		System.out.print("Press q-ket to exit of enter-key to continue:");  //Press q-ket to exit of enter-key to continue 출력
		String str=input.nextLine();  //한 줄 읽기
		if(str.contentEquals("q"))  //읽은 값이 q이면
			return true;   //true 반환
		else  //q가 아닐경우
			return false;  //false 반환
	}
	

}
