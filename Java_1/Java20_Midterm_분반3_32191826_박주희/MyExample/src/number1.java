//3�й� 32191826 ������

public class number1 {
	//(1.5)
	public static void upper(int x,int y)
	{
		x++;
		y++;
	}
	//(1.3)
	static void Arrayprint1(String[] arr) //String�迭�� �Ű������� ���� Arrayprint1�޼ҵ�
	{
		for(int i=0;i<arr.length;i++)
			System.out.println("�迭�� "+i+"��° ���="+arr[i]);
	}
    static void Arrayprint2(int[] arr)  //integer�� �迭�� �Ű������� ���� Arrayprint2�޼ҵ�
	{
		for(int i=0;i<arr.length;i++)
			if(arr[i]<=10)  //���Ұ��� 10���� ���������� ����Ѵ�.
				System.out.println(arr[i]);
	}
    
    //(1.4)
    //�޼ҵ� �����ε�
	//�Ű������� �ٸ����� ��� ���ϴ� ����� �����Ѵ�.
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
		while(i<=5) //i�� 5���� ����������
		{
			fact*=i; //fact�� i�� ���� ���Ѵ�
			i++;  //i�� ���� 1�� ����

		}
		System.out.println("5!="+fact);
		System.out.println();
		
		//(1.2)
		for(int j=0;j<10;j++)  //for���� �̿��Ͽ� j���� 0���� 9���� 1�� ������Ų��.
		{
			if(j%2==0)  //j�� 2�� ������ 0�� �Ǹ�
				continue; //�ݺ��� ���� ���� ���� �ݺ��� �����Ͽ� ��½ı��� �����ʾ� ¦���� ������� �ʴ´�.
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
		//upper�޼ҵ� �ȿ��� a,b���� �����Ͽ� ����ϰ� �޼ҵ� ����� ���� �� �ı��ǹǷ� a,b�� ���� ������ �ʴ´�.
		System.out.println();
		
		//(1.7)
		String[] strArray= {"H","a","l","l","o"};
		strArray[1]="e"; //�ε���1�� 0�� 4 �����̹Ƿ� ��밡���ϴ�.
		for(int j=0;j<strArray.length;j++)
			System.out.print(strArray[j]);
		
	}

}
