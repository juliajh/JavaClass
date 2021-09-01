import java.util.Scanner;
public class PeriodicTable {
	private static Scanner input=new Scanner(System.in);
	
	PeriodicElement[] elements;
	
	//������
	public PeriodicTable(PeriodicElement[] elements)
	{
		this.elements=elements;
	}
	
	//getter
	public PeriodicElement[] getElements() {
		return elements;
	}
	
	//setter
	public void setElements(PeriodicElement[] elements) {
		this.elements=elements;
	}
	
	public String toString(Element e) {
		return e.toString();
	}
	
	//index�� �޾� elements�� index��° ���Ҹ� ����
	public PeriodicElement get(int index)
	{
		if(index>=0&&index<this.elements.length)
			return this.elements[index];
		return null;
	}
	
	//index�� �޾� elements�� index-1��° ���Ҹ� ����
	public PeriodicElement getPrevious(int index)
	{
		if(index>=-1&&index<this.elements.length-1)
			return this.elements[index-1];
		return null;
	}
	
	//index�� �޾� elements�� index+1��° ���Ҹ� ����
	public PeriodicElement getNext(int index)
	{
		if(index>=1&&index<this.elements.length+1)
			return this.elements[index+1];
		return null;
	}
	
	//Element�� ���ҹ�ȣ�� ���� PeriodicElement�� ã�� ��ȯ�ϴ� �޼ҵ�
	private PeriodicElement getPeriodicElement(PeriodicElement[] array,Element e) 
	{
		PeriodicElement element=null;
		for(int i=0;i<50;i++)   //for���� �̿��Ͽ�
		{
			if(e.getValue()==array[i].getNumber()) //�Է¹��� Element e�� ���ҹ�ȣ���� array[i]�� ���ҹ�ȣ�� ���ٸ�
				element=array[i]; //element�� array[i]�� ����
		}
		return element; //element ��ȯ
	}
	
	//Element -> PeriodicElement
	public PeriodicElement find(Element e)
	{  
		for(PeriodicElement pe:this.elements)  //for-each
		{
			if(e!=null&&pe!=null&&pe.getNumber()==e.getValue()) //e�� pe�� null�� �ƴϰ� e�� value�� pe�� number(���ҹ�ȣ)�� ���ٸ� 
				return pe;
		}
		return null;		
	}
	
	//number -> PeriodicElement
	public PeriodicElement find(int number)
	{
		Element e=Element.valueOf(number); //Element�� valueOf�޼ҵ�
		
		for(PeriodicElement pe:this.elements)
		{
			if(e!=null&&pe!=null&&pe.getNumber()==e.getValue())
				return pe;
		}
		return null;
	}
	
	//symbol -> PeriodicElement
	public PeriodicElement find(String symbol)
	{
		Element e=Element.symbolOf(symbol); //Element�� symbolOf�޼ҵ带 �̿��Ͽ� �Է��� symbol�� Element enum�� ����� �� ȣ��
		
		for(PeriodicElement pe:this.elements)
		{
			if(e!=null&&pe!=null&&pe.getNumber()==e.getValue())
				return pe;
		}
		return null;
	}
	
		
	//state -> PeriodicElement
	public PeriodicElement[] find(State state)
	{
		PeriodicElement[] element1= new PeriodicElement[50]; //PeriodicElement[] ��ü ����
		//�ϴ� �迭�� ũ�⸦ 50���� ���� �� Lab4���� for������  null�� ���� ���� ���
		PeriodicElement[] pe = Lab4.get_elements(); //�迭�� ���� ���۷��� ����, Lab4�� get_elements�޼ҵ带 �̿��Ͽ� elements ��ȯ
		int j=0;
		for(int i=0;i<50;i++) //for���� �̿��Ͽ�
		{
			if(pe[i].getstate()==state) //pe[i]�� state�� �Է¹��� state�� ���ٸ�
				element1[j++]=pe[i]; //element1 �迭�� ���ʷ� ����
		}
		return element1; //element1 ��ȯ
	}
	
	public void print() 
	{
		PeriodicElement[] pe = Lab4.get_elements(); //�迭�� ���� ���۷��� ����, Lab4�� get_elements�޼ҵ带 �̿��Ͽ� elements ��ȯ
	
		int i=0;
		while(i<50)  //while���� �̿��Ͽ�
		{
			pe[i].print(pe[i]); //print
			i++;
		}
	}


}