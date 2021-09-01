//Lab7 3�й� 6/02 32191826 ������

//�߻�Ŭ���� PeriodicElementFinder
abstract class PeriodicElementFinder {
	public abstract boolean isInstanceOf(PeriodicElement pe); //�߻�޼ҵ�
	
	//state�� ���� PeriodicElement[]�� ��ȯ�ϴ� �޼ҵ�
	public PeriodicElement[] find(PeriodicElement[] elements)
	{
		int count=0;
		for(int i=0;i<elements.length;i++) 
		{
			//elements�� i��° ���Ұ� null�� �ƴϰ� 
			//isInstanceOf�޼ҵ忡 elements[i]�� �Է��Ͽ� true���
			if((elements[i]!=null)&&(isInstanceOf(elements[i])==true))
					count++;  //������ ������ ���� count�� 1 ����
		}

		PeriodicElement[] pe = new PeriodicElement[count]; //count ũ���� PeriodicElement�迭 ���� pe ����
		int j=0;
		for(int i=0;i<elements.length;i++)
		{
			//elements�� i��° ���Ұ� null�� �ƴϰ� 
			//isInstanceOf�޼ҵ忡 elements[i]�� �Է��Ͽ� true���
			if((elements[i]!=null)&&(isInstanceOf(elements[i])==true))
					pe[j++]=elements[i]; //pe�� j��° ���ҿ� elements�� i��° ���� ����, j�� 1 ����
		}
		return pe;  //pe ��ȯ
		
		
	}

	
	
}
