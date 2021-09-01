import java.util.Scanner;
public class Lab1 {
	
	public static void print(int number, String symbol, String name, double weight)  //print �޼ҵ� ����
	{
		System.out.println("PeriodicElement[number="+number+",symbol="+symbol+
			",name="+name+",weight="+weight+"]");
	}
	public static void main(String[] args) {
		//1.method
		System.out.println("method");
		print(1,"H","����",1.008);
		print(2,"He","���",4.0026);
		print(3,"Li","��Ƭ",6.94);
		print(4,"Be","������",9.0122);
		print(5,"B","�ؼ�",10.81);
		print(6,"C","ź��",12.011);
		print(7,"N","����",14.007);
		print(8,"O","���",15.999);
		print(9,"F","�÷����",18.998);
		print(10,"Ne","�׿�",20.180);
		
		//4
		System.out.println("���ұ�ȣ 1~10�� �� ���� ������ ����?");
		print(1,"H","����",1.008);
		System.out.println("���ұ�ȣ 1~10�� �� ���� ���ſ� ����?");
		print(10,"Ne","�׿�",20.180);
		System.out.println("���ұ�ȣ 1~10�� �� �ϳ��� ��� ��ȣ�� �Է��ϼ���.");
		Scanner input1 =new Scanner(System.in);  //scanner ��ü ����
		int number1=input1.nextInt();  //int Ÿ������ ����
		System.out.println(number1+"�� ���Ҵ�"+number1+"��°�� �������ϴ�.");
		if((number1==3)||(number1==4)||(number1==5)||(number1==6))  //�Է��� ���� ��ȣ�� 3 �Ǵ� 4 �Ǵ� 5 �Ǵ� 6�� ���
			System.out.println(number1+"�� ���Ҵ� ��ü�Դϴ�.");
		else //�ƴҰ��
			System.out.println(number1+"�� ���Ҵ� ��ü�Դϴ�.");
		
		
		
		//2.command line arguments
		System.out.println("command line arguments");
		if(args.length ==4)
		{
			int number=Integer.parseInt(args[0]); //���ڿ��� int������ �ٲ�
			String symbol=args[1];
			String name=args[2];
			double weight=Double.parseDouble(args[3]); //���ڿ��� double������ �ٲ�
			print(number,symbol,name,weight);
		}
		
		//3.Scanner user input
		System.out.println("Scanner user input");
		System.out.print("Please enter periodic element:");
		Scanner input =new Scanner(System.in); //scanner ��ü ����
		int number=input.nextInt(); //���� ��ū�� int Ÿ������ ����
		String symbol=input.next(); //���� ��ū�� ���ڿ��� ����
		String name=input.next();  
		double weight=input.nextDouble(); //���� ��ū�� double Ÿ������ ����
		print(number,symbol,name,weight);
		
		
	}

}