//Lab 5-2, 5/7, ������

import java.util.Scanner;

public class Lab5 {

	static Scanner input= new Scanner(System.in);  //scanner ��ü ����
		
	public static void main(String[] args) {

		PeriodicElement[] element2= new PeriodicElement[5];  //���۷��� ���� element2 ���� �� PeriodicElement[] �迭 ����
		
		System.out.println("���� ���� 5���� �Է��Ͻÿ�(���ҹ�ȣ, ���ұ�ȣ, �����̸�, ���ҷ�, ����):");
		for(int i=0;i<5;i++) //for���� �̿��Ͽ� PeriodicELement�� �޾Ƽ� element2�� �־���
		{
			element2[i]=UserInput.getPeriodicElement();  //UserInput.getPeriodicElement�� ���� �Է¹��� ������ state�� ���� ���� ���� ��ü�� element[i]�� ����
		}
		
		for(PeriodicElement i:element2) 
		{
			System.out.println(i); //for-each���� �̿��Ͽ� element2�� ��� ���� ���
		}
		PeriodicTable ptable2=new PeriodicTable(element2);  //�Է¹��� element2�� �̿��Ͽ�  PeriodicTable ����
		
		//set test
		System.out.println("���� ������ ������ index�� �Է��Ͻÿ�(0�̻� 4����): ");
		int index=input.nextInt();  //����ڰ� �Է��� ���� integer������ �ٲ� �� index�� ����
		System.out.println("������ ���� ������ �Է��Ͻÿ�: ");
		PeriodicElement pe=UserInput.getPeriodicElement();  //����ڰ� �Է��� ���� UserInput.getPeriodicElement()�� ���� �� pe�� ����
		ptable2.set(index, pe); //set�޼ҵ�� index�� pe���� ������ ����
		for(int i=0;i<5;i++) //for���� �̿��Ͽ� element2 ���
		{
			System.out.println(element2[i]);
		}
		System.out.println("���� ������ ����Ǿ����ϴ�.");
		
		//find test
		System.out.print("Please enter [name] of PeriodicElement: ");
		String str=input.next();  //�Է¹��� ���� str�� ����
		Element e=Element.nameOf(str);
		PeriodicElement element = ptable2.find(e);
		if(element != null) element.print();

	
		System.out.println("Please enter [symbol] of PeriodicElement:");
		String symbol=input.next(); //����ڰ� �Է��� ���� symbol�� ����
		System.out.println(ptable2.find(symbol));  //find by Symbol. �Է°� symbol�� �ش��ϴ� ���� ���� ���
		
		System.out.println("Please enter [number] of PeriodicElement:");
		int number=input.nextInt();   //����ڰ� �Է��� ���� integer������ �ٲ� �� number�� ����
		System.out.println(ptable2.find(number)); //find by Number. �Է°� number�� �ش��ϴ� ���� ���� ���
		
		System.out.println("Please enter [state] of PeriodicElement:"); 
		String str1=input.next();    //����ڰ� �Է��� ���� str1�� ����
		State str2=State.valueOf(str1); //�Է��� str1�� Enum������ ��ȯ�Ͽ� str2�� ����
		PeriodicElement[] foundElements = ptable2.find(str2); //find by State. str2�� �ش��ϴ� ���ҵ��� ������ foundElements�迭�� ����
		for (PeriodicElement pe1 : foundElements) {
			pe1.print();		//for-each���� �̿��Ͽ� foundElements�� ��� ���� ���� ���	
		}
		
		//get test
		System.out.println("Please enter an index: ");
		int index1=input.nextInt();
		System.out.println(ptable2.get(index1));
		System.out.println(ptable2.getNext(index1));
		System.out.println(ptable2.getPrevious(index1));
		
		//my code
		//�ΰ��� index�� �Է��ϸ� �� ������ ��� ���� ���� ���
		System.out.println("index �ΰ��� ������, ū�� ������ �Է��ϼ���: ");
		int index2=input.nextInt();  
		int index3=input.nextInt();
		int j=index2;
		if((index2<4)&&(index3>0)&&(index2>=0)&&(index3<=4))
		{
			PeriodicElement[] pe3=new PeriodicElement[index3-index2+1]; //���۷��� ���� pe3 ���� �� PeriodicElement[] �迭 ����
			for(int i=0;i<=index3-index2;i++) //for���� �̿��Ͽ� �� index������ ���ҵ��� ������ pe3�� ����
			{
				pe3[i]=element2[j++];
			}
			for(PeriodicElement i:pe3) //for-each���� �̿��Ͽ� pe3�� ��� PeriodicElement ���
				System.out.println(i);
			
		}
	}
}


