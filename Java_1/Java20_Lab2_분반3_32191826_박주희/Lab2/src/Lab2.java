
public class Lab2 {
	
	private static final int NUM=20;  //���� NUM�� ������ ������ 20���� �ʱ�ȭ
	public static void print(int number, String symbol, String name, double weight)    //print �޼ҵ� ����
	{
		System.out.println("PeriodicElement[number="+number+",symbol="+symbol+
			",name="+name+",weight="+weight+"]"); //�������
	}
	private static void print(int element) {  //element�� �Է¹޾� �� print�� ȣ��
		print(element,PTable.getSymbol(element),PTable.getName(element),PTable.getWeight(element));
	}  //element(���� ��ȣ)�� �Է¹޾� �� ������ number,symbol,name,weight�� �� print�� �Է°����� �� �� �ֵ��� ��

	//self code
	private static void print2(String elementN) {
		int element=PTable.getNumber(elementN);
		print(element,PTable.getSymbol(element),elementN,PTable.getWeight(element));
	}
	
	public static void main(String[] args) {
	
		//for & PTable methods
		for (int i=1;i<=NUM;i++) {   //���� i�� 1���� NUM���� �ݺ�
			System.out.println(PTable.getSymbol(i));  //PTable Class�� getSymbol method�� i�� �Է����� �� ���ϰ� ���
			System.out.println(PTable.getName(i));   //PTable Class�� getName method�� i�� �Է����� �� ���ϰ� ���
			System.out.println(PTable.getWeight(i));  //PTable Class�� getWeight method�� i�� �Է����� �� ���ϰ� ���
		}
		System.out.println();  //���� ���
		
		//for & PTable methods
		for(int i=1;i<=NUM;i++) {   //���� i�� 1���� NUM���� �ݺ�
			print(i,PTable.getSymbol(i),PTable.getName(i),PTable.getWeight(i));  //print�޼ҵ带 �̿��Ͽ� ���
		}
		System.out.println();  //���� ���
		
		//array(0~length-1)
		String[] elementSymbols=new String[NUM];  //String�� ���Ұ� 20���� elementSymbols �迭 ���� �� ���� 
		String[] elementNames=new String[NUM];   //String�� ���Ұ� 20���� elementNames �迭 ���� �� ����
		double[] elementsWeight=new double[NUM];  //double�� ���Ұ� 20���� elementsWeight �迭 ���� �� ����
		for (int i=0;i<NUM;i++) {   //���� i�� 1���� NUM���� �ݺ�
			elementSymbols[i]=PTable.getSymbol(i+1);   //elementSymbols�� i��° ���Ҵ� PTable�� getSymbol�� (i+1)�� �Է����� �� ���ϰ�
			elementNames[i]=PTable.getName(i+1);  //elementSymbols�� i��° ���Ҵ� PTable�� getName�� (i+1)�� �Է����� �� ���ϰ�
			elementsWeight[i]=PTable.getWeight(i+1); //elementSymbols�� i��° ���Ҵ� PTable�� getWeight�� (i+1)�� �Է����� �� ���ϰ�
		}
		
		//for-each
		for(String symbol:elementSymbols) {  //elementSymbols.length�� �ݺ�.symbol�� elementSymbols[0],...,elementSymbols[20]�� ������ �ݺ�
			System.out.println(symbol);  //symbol ���
		}
		for(String name:elementNames) {  //elementNames.length�� �ݺ�.name�� elementNames[0],...,elementNames[20]�� ������ �ݺ�
			System.out.println(name);  //name ���
		}
		for(double weight:elementsWeight) { //elementsWeight.length�� �ݺ�.weight�� elementsWeight[0],...,elementsWeight[20]�� ������ �ݺ�
			System.out.println(weight);  //weight ��� 
		}
		System.out.println();  //���� ���
		
		//while 
		int k=1;  //���� k ���� �� 0���� �ʱ�ȭ
		while(k<=20) { //k�� 20���� ���� ����
			print(k);  //k�� �Է��Ͽ� ���ϴ� ��� ���·� ����ϰ� �ϴ� print�޼ҵ带 �̿��Ͽ� ���
			k++;  //k�� 1�� ����		
		}
		System.out.println();  //���� ���
		
		//do while
		int a=1;   //���� a ���� �� 0���� �ʱ�ȭ
		do {   //while�� ���ǹ� ���� ����
			print(a);  //a�� �Է��Ͽ� ���ϴ� ��� ���·� ����ϰ� �ϴ� print�޼ҵ带 �̿��Ͽ� ���
			a++;	//a�� 1�� ����	
		}while (a<=20);  //a�� 20���� ���� ��
		System.out.println();  //���� ���
		
		//UserInput
		System.out.println("UserInput");  //UserInput ���
		do {   //while�� ���ǹ��� true�� ���� ����
			System.out.println("Please enter element #:");  //Please enter element # ���
			int element=UserInput.getInteger();  //�Է� ���� ���� integer������ ��ȯ�Ͽ� �б�
			print(element); //element�� �Է��Ͽ� ���ϴ� ��� ���·� ����ϰ� �ϴ� print�޼ҵ带 �̿��Ͽ� ���
			
			//self code
			System.out.println("Please enter element name in Korean:");
			String elementN=UserInput.getString();
			print2(elementN);
			} while(!UserInput.getExitKey());  //UserInput�� getExitKey�� false�� ��
		System.out.println("done");	//done ���
		System.out.println();  //���� ���
	}

}
