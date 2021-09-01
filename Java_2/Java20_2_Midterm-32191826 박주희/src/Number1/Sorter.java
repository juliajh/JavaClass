//32191826 ������ ��й�ȣ 9426 Java2 Midterm
package Number1;

public class Sorter {
	private Comparator comparator=null;
	
	//Constructor
	public Sorter(Comparator comparator) {
		this.comparator = comparator;
	}
	
	//getter,setter
	public Comparator getComparator() {
		return comparator;
	}

	public void setComparator(Comparator comparator) {
		this.comparator = comparator;
	}

	public void selectionSort(double[] data) {
		int size = data.length;
        int min; //�ּҰ��� ���� �������� �ε��� ���� ����
        double temp;
        
        for(int i=0; i<size-1; i++){ // size-1 : ������ ��Ҵ� �ڿ������� ���ĵ�
            min = i;
            for(int j=i+1; j<size; j++){
                if(this.comparator.compare(data[min], data[j]) > 0){
                    min = j;
                }
            }
            temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }

	}
		
		
	
}
