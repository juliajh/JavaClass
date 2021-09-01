//Lab7 3�й� 6/02 32191826 ������

import java.util.Arrays;
import java.util.Random;

public class PeriodicTable {
	private PeriodicElement[] elements = null;

	// constructor
	public PeriodicTable() {
		this(null);
	}
	
	// constructor
	public PeriodicTable(PeriodicElement[] elements) {
		this.elements = elements;
	}

	// getter & setter
	public PeriodicElement[] getElements() {
		return elements;
	}

	public void setElements(PeriodicElement[] elements) {
		this.elements = elements;
	}

	//PeriodicElementFinder �߻�Ŭ������ find�� �̿��Ͽ� ���¿� �ش��ϴ� �迭 ��ȯ
	public PeriodicElement[] find(PeriodicElementFinder finder)
	{
		PeriodicElement[] pe=finder.find(elements);
		return pe;
	}
	
	//IPeriodicElementFinder �������̽��� find�� �̿��Ͽ� ���¿� �ش��ϴ� �迭 ��ȯ
	public PeriodicElement[] find(IPeriodicElementFinder ifinder)
	{
		int count=0;
		for(PeriodicElement i:elements) //i�� elements[0],elements[1],...�� ��ȯ
		{
			//i�� null�� �ƴϰ� 
			//IPeriodicElementFinderŬ������ isInstanceOf�޼ҵ忡 i�� �Է��Ͽ� true���
			if((i!=null)&&(ifinder.isInstanceOf(i)==true))  
				count++;  //count�� 1 ����
		}

		PeriodicElement[] pe = new PeriodicElement[count]; //count ũ���� PeriodicElement�迭 ���� pe ����
		int j=0;
		for(int i=0;i<elements.length;i++)
		{
			//elements�� i��° ���Ұ� null�� �ƴϰ� 
			//IPeriodicElementFinderŬ������ isInstanceOf�޼ҵ忡 elements[i]�� �Է��Ͽ� true���
			if((elements[i]!=null)&&(ifinder.isInstanceOf(elements[i])==true))
					pe[j++]=elements[i]; //pe�� j��° ���ҿ� elements�� i��° ���� ����, j�� 1 ����
		}
		return pe;
	}
	
	//�迭�� min���� max������ �ε����� PeriodicElement�� ���ο� �迭�� �����Ͽ� ��ȯ�ϴ� �޼ҵ�
	public PeriodicElement[] getElements(int min,int max){
		PeriodicElement[] pe = new PeriodicElement[max-min+1]; //max-min+1 ũ���� PeriodicElement�� pe�迭 ����
		int j=0;
		for(int i=min;i<=max;i++)
			pe[j++]=elements[i]; //elements�� i��° ���Ҹ� pe�迭�� ���ʷ� ����
		return pe; 
	}

	//size��ŭ ���� �����Ͽ� pe�� �����Ͽ� ��ȯ�ϴ� �޼ҵ�
	public PeriodicElement[] getRandomElements(int size) {
		PeriodicElement[] pe=new PeriodicElement[size];  //�Է¹��� size ũ���� PeriodicElement�� pe�迭 ����
		int j=0;
		Random rd=new Random();
		for(int i=0;i<pe.length;i++)
		{
			j=rd.nextInt(50);  //0~49���� ���� �� �����ϰ� ������ �޾� j�� ����
			pe[i]=elements[j];  //elements�� j��° ���Ҹ� pe�� i��° �� ����
		}//pe�� length��ŭ �ݺ�
		return pe;
	}
	
	//�迭���� �����ϰ� �ϳ� �����Ͽ� ��ȯ�ϴ� �޼ҵ�
	public PeriodicElement getRandomElement() {
		Random rd=new Random();
		int i;
		i=rd.nextInt(elements.length);   //0~elements.legnth-1���� ���� �� �����ϰ� ������ �޾� i�� ����
		return elements[i];  //i��° elements ���Ҹ� ��ȯ
	}
	
	//�迭�� �����ϰ� ���� �޼ҵ�
	public void shuffle() {
		Random rd=new Random();
		int j,k;
		PeriodicElement temp;
		for(int i=0;i<elements.length;i++)
		{
			j=rd.nextInt(50);  //0~49������ ���� ����
			k=rd.nextInt(50);  //0~49������ ���� ����
			temp=elements[j];  
			elements[j]=elements[k];
			elements[k]=temp;
		}
	
	}
	
	//�迭�� �����ϴ� �޼ҵ�
	public void sort() {
		Arrays.sort(elements);  
	}
	
	
	public String toString() {
		return "PeriodicTable [elements=" + Arrays.toString(elements) + "]";
	}

	public void print() {
		for (PeriodicElement pe : elements) {
			System.out.println(pe);
		}
	}
}
