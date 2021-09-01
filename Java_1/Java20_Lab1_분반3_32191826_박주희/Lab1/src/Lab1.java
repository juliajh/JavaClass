import java.util.Scanner;
public class Lab1 {
	
	public static void print(int number, String symbol, String name, double weight)  //print 메소드 생성
	{
		System.out.println("PeriodicElement[number="+number+",symbol="+symbol+
			",name="+name+",weight="+weight+"]");
	}
	public static void main(String[] args) {
		//1.method
		System.out.println("method");
		print(1,"H","수소",1.008);
		print(2,"He","헬륨",4.0026);
		print(3,"Li","리튬",6.94);
		print(4,"Be","베릴륨",9.0122);
		print(5,"B","붕소",10.81);
		print(6,"C","탄소",12.011);
		print(7,"N","질소",14.007);
		print(8,"O","산소",15.999);
		print(9,"F","플루오린",18.998);
		print(10,"Ne","네온",20.180);
		
		//4
		System.out.println("원소기호 1~10번 중 가장 가벼운 것은?");
		print(1,"H","수소",1.008);
		System.out.println("원소기호 1~10번 중 가장 무거운 것은?");
		print(10,"Ne","네온",20.180);
		System.out.println("원소기호 1~10번 중 하나를 골라 번호를 입력하세요.");
		Scanner input1 =new Scanner(System.in);  //scanner 객체 생성
		int number1=input1.nextInt();  //int 타입으로 리턴
		System.out.println(number1+"번 원소는"+number1+"번째로 가볍습니다.");
		if((number1==3)||(number1==4)||(number1==5)||(number1==6))  //입력한 원소 번호가 3 또는 4 또는 5 또는 6일 경우
			System.out.println(number1+"번 원소는 고체입니다.");
		else //아닐경우
			System.out.println(number1+"번 원소는 기체입니다.");
		
		
		
		//2.command line arguments
		System.out.println("command line arguments");
		if(args.length ==4)
		{
			int number=Integer.parseInt(args[0]); //문자열을 int형으로 바꿈
			String symbol=args[1];
			String name=args[2];
			double weight=Double.parseDouble(args[3]); //문자열을 double형으로 바꿈
			print(number,symbol,name,weight);
		}
		
		//3.Scanner user input
		System.out.println("Scanner user input");
		System.out.print("Please enter periodic element:");
		Scanner input =new Scanner(System.in); //scanner 객체 생성
		int number=input.nextInt(); //다음 토큰을 int 타입으로 리턴
		String symbol=input.next(); //다음 토큰을 문자열로 리턴
		String name=input.next();  
		double weight=input.nextDouble(); //다음 토큰을 double 타입으로 리턴
		print(number,symbol,name,weight);
		
		
	}

}