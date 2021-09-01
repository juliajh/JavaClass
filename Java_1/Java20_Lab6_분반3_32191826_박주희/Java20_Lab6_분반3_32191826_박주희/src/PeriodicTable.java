//Lab6 5/21 ������

import java.util.Arrays;

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
	
	public String toString() {
		return "PeriodicTable [elements=" + Arrays.toString(elements) + "]";
	}

	public void print() {
		for (PeriodicElement pe : elements) {
			System.out.println(pe);
		}
	}
}
