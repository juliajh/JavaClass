//3�й� 32191826 ������

public class number2 {
	public static void main(String[] args) {
		//(2.2)
		Celebrity a1=new Singer("�迵��",22);
		Celebrity a2=new Actor("������",22);
		a1.print2();
		a2.print2();
		System.out.println();
		
		//(2.3)
		Celebrity[] people= {new Singer("������",22),new Actor("�̰ǿ�",24)};
		for(Celebrity i:people)  //�ݺ��� ������ i�� Celebrity[0],Celebrity[1],...������ �����ȴ�.
		{
			i.print1(); 
			i.print2();
			i.work();
			//�� ���ҵ��� �޼ҵ忡 ���� ����Ѵ�.
		}
		
		//(2.5)
		Comedian a3=new Comedian("���ֿ�",88); //Comedian ��ü ����
		a3.setage(17); //a3.age�� 88���� 17�� �ٲ��.
		//age�� static������ �ƴϱ� ������ Comedian.age=17�� ��������.
		System.out.println(a3);
	}

}
