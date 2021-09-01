//3�й� 32191826 ������

public class Main {

	static void square1(int a) //integer���� �Է� �޴� square1 �޼ҵ�
	{
		a*=a; //a���� ���� a�� ����
		System.out.println("inside square1 a="+a);
	}
	static void square2(int[] arr)  //integer�� �迭�� �Է� �޴� square2 �޼ҵ�
	{
		for(int a:arr) //�ݺ��� ������ a�� arr[0],arr[1],...������ �����ȴ�.
		{
			a*=a; //a�� ���� ���� a�� ����
			System.out.println("inside square2 a="+a);
		}
	}
	static void square3(int[] arr)   //integer�� �迭�� �Է� �޴� square3 �޼ҵ�
	{
		for(int i=0;i<arr.length;i++) //i�� 0���� arr�� ũ����� 1�� �����Ѵ�.
		{
			arr[i]*=arr[i]; //arr�� i��° ������ ���� ���� i��° ���ҿ� ����
			System.out.println("inside square3 a="+arr[i]);
		}
	}
	
	static void print(int[]arr) //integer�� �迭�� �Է� �޴� print �޼ҵ�
	{
		System.out.println(java.util.Arrays.toString(arr));  //arr�� ���ҵ��� ���ڿ��� ��ȯ�Ͽ� ����Ѵ�.
	}
	static void print(int[][]arr) //integer�� 2���� �迭�� �Է� �޴� print �޼ҵ�
	{
		System.out.println(java.util.Arrays.deepToString(arr)); //arr�� ���ҵ��� ���ڿ��� ��ȯ�Ͽ� ����Ѵ�.
	}
	//toString�� ������ �迭�� ����Ҷ� ���, deepToSting�� ������ �迭�� ����� �� ���
	static void print(String []arr) //string�� �迭�� �Է� �޴� print �޼ҵ�
	{
		System.out.println(java.util.Arrays.toString(arr)); //arr�� ���ҵ��� ���ڿ��� ��ȯ�Ͽ� ����Ѵ�.
	}
	
	//(1.3)
	static int sum(int[] arr)  //arr�� ���� ��Ҹ� ������ ���� ��ȯ�ϴ� �޼ҵ�
	{
		int result=0;
		for(int i=0;i<arr.length;i++) //i�� 0���� arr�迭�� ũ�⸸ŭ 1�� ������ ����
			result+=arr[i];  //result�� arr[i]�� ���� ���Ѵ�.
		return result;
	}
	static String join(String[] arr)  //arr�� ��� ��Ҹ� ������ ���� ��ȯ�ϴ� �޼ҵ�
	{
		String result="";  //String�� ���� result�� ""���� �ʱ�ȭ
		for(int i=0;i<arr.length;i++) //i�� 0���� arr�迭�� ũ�⸸ŭ 1�� ������ ����
			result+=arr[i]; //result�� arr[i]�� ���� ���Ѵ�.
		return result;
	}
	public static void main(String[] args) {
		//(1.1)
		for(int i=1;i<=243;i*=3)
			System.out.println(i);
		
		//(1.2)
		int k=0;
		do {  //k�� 10���� �������� �ݺ�
			k++;
			if(k==5) break;
			//continue��: �ݺ����� ���� ������ �����鼭 �ݺ��� ���� ���� ���� �ݺ��� �����Ѵ�.
			//break��� continue���� �̿��ϰ� �Ǹ� k=5�� �ɶ� �ٷ� ���� �ݺ��� ����Ǿ� k++�ǰ� System.out.println(5)�� ������� �ʴ´�.
			System.out.println(k);
		}while(k<10); 
		System.out.println();
		/*������: 
		 * break -> 1 2 3 4
		 * continue -> 1 2 3 4 6 7 8 9 10
		*/
		
		//(1.3)
		int[] arr1= {1,2,3};  //integer�� �迭 arr1 ���� �� �ʱ�ȭ
		String[] arr2= {"a","b","c","d"};  //string�� �迭 arr2 ���� �� �ʱ�ȭ
		int sum=sum(arr1); //arr1�� sum�޼ҵ忡 �Ѱ��־� ��ȯ���� ���� sum�� ����
		System.out.println("sum="+sum);
		String join=join(arr2);  //arr2�� join�޼ҵ忡 �Ѱ��־� ��ȯ���� ���� join�� ����
		System.out.println("join="+join);
		
		//(1.4)
		print(arr1);  //������:[1,2,3]
		print(arr2);  //������:[a,b,c,d]
		int[][] arr3= {{4,-3,5},{-4,3,7},{7,-2,4}};  
		print(arr3);  //������:[[4,-3,5],[-4,3,7],[7,-2,4]]
		//�� Ŭ���� ���� �̹� ����Ϸ��� �̸��� ���� �̸��� ���� �޼ҵ尡 �ִ��� �Ű� ������ ���� �Ǵ� Ÿ���� �ٸ���, ���� �̸��� ����Ͽ� �޼ҵ带 ������ �� �ִµ� �̸� �޼ҵ� �����ε��̶�� �Ѵ�.
		//�޼ҵ� �����ε��� �̿��ϸ� �Ű� ���� �پ��ϰ� �ٴ� ó���� �� �ֵ��� �� �� �ִ�. 
		
		//(1.5)
		int x=-1;
		square1(x); //x�� square1�� �Ѱ��ش�
		System.out.println("after square1 x="+x);  
		int[] y= {1,2,3}; //integer�� �迭 y ���� �� �ʱ�ȭ
		square2(y); //y�� square2 �޼ҵ忡 �Ѱ��ش�
		System.out.print("after square2 y=");
		print(y); //y�� print�޼ҵ忡 �Ѱ��ش�
		int[] z= {-1,-2,-3,-4};  //integer�� �迭 z ���� �� �ʱ�ȭ
		square3(z); //z�� square3 �޼ҵ忡 �Ѱ��ش�
		System.out.print("after square3 z=");
		print(z);  //z�� print�޼ҵ忡 �Ѱ��ش�
		/*������:
		 * inside square1 a=1  //(-1)*(-1)=1
		 * after square1 x=-1  //x�� ���� ������ �ʴ´�.
         * �μ��� x�� �����Ͽ� square1 �޼ҵ带 ȣ���Ѵ�. 
		 * square1 �޼ҵ� �ȿ��� �Ű����� a�� �μ� x�� �ٸ���.
		 * a�� x�� ���� �����Ͽ� ����ϰ� �޼ҵ尡 ���� �� �ı��ȴ�.
		 * inside square2 a=1  //1*1=1
		 * inside square2 a=4  //2*2=4
		 * inside square2 a=9  //3*3=9
		 * after square2 y=[1, 2, 3]  //y�迭�� ���� ������ �ʴ´�.
         * �μ��� y[]�� �����Ͽ� square2 �޼ҵ带 ȣ���Ѵ�. 
		 * square2 �޼ҵ� �ȿ��� ���ú���a�� �μ� x�� �ٸ���.
		 * a�� y[]�� ���� �����Ͽ� ����ϰ� �޼ҵ尡 ���� �� �ı��ȴ�.
		 * inside square3 a=1   //(-1)*(-1)=1
		 * inside square3 a=4   //(-2)*(-2)=4
		 * inside square3 a=9   //(-3)*(-3)=9
		 * inside square3 a=16  //(-4)*(-4)=16
		 * after square3 z=[1, 4, 9, 16]  
         * �μ��� z[]�� �����Ͽ� square3 �޼ҵ带 ȣ���Ѵ�. 
         * z�迭�� ���Ұ����� ������ ������ z�迭�� �ٲ���.
		*/
		
		//(1.6)
		int[] intArray=new int[5]; //ũ�Ⱑ 5�� integer�� �迭 intArray����
		intArray[0]=3; 
		intArray[4]=-18;
		intArray[2]=5;
		intArray[1]=intArray[2];  //2��° �ε����� ���Ұ�(5)�� 1��° �ε����� ����
		int w=intArray[0];  //0��° �ε����� ���Ұ�(3)�� ���� w�� ����
		intArray[2]=6; 
		intArray[w]=intArray[1]*intArray[4]; //w��° �ε����� 1��° �ε����� ���Ұ�(5)�� 4��° �ε����� ���Ұ�(-18)�� ���� ���� ����
		print(intArray);
		//3, 5, 6, -90, -18
		
		//(1.7)
		String[] strArray= {"a","b","c","d","e"};  //ũ�Ⱑ 5�� strArray�迭 ����
		//strArray[5]="f"; 
		//ArrayIndexOutOfBoundsException�� �߻��Ѵ�.
		//strArray�� ũ�Ⱑ 5�� �迭�̹Ƿ� �ε��� 0���� 4������ �����Ѵ�.
	}
}
